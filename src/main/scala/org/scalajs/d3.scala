package org.scalajs.d3

import scala.scalajs.js
import js.annotation._
import scala.scalajs.js.Date
import org.scalajs.dom.XMLHttpRequest
import org.scalajs.dom.Document
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import org.scalajs.dom.EventTarget
import org.scalajs.dom.Event

package D3 {
  trait Selectors extends js.Object {
    def select(): Selection = js.native
    def select(selector: String): Selection = js.native
    def select(element: EventTarget): Selection = js.native
    def selectAll(selector: String): Selection = js.native
    def selectAll(elements: js.Array[EventTarget]): Selection = js.native
  }

  trait D3Event extends Event {
    var dx: Double = js.native
    var dy: Double = js.native
    var clientX: Double = js.native
    var clientY: Double = js.native
    var translate: js.Array[Double] = js.native
    var scale: Double = js.native
    var sourceEvent: D3Event = js.native
    var x: Double = js.native
    var y: Double = js.native
    var keyCode: Double = js.native
    var altKey: js.Any = js.native
    //var `type`: String = js.native
  }

  trait Base extends Selectors {
    var behavior: Behavior.Behavior = js.native
    var event: D3Event = js.native
    def ascending[T](a: T, b: T): Double = js.native
    def descending[T](a: T, b: T): Double = js.native
    def min[T, U](arr: js.Array[T], map: js.Function2[T, Double, U]): U = js.native
    def min[T](arr: js.Array[T]): T = js.native
    def max[T, U](arr: js.Array[T], map: js.Function2[T, Double, U]): U = js.native
    def max[T](arr: js.Array[T]): T = js.native
    def extent[T, U](arr: js.Array[T], map: js.Function1[T, U]): js.Array[U] = js.native
    def extent[T](arr: js.Array[T]): js.Array[T] = js.native
    def sum[T](arr: js.Array[T], map: js.Function1[T, Double]): Double = js.native
    def sum(arr: js.Array[Double]): Double = js.native
    def mean[T](arr: js.Array[T], map: js.Function1[T, Double]): Double = js.native
    def mean(arr: js.Array[Double]): Double = js.native
    def median[T](arr: js.Array[T], map: js.Function1[T, Double]): Double = js.native
    def median(arr: js.Array[Double]): Double = js.native
    var quantile: js.Function2[js.Array[Double], Double, Double] = js.native
    def bisect[T](arr: js.Array[T], x: T, low: Double = js.native, high: Double = js.native): Double = js.native
    def bisectLeft[T](arr: js.Array[T], x: T, low: Double = js.native, high: Double = js.native): Double = js.native
    def bisectRight[T](arr: js.Array[T], x: T, low: Double = js.native, high: Double = js.native): Double = js.native
    def bisector(accessor: js.Function2[js.Any, Double, Any]): js.Dynamic = js.native
    def shuffle[T](arr: js.Array[T]): js.Array[T] = js.native
    def permute(arr: js.Array[js.Any], indexes: js.Array[js.Any]): js.Array[js.Any] = js.native
    def zip(arrs: js.Any*): js.Array[js.Any] = js.native
    def transform(definition: String): js.Dynamic = js.native
    def transpose(matrix: js.Array[js.Any]): js.Array[js.Any] = js.native
    def pairs(arr: js.Array[js.Any]): js.Array[js.Array[js.Any]] = js.native
    def keys(map: js.Any): js.Array[String] = js.native
    def values(map: js.Any): js.Array[js.Any] = js.native
    def entries(map: js.Any): js.Array[js.Any] = js.native
    def merge(map: js.Any*): js.Array[js.Any] = js.native
    def range(stop: Double, step: Double ): js.Array[Double] = js.native
    def range(start: Double, stop: Double , step: Double ): js.Array[Double] = js.native
    def nest(): Nest = js.native
    def xhr(url: String, callback: js.Function1[XMLHttpRequest, Unit] ): Xhr = js.native
    def xhr(url: String, mime: String, callback: js.Function1[XMLHttpRequest, Unit] ): Xhr = js.native
    def text(url: String, callback: js.Function1[String, Unit] ): Xhr = js.native
    def text(url: String, mime: String, callback: js.Function1[String, Unit]): Xhr = js.native
    var json: js.Function2[String, js.Function2[js.Any, js.Any, Unit], Xhr] = js.native
    def xml(url: String, callback: js.Function1[Document, Unit]): Xhr = js.native
    def xml(url: String, mime: String, callback: js.Function1[Document, Unit]): Xhr = js.native
    var html: js.Function2[String, js.Function1[DocumentFragment, Unit], Xhr] = js.native
    var csv: Dsv = js.native
    var tsv: Dsv = js.native
    var time: Time.Time = js.native
    var scale: Scale.ScaleBase = js.native
    var interpolate: Transition.BaseInterpolate = js.native
    var interpolateNumber: Transition.BaseInterpolate = js.native
    var interpolateRound: Transition.BaseInterpolate = js.native
    var interpolateString: Transition.BaseInterpolate = js.native
    var interpolateRgb: Transition.BaseInterpolate = js.native
    var interpolateHsl: Transition.BaseInterpolate = js.native
    var interpolateHcl: Transition.BaseInterpolate = js.native
    var interpolateLab: Transition.BaseInterpolate = js.native
    var interpolateArray: Transition.BaseInterpolate = js.native
    var interpolateObject: Transition.BaseInterpolate = js.native
    var interpolateTransform: Transition.BaseInterpolate = js.native
    var interpolators: js.Array[Transition.InterpolateFactory] = js.native
    var layout: Layout.Layout = js.native
    var svg: Svg.Svg = js.native
    var random: Random = js.native
    def format(specifier: String): js.Function1[Double, String] = js.native
    def formatPrefix(value: Double, precision: Double = js.native): MetricPrefix = js.native
    var version: String = js.native
    def selection(): Selection = js.native
    var ns: js.Any = js.native
    var ease: js.Function = js.native
    def rgb(r: Double, g: Double, b: Double): Color.RGBColor = js.native
    def rgb(color: String): Color.RGBColor = js.native
    def hcl(h: Double, c: Double, l: Double): Color.HCLColor = js.native
    def hcl(color: String): Color.HCLColor = js.native
    def hsl(h: Double, s: Double, l: Double): Color.HSLColor = js.native
    def hsl(color: String): Color.HSLColor = js.native
    def lab(l: Double, a: Double, b: Double): Color.LABColor = js.native
    def lab(color: String): Color.LABColor = js.native
    var geo: Geo.Geo = js.native
    var geom: Geom.Geom = js.native
    def mouse(container: js.Any): js.Array[Double] = js.native
    def touches(container: js.Any): js.Array[js.Array[Double]] = js.native
    def functor[R, T](value: js.Function1[R, T]): js.Function1[R, T] = js.native
    def functor[T](value: T): js.Function1[js.Any, T] = js.native
    def map(): Map[js.Any] = js.native
    def set(): Set[js.Any] = js.native
    def map[T](`object`: js.Any): Map[T] = js.native
    def set[T](array: js.Array[T]): Set[T] = js.native
    def dispatch(types: String*): Dispatch = js.native
    def rebind(target: js.Any, source: js.Any, names: js.Any*): js.Dynamic = js.native
    def requote(str: String): String = js.native
    var timer: js.Any = js.native
    def transition(): Transition.Transition = js.native
    def round(x: Double, n: Double): Double = js.native
  }

  trait Dispatch extends js.Object {
    @JSBracketAccess
    def apply(event: String): js.Any = js.native
    @JSBracketAccess
    def update(event: String, v: js.Any): Unit = js.native
    def on(`type`: String): js.Dynamic = js.native
    def on(`type`: String, listener: js.Any): js.Dynamic = js.native
  }

  trait MetricPrefix extends js.Object {
    var scale: js.Function1[Double, Double] = js.native
    var symbol: String = js.native
  }

  trait Xhr extends js.Object {
    def header(name: String): String = js.native
    def header(name: String, value: String): Xhr = js.native
    def mimeType(): String = js.native
    def mimeType(`type`: String): Xhr = js.native
    def response(): js.Function1[XMLHttpRequest, Any] = js.native
    def response(value: js.Function1[XMLHttpRequest, Any]): Xhr = js.native
    def get(callback: js.Function1[XMLHttpRequest, Unit] = js.native): Xhr = js.native
    def post(callback: js.Function1[XMLHttpRequest, Unit] ): Xhr = js.native
    def post(data: js.Any, callback: js.Function1[XMLHttpRequest, Unit] ): Xhr = js.native
    def send(method: String, callback: js.Function1[XMLHttpRequest, Unit] ): Xhr = js.native
    def send(method: String, data: js.Any, callback: js.Function1[XMLHttpRequest, Unit] ): Xhr = js.native
    def abort(): Xhr = js.native
    var on: js.Function2[String, js.Function2[js.Any, Double, Any], Xhr] = js.native
  }

  trait Dsv extends js.Object {
    def apply(url: String, callback: js.Function2[js.Any, js.Array[js.Any], Unit] = js.native): Xhr = js.native
    def parse(string: String): js.Array[js.Any] = js.native
    def parseRows(string: String, accessor: js.Function2[js.Array[js.Any], Double, Any]): js.Dynamic = js.native
    def format(rows: js.Array[js.Any]): String = js.native
  }

  trait Selection extends js.Array[js.Any] with Selectors {
    def attr(name: String): String = js.native
    def attr(name: String, value: js.Any): Selection = js.native
    def attr(name: String, valueFunction: js.Function2[js.Any, Double, Any]): Selection = js.native
    def attr(attrValueMap: Object): Selection = js.native
    def classed(name: String): String = js.native
    def classed(name: String, value: js.Any): Selection = js.native
    def classed(name: String, valueFunction: js.Function2[js.Any, Double, Any]): Selection = js.native
    def classed(classValueMap: Object): Selection = js.native
    def style(name: String): String = js.native
    def style(name: String, value: js.Any, priority: String ): Selection = js.native
    def style(name: String, valueFunction: js.Function2[js.Any, Double, Any], priority: String ): Selection = js.native
    def style(styleValueMap: Object): Selection = js.native
    def property(name: String): Unit = js.native
    def property(name: String, value: js.Any): Selection = js.native
    def property(name: String, valueFunction: js.Function2[js.Any, Double, Any]): Selection = js.native
    def property(propertyValueMap: Object): Selection = js.native
    def text(): String = js.native
    def text(value: js.Any): Selection = js.native
    def text(valueFunction: js.Function2[js.Any, Double, Any]): Selection = js.native
    def html(): String = js.native
    def html(value: js.Any): Selection = js.native
    def html(valueFunction: js.Function2[js.Any, Double, Any]): Selection = js.native
    var append: js.Function1[String, Selection] = js.native
    var insert: js.Function2[String, String, Selection] = js.native
    var remove: js.Function0[Selection] = js.native
    var empty: js.Function0[Boolean] = js.native
    def data(values: js.Function2[js.Any, Double, js.Array[js.Any]], key: js.Function2[js.Any, Double, Any] = js.native): UpdateSelection = js.native
    def data(): js.Array[js.Any] = js.native
    def datum(values: js.Function2[js.Any, Double, Any]): UpdateSelection = js.native
    def datum(): js.Dynamic = js.native
    def filter(filter: js.Function2[js.Any, Double, Boolean], thisArg: js.Any = js.native): UpdateSelection = js.native
    def call(callback: js.Function, args: js.Any*): Selection = js.native
    def each(eachFunction: js.Function2[js.Any, Double, Any]): Selection = js.native
    def on(`type`: String): js.Function2[js.Any, Double, Any] = js.native
    def on(`type`: String, listener: js.Function2[js.Any, Double, Any], capture: Boolean = js.native): Selection = js.native
    def size(): Double = js.native
    def transition(): Transition.Transition = js.native
    def sort[T](comparator: js.Function2[T, T, Double] ): Selection = js.native
    var order: js.Function0[Selection] = js.native
    var node: js.Function = js.native
  }

  trait EnterSelection extends js.Object {
    var append: js.Function1[String, Selection] = js.native
    var insert: js.Function2[String, String, Selection] = js.native
    var select: js.Function1[String, Selection] = js.native
    var empty: js.Function0[Boolean] = js.native
    var node: js.Function0[Element] = js.native
    var call: js.Function1[js.Function1[EnterSelection, Unit], EnterSelection] = js.native
    var size: js.Function0[Double] = js.native
  }

  trait UpdateSelection extends Selection {
    var enter: js.Function0[EnterSelection] = js.native
    var update: js.Function0[Selection] = js.native
    var exit: js.Function0[Selection] = js.native
  }

  trait NestKeyValue extends js.Object {
    var key: String = js.native
    var values: js.Any = js.native
  }

  trait Nest extends js.Object {
    def key(keyFunction: js.Function2[js.Any, Double, String]): Nest = js.native
    def sortKeys(comparator: js.Function2[js.Any, js.Any, Double]): Nest = js.native
    def sortValues(comparator: js.Function2[js.Any, js.Any, Double]): Nest = js.native
    def rollup(rollupFunction: js.Function2[js.Any, Double, Any]): Nest = js.native
    def map(values: js.Array[js.Any]): js.Dynamic = js.native
    def entries(values: js.Array[js.Any]): js.Array[NestKeyValue] = js.native
  }

  trait MapKeyValue[T] extends js.Object {
    var key: String = js.native
    var value: T = js.native
  }

  trait Map[T] extends js.Object {
    def has(key: String): Boolean = js.native
    def get(key: String): T = js.native
    def set(key: String, value: T): T = js.native
    def remove(key: String): Boolean = js.native
    def keys(): js.Array[String] = js.native
    def values(): js.Array[T] = js.native
    def entries(): js.Array[MapKeyValue[T]] = js.native
    def forEach(func: js.Function2[String, T, Unit]): Unit = js.native
    def empty(): Boolean = js.native
    def size(): Double = js.native
  }

  trait Set[T] extends js.Object {
    def has(value: T): Boolean = js.native
    def add(value: T): T = js.native
    def remove(value: T): Boolean = js.native
    def values(): js.Array[String] = js.native
    def forEach(func: js.Function1[String, Unit]): Unit = js.native
    def empty(): Boolean = js.native
    def size(): Double = js.native
  }

  trait Random extends js.Object {
    def normal(mean: Double = js.native, deviation: Double = js.native): js.Function0[Double] = js.native
    def logNormal(mean: Double = js.native, deviation: Double = js.native): js.Function0[Double] = js.native
    def irwinHall(count: Double): js.Function0[Double] = js.native
  }
}
package Transition {

  trait Transition extends js.Object {
    def duration(duration: Double): Transition = js.native
    def delay(delay: Double): Transition = js.native
    def attr(name: String): String = js.native
    def attr(name: String, value: js.Any): Transition = js.native
    def attr(name: String, valueFunction: js.Function2[js.Any, Double, Any]): Transition = js.native
    def attr(attrValueMap: js.Any): Transition = js.native
    def style(name: String): String = js.native
    def style(name: String, value: js.Any, priority: String): Transition = js.native
    def style(name: String, valueFunction: js.Function2[js.Any, Double, Any], priority: String ): Transition = js.native
    def call(callback: js.Function, args: js.Any*): Transition = js.native
    def select(selector: String): Transition = js.native
    def select(element: EventTarget): Transition = js.native
    def selectAll(selector: String): Transition = js.native
    def selectAll(elements: js.Array[EventTarget]): Transition = js.native
    var each: js.Function2[String, js.Function2[js.Any, Double, Any], Transition] = js.native
    var transition: js.Function0[Transition] = js.native
    var ease: js.Function = js.native
    def attrTween(name: String, tween: js.Function3[js.Any, Double, js.Any, BaseInterpolate]): Transition = js.native
    def styleTween(name: String, tween: js.Function3[js.Any, Double, js.Any, BaseInterpolate], priority: String = js.native): Transition = js.native
    def text(text: String): Transition = js.native
    def tween(name: String, factory: InterpolateFactory): Transition = js.native
    def filter(selector: String): Transition = js.native
    def remove(): Transition = js.native
  }

  trait InterpolateFactory extends js.Object {
    def apply(a: js.Any = js.native, b: js.Any = js.native): BaseInterpolate = js.native
  }

  trait BaseInterpolate extends js.Object {
    def apply(a: js.Any, b: js.Any = js.native): js.Dynamic = js.native
  }

  trait Interpolate extends js.Object {
    def apply(t: js.Any): js.Dynamic = js.native
  }

}

package Time {

  trait Time extends js.Object {
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
    var seconds: Range = js.native
    var minutes: Range = js.native
    var hours: Range = js.native
    var days: Range = js.native
    var weeks: Range = js.native
    var months: Range = js.native
    var years: Range = js.native
    var sundays: Range = js.native
    var mondays: Range = js.native
    var tuesdays: Range = js.native
    var wednesdays: Range = js.native
    var thursdays: Range = js.native
    var fridays: Range = js.native
    var saturdays: Range = js.native
    var format: js.Any = js.native
    var scale: js.Any = js.native
  }

  trait Range extends js.Object {
    def apply(start: Date, end: Date, step: Double = js.native): js.Array[Date] = js.native
  }

  trait Interval extends js.Object {
    def apply(date: Date): Date = js.native
    var floor: js.Function1[Date, Date] = js.native
    var round: js.Function1[Date, Date] = js.native
    var ceil: js.Function1[Date, Date] = js.native
    var range: Range = js.native
    var offset: js.Function2[Date, Double, Date] = js.native
    var utc: Interval = js.native
  }

  trait TimeFormat extends js.Object {
    def apply(date: Date): String = js.native
    var parse: js.Function1[String, Date] = js.native
  }

}

package Layout {

  trait Layout extends js.Object {
    def stack(): StackLayout = js.native
    def pie(): PieLayout = js.native
    def force(): ForceLayout = js.native
    def tree(): TreeLayout = js.native
    def bundle(): BundleLayout = js.native
    def chord(): ChordLayout = js.native
    def cluster(): ClusterLayout = js.native
    def hierarchy(): HierarchyLayout = js.native
    def histogram(): HistogramLayout = js.native
    def pack(): PackLayout = js.native
    def partition(): PartitionLayout = js.native
    def treemap(): TreeMapLayout = js.native
  }

  trait StackLayout extends js.Object {
    def apply[T](layers: js.Array[T], index: Double = js.native): js.Array[T] = js.native
    def values(accessor: js.Function1[js.Any, Any] = js.native): StackLayout = js.native
    def offset(offset: String): StackLayout = js.native
    def x(accessor: js.Function2[js.Any, Double, Any]): StackLayout = js.native
    def y(accessor: js.Function2[js.Any, Double, Any]): StackLayout = js.native
    def out(setter: js.Function3[js.Any, Double, Double, Unit]): StackLayout = js.native
  }

  trait TreeLayout extends js.Object {
    def sort(): js.Function2[js.Any, js.Any, Double] = js.native
    def sort(comparator: js.Function2[js.Any, js.Any, Double]): TreeLayout = js.native
    def children(): js.Function1[js.Any, Any] = js.native
    def children(children: js.Function1[js.Any, Any]): TreeLayout = js.native
    def nodes(root: GraphNode): js.Array[GraphNode] = js.native
    def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = js.native
    def separation(): js.Function2[GraphNode, GraphNode, Double] = js.native
    def separation(separation: js.Function2[GraphNode, GraphNode, Double]): TreeLayout = js.native
    def size(): js.Array[Double] = js.native
    def size(size: js.Array[Double]): TreeLayout = js.native
    def nodeSize(): js.Array[Double] = js.native
    def nodeSize(size: js.Array[Double]): TreeLayout = js.native
  }

  trait PieLayout extends js.Object {
    def apply(values: js.Array[js.Any], index: Double = js.native): js.Array[ArcDescriptor] = js.native
    def value(): js.Function2[js.Any, Double, Double] = js.native
    def value(accessor: js.Function2[js.Any, Double, Double]): PieLayout = js.native
    def sort(): js.Function2[js.Any, js.Any, Double] = js.native
    def sort(comparator: js.Function2[js.Any, js.Any, Double]): PieLayout = js.native
    def startAngle(): Double = js.native
    def startAngle(angle: Double): PieLayout = js.native
    def endAngle(): Double = js.native
    def endAngle(angle: Double): PieLayout = js.native
  }

  trait ArcDescriptor extends js.Object {
    var value: js.Any = js.native
    var data: js.Any = js.native
    var startAngle: Double = js.native
    var endAngle: Double = js.native
    var index: Double = js.native
  }

  trait GraphNode extends js.Object {
    var id: Double = js.native
    var index: Double = js.native
    var name: String = js.native
    var px: Double = js.native
    var py: Double = js.native
    var size: Double = js.native
    var weight: Double = js.native
    var x: Double = js.native
    var y: Double = js.native
    var subindex: Double = js.native
    var startAngle: Double = js.native
    var endAngle: Double = js.native
    var value: Double = js.native
    var fixed: Boolean = js.native
    var children: js.Array[GraphNode] = js.native
    var _children: js.Array[GraphNode] = js.native
    var parent: GraphNode = js.native
    var depth: Double = js.native
  }

  trait GraphLink extends js.Object {
    var source: GraphNode = js.native
    var target: GraphNode = js.native
  }

  trait GraphNodeForce extends js.Object {
    var index: Double = js.native
    var x: Double = js.native
    var y: Double = js.native
    var px: Double = js.native
    var py: Double = js.native
    var fixed: Boolean = js.native
    var weight: Double = js.native
  }

  trait GraphLinkForce extends js.Object {
    var source: GraphNodeForce = js.native
    var target: GraphNodeForce = js.native
  }

  trait ForceLayout extends js.Object {
    def apply(): ForceLayout = js.native
    def size(): Double = js.native
    def size(mysize: js.Array[Double]): ForceLayout = js.native
    def size(accessor: js.Function2[js.Any, Double, js.Any]): ForceLayout = js.native
    def linkDistance(): Double = js.native
    def linkDistance(number: Double): ForceLayout = js.native
    def linkDistance(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = js.native
    def linkStrength(): Double = js.native
    def linkStrength(number: Double): ForceLayout = js.native
    def linkStrength(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = js.native
    def friction(): Double = js.native
    def friction(number: Double): ForceLayout = js.native
    def friction(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = js.native
    def alpha(): Double = js.native
    def alpha(number: Double): ForceLayout = js.native
    def alpha(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = js.native
    def charge(): Double = js.native
    def charge(number: Double): ForceLayout = js.native
    def charge(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = js.native
    def theta(): Double = js.native
    def theta(number: Double): ForceLayout = js.native
    def theta(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = js.native
    def gravity(): Double = js.native
    def gravity(number: Double): ForceLayout = js.native
    def gravity(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = js.native
    def links(): js.Array[GraphLinkForce] = js.native
    def links(arLinks: js.Array[GraphLinkForce]): ForceLayout = js.native
    def nodes(): js.Array[GraphNodeForce] = js.native
    def nodes(arNodes: js.Array[GraphNodeForce]): ForceLayout = js.native
    def start(): ForceLayout = js.native
    def resume(): ForceLayout = js.native
    def stop(): ForceLayout = js.native
    def tick(): ForceLayout = js.native
    def on(`type`: String, listener: js.Function0[Unit]): ForceLayout = js.native
    def drag(): ForceLayout = js.native
  }

  trait BundleLayout extends js.Object {
    def apply(links: js.Array[GraphLink]): js.Array[js.Array[GraphNode]] = js.native
  }

  trait ChordLayout extends js.Object {
    def matrix(): js.Array[js.Array[Double]] = js.native
    def matrix(matrix: js.Array[js.Array[Double]]): ChordLayout = js.native
    def padding(): Double = js.native
    def padding(padding: Double): ChordLayout = js.native
    def sortGroups(): js.Function2[Double, Double, Double] = js.native
    def sortGroups(comparator: js.Function2[Double, Double, Double]): ChordLayout = js.native
    def sortSubgroups(): js.Function2[Double, Double, Double] = js.native
    def sortSubgroups(comparator: js.Function2[Double, Double, Double]): ChordLayout = js.native
    def sortChords(): js.Function2[Double, Double, Double] = js.native
    def sortChords(comparator: js.Function2[Double, Double, Double]): ChordLayout = js.native
    def chords(): js.Array[GraphLink] = js.native
    def groups(): js.Array[ArcDescriptor] = js.native
  }

  trait ClusterLayout extends js.Object {
    def sort(): js.Function2[GraphNode, GraphNode, Double] = js.native
    def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): ClusterLayout = js.native
    def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = js.native
    def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): ClusterLayout = js.native
    def nodes(root: GraphNode): js.Array[GraphNode] = js.native
    def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = js.native
    def separation(): js.Function2[GraphNode, GraphNode, Double] = js.native
    def separation(separation: js.Function2[GraphNode, GraphNode, Double]): ClusterLayout = js.native
    def size(): js.Array[Double] = js.native
    def size(size: js.Array[Double]): ClusterLayout = js.native
    def value(): js.Function1[GraphNode, Double] = js.native
    def value(value: js.Function1[GraphNode, Double]): ClusterLayout = js.native
  }

  trait HierarchyLayout extends js.Object {
    def sort(): js.Function2[GraphNode, GraphNode, Double] = js.native
    def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): HierarchyLayout = js.native
    def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = js.native
    def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): HierarchyLayout = js.native
    def nodes(root: GraphNode): js.Array[GraphNode] = js.native
    def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = js.native
    def value(): js.Function1[GraphNode, Double] = js.native
    def value(value: js.Function1[GraphNode, Double]): HierarchyLayout = js.native
    def reValue(root: GraphNode): HierarchyLayout = js.native
  }

  trait Bin extends js.Array[js.Any] {
    var x: Double = js.native
    var dx: Double = js.native
    var y: Double = js.native
  }

  trait HistogramLayout extends js.Object {
    def apply(values: js.Array[js.Any], index: Double = js.native): js.Array[Bin] = js.native
    def value(): js.Function1[js.Any, Any] = js.native
    def value(accessor: js.Function1[js.Any, Any]): HistogramLayout = js.native
    def range(): js.Function2[js.Any, Double, js.Array[Double]] = js.native
    def range(range: js.Function2[js.Any, Double, js.Array[Double]]): HistogramLayout = js.native
    def bins(): js.Function2[js.Array[js.Any], Double, js.Array[Double]] = js.native
    def bins(bins: js.Function2[js.Array[js.Any], Double, js.Array[Double]]): HistogramLayout = js.native
    def frequency(): Boolean = js.native
    def frequency(frequency: Boolean): HistogramLayout = js.native
  }

  trait PackLayout extends js.Object {
    def sort(): js.Function2[GraphNode, GraphNode, Double] = js.native
    def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): PackLayout = js.native
    def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = js.native
    def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): PackLayout = js.native
    def nodes(root: GraphNode): js.Array[GraphNode] = js.native
    def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = js.native
    def value(): js.Function1[GraphNode, Double] = js.native
    def value(value: js.Function1[GraphNode, Double]): PackLayout = js.native
    def size(): js.Array[Double] = js.native
    def size(size: js.Array[Double]): PackLayout = js.native
    def padding(): Double = js.native
    def padding(padding: Double): PackLayout = js.native
  }

  trait PartitionLayout extends js.Object {
    def sort(): js.Function2[GraphNode, GraphNode, Double] = js.native
    def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): PackLayout = js.native
    def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = js.native
    def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): PackLayout = js.native
    def nodes(root: GraphNode): js.Array[GraphNode] = js.native
    def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = js.native
    def value(): js.Function1[GraphNode, Double] = js.native
    def value(value: js.Function1[GraphNode, Double]): PackLayout = js.native
    def size(): js.Array[Double] = js.native
    def size(size: js.Array[Double]): PackLayout = js.native
  }

  trait TreeMapLayout extends js.Object {
    def sort(): js.Function2[GraphNode, GraphNode, Double] = js.native
    def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): TreeMapLayout = js.native
    def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = js.native
    def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): TreeMapLayout = js.native
    def nodes(root: GraphNode): js.Array[GraphNode] = js.native
    def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = js.native
    def value(): js.Function1[GraphNode, Double] = js.native
    def value(value: js.Function1[GraphNode, Double]): TreeMapLayout = js.native
    def size(): js.Array[Double] = js.native
    def size(size: js.Array[Double]): TreeMapLayout = js.native
    def padding(): Double = js.native
    def padding(padding: Double): TreeMapLayout = js.native
    def round(): Boolean = js.native
    def round(round: Boolean): TreeMapLayout = js.native
    def sticky(): Boolean = js.native
    def sticky(sticky: Boolean): TreeMapLayout = js.native
    def mode(): String = js.native
    def mode(mode: String): TreeMapLayout = js.native
  }

}

package Color {

  trait Color extends js.Object {
    def brighter(k: Double = js.native): Color = js.native
    def darker(k: Double = js.native): Color = js.native
  }

  trait RGBColor extends Color {
    var r: Double = js.native
    var g: Double = js.native
    var b: Double = js.native
    def hsl(): HSLColor = js.native
  }

  trait HSLColor extends Color {
    var h: Double = js.native
    var s: Double = js.native
    var l: Double = js.native
    def rgb(): RGBColor = js.native
  }

  trait LABColor extends Color {
    var l: Double = js.native
    var a: Double = js.native
    var b: Double = js.native
    def rgb(): RGBColor = js.native
  }

  trait HCLColor extends Color {
    var h: Double = js.native
    var c: Double = js.native
    var l: Double = js.native
    def rgb(): RGBColor = js.native
  }

}

package Svg {

  trait Svg extends js.Object {
    def symbol(): Symbol = js.native
    def axis(): Axis = js.native
    def arc(): Arc = js.native
    var line: js.Any = js.native
    var area: js.Any = js.native
    def brush(): Brush = js.native
    def chord(): Chord = js.native
    var diagonal: js.Any = js.native
    var symbolTypes: js.Array[String] = js.native
  }

  trait Symbol extends js.Object {
    var `type`: js.Function1[String, Symbol] = js.native
    var size: js.Function1[Double, Symbol] = js.native
    def apply(datum: js.Any, index: Double): String = js.native
  }

  trait Brush extends js.Object {
    def apply(selection: D3.Selection): Unit = js.native
    def x(): Scale.Scale = js.native
    def x(scale: Scale.Scale): Brush = js.native
    def y(): Scale.Scale = js.native
    def y(scale: Scale.Scale): Brush = js.native
    def extent(): js.Array[js.Any] = js.native
    def extent(values: js.Array[js.Any]): Brush = js.native
    def clear(): Brush = js.native
    def empty(): Boolean = js.native
    def on(`type`: String): js.Function2[js.Any, Double, Any] = js.native
    def on(`type`: String, listener: js.Function2[js.Any, Double, Any], capture: Boolean = js.native): Brush = js.native
  }

  trait Axis extends js.Object {
    def apply(selection: D3.Selection): Unit = js.native
    def apply(transition: Transition.Transition): Unit = js.native
    def scale(): js.Dynamic = js.native
    def scale(scale: js.Any): Axis = js.native
    def orient(): String = js.native
    def orient(orientation: String): Axis = js.native
    def ticks(): js.Array[js.Any] = js.native
    def ticks(arguments: js.Any*): Axis = js.native
    def tickPadding(): Double = js.native
    def tickPadding(padding: Double): Axis = js.native
    def tickValues(): js.Array[js.Any] = js.native
    def tickValues(values: js.Array[js.Any]): Axis = js.native
    def tickSubdivide(count: Double): Axis = js.native
    def tickSize(): Double = js.native
    def tickSize(inner: Double, outer: Double = js.native): Axis = js.native
    def innerTickSize(): Double = js.native
    def innerTickSize(value: Double): Axis = js.native
    def outerTickSize(): Double = js.native
    def outerTickSize(value: Double): Axis = js.native
    def tickFormat(formatter: js.Function1[js.Any, String]): Axis = js.native
    def nice(count: Double = js.native): Axis = js.native
  }

  trait Arc extends js.Object {
    def apply(data: js.Any, index: Double = js.native): String = js.native
    def innerRadius(): js.Function2[js.Any, Double, Double] = js.native
    def innerRadius(radius: Double): Arc = js.native
    def outerRadius(): js.Function2[js.Any, Double, Double] = js.native
    def outerRadius(radius: Double): Arc = js.native
    def startAngle(): js.Function2[js.Any, Double, Double] = js.native
    def startAngle(angle: Double): Arc = js.native
    def endAngle(): js.Function2[js.Any, Double, Double] = js.native
    def endAngle(angle: Double): Arc = js.native
    def centroid(data: js.Any, index: Double = js.native): js.Array[Double] = js.native
  }

  trait Line extends js.Object {
    def apply(data: js.Array[js.Any], index: Double = js.native): String = js.native
    def x(): js.Function2[js.Any, Double, Double] = js.native
    def x(accessor: js.Function1[js.Any, Double]): Line = js.native
    def x(cnst: Double): Line = js.native
    def y(): js.Function2[js.Any, Double, Double] = js.native
    def y(accessor: js.Function1[js.Any, Double]): Line = js.native
    def y(cnst: Double): Line = js.native
    def interpolate(): String = js.native
    def interpolate(interpolate: String): Line = js.native
    def tension(): Double = js.native
    def tension(tension: Double): Line = js.native
    def defined(): js.Function2[js.Any, Double, Boolean] = js.native
    def defined(defined: js.Function2[js.Any, Double, Boolean]): Line = js.native
  }

  trait LineRadial extends js.Object {
    def apply(data: js.Array[js.Any], index: Double = js.native): String = js.native
    def x(): js.Function2[js.Any, Double, Double] = js.native
    def x(accessor: js.Function1[js.Any, Double]): LineRadial = js.native
    def x(cnst: Double): LineRadial = js.native
    def y(): js.Function2[js.Any, Double, Double] = js.native
    def y(accessor: js.Function1[js.Any, Double]): LineRadial = js.native
    def y(cnst: Double): LineRadial = js.native
    def interpolate(): String = js.native
    def interpolate(interpolate: String): LineRadial = js.native
    def tension(): Double = js.native
    def tension(tension: Double): LineRadial = js.native
    def defined(): js.Function1[js.Any, Any] = js.native
    def defined(defined: js.Function1[js.Any, Any]): LineRadial = js.native
    def radius(): js.Function2[js.Any, Double, Double] = js.native
    def radius(radius: Double): LineRadial = js.native
    def angle(): js.Function2[js.Any, js.Any, Double] = js.native
    def angle(angle: Double): LineRadial = js.native
  }

  trait Area extends js.Object {
    def apply(data: js.Array[js.Any], index: Double = js.native): String = js.native
    def x(): js.Function2[js.Any, Double, Double] = js.native
    def x(accessor: js.Function1[js.Any, Double]): Area = js.native
    def x(cnst: Double): Area = js.native
    def x0(): js.Function2[js.Any, Double, Double] = js.native
    def x0(accessor: js.Function1[js.Any, Double]): Area = js.native
    def x0(cnst: Double): Area = js.native
    def x1(): js.Function2[js.Any, Double, Double] = js.native
    def x1(accessor: js.Function1[js.Any, Double]): Area = js.native
    def x1(cnst: Double): Area = js.native
    def y(): js.Function2[js.Any, Double, Double] = js.native
    def y(accessor: js.Function1[js.Any, Double]): Area = js.native
    def y(cnst: Double): Area = js.native
    def y0(): js.Function2[js.Any, Double, Double] = js.native
    def y0(accessor: js.Function1[js.Any, Double]): Area = js.native
    def y0(cnst: Double): Area = js.native
    def y1(): js.Function2[js.Any, Double, Double] = js.native
    def y1(accessor: js.Function1[js.Any, Double]): Area = js.native
    def y1(cnst: Double): Area = js.native
    def interpolate(): String = js.native
    def interpolate(interpolate: String): Area = js.native
    def tension(): Double = js.native
    def tension(tension: Double): Area = js.native
    def defined(): js.Function2[js.Any, Double, Any] = js.native
    def defined(defined: js.Function2[js.Any, Double, Any]): Area = js.native
  }

  trait AreaRadial extends js.Object {
    def apply(data: js.Array[js.Any], index: Double = js.native): String = js.native
    def x(): js.Function2[js.Any, Double, Double] = js.native
    def x(accessor: js.Function1[js.Any, Double]): AreaRadial = js.native
    def x(cnst: Double): AreaRadial = js.native
    def x0(): js.Function2[js.Any, Double, Double] = js.native
    def x0(accessor: js.Function1[js.Any, Double]): AreaRadial = js.native
    def x0(cnst: Double): AreaRadial = js.native
    def x1(): js.Function2[js.Any, Double, Double] = js.native
    def x1(accessor: js.Function1[js.Any, Double]): AreaRadial = js.native
    def x1(cnst: Double): AreaRadial = js.native
    def y(): js.Function2[js.Any, Double, Double] = js.native
    def y(accessor: js.Function1[js.Any, Double]): AreaRadial = js.native
    def y(cnst: Double): AreaRadial = js.native
    def y0(): js.Function2[js.Any, Double, Double] = js.native
    def y0(accessor: js.Function1[js.Any, Double]): AreaRadial = js.native
    def y0(cnst: Double): AreaRadial = js.native
    def y1(): js.Function2[js.Any, Double, Double] = js.native
    def y1(accessor: js.Function1[js.Any, Double]): AreaRadial = js.native
    def y1(cnst: Double): AreaRadial = js.native
    def interpolate(): String = js.native
    def interpolate(interpolate: String): AreaRadial = js.native
    def tension(): Double = js.native
    def tension(tension: Double): AreaRadial = js.native
    def defined(): js.Function1[js.Any, Any] = js.native
    def defined(defined: js.Function1[js.Any, Any]): AreaRadial = js.native
    def radius(): Double = js.native
    def radius(radius: Double): AreaRadial = js.native
    def innerRadius(): Double = js.native
    def innerRadius(radius: Double): AreaRadial = js.native
    def outerRadius(): Double = js.native
    def outerRadius(radius: Double): AreaRadial = js.native
    def angle(): Double = js.native
    def angle(angle: Double): AreaRadial = js.native
    def startAngle(): Double = js.native
    def startAngle(angle: Double): AreaRadial = js.native
    def endAngle(): Double = js.native
    def endAngle(angle: Double): AreaRadial = js.native
  }

  trait Chord extends js.Object {
    def apply(datum: js.Any, index: Double = js.native): String = js.native
    def radius(): Double = js.native
    def radius(radius: Double): Chord = js.native
    def startAngle(): Double = js.native
    def startAngle(angle: Double): Chord = js.native
    def endAngle(): Double = js.native
    def endAngle(angle: Double): Chord = js.native
    def source(): js.Dynamic = js.native
    def source(angle: js.Any): Chord = js.native
    def target(): js.Dynamic = js.native
    def target(angle: js.Any): Chord = js.native
  }

  trait Diagonal extends js.Object {
    def apply(datum: js.Any, index: Double = js.native): String = js.native
    def projection(): js.Function2[js.Any, Double, js.Array[Double]] = js.native
    def projection(proj: js.Function1[js.Any, js.Array[Double]]): Diagonal = js.native
    def source(): js.Function2[js.Any, Double, Any] = js.native
    def source(src: js.Function1[js.Any, Any]): Diagonal = js.native
    def target(): js.Function2[js.Any, Double, Any] = js.native
    def target(target: js.Function1[js.Any, Any]): Diagonal = js.native
  }

}

package Scale {

  trait ScaleBase extends js.Object {
    def linear(): LinearScale = js.native
    def ordinal(): OrdinalScale = js.native
    def quantize(): QuantizeScale = js.native
    def category10(): OrdinalScale = js.native
    def category20(): OrdinalScale = js.native
    def category20b(): OrdinalScale = js.native
    def category20c(): OrdinalScale = js.native
    def identity(): IdentityScale = js.native
    def log(): LogScale = js.native
    def pow(): PowScale = js.native
    def quantile(): QuantileScale = js.native
    def sqrt(): SqrtScale = js.native
    def threshold(): ThresholdScale = js.native
  }

  trait GenericScale[S] extends js.Object {
    def apply(value: js.Any): js.Dynamic = js.native
    def domain(values: js.Array[js.Any]): S = js.native
    def domain(): js.Array[js.Any] = js.native
    def range(values: js.Array[js.Any]): S = js.native
    def range(): js.Array[js.Any] = js.native
    def invertExtent(y: js.Any): js.Array[js.Any] = js.native
    def copy(): S = js.native
  }

  trait Scale extends GenericScale[Scale] {
  }

  trait GenericQuantitativeScale[S] extends GenericScale[S] {
    def apply(value: Double): Double = js.native
    def invert(value: Double): Double = js.native
    var rangeRound: js.Function1[js.Array[js.Any], S] = js.native
    def interpolate(): Transition.Interpolate = js.native
    def interpolate(factory: Transition.Interpolate): S = js.native
    def clamp(): Boolean = js.native
    def clamp(clamp: Boolean): S = js.native
    def nice(count: Double = js.native): S = js.native
    def ticks(count: Double): js.Array[js.Any] = js.native
    def tickFormat(count: Double, format: String = js.native): js.Function1[Double, String] = js.native
  }

  trait QuantitativeScale extends GenericQuantitativeScale[QuantitativeScale] {
  }

  trait LinearScale extends GenericQuantitativeScale[LinearScale] {
  }

  trait IdentityScale extends GenericScale[IdentityScale] {
    def apply(value: Double): Double = js.native
    def invert(value: Double): Double = js.native
    def ticks(count: Double): js.Array[js.Any] = js.native
    def tickFormat(count: Double): js.Function1[Double, String] = js.native
  }

  trait SqrtScale extends GenericQuantitativeScale[SqrtScale] {
  }

  trait PowScale extends GenericQuantitativeScale[PowScale] {
  }

  trait LogScale extends GenericQuantitativeScale[LogScale] {
  }

  trait OrdinalScale extends GenericScale[OrdinalScale] {
    def rangePoints(interval: js.Array[js.Any], padding: Double = js.native): OrdinalScale = js.native
    def rangeBands(interval: js.Array[js.Any], padding: Double = js.native, outerPadding: Double = js.native): OrdinalScale = js.native
    def rangeRoundBands(interval: js.Array[js.Any], padding: Double = js.native, outerPadding: Double = js.native): OrdinalScale = js.native
    def rangeBand(): Double = js.native
    def rangeExtent(): js.Array[js.Any] = js.native
  }

  trait QuantizeScale extends GenericScale[QuantizeScale] {
  }

  trait ThresholdScale extends GenericScale[ThresholdScale] {
  }

  trait QuantileScale extends GenericScale[QuantileScale] {
    def quantiles(): js.Array[js.Any] = js.native
  }

  trait TimeScale extends GenericScale[TimeScale] {
    def apply(value: Date): Double = js.native
    def invert(value: Double): Date = js.native
    var rangeRound: js.Function1[js.Array[js.Any], TimeScale] = js.native
    def interpolate(): Transition.Interpolate = js.native
    def interpolate(factory: Transition.InterpolateFactory): TimeScale = js.native
    def clamp(clamp: Boolean): TimeScale = js.native
    def ticks(count: Double): js.Array[js.Any] = js.native
    def ticks(range: Time.Range, count: Double): js.Array[js.Any] = js.native
    def tickFormat(count: Double): js.Function1[Double, String] = js.native
    def nice(count: Double = js.native): TimeScale = js.native
  }

}

package Behavior {

  trait Behavior extends js.Object {
    def drag(): Drag = js.native
    def zoom(): Zoom = js.native
  }

  trait Zoom extends js.Object {
    def apply(selection: D3.Selection): Unit = js.native
    var on: js.Function2[String, js.Function2[js.Any, Double, Any], Zoom] = js.native
    def scale(): Double = js.native
    def scale(scale: Double): Zoom = js.native
    def translate(): js.Array[Double] = js.native
    def translate(translate: js.Array[Double]): Zoom = js.native
    def scaleExtent(): js.Array[Double] = js.native
    def scaleExtent(extent: js.Array[Double]): Zoom = js.native
    def x(): Scale.Scale = js.native
    def x(x: Scale.Scale): Zoom = js.native
    def y(): Scale.Scale = js.native
    def y(y: Scale.Scale): Zoom = js.native
  }

  trait Drag extends js.Object {
    def apply(): js.Dynamic = js.native
    var on: js.Function2[String, js.Function2[js.Any, Double, Any], Drag] = js.native
    def origin(): js.Dynamic = js.native
    def origin(origin: js.Any = js.native): Drag = js.native
  }

}

package Geo {

  trait Geo extends js.Object {
    def path(): Path = js.native
    def circle(): Circle = js.native
    def area(feature: js.Any): Double = js.native
    def bounds(feature: js.Any): js.Array[js.Array[Double]] = js.native
    def centroid(feature: js.Any): js.Array[Double] = js.native
    def distance(a: js.Array[Double], b: js.Array[Double]): Double = js.native
    def interpolate(a: js.Array[Double], b: js.Array[Double]): js.Function1[Double, js.Array[Double]] = js.native
    def length(feature: js.Any): Double = js.native
    def projection(raw: RawProjection): Projection = js.native
    def projectionMutator(rawFactory: RawProjection): ProjectionMutator = js.native
    def albers(): Projection = js.native
    def albersUsa(): Projection = js.native
    var azimuthalEqualArea: js.Any = js.native
    var azimuthalEquidistant: js.Any = js.native
    var conicConformal: js.Any = js.native
    var conicEquidistant: js.Any = js.native
    var conicEqualArea: js.Any = js.native
    var equirectangular: js.Any = js.native
    var gnomonic: js.Any = js.native
    var mercator: js.Any = js.native
    var orthographic: js.Any = js.native
    var stereographic: js.Any = js.native
    var transverseMercator: js.Any = js.native
    def stream(`object`: GeoJSON, listener: Stream): Unit = js.native
    def graticule(): Graticule = js.native
    def greatArc(): GreatArc = js.native
    def rotation(rotation: js.Array[Double]): Rotation = js.native
  }

  trait Path extends js.Object {
    def apply(feature: js.Any, index: js.Any = js.native): String = js.native
    def projection(): Projection = js.native
    def projection(projection: Projection): Path = js.native
    def context(): String = js.native
    def context(context: Context): Path = js.native
    def area(feature: js.Any): js.Dynamic = js.native
    def centroid(feature: js.Any): js.Dynamic = js.native
    def bounds(feature: js.Any): js.Dynamic = js.native
    def pointRadius(): Double = js.native
    def pointRadius(radius: Double): Path = js.native
  }

  trait Context extends js.Object {
    def beginPath(): js.Dynamic = js.native
    def moveTo(x: Double, y: Double): js.Dynamic = js.native
    def lineTo(x: Double, y: Double): js.Dynamic = js.native
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): js.Dynamic = js.native
    def closePath(): js.Dynamic = js.native
  }

  trait Circle extends js.Object {
    def apply(args: js.Any*): GeoJSON = js.native
    def origin(): js.Array[Double] = js.native
    def origin(origin: js.Array[Double]): Circle = js.native
    def angle(): Double = js.native
    def angle(angle: Double): Circle = js.native
    def precision(): Double = js.native
    def precision(precision: Double): Circle = js.native
  }

  trait Graticule extends js.Object {
    def apply(): GeoJSON = js.native
    def lines(): js.Array[GeoJSON] = js.native
    def outline(): GeoJSON = js.native
    def extent(): js.Array[js.Array[Double]] = js.native
    def extent(extent: js.Array[js.Array[Double]]): Graticule = js.native
    def minorExtent(): js.Array[js.Array[Double]] = js.native
    def minorExtent(extent: js.Array[js.Array[Double]]): Graticule = js.native
    def majorExtent(): js.Array[js.Array[Double]] = js.native
    def majorExtent(extent: js.Array[js.Array[Double]]): Graticule = js.native
    def step(): js.Array[js.Array[Double]] = js.native
    def step(extent: js.Array[js.Array[Double]]): Graticule = js.native
    def minorStep(): js.Array[js.Array[Double]] = js.native
    def minorStep(extent: js.Array[js.Array[Double]]): Graticule = js.native
    def majorStep(): js.Array[js.Array[Double]] = js.native
    def majorStep(extent: js.Array[js.Array[Double]]): Graticule = js.native
    def precision(): Double = js.native
    def precision(precision: Double): Graticule = js.native
  }

  trait GreatArc extends js.Object {
    def apply(): GeoJSON = js.native
    def distance(): Double = js.native
    def source(): js.Dynamic = js.native
    def source(source: js.Any): GreatArc = js.native
    def target(): js.Dynamic = js.native
    def target(target: js.Any): GreatArc = js.native
    def precision(): Double = js.native
    def precision(precision: Double): GreatArc = js.native
  }

  trait GeoJSON extends js.Object {
    var coordinates: js.Array[js.Array[Double]] = js.native
    var `type`: String = js.native
  }

  trait RawProjection extends js.Object {
    def apply(lambda: Double, phi: Double): js.Array[Double] = js.native
    def invert(x: Double, y: Double): js.Array[Double] = js.native
  }

  trait Projection extends js.Object {
    def apply(coordinates: js.Array[Double]): js.Array[Double] = js.native
    def invert(point: js.Array[Double]): js.Array[Double] = js.native
    def rotate(): js.Array[Double] = js.native
    def rotate(rotation: js.Array[Double]): Projection = js.native
    def center(): js.Array[Double] = js.native
    def center(location: js.Array[Double]): Projection = js.native
    def parallels(): js.Array[Double] = js.native
    def parallels(location: js.Array[Double]): Projection = js.native
    def translate(): js.Array[Double] = js.native
    def translate(point: js.Array[Double]): Projection = js.native
    def scale(): Double = js.native
    def scale(scale: Double): Projection = js.native
    def clipAngle(): Double = js.native
    def clipAngle(angle: Double): Projection = js.native
    def clipExtent(): js.Array[js.Array[Double]] = js.native
    def clipExtent(extent: js.Array[js.Array[Double]]): Projection = js.native
    def precision(): Double = js.native
    def precision(precision: Double): Projection = js.native
    def stream(listener: Stream = js.native): Stream = js.native
  }

  trait Stream extends js.Object {
    def point(x: Double, y: Double, z: Double = js.native): Unit = js.native
    def lineStart(): Unit = js.native
    def lineEnd(): Unit = js.native
    def polygonStart(): Unit = js.native
    def polygonEnd(): Unit = js.native
    def sphere(): Unit = js.native
  }

  trait Rotation extends js.Array[js.Any] {
    def apply(location: js.Array[Double]): Rotation = js.native
    def invert(location: js.Array[Double]): Rotation = js.native
  }

  trait ProjectionMutator extends js.Object {
    def apply(lambda: Double, phi: Double): Projection = js.native
  }

}

package Geom {

  trait Geom extends js.Object {
    def voronoi[T](): Voronoi[T] = js.native
    def voronoi(vertices: js.Array[Vertice]): js.Array[Polygon] = js.native
    def delaunay(vertices: js.Array[Vertice] = js.native): js.Array[Polygon] = js.native
    def quadtree(): QuadtreeFactory = js.native
    def quadtree(points: js.Array[Point], x1: Double, y1: Double, x2: Double, y2: Double): Quadtree = js.native
    def quadtree(points: js.Array[Point], width: Double, height: Double): Quadtree = js.native
    def polygon(vertices: js.Array[Vertice]): Polygon = js.native
    def hull(): Hull = js.native
    def hull(vertices: js.Array[Vertice]): js.Array[Vertice] = js.native
  }

  trait Vertice extends js.Array[Double] {
    var angle: Double = js.native
  }

  trait Polygon extends js.Array[Vertice] {
    def area(): Double = js.native
    def centroid(): js.Array[Double] = js.native
    def clip(subject: Polygon): Polygon = js.native
  }

  trait QuadtreeFactory extends js.Object {
    def apply(): Quadtree = js.native
    def apply(points: js.Array[Point], x1: Double, y1: Double, x2: Double, y2: Double): Quadtree = js.native
    def apply(points: js.Array[Point], width: Double, height: Double): Quadtree = js.native
    def x(): js.Function1[js.Any, Any] = js.native
    def x(accesor: js.Function1[js.Any, Any]): QuadtreeFactory = js.native
    def y(): js.Function1[js.Any, Any] = js.native
    def y(accesor: js.Function1[js.Any, Any]): QuadtreeFactory = js.native
    def size(): js.Array[Double] = js.native
    def size(size: js.Array[Double]): QuadtreeFactory = js.native
    def extent(): js.Array[js.Array[Double]] = js.native
    def extent(points: js.Array[js.Array[Double]]): QuadtreeFactory = js.native
  }

  trait Quadtree extends js.Object {
    def add(point: Point): Unit = js.native
    def visit(callback: js.Any): Unit = js.native
  }

  trait Point extends js.Object {
    var x: Double = js.native
    var y: Double = js.native
  }

  trait Voronoi[T] extends js.Object {
    def apply(data: js.Array[T]): js.Array[Polygon] = js.native
    def links(data: js.Array[T]): js.Array[Layout.GraphLink] = js.native
    def triangles(data: js.Array[T]): js.Array[js.Array[Double]] = js.native
    def x(): js.Function2[T, Double, Double] = js.native
    def x(accessor: js.Function2[T, Double, Double]): Voronoi[T] = js.native
    def x(constant: Double): Voronoi[T] = js.native
    def y(): js.Function2[T, Double, Double] = js.native
    def y(accessor: js.Function2[T, Double, Double]): Voronoi[T] = js.native
    def y(constant: Double): Voronoi[T] = js.native
    def clipExtent(): js.Array[js.Array[Double]] = js.native
    def clipExtent(extent: js.Array[js.Array[Double]]): Voronoi[T] = js.native
    def size(): js.Array[Double] = js.native
    def size(size: js.Array[Double]): Voronoi[T] = js.native
  }

  trait Hull extends js.Object {
    def apply(vertices: js.Array[Vertice]): js.Array[Vertice] = js.native
    def x(): js.Function1[js.Any, Any] = js.native
    def x(accesor: js.Function1[js.Any, Any]): js.Dynamic = js.native
    def y(): js.Function1[js.Any, Any] = js.native
    def y(accesor: js.Function1[js.Any, Any]): js.Dynamic = js.native
  }

}



