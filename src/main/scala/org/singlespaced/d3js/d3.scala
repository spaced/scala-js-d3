
package org.singlespaced.d3js

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.JSName


@JSName("d3")
@js.native
object d3 extends js.Object  {

  type Primitive = Double | String | Boolean

  var version: String = js.native
  def select(selector: String): Selection[c] = js.native
  def select(node: dom.EventTarget): Selection[dom.EventTarget] = js.native
  def selectAll(selector: String): Selection[dom.EventTarget] = js.native
  def selectAll(nodes: js.Array[dom.EventTarget]): Selection[dom.EventTarget] = js.native
  def selection(): Selection[dom.Element] = js.native
  def transition(): Transition[dom.Element] = js.native
  def ease(`type`: String, args: js.Any*): js.Function1[Double, Double] = js.native
  def timer(func: js.Function0[Any], delay: Double = ???, time: Double = ???): Unit = js.native
  var event: dom.Event | BaseEvent = js.native
  def mouse(container: dom.EventTarget): js.Tuple2[Double, Double] = js.native
  def touch(container: dom.EventTarget, identifer: Double): js.Tuple2[Double, Double] = js.native
  def touch(container: dom.EventTarget, touches: dom.TouchList, identifer: Double): js.Tuple2[Double, Double] = js.native
  def touches(container: dom.EventTarget, touches: dom.TouchList = ???): js.Array[js.Tuple2[Double, Double]] = js.native
  def ascending(a: Primitive, b: Primitive): Double = js.native
  def descending(a: Primitive, b: Primitive): Double = js.native
  def min(array: js.Array[Double]): Double = js.native
  def minString(array: js.Array[String]): String = js.native
  def min[T <: Numeric](array: js.Array[T]): T = js.native
  def min[T](array: js.Array[T], accessor: js.Function2[T, Double, Double]): Double = js.native
  def min[T](array: js.Array[T], accessor: js.Function2[T, Double, String]): String = js.native
  def min[T, U <: Numeric](array: js.Array[T], accessor: js.Function2[T, Double, U]): U = js.native
  def max(array: js.Array[Double]): Double = js.native
  def maxString(array: js.Array[String]): String = js.native
  def max[T <: Numeric](array: js.Array[T]): T = js.native
  def max[T](array: js.Array[T], accessor: js.Function2[T, Double, Double]): Double = js.native
  def max[T](array: js.Array[T], accessor: js.Function2[T, Double, String]): String = js.native
  def max[T, U <: Numeric](array: js.Array[T], accessor: js.Function2[T, Double, U]): U = js.native
  //TODO def extent(array: js.Array[Double]): js.Tuple2[Double, Double] = js.native
  //TODO def extent(array: js.Array[String]): js.Tuple2[String, String] = js.native
  def extent[T](array: js.Array[T]): js.Tuple2[T, T] = js.native
  //TODO def extent[T <: Numeric](array: js.Array[T | Primitive]): js.Tuple2[T | Primitive, T | Primitive] = js.native
  //TODO def extent[T]              (array: js.Array[T], accessor: js.Function2[T, Double, Double]): js.Tuple2[Double, Double] = js.native
  //TODO def extent[T]              (array: js.Array[T], accessor: js.Function2[T, Double, String]): js.Tuple2[String, String] = js.native
  //TODO def extent[T, U <: Numeric](array: js.Array[U], accessor: js.Function2[T, Double, U]): js.Tuple2[U | Primitive, U | Primitive] = js.native
  def sum(array: js.Array[Double]): Double = js.native
  def sum[T](array: js.Array[T], accessor: js.Function2[T, Double, Double]): Double = js.native
  def mean(array: js.Array[Double]): Double = js.native
  def mean[T](array: js.Array[T], accessor: js.Function2[T, Double, Double]): Double = js.native
  def quantile(array: js.Array[Double], p: Double): Double = js.native
  def variance(array: js.Array[Double]): Double = js.native
  def variance[T](array: js.Array[T], accessor: js.Function2[T, Double, Double]): Double = js.native
  def deviation(array: js.Array[Double]): Double = js.native
  def deviation[T](array: js.Array[T], accessor: js.Function2[T, Double, Double]): Double = js.native
  def bisectLeft(array: js.Array[Double], x: Double, lo: Double , hi: Double ): Double = js.native
  def bisectLeft(array: js.Array[String], x: String, lo: Double = ???, hi: Double = ???): Double = js.native
  //TODO:fix var bisect: bisectRight.type = js.native
  def bisectRight[T](array: js.Array[T], x: T, lo: Double , hi: Double ): Double = js.native
  def bisector[T, U](accessor: js.Function1[T, U]): js.Any = js.native
  def bisector[T, U](comparator: js.Function2[T, U, Double]): js.Any = js.native
  def shuffle[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  def keys(`object`: Object): js.Array[String] = js.native
  def values[T](`object`: js.Dictionary[T]): js.Array[T] = js.native
  def values[T](`object`: js.Any): js.Array[T] = js.native
  def values(`object`: Object): js.Array[js.Any] = js.native
  def entries[T](`object`: js.Dictionary[T]): js.Array[js.Any] = js.native
  def entries(`object`: Object): js.Array[js.Any] = js.native
  def map[T](): Map[T] = js.native
  def map[T](`object`: Map[T]): Map[T] = js.native
  def map[T](`object`: js.Dictionary[T]): Map[T] = js.native
  def map[T](`object`: js.Any): Map[T] = js.native
  def map[T](array: js.Array[T], key: js.Function2[T, Double, String]): Map[T] = js.native
  def set(): Set = js.native
  def set(array: js.Array[String]): Set = js.native
  def merge[T](arrays: js.Array[js.Array[T]]): js.Array[T] = js.native
  def range(stop: Double): js.Array[Double] = js.native
  def range(start: Double, stop: Double, step: Double = ???): js.Array[Double] = js.native
  def permute[T](array: js.Any, keys: js.Array[Double]): js.Array[T] = js.native
  def permute[T](`object`: js.Dictionary[T], keys: js.Array[String]): js.Array[T] = js.native
  def zip[T](arrays: js.Array[T]*): js.Array[js.Array[T]] = js.native
  def transpose[T](matrix: js.Array[js.Array[T]]): js.Array[js.Array[T]] = js.native
  def pairs[T](array: js.Array[T]): js.Array[js.Tuple2[T, T]] = js.native
  def nest[T](): Nest[T] = js.native
  def transform(transform: String): Transform = js.native
  def format(specifier: String): js.Function1[Double, String] = js.native
  def formatPrefix(value: Double, precision: Double = ???): FormatPrefix = js.native
  def round(x: Double, n: Double = ???): Double = js.native
  def requote(string: String): String = js.native
  def functorWithFun[T <: js.Function](value: T): T = js.native
  def functor[T](value: T): js.Function0[T] = js.native
  def rebind(target: js.Any, source: js.Any, names: String*): js.Dynamic = js.native
  def dispatch(names: String*): Dispatch = js.native
  def interpolate(a: Double, b: Double): js.Function1[Double, Double] = js.native
  def interpolate(a: String, b: String): js.Function1[Double, String] = js.native
  def interpolate(a: String | Color, b: Color): js.Function1[Double, String] = js.native
  //TODO def interpolate(a: js.Array[String | Color], b: js.Array[Color]): js.Function1[Double, String] = js.native
  //TODO def interpolate[Range, Output](a: js.Array[Range], b: js.Array[Output]): js.Function1[Double, js.Array[Output]] = js.native
  def interpolate[Range, Output](a: js.Array[Range], b: js.Array[Range]): js.Function1[Double, js.Array[Output]] = js.native
  //TODO def interpolate(a: js.Dictionary[String | Color], b: js.Dictionary[Color]): js.Function1[Double, js.Dictionary[String]] = js.native
  def interpolate[Range, Output](a: js.Dictionary[Range], b: js.Dictionary[Output]): js.Function1[Double, js.Dictionary[Output]] = js.native
  //TODO def interpolate[Range, Output](a: js.Dictionary[Range], b: js.Dictionary[Range]): js.Function1[Double, js.Dictionary[Output]] = js.native
  def interpolateNumber(a: Double, b: Double): js.Function1[Double, Double] = js.native
  def interpolateRound(a: Double, b: Double): js.Function1[Double, Double] = js.native
  def interpolateString(a: String, b: String): js.Function1[Double, String] = js.native
  def interpolateRgb(a: String | Color, b: String | Color): js.Function1[Double, String] = js.native
  def interpolateHsl(a: String | Color, b: String | Color): js.Function1[Double, String] = js.native
  def interpolateLab(a: String | Color, b: String | Color): js.Function1[Double, String] = js.native
  def interpolateHcl(a: String | Color, b: String | Color): js.Function1[Double, String] = js.native
  //TODO def interpolateArray(a: js.Array[String | Color], b: js.Array[Color]): js.Function1[Double, js.Array[String]] = js.native
  def interpolateArray[Range, Output](a: js.Array[Range], b: js.Array[Range]): js.Function1[Double, js.Array[Output]] = js.native
  //TODO def interpolateArray[Range, Output](a: js.Array[Range], b: js.Array[Output]): js.Function1[Double, js.Array[Output]] = js.native
  //TODO def interpolateObject(a: js.Dictionary[String | Color], b: js.Dictionary[Color]): js.Function1[Double, js.Dictionary[String]] = js.native
  def interpolateObject[Range, Output](a: js.Dictionary[Range], b: js.Dictionary[Output]): js.Function1[Double, js.Dictionary[Output]] = js.native
  //TODO def interpolateObject[Range, Output](a: js.Dictionary[Range], b: js.Dictionary[Range]): js.Function1[Double, js.Dictionary[Output]] = js.native
  def interpolateTransform(a: String | Transform, b: String | Transform): js.Function1[Double, String] = js.native
  def interpolateZoom(a: js.Tuple3[Double, Double, Double], b: js.Tuple3[Double, Double, Double]): js.Any = js.native
  var interpolators: js.Array[js.Function2[js.Any, js.Any, js.Function1[Double, Any]]] = js.native
  def xhr(url: String, mimeType: String = ???, callback: js.Function2[js.Any, js.Any, Unit] = ???): Xhr = js.native
  def xhr(url: String, callback: js.Function2[js.Any, js.Any, Unit]): Xhr = js.native
  def text(url: String, mimeType: String = ???, callback: js.Function2[js.Any, String, Unit] = ???): Xhr = js.native
  def text(url: String, callback: js.Function2[js.Any, String, Unit]): Xhr = js.native
  def json(url: String, callback: js.Function2[js.Any, js.Any, Unit] = ???): Xhr = js.native
  def xml(url: String, mimeType: String = ???, callback: js.Function2[js.Any, js.Any, Unit] = ???): Xhr = js.native
  def xml(url: String, callback: js.Function2[js.Any, js.Any, Unit]): Xhr = js.native
  def html(url: String, callback: js.Function2[js.Any, dom.DocumentFragment, Unit] = ???): Xhr = js.native
  var csv: Dsv = js.native
  var tsv: Dsv = js.native
  def dsv(delimiter: String, mimeType: String): Dsv = js.native
  def locale(definition: LocaleDefinition): Locale = js.native
  //forwarders

  def behavior:BehaviorObject=js.native
  def geo:GeoObject=js.native
  def geom:GeomObject=js.native
  def layout:LayoutObject=js.native
  //TODO def transition=d3modules.transition
  def timer:TimerObject=js.native
  def random:RandomObject=js.native
  def rgb:RgbObject=js.native
  def hsl:HslObject=js.native
  def hcl:HclObject=js.native
  def lab:LabObject=js.native
  def color:ColorObject=js.native
  def scale:ScaleObject=js.native
  def ns:NsObject=js.native
  def svg:SvgObject=js.native
  def time:TimeObject=js.native



}

