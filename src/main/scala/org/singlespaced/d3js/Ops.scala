package org.singlespaced.d3js

import org.singlespaced.d3js.d3.Primitive

import scala.language.implicitConversions
import scala.scalajs.js


object Ops {

  @inline implicit def fromFunction1To3StringPrimitive[Datum](value: Datum => String): js.Function3[Datum, Int, Int, Primitive] =
    asPrimitive(value)

  @inline implicit def fromFunction1To3DoublePrimitive[Datum](value: Datum => Double): js.Function3[Datum, Int, Int, Primitive] =
    asPrimitive(value)

  @inline implicit def fromFunction1To3IntPrimitive[Datum](value: Datum =>  Int): js.Function3[Datum, Int, Int, Primitive] =
    asPrimitive(value)

  @inline implicit def fromFunction1To3BooleanPrimitive[Datum](value: Datum => Boolean): js.Function3[Datum, Int, Int, Primitive] =
    asPrimitive(value)

  @inline implicit def fromFunction2To3StringPrimitive[Datum](value: (Datum, Int) => String): js.Function3[Datum, Int, Int, Primitive] =
    asPrimitive(value)

  @inline implicit def fromFunction2To3DoublePrimitive[Datum](value: (Datum, Int) => Double): js.Function3[Datum, Int, Int, Primitive] =
    asPrimitive(value)

  @inline implicit def fromFunction2To3BooleanPrimitive[Datum](value: (Datum, Int) => Boolean): js.Function3[Datum, Int, Int, Primitive] =
    asPrimitive(value)

  @inline implicit def fromFunction2To3IntPrimitive[Datum](value: (Datum, Int) => Int): js.Function3[Datum, Int, Int, Primitive] =
    asPrimitive(value)

  @inline implicit def asPrimitive[Datum, T](value: Datum => T) =
    fromFunction1To3(value.andThen(_.asInstanceOf[Primitive]))

  @inline implicit def asPrimitive[Datum, T](value: (Datum, Int) => T) =
    fromFunction2To3((d: Datum, i: Int) => value.apply(d, i).asInstanceOf[Primitive])

  @inline implicit def fromFunction1To3[Datum, M](value: Datum => M): js.Function3[Datum, Int, Int, M] =
    (d: Datum, i: Int, x: Int) => value.apply(d)

  @inline implicit def fromFunction2To3[Datum, M](value: (Datum, Int) => M): js.Function3[Datum, Int, Int, M] =
    (d: Datum, i: Int, x: Int) => value.apply(d, i)


}
