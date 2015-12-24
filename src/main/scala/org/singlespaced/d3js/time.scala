package org.singlespaced.d3js

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{Date, `|`}

@JSName("d3.time")
@js.native
trait TimeObject extends js.Object {

  import timeModule._

  var second: Interval = js.native
  var minute: Interval = js.native
  var hour: Interval = js.native
  var day: Interval = js.native
  var week: Interval = js.native
  var sunday: Interval = js.native
  var monday: Interval = js.native
  var tuesday: Interval = js.native
  var wednesday: Interval = js.native
  var thursday: Interval = js.native
  var friday: Interval = js.native
  var saturday: Interval = js.native
  var month: Interval = js.native
  var year: Interval = js.native

  def seconds(start: Date, stop: Date, step: Double = ???): js.Array[Date] = js.native

  def minutes(start: Date, stop: Date, step: Double = ???): js.Array[Date] = js.native

  def hours(start: Date, stop: Date, step: Double = ???): js.Array[Date] = js.native

  def days(start: Date, stop: Date, step: Double = ???): js.Array[Date] = js.native

  def weeks(start: Date, stop: Date, step: Double = ???): js.Array[Date] = js.native

  def sundays(start: Date, stop: Date, step: Double = ???): js.Array[Date] = js.native

  def mondays(start: Date, stop: Date, step: Double = ???): js.Array[Date] = js.native

  def tuesdays(start: Date, stop: Date, step: Double = ???): js.Array[Date] = js.native

  def wednesdays(start: Date, stop: Date, step: Double = ???): js.Array[Date] = js.native

  def thursdays(start: Date, stop: Date, step: Double = ???): js.Array[Date] = js.native

  def fridays(start: Date, stop: Date, step: Double = ???): js.Array[Date] = js.native

  def saturdays(start: Date, stop: Date, step: Double = ???): js.Array[Date] = js.native

  def months(start: Date, stop: Date, step: Double = ???): js.Array[Date] = js.native

  def years(start: Date, stop: Date, step: Double = ???): js.Array[Date] = js.native

  def dayOfYear(d: Date): Double = js.native

  def weekOfYear(d: Date): Double = js.native

  def sundayOfYear(d: Date): Double = js.native

  def mondayOfYear(d: Date): Double = js.native

  def tuesdayOfYear(d: Date): Double = js.native

  def wednesdayOfYear(d: Date): Double = js.native

  def fridayOfYear(d: Date): Double = js.native

  def saturdayOfYear(d: Date): Double = js.native

  def format(specifier: String): Format = js.native

  def scale(): Scale[Double, Double] = js.native


  //TODO def scale[Output](): Scale[Output, Output] = js.native
  //TODO def scale[Range, Output](): Scale[Range, Output] = js.native
  //Forwarders
  def format: timeModule.FormatObject = js.native
}

package timeModule {

@js.native
trait Interval extends js.Object {
  def apply(d: Date): Date = js.native

  def floor(d: Date): Date = js.native

  def round(d: Date): Date = js.native

  def ceil(d: Date): Date = js.native

  def range(start: Date, stop: Date, step: Double): js.Array[Date] = js.native

  def offset(date: Date, step: Double): Date = js.native

  var utc: js.Any = js.native
}


@JSName("d3.time.format")
@js.native
trait FormatObject extends js.Object {
  def multi(formats: js.Array[js.Tuple2[String, js.Function1[Date, Boolean | Double]]]): Format = js.native

  def utc(specifier: String): Format = js.native

  var iso: Format = js.native

  //Forwarders
  def utc: formatModule.UtcObject = js.native
}

package formatModule {

@JSName("d3.time.format.utc")
@js.native
trait UtcObject extends js.Object {
  def multi(formats: js.Array[js.Tuple2[String, js.Function1[Date, Boolean | Double]]]): Format = js.native
}

}

@js.native
trait Format extends js.Object {
  def apply(d: Date): String = js.native

  def parse(input: String): Date = js.native
}

@JSName("d3.time.scale")
@js.native
trait ScaleObject extends js.Object {
  def utc(): Scale[Double, Double] = js.native

  //TODO def utc[Output](): Scale[Output, Output] = js.native
  //TODO def utc[Range, Output](): Scale[Range, Output] = js.native
}


@js.native
trait Scale[Range, Output] extends BaseScale[Date,Range,Scale[Range, Output]] {
  def apply(x: Date): Output = js.native

  def nice(): Scale[Range, Output] = js.native

  def nice(interval: Interval, step: Double): Scale[Range, Output] = js.native

  def rangeRound(values: js.Array[Double]): Scale[Double, Double] = js.native

  def interpolate(): js.Function2[Range, Range, js.Function1[Double, Output]] = js.native

  def interpolate(factory: js.Function2[Range, Range, js.Function1[Double, Output]]): Scale[Range, Output] = js.native

  def clamp(): Boolean = js.native

  def clamp(clamp: Boolean): Scale[Range, Output] = js.native

  def ticks(): js.Array[Date] = js.native

  def ticks(interval: Interval, step: Double): js.Array[Date] = js.native

  def ticks(count: Double): js.Array[Date] = js.native

  def tickFormat(count: Double): js.Function1[Date, String] = js.native

  def copy(): Scale[Range, Output] = js.native
}

}

