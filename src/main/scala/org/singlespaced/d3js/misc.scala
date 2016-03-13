package org.singlespaced.d3js

import org.scalajs.dom
import d3.Primitive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSBracketAccess, JSName}


@js.native
trait Numeric extends js.Object {
  override def valueOf(): Double = js.native
}


@JSName("d3.transition")
@js.native
trait TransitionObject extends js.Object {
  var prototype: Transition[js.Any] = js.native
}


@js.native
trait BaseScale[Datum,Range, T <: BaseScale[Datum,Range,T]] extends js.Function1[Double,Double] {
  def domain(): js.Array[Datum] = js.native

  def domain(values: js.Array[Datum]): T = js.native

  def invert(y: Double): Datum = js.native

  def range(values: js.Array[Range]): T = js.native

  def range(): js.Array[Range] = js.native
}

@js.native
trait BaseDom[Datum,T <: BaseDom[Datum,T]] extends js.Object {
//  self: T =>

  type DatumFunction[M]=js.Function3[Datum, Int, js.UndefOr[Int], M]
  type SelfOrDatumFunction[M]=M | js.Function3[Datum, Int, Int, M]

  def attr(name: String, value: Primitive): T = js.native
  def attr(name: String, value: DatumFunction[Primitive]): T = js.native
  def attr(obj: js.Dictionary[SelfOrDatumFunction[Primitive]]): T = js.native

  def style(name: String, value: Primitive): T = js.native
  def style(name: String, value: Primitive,priority: String): T = js.native
  def style(name: String, value: DatumFunction[Primitive], priority: String = ???): T = js.native

  def text(value: Primitive): T = js.native
  def text(value: DatumFunction[Primitive]): T = js.native

  def filter(selector: String): T = js.native

  def remove(): T = js.native

  def empty(): Boolean = js.native

  def call(func: js.Function, args: js.Any*): T = js.native

  def node(): dom.EventTarget = js.native

  def size(): Double = js.native
}



@js.native
trait Transition[Datum] extends BaseDom[Datum,Transition[Datum]] {

  def transition(): Transition[Datum] = js.native

  def delay(): Double = js.native

  def delay(delay: Double): Transition[Datum] = js.native

  def delay(delay: DatumFunction[Double]): Transition[Datum] = js.native

  def duration(): Double = js.native

  def duration(duration: Double): Transition[Datum] = js.native

  def duration(duration: DatumFunction[Double]): Transition[Datum] = js.native

  def ease(): js.Function1[Double, Double] = js.native

  def ease(value: String, args: js.Any*): Transition[Datum] = js.native

  def ease(value: js.Function1[Double, Double]): Transition[Datum] = js.native

  def attrTween(name: String, tween: js.Function3[Datum, Double, String, js.Function1[Double, Primitive]]): Transition[Datum] = js.native

  def styleTween(name: String, tween: js.Function3[Datum, Double, String, js.Function1[Double, Primitive]], priority: String = ???): Transition[Datum] = js.native

  def tween(name: String, factory: js.Function0[js.Function1[Double, Any]]): Transition[Datum] = js.native

  def select(selector: String): Transition[Datum] = js.native

  def select(selector: js.Function2[Datum, Double, dom.EventTarget]): Transition[Datum] = js.native

  def selectAll(selector: String): Transition[js.Any] = js.native

  def selectAll(selector: js.Function2[Datum, Double, js.Array[dom.EventTarget]]): Transition[js.Any] = js.native

  def filter(selector: js.Function2[Datum, Double, Boolean]): Transition[Datum] = js.native

  def each(`type`: String, listener: js.Function2[Datum, Double, Any]): Transition[Datum] = js.native

  def each(listener: js.Function2[Datum, Double, Any]): Transition[Datum] = js.native

}

@JSName("d3.timer")
@js.native
trait TimerObject extends js.Object {
  def flush(): Unit = js.native
}

@js.native
trait BaseEvent extends js.Object {
  var `type`: String = js.native
  var sourceEvent: dom.Event = js.native
}

@js.native
trait ZoomEvent extends BaseEvent {
  var scale: Double = js.native
  var translate: js.Tuple2[Double, Double] = js.native
}

@js.native
trait DragEvent extends BaseEvent {
  var x: Double = js.native
  var y: Double = js.native
  var dx: Double = js.native
  var dy: Double = js.native
}

@js.native
trait Map[T] extends js.Object {
  def has(key: String): Boolean = js.native

  def get(key: String): T = js.native

  def set(key: String, value: T): T = js.native

  def remove(key: String): Boolean = js.native

  def keys(): js.Array[String] = js.native

  def values(): js.Array[T] = js.native

  def entries(): js.Array[js.Any] = js.native

  def forEach(func: js.Function2[String, T, Any]): Unit = js.native

  def empty(): Boolean = js.native

  def size(): Double = js.native
}

@js.native
trait Set extends js.Object {
  def has(value: String): Boolean = js.native

  def add(value: String): String = js.native

  def remove(value: String): Boolean = js.native

  def values(): js.Array[String] = js.native

  def forEach(func: js.Function1[String, Any]): Unit = js.native

  def empty(): Boolean = js.native

  def size(): Double = js.native
}

@js.native
trait Nest[T] extends js.Object {
  def key(func: js.Function1[T, String]): Nest[T] = js.native

  def sortKeys(comparator: js.Function2[String, String, Double]): Nest[T] = js.native

  def sortValues(comparator: js.Function2[T, T, Double]): Nest[T] = js.native

  def rollup[U](func: js.Function1[js.Array[T], U]): Nest[T] = js.native

  def map(array: js.Array[T]): js.Dictionary[js.Any] = js.native

  //TODO:Fix map def map(array: js.Array[T], mapType: d3.map.type): Map[js.Any] = js.native
  def entries(array: js.Array[T]): js.Array[js.Any] = js.native
}

@JSName("d3.random")
@js.native
trait RandomObject extends js.Object {
  def normal(mean: Double = ???, deviation: Double = ???): js.Function0[Double] = js.native

  def logNormal(mean: Double = ???, deviation: Double = ???): js.Function0[Double] = js.native

  def bates(count: Double): js.Function0[Double] = js.native

  def irwinHall(count: Double): js.Function0[Double] = js.native
}

@js.native
trait Transform extends js.Object {
  var rotate: Double = js.native
  var translate: js.Tuple2[Double, Double] = js.native
  var skew: Double = js.native
  var scale: js.Tuple2[Double, Double] = js.native

  override def toString(): String = js.native
}

@js.native
trait FormatPrefix extends js.Object {
  var symbol: String = js.native

  def scale(n: Double): Double = js.native
}

@js.native
@JSName("d3.rgb")
trait RgbObject extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(r),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(g),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(b),false,Some(TypeRef(CoreType(number),List())))),Some(TypeRef(TypeName(Rgb),List())))) */
  /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(color),false,Some(TypeRef(CoreType(string),List())))),Some(TypeRef(TypeName(Rgb),List())))) */
  def apply(r: Double, g: Double, b: Double): Rgb = js.native

  def apply(color: String): Rgb = js.native
}

@js.native
trait Rgb extends Color {
  var r: Double = js.native
  var g: Double = js.native
  var b: Double = js.native

  def brighter(k: Double = ???): Rgb = js.native

  def darker(k: Double = ???): Rgb = js.native

  def hsl(): Hsl = js.native

  override def toString(): String = js.native
}

@js.native
@JSName("d3.hsl")
trait HslObject extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(h),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(s),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(l),false,Some(TypeRef(CoreType(number),List())))),Some(TypeRef(TypeName(Hsl),List())))) */
  /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(color),false,Some(TypeRef(CoreType(string),List())))),Some(TypeRef(TypeName(Hsl),List())))) */
  def apply(h: Double, s: Double, l: Double): Hsl = js.native

  def apply(color: String): Hsl = js.native
}

@js.native
trait Hsl extends Color {
  var h: Double = js.native
  var s: Double = js.native
  var l: Double = js.native

  def brighter(k: Double = ???): Hsl = js.native

  def darker(k: Double = ???): Hsl = js.native

  override def rgb(): Rgb = js.native

  override def toString(): String = js.native
}

@js.native
@JSName("d3.hcl")
trait HclObject extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(h),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(c),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(l),false,Some(TypeRef(CoreType(number),List())))),Some(TypeRef(TypeName(Hcl),List())))) */
  /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(color),false,Some(TypeRef(CoreType(string),List())))),Some(TypeRef(TypeName(Hcl),List())))) */
  def apply(h: Double, c: Double, l: Double): Hcl = js.native

  def apply(color: String): Hcl = js.native
}

@js.native
trait Hcl extends Color {
  var h: Double = js.native
  var c: Double = js.native
  var l: Double = js.native

  def brighter(k: Double = ???): Hcl = js.native

  def darker(k: Double = ???): Hcl = js.native
}

@js.native
@JSName("d3.lab")
trait LabObject extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(l),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(a),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(b),false,Some(TypeRef(CoreType(number),List())))),Some(TypeRef(TypeName(Lab),List())))) */
  /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(color),false,Some(TypeRef(CoreType(string),List())))),Some(TypeRef(TypeName(Lab),List())))) */
  def apply(l: Double, a: Double, b: Double): Lab = js.native

  def apply(color: String): Lab = js.native
}

@js.native
trait Lab extends Color {
  var l: Double = js.native
  var a: Double = js.native
  var b: Double = js.native

  def brighter(k: Double = ???): Lab = js.native

  def darker(k: Double = ???): Lab = js.native

  override def rgb(): Rgb = js.native

  override def toString(): String = js.native
}

@js.native
@JSName("d3.color")
trait ColorObject extends js.Object {
  def apply(): Color = js.native

  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Color),List())))) */
}

@js.native
trait Color extends js.Object {
  def rgb(): Rgb = js.native
}


@js.native
trait Dispatch extends js.Object {
  def on(`type`: String): js.Function = js.native

  def on(`type`: String, listener: js.Function): Dispatch = js.native

  @JSBracketAccess
  def apply(event: String): js.Function = js.native

  @JSBracketAccess
  def update(event: String, v: js.Function): Unit = js.native
}


@js.native
trait Xhr extends js.Object {
  def header(name: String): String = js.native

  def header(name: String, value: String): Xhr = js.native

  def mimeType(): String = js.native

  def mimeType(`type`: String): Xhr = js.native

  def responseType(): String = js.native

  def responseType(`type`: String): Xhr = js.native

  def response(): js.Function1[dom.XMLHttpRequest, Any] = js.native

  def response(value: js.Function1[dom.XMLHttpRequest, Any]): Xhr = js.native

  def get(callback: js.Function2[js.Any, js.Any, Unit] = ???): Xhr = js.native

  def post(data: js.Any = ???, callback: js.Function2[js.Any, js.Any, Unit] = ???): Xhr = js.native

  def post(callback: js.Function2[js.Any, js.Any, Unit]): Xhr = js.native

  def send(method: String, data: js.Any = ???, callback: js.Function2[js.Any, js.Any, Unit] = ???): Xhr = js.native

  def send(method: String, callback: js.Function2[js.Any, js.Any, Unit]): Xhr = js.native

  def abort(): Xhr = js.native

  def on(`type`: String): js.Function = js.native

  def on(`type`: String, listener: js.Function): Xhr = js.native
}

@js.native
trait Dsv extends js.Object {
  def apply(url: String, callback: js.Function1[js.Array[js.Dictionary[String]], Unit]): DsvXhr[js.Dictionary[String]] = js.native

  def apply(url: String, callback: js.Function2[js.Any, js.Array[js.Dictionary[String]], Unit]): DsvXhr[js.Dictionary[String]] = js.native

  def apply(url: String): DsvXhr[js.Dictionary[String]] = js.native

  //TODO def apply[T](url: String, accessor: js.Function1[js.Dictionary[String], T], callback: js.Function1[js.Array[T], Unit]): DsvXhr[T] = js.native
  //TODO def apply[T](url: String, accessor: js.Function1[js.Dictionary[String], T], callback: js.Function2[js.Any, js.Array[T], Unit]): DsvXhr[T] = js.native
  //TODO def apply[T](url: String, accessor: js.Function1[js.Dictionary[String], T]): DsvXhr[T] = js.native
  def parse(string: String): js.Array[js.Dictionary[String]] = js.native

  def parse[T](string: String, accessor: js.Function2[js.Dictionary[String], Double, T]): js.Array[T] = js.native

  def parseRows(string: String): js.Array[js.Array[String]] = js.native

  def parseRows[T](string: String, accessor: js.Function2[js.Array[String], Double, T]): js.Array[T] = js.native

  def format(rows: js.Array[Object]): String = js.native

  def formatRows(rows: js.Array[js.Array[String]]): String = js.native
}

@js.native
trait DsvXhr[T] extends Xhr {
  def row(): js.Function1[js.Dictionary[String], T] = js.native

  def row[U](accessor: js.Function1[js.Dictionary[String], U]): DsvXhr[U] = js.native

  override def header(name: String): String = js.native

  override def header(name: String, value: String): DsvXhr[T] = js.native

  override def mimeType(): String = js.native

  override def mimeType(`type`: String): DsvXhr[T] = js.native

  override def responseType(): String = js.native

  override def responseType(`type`: String): DsvXhr[T] = js.native

  override def response(): js.Function1[dom.XMLHttpRequest, Any] = js.native

  override def response(value: js.Function1[dom.XMLHttpRequest, Any]): DsvXhr[T] = js.native

  def get(callback: js.Function2[js.Any, T, Unit]): DsvXhr[T] = js.native

  def post(data: js.Any, callback: js.Function2[js.Any, T, Unit]): DsvXhr[T] = js.native

  def post(callback: js.Function2[js.Any, T, Unit]): DsvXhr[T] = js.native

  def send(method: String, data: js.Any, callback: js.Function2[js.Any, T, Unit]): DsvXhr[T] = js.native

  def send(method: String, callback: js.Function2[js.Any, T, Unit]): DsvXhr[T] = js.native

  override def abort(): DsvXhr[T] = js.native

  override def on(`type`: String): js.Function = js.native

  override def on(`type`: String, listener: js.Function): DsvXhr[T] = js.native
}

@js.native
trait LocaleDefinition extends js.Object {
  var decimal: String = js.native
  var thousands: String = js.native
  var grouping: js.Array[Double] = js.native
  var currency: js.Tuple2[String, String] = js.native
  var dateTime: String = js.native
  var date: String = js.native
  var time: String = js.native
  var periods: js.Tuple2[String, String] = js.native
  var days: js.Tuple7[String, String, String, String, String, String, String] = js.native
  var shortDays: js.Tuple7[String, String, String, String, String, String, String] = js.native
  var months: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
  var shortMonths: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
}

@js.native
trait Locale extends js.Object {
  def numberFormat(specifier: String): js.Function1[Double, String] = js.native

  var timeFormat: js.Any = js.native
}



