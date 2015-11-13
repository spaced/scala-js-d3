package org.singlespaced.d3js

import org.singlespaced.d3js.d3.Primitive

import scala.scalajs.js
import scala.language.implicitConversions


object Obs {

  @inline implicit def fromFunction1To3StringPrimitive[Datum](value: Datum => String): js.Function3[Datum, Int, Int, Primitive] =
    fromFunction1To3( value.andThen( _.asInstanceOf[Primitive]) )

  @inline implicit def fromFunction1To3DoublePrimitive[Datum](value: Datum => Double): js.Function3[Datum, Int, Int, Primitive] =
    fromFunction1To3( value.andThen( _.asInstanceOf[Primitive]) )

  @inline implicit def fromFunction1To3IntPrimitive[Datum](value: Datum =>  Int): js.Function3[Datum, Int, Int, Primitive] =
    fromFunction1To3( value.andThen( _.asInstanceOf[Primitive]) )

  @inline implicit def fromFunction1To3BooleanPrimitive[Datum](value: Datum => Boolean): js.Function3[Datum, Int, Int, Primitive] =
    fromFunction1To3( value.andThen( _.asInstanceOf[Primitive]) )


  @inline implicit def fromFunction2To3StringPrimitive[Datum](value: scala.Function2[Datum,Int, String]): js.Function3[Datum, Int, Int, Primitive] =
    fromFunction2To3( (d:Datum,i:Int) => value.apply(d,i).asInstanceOf[Primitive] )

  @inline implicit def fromFunction2To3DoublePrimitive[Datum](value: scala.Function2[Datum,Int, Double]): js.Function3[Datum, Int, Int, Primitive] =
    fromFunction2To3( (d:Datum,i:Int) => value.apply(d,i).asInstanceOf[Primitive] )

  @inline implicit def fromFunction2To3BooleanPrimitive[Datum](value: scala.Function2[Datum,Int, Boolean]): js.Function3[Datum, Int, Int, Primitive] =
    fromFunction2To3( (d:Datum,i:Int) => value.apply(d,i).asInstanceOf[Primitive] )

  @inline implicit def fromFunction2To3IntPrimitive[Datum](value: scala.Function2[Datum,Int, Int]): js.Function3[Datum, Int, Int, Primitive] =
    fromFunction2To3( (d:Datum,i:Int) => value.apply(d,i).asInstanceOf[Primitive] )

  @inline implicit def fromFunction1To3[Datum, M](value: Datum => M): js.Function3[Datum, Int, Int, M] = {
    val scalafun = (d: Datum, i: Int, x: Int) => value.apply(d)
    js.Any.fromFunction3[Datum, Int, Int, M](scalafun)
  }

  @inline implicit def fromFunction2To3[Datum, M](value: scala.Function2[Datum, Int, M]): js.Function3[Datum, Int, Int, M] = {
    val scalafun = (d: Datum, i: Int, x: Int) => value.apply(d, i)
    js.Any.fromFunction3[Datum, Int, Int, M](scalafun)
  }
}
