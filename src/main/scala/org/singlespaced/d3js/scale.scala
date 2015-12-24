package org.singlespaced.d3js

import scala.scalajs.js
import scala.scalajs.js.annotation._

@JSName("d3.scale")
@js.native
trait ScaleObject extends js.Object {

  import scale._

  def identity(): Identity = js.native

  def linear(): Linear[Double, Double] = js.native

  //TODO def linear[Output](): Linear[Output, Output] = js.native
  //TODO def linear[Range, Output](): Linear[Range, Output] = js.native
  def sqrt(): Pow[Double, Double] = js.native

  //TODO def sqrt[Output](): Pow[Output, Output] = js.native
  //TODO def sqrt[Range, Output](): Pow[Range, Output] = js.native
  def pow(): Pow[Double, Double] = js.native

  //TODO def pow[Output](): Pow[Output, Output] = js.native
  //TODO def pow[Range, Output](): Pow[Range, Output] = js.native
  def log(): Log[Double, Double] = js.native

  //TODO def log[Output](): Log[Output, Output] = js.native
  //TODO def log[Range, Output](): Log[Range, Output] = js.native
  def quantize[T](): Quantize[T] = js.native

  def quantile[T](): Quantile[T] = js.native

  def threshold[Range](): Threshold[Double, Range] = js.native

  //TODO def threshold[Domain, Range](): Threshold[Domain, Range] = js.native
  def ordinal[Range](): Ordinal[String, Range] = js.native

  //TODO def ordinal[Domain, Range](): Ordinal[Domain, Range] = js.native
  def category10(): Ordinal[String, String] = js.native

  //TODO def category10[Domain](): Ordinal[Domain, String] = js.native
  def category20(): Ordinal[String, String] = js.native

  //TODO def category20[Domain](): Ordinal[Domain, String] = js.native
  def category20b(): Ordinal[String, String] = js.native

  //TODO def category20b[Domain](): Ordinal[Domain, String] = js.native
  def category20c(): Ordinal[String, String] = js.native

  //TODO def category20c[Domain](): Ordinal[Domain, String] = js.native
}
package scale {

@js.native
trait Identity extends BaseScale[Double,Double,Identity]{
  def apply(n: Double): Double = js.native

  def ticks(count: Double = ???): js.Array[Double] = js.native

  def tickFormat(count: Double = ???, format: String = ???): js.Function1[Double, String] = js.native

  def copy(): Identity = js.native
}

@js.native
trait Linear[Range, Output] extends BaseScale[Double,Range,Linear[Range,Output]] {
  def apply(x: Double): Output = js.native

  def rangeRound(values: js.Array[Double]): Linear[Double, Double] = js.native

  def interpolate(): js.Function2[Range, Range, js.Function1[Double, Output]] = js.native

  def interpolate(factory: js.Function2[Range, Range, js.Function1[Double, Output]]): Linear[Range, Output] = js.native

  def clamp(): Boolean = js.native

  def clamp(clamp: Boolean): Linear[Range, Output] = js.native

  def nice(count: Double = ???): Linear[Range, Output] = js.native

  def ticks(count: Double = ???): js.Array[Double] = js.native

  def tickFormat(count: Double = ???, format: String = ???): js.Function1[Double, String] = js.native

  def copy(): Linear[Range, Output] = js.native
}

@js.native
trait Pow[Range, Output] extends BaseScale[Double,Range,Pow[Range,Output]] {
  def apply(x: Double): Output = js.native

  def rangeRound(values: js.Array[Double]): Pow[Double, Double] = js.native

  def exponent(): Double = js.native

  def exponent(k: Double): Pow[Range, Output] = js.native

  def interpolate(): js.Function2[Range, Range, js.Function1[Double, Output]] = js.native

  def interpolate(factory: js.Function2[Range, Range, js.Function1[Double, Output]]): Pow[Range, Output] = js.native

  def clamp(): Boolean = js.native

  def clamp(clamp: Boolean): Pow[Range, Output] = js.native

  def nice(m: Double = ???): Pow[Range, Output] = js.native

  def ticks(count: Double = ???): js.Array[Double] = js.native

  def tickFormat(count: Double = ???, format: String = ???): js.Function1[Double, String] = js.native

  def copy(): Pow[Range, Output] = js.native
}

@js.native
trait Log[Range, Output] extends BaseScale[Double,Range,Log[Range,Output]] {
  def apply(x: Double): Output = js.native

  def rangeRound(values: js.Array[Double]): Log[Double, Double] = js.native

  def base(): Double = js.native

  def base(base: Double): Log[Range, Output] = js.native

  def interpolate(): js.Function2[Range, Range, js.Function1[Double, Output]] = js.native

  def interpolate(factory: js.Function2[Range, Range, js.Function1[Double, Output]]): Log[Range, Output] = js.native

  def clamp(): Boolean = js.native

  def clamp(clamp: Boolean): Log[Range, Output] = js.native

  def nice(): Log[Range, Output] = js.native

  def ticks(): js.Array[Double] = js.native

  def tickFormat(count: Double = ???, format: String = ???): js.Function1[Double, String] = js.native

  def copy(): Log[Range, Output] = js.native
}

@js.native
trait Quantize[T] extends js.Object {
  def apply(x: Double): T = js.native

  def invertExtent(y: T): js.Tuple2[Double, Double] = js.native

  def domain(): js.Array[Double] = js.native

  def domain(numbers: js.Array[Double]): Quantize[T] = js.native

  def range(): js.Array[T] = js.native

  def range(values: js.Array[T]): Quantize[T] = js.native

  def copy(): Quantize[T] = js.native
}

@js.native
trait Quantile[T] extends js.Object {
  def apply(x: Double): T = js.native

  def invertExtent(y: T): js.Tuple2[Double, Double] = js.native

  def domain(): js.Array[Double] = js.native

  def domain(numbers: js.Array[Double]): Quantile[T] = js.native

  def range(): js.Array[T] = js.native

  def range(values: js.Array[T]): Quantile[T] = js.native

  def quantiles(): js.Array[Double] = js.native

  def copy(): Quantile[T] = js.native
}

@js.native
trait Threshold[Domain, Range] extends js.Object {
  def apply(x: Double): Range = js.native

  def invertExtent(y: Range): js.Tuple2[Domain, Domain] = js.native

  def domain(): js.Array[Domain] = js.native

  def domain(domain: js.Array[Domain]): Threshold[Domain, Range] = js.native

  def range(): js.Array[Range] = js.native

  def range(values: js.Array[Range]): Threshold[Domain, Range] = js.native

  def copy(): Threshold[Domain, Range] = js.native
}

@js.native
trait Ordinal[Domain, Range] extends js.Object {
  def apply(x: Domain): Range = js.native

  def domain(): js.Array[Domain] = js.native

  def domain(values: js.Array[Domain]): Ordinal[Domain, Range] = js.native

  def range(): js.Array[Range] = js.native

  def range(values: js.Array[Range]): Ordinal[Domain, Range] = js.native

  def rangePoints(interval: js.Tuple2[Double, Double], padding: Double = ???): Ordinal[Domain, Double] = js.native

  def rangeRoundPoints(interval: js.Tuple2[Double, Double], padding: Double = ???): Ordinal[Domain, Double] = js.native

  def rangeBands(interval: js.Tuple2[Double, Double], padding: Double = ???, outerPadding: Double = ???): Ordinal[Domain, Double] = js.native

  def rangeRoundBands(interval: js.Tuple2[Double, Double], padding: Double = ???, outerPadding: Double = ???): Ordinal[Domain, Double] = js.native

  def rangeBand(): Double = js.native

  def rangeExtent(): js.Tuple2[Double, Double] = js.native

  def copy(): Ordinal[Domain, Range] = js.native
}

}

