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
    def select(): Selection = ???
    def select(selector: String): Selection = ???
    def select(element: EventTarget): Selection = ???
    def selectAll(selector: String): Selection = ???
    def selectAll(elements: js.Array[EventTarget]): Selection = ???
  }

  trait D3Event extends Event {
    var dx: Double = ???
    var dy: Double = ???
    var clientX: Double = ???
    var clientY: Double = ???
    var translate: js.Array[Double] = ???
    var scale: Double = ???
    var sourceEvent: D3Event = ???
    var x: Double = ???
    var y: Double = ???
    var keyCode: Double = ???
    var altKey: js.Any = ???
    //var `type`: String = ???
  }

  trait Base extends Selectors {
    var behavior: Behavior.Behavior = ???
    var event: D3Event = ???
    def ascending[T](a: T, b: T): Double = ???
    def descending[T](a: T, b: T): Double = ???
    def min[T, U](arr: js.Array[T], map: js.Function2[T, Double, U]): U = ???
    def min[T](arr: js.Array[T]): T = ???
    def max[T, U](arr: js.Array[T], map: js.Function2[T, Double, U]): U = ???
    def max[T](arr: js.Array[T]): T = ???
    def extent[T, U](arr: js.Array[T], map: js.Function1[T, U]): js.Array[U] = ???
    def extent[T](arr: js.Array[T]): js.Array[T] = ???
    def sum[T](arr: js.Array[T], map: js.Function1[T, Double]): Double = ???
    def sum(arr: js.Array[Double]): Double = ???
    def mean[T](arr: js.Array[T], map: js.Function1[T, Double]): Double = ???
    def mean(arr: js.Array[Double]): Double = ???
    def median[T](arr: js.Array[T], map: js.Function1[T, Double]): Double = ???
    def median(arr: js.Array[Double]): Double = ???
    var quantile: js.Function2[js.Array[Double], Double, Double] = ???
    def bisect[T](arr: js.Array[T], x: T, low: Double = ???, high: Double = ???): Double = ???
    def bisectLeft[T](arr: js.Array[T], x: T, low: Double = ???, high: Double = ???): Double = ???
    def bisectRight[T](arr: js.Array[T], x: T, low: Double = ???, high: Double = ???): Double = ???
    def bisector(accessor: js.Function2[js.Any, Double, Any]): js.Dynamic = ???
    def shuffle[T](arr: js.Array[T]): js.Array[T] = ???
    def permute(arr: js.Array[js.Any], indexes: js.Array[js.Any]): js.Array[js.Any] = ???
    def zip(arrs: js.Any*): js.Array[js.Any] = ???
    def transform(definition: String): js.Dynamic = ???
    def transpose(matrix: js.Array[js.Any]): js.Array[js.Any] = ???
    def pairs(arr: js.Array[js.Any]): js.Array[js.Array[js.Any]] = ???
    def keys(map: js.Any): js.Array[String] = ???
    def values(map: js.Any): js.Array[js.Any] = ???
    def entries(map: js.Any): js.Array[js.Any] = ???
    def merge(map: js.Any*): js.Array[js.Any] = ???
    def range(stop: Double, step: Double ): js.Array[Double] = ???
    def range(start: Double, stop: Double , step: Double ): js.Array[Double] = ???
    def nest(): Nest = ???
    def xhr(url: String, callback: js.Function1[XMLHttpRequest, Unit] ): Xhr = ???
    def xhr(url: String, mime: String, callback: js.Function1[XMLHttpRequest, Unit] ): Xhr = ???
    def text(url: String, callback: js.Function1[String, Unit] ): Xhr = ???
    def text(url: String, mime: String, callback: js.Function1[String, Unit]): Xhr = ???
    var json: js.Function2[String, js.Function2[js.Any, js.Any, Unit], Xhr] = ???
    def xml(url: String, callback: js.Function1[Document, Unit]): Xhr = ???
    def xml(url: String, mime: String, callback: js.Function1[Document, Unit]): Xhr = ???
    var html: js.Function2[String, js.Function1[DocumentFragment, Unit], Xhr] = ???
    var csv: Dsv = ???
    var tsv: Dsv = ???
    var time: Time.Time = ???
    var scale: Scale.ScaleBase = ???
    var interpolate: Transition.BaseInterpolate = ???
    var interpolateNumber: Transition.BaseInterpolate = ???
    var interpolateRound: Transition.BaseInterpolate = ???
    var interpolateString: Transition.BaseInterpolate = ???
    var interpolateRgb: Transition.BaseInterpolate = ???
    var interpolateHsl: Transition.BaseInterpolate = ???
    var interpolateHcl: Transition.BaseInterpolate = ???
    var interpolateLab: Transition.BaseInterpolate = ???
    var interpolateArray: Transition.BaseInterpolate = ???
    var interpolateObject: Transition.BaseInterpolate = ???
    var interpolateTransform: Transition.BaseInterpolate = ???
    var interpolators: js.Array[Transition.InterpolateFactory] = ???
    var layout: Layout.Layout = ???
    var svg: Svg.Svg = ???
    var random: Random = ???
    def format(specifier: String): js.Function1[Double, String] = ???
    def formatPrefix(value: Double, precision: Double = ???): MetricPrefix = ???
    var version: String = ???
    def selection(): Selection = ???
    var ns: js.Any = ???
    var ease: js.Function = ???
    def rgb(r: Double, g: Double, b: Double): Color.RGBColor = ???
    def rgb(color: String): Color.RGBColor = ???
    def hcl(h: Double, c: Double, l: Double): Color.HCLColor = ???
    def hcl(color: String): Color.HCLColor = ???
    def hsl(h: Double, s: Double, l: Double): Color.HSLColor = ???
    def hsl(color: String): Color.HSLColor = ???
    def lab(l: Double, a: Double, b: Double): Color.LABColor = ???
    def lab(color: String): Color.LABColor = ???
    var geo: Geo.Geo = ???
    var geom: Geom.Geom = ???
    def mouse(container: js.Any): js.Array[Double] = ???
    def touches(container: js.Any): js.Array[js.Array[Double]] = ???
    def functor[R, T](value: js.Function1[R, T]): js.Function1[R, T] = ???
    def functor[T](value: T): js.Function1[js.Any, T] = ???
    def map(): Map[js.Any] = ???
    def set(): Set[js.Any] = ???
    def map[T](`object`: js.Any): Map[T] = ???
    def set[T](array: js.Array[T]): Set[T] = ???
    def dispatch(types: String*): Dispatch = ???
    def rebind(target: js.Any, source: js.Any, names: js.Any*): js.Dynamic = ???
    def requote(str: String): String = ???
    var timer: js.Any = ???
    def transition(): Transition.Transition = ???
    def round(x: Double, n: Double): Double = ???
  }

  trait Dispatch extends js.Object {
    @JSBracketAccess
    def apply(event: String): js.Any = ???
    @JSBracketAccess
    def update(event: String, v: js.Any): Unit = ???
    def on(`type`: String): js.Dynamic = ???
    def on(`type`: String, listener: js.Any): js.Dynamic = ???
  }

  trait MetricPrefix extends js.Object {
    var scale: js.Function1[Double, Double] = ???
    var symbol: String = ???
  }

  trait Xhr extends js.Object {
    def header(name: String): String = ???
    def header(name: String, value: String): Xhr = ???
    def mimeType(): String = ???
    def mimeType(`type`: String): Xhr = ???
    def response(): js.Function1[XMLHttpRequest, Any] = ???
    def response(value: js.Function1[XMLHttpRequest, Any]): Xhr = ???
    def get(callback: js.Function1[XMLHttpRequest, Unit] = ???): Xhr = ???
    def post(callback: js.Function1[XMLHttpRequest, Unit] ): Xhr = ???
    def post(data: js.Any, callback: js.Function1[XMLHttpRequest, Unit] ): Xhr = ???
    def send(method: String, callback: js.Function1[XMLHttpRequest, Unit] ): Xhr = ???
    def send(method: String, data: js.Any, callback: js.Function1[XMLHttpRequest, Unit] ): Xhr = ???
    def abort(): Xhr = ???
    var on: js.Function2[String, js.Function2[js.Any, Double, Any], Xhr] = ???
  }

  trait Dsv extends js.Object {
    def apply(url: String, callback: js.Function2[js.Any, js.Array[js.Any], Unit] = ???): Xhr = ???
    def parse(string: String): js.Array[js.Any] = ???
    def parseRows(string: String, accessor: js.Function2[js.Array[js.Any], Double, Any]): js.Dynamic = ???
    def format(rows: js.Array[js.Any]): String = ???
  }

  trait Selection extends js.Array[js.Any] with Selectors {
    def attr(name: String): String = ???
    def attr(name: String, value: js.Any): Selection = ???
    def attr(name: String, valueFunction: js.Function2[js.Any, Double, Any]): Selection = ???
    def attr(attrValueMap: Object): Selection = ???
    def classed(name: String): String = ???
    def classed(name: String, value: js.Any): Selection = ???
    def classed(name: String, valueFunction: js.Function2[js.Any, Double, Any]): Selection = ???
    def classed(classValueMap: Object): Selection = ???
    def style(name: String): String = ???
    def style(name: String, value: js.Any, priority: String ): Selection = ???
    def style(name: String, valueFunction: js.Function2[js.Any, Double, Any], priority: String ): Selection = ???
    def style(styleValueMap: Object): Selection = ???
    def property(name: String): Unit = ???
    def property(name: String, value: js.Any): Selection = ???
    def property(name: String, valueFunction: js.Function2[js.Any, Double, Any]): Selection = ???
    def property(propertyValueMap: Object): Selection = ???
    def text(): String = ???
    def text(value: js.Any): Selection = ???
    def text(valueFunction: js.Function2[js.Any, Double, Any]): Selection = ???
    def html(): String = ???
    def html(value: js.Any): Selection = ???
    def html(valueFunction: js.Function2[js.Any, Double, Any]): Selection = ???
    var append: js.Function1[String, Selection] = ???
    var insert: js.Function2[String, String, Selection] = ???
    var remove: js.Function0[Selection] = ???
    var empty: js.Function0[Boolean] = ???
    def data(values: js.Function2[js.Any, Double, js.Array[js.Any]], key: js.Function2[js.Any, Double, Any] = ???): UpdateSelection = ???
    def data(): js.Array[js.Any] = ???
    def datum(values: js.Function2[js.Any, Double, Any]): UpdateSelection = ???
    def datum(): js.Dynamic = ???
    def filter(filter: js.Function2[js.Any, Double, Boolean], thisArg: js.Any = ???): UpdateSelection = ???
    def call(callback: js.Function, args: js.Any*): Selection = ???
    def each(eachFunction: js.Function2[js.Any, Double, Any]): Selection = ???
    def on(`type`: String): js.Function2[js.Any, Double, Any] = ???
    def on(`type`: String, listener: js.Function2[js.Any, Double, Any], capture: Boolean = ???): Selection = ???
    def size(): Double = ???
    def transition(): Transition.Transition = ???
    def sort[T](comparator: js.Function2[T, T, Double] ): Selection = ???
    var order: js.Function0[Selection] = ???
    var node: js.Function = ???
  }

  trait EnterSelection extends js.Object {
    var append: js.Function1[String, Selection] = ???
    var insert: js.Function2[String, String, Selection] = ???
    var select: js.Function1[String, Selection] = ???
    var empty: js.Function0[Boolean] = ???
    var node: js.Function0[Element] = ???
    var call: js.Function1[js.Function1[EnterSelection, Unit], EnterSelection] = ???
    var size: js.Function0[Double] = ???
  }

  trait UpdateSelection extends Selection {
    var enter: js.Function0[EnterSelection] = ???
    var update: js.Function0[Selection] = ???
    var exit: js.Function0[Selection] = ???
  }

  trait NestKeyValue extends js.Object {
    var key: String = ???
    var values: js.Any = ???
  }

  trait Nest extends js.Object {
    def key(keyFunction: js.Function2[js.Any, Double, String]): Nest = ???
    def sortKeys(comparator: js.Function2[js.Any, js.Any, Double]): Nest = ???
    def sortValues(comparator: js.Function2[js.Any, js.Any, Double]): Nest = ???
    def rollup(rollupFunction: js.Function2[js.Any, Double, Any]): Nest = ???
    def map(values: js.Array[js.Any]): js.Dynamic = ???
    def entries(values: js.Array[js.Any]): js.Array[NestKeyValue] = ???
  }

  trait MapKeyValue[T] extends js.Object {
    var key: String = ???
    var value: T = ???
  }

  trait Map[T] extends js.Object {
    def has(key: String): Boolean = ???
    def get(key: String): T = ???
    def set(key: String, value: T): T = ???
    def remove(key: String): Boolean = ???
    def keys(): js.Array[String] = ???
    def values(): js.Array[T] = ???
    def entries(): js.Array[MapKeyValue[T]] = ???
    def forEach(func: js.Function2[String, T, Unit]): Unit = ???
    def empty(): Boolean = ???
    def size(): Double = ???
  }

  trait Set[T] extends js.Object {
    def has(value: T): Boolean = ???
    def add(value: T): T = ???
    def remove(value: T): Boolean = ???
    def values(): js.Array[String] = ???
    def forEach(func: js.Function1[String, Unit]): Unit = ???
    def empty(): Boolean = ???
    def size(): Double = ???
  }

  trait Random extends js.Object {
    def normal(mean: Double = ???, deviation: Double = ???): js.Function0[Double] = ???
    def logNormal(mean: Double = ???, deviation: Double = ???): js.Function0[Double] = ???
    def irwinHall(count: Double): js.Function0[Double] = ???
  }
}
package Transition {

  trait Transition extends js.Object {
    def duration(duration: Double): Transition = ???
    def delay(delay: Double): Transition = ???
    def attr(name: String): String = ???
    def attr(name: String, value: js.Any): Transition = ???
    def attr(name: String, valueFunction: js.Function2[js.Any, Double, Any]): Transition = ???
    def attr(attrValueMap: js.Any): Transition = ???
    def style(name: String): String = ???
    def style(name: String, value: js.Any, priority: String): Transition = ???
    def style(name: String, valueFunction: js.Function2[js.Any, Double, Any], priority: String ): Transition = ???
    def call(callback: js.Function, args: js.Any*): Transition = ???
    def select(selector: String): Transition = ???
    def select(element: EventTarget): Transition = ???
    def selectAll(selector: String): Transition = ???
    def selectAll(elements: js.Array[EventTarget]): Transition = ???
    var each: js.Function2[String, js.Function2[js.Any, Double, Any], Transition] = ???
    var transition: js.Function0[Transition] = ???
    var ease: js.Function = ???
    def attrTween(name: String, tween: js.Function3[js.Any, Double, js.Any, BaseInterpolate]): Transition = ???
    def styleTween(name: String, tween: js.Function3[js.Any, Double, js.Any, BaseInterpolate], priority: String = ???): Transition = ???
    def text(text: String): Transition = ???
    def tween(name: String, factory: InterpolateFactory): Transition = ???
    def filter(selector: String): Transition = ???
    def remove(): Transition = ???
  }

  trait InterpolateFactory extends js.Object {
    def apply(a: js.Any = ???, b: js.Any = ???): BaseInterpolate = ???
  }

  trait BaseInterpolate extends js.Object {
    def apply(a: js.Any, b: js.Any = ???): js.Dynamic = ???
  }

  trait Interpolate extends js.Object {
    def apply(t: js.Any): js.Dynamic = ???
  }

}

package Time {

  trait Time extends js.Object {
    var second: Interval = ???
    var minute: Interval = ???
    var hour: Interval = ???
    var day: Interval = ???
    var week: Interval = ???
    var sunday: Interval = ???
    var monday: Interval = ???
    var tuesday: Interval = ???
    var wednesday: Interval = ???
    var thursday: Interval = ???
    var friday: Interval = ???
    var saturday: Interval = ???
    var month: Interval = ???
    var year: Interval = ???
    var seconds: Range = ???
    var minutes: Range = ???
    var hours: Range = ???
    var days: Range = ???
    var weeks: Range = ???
    var months: Range = ???
    var years: Range = ???
    var sundays: Range = ???
    var mondays: Range = ???
    var tuesdays: Range = ???
    var wednesdays: Range = ???
    var thursdays: Range = ???
    var fridays: Range = ???
    var saturdays: Range = ???
    var format: js.Any = ???
    var scale: js.Any = ???
  }

  trait Range extends js.Object {
    def apply(start: Date, end: Date, step: Double = ???): js.Array[Date] = ???
  }

  trait Interval extends js.Object {
    def apply(date: Date): Date = ???
    var floor: js.Function1[Date, Date] = ???
    var round: js.Function1[Date, Date] = ???
    var ceil: js.Function1[Date, Date] = ???
    var range: Range = ???
    var offset: js.Function2[Date, Double, Date] = ???
    var utc: Interval = ???
  }

  trait TimeFormat extends js.Object {
    def apply(date: Date): String = ???
    var parse: js.Function1[String, Date] = ???
  }

}

package Layout {

  trait Layout extends js.Object {
    def stack(): StackLayout = ???
    def pie(): PieLayout = ???
    def force(): ForceLayout = ???
    def tree(): TreeLayout = ???
    def bundle(): BundleLayout = ???
    def chord(): ChordLayout = ???
    def cluster(): ClusterLayout = ???
    def hierarchy(): HierarchyLayout = ???
    def histogram(): HistogramLayout = ???
    def pack(): PackLayout = ???
    def partition(): PartitionLayout = ???
    def treemap(): TreeMapLayout = ???
  }

  trait StackLayout extends js.Object {
    def apply[T](layers: js.Array[T], index: Double = ???): js.Array[T] = ???
    def values(accessor: js.Function1[js.Any, Any] = ???): StackLayout = ???
    def offset(offset: String): StackLayout = ???
    def x(accessor: js.Function2[js.Any, Double, Any]): StackLayout = ???
    def y(accessor: js.Function2[js.Any, Double, Any]): StackLayout = ???
    def out(setter: js.Function3[js.Any, Double, Double, Unit]): StackLayout = ???
  }

  trait TreeLayout extends js.Object {
    def sort(): js.Function2[js.Any, js.Any, Double] = ???
    def sort(comparator: js.Function2[js.Any, js.Any, Double]): TreeLayout = ???
    def children(): js.Function1[js.Any, Any] = ???
    def children(children: js.Function1[js.Any, Any]): TreeLayout = ???
    def nodes(root: GraphNode): js.Array[GraphNode] = ???
    def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = ???
    def separation(): js.Function2[GraphNode, GraphNode, Double] = ???
    def separation(separation: js.Function2[GraphNode, GraphNode, Double]): TreeLayout = ???
    def size(): js.Array[Double] = ???
    def size(size: js.Array[Double]): TreeLayout = ???
    def nodeSize(): js.Array[Double] = ???
    def nodeSize(size: js.Array[Double]): TreeLayout = ???
  }

  trait PieLayout extends js.Object {
    def apply(values: js.Array[js.Any], index: Double = ???): js.Array[ArcDescriptor] = ???
    def value(): js.Function2[js.Any, Double, Double] = ???
    def value(accessor: js.Function2[js.Any, Double, Double]): PieLayout = ???
    def sort(): js.Function2[js.Any, js.Any, Double] = ???
    def sort(comparator: js.Function2[js.Any, js.Any, Double]): PieLayout = ???
    def startAngle(): Double = ???
    def startAngle(angle: Double): PieLayout = ???
    def endAngle(): Double = ???
    def endAngle(angle: Double): PieLayout = ???
  }

  trait ArcDescriptor extends js.Object {
    var value: js.Any = ???
    var data: js.Any = ???
    var startAngle: Double = ???
    var endAngle: Double = ???
    var index: Double = ???
  }

  trait GraphNode extends js.Object {
    var id: Double = ???
    var index: Double = ???
    var name: String = ???
    var px: Double = ???
    var py: Double = ???
    var size: Double = ???
    var weight: Double = ???
    var x: Double = ???
    var y: Double = ???
    var subindex: Double = ???
    var startAngle: Double = ???
    var endAngle: Double = ???
    var value: Double = ???
    var fixed: Boolean = ???
    var children: js.Array[GraphNode] = ???
    var _children: js.Array[GraphNode] = ???
    var parent: GraphNode = ???
    var depth: Double = ???
  }

  trait GraphLink extends js.Object {
    var source: GraphNode = ???
    var target: GraphNode = ???
  }

  trait GraphNodeForce extends js.Object {
    var index: Double = ???
    var x: Double = ???
    var y: Double = ???
    var px: Double = ???
    var py: Double = ???
    var fixed: Boolean = ???
    var weight: Double = ???
  }

  trait GraphLinkForce extends js.Object {
    var source: GraphNodeForce = ???
    var target: GraphNodeForce = ???
  }

  trait ForceLayout extends js.Object {
    def apply(): ForceLayout = ???
    def size(): Double = ???
    def size(mysize: js.Array[Double]): ForceLayout = ???
    def size(accessor: js.Function2[js.Any, Double, js.Any]): ForceLayout = ???
    def linkDistance(): Double = ???
    def linkDistance(number: Double): ForceLayout = ???
    def linkDistance(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = ???
    def linkStrength(): Double = ???
    def linkStrength(number: Double): ForceLayout = ???
    def linkStrength(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = ???
    def friction(): Double = ???
    def friction(number: Double): ForceLayout = ???
    def friction(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = ???
    def alpha(): Double = ???
    def alpha(number: Double): ForceLayout = ???
    def alpha(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = ???
    def charge(): Double = ???
    def charge(number: Double): ForceLayout = ???
    def charge(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = ???
    def theta(): Double = ???
    def theta(number: Double): ForceLayout = ???
    def theta(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = ???
    def gravity(): Double = ???
    def gravity(number: Double): ForceLayout = ???
    def gravity(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = ???
    def links(): js.Array[GraphLinkForce] = ???
    def links(arLinks: js.Array[GraphLinkForce]): ForceLayout = ???
    def nodes(): js.Array[GraphNodeForce] = ???
    def nodes(arNodes: js.Array[GraphNodeForce]): ForceLayout = ???
    def start(): ForceLayout = ???
    def resume(): ForceLayout = ???
    def stop(): ForceLayout = ???
    def tick(): ForceLayout = ???
    def on(`type`: String, listener: js.Function0[Unit]): ForceLayout = ???
    def drag(): ForceLayout = ???
  }

  trait BundleLayout extends js.Object {
    def apply(links: js.Array[GraphLink]): js.Array[js.Array[GraphNode]] = ???
  }

  trait ChordLayout extends js.Object {
    def matrix(): js.Array[js.Array[Double]] = ???
    def matrix(matrix: js.Array[js.Array[Double]]): ChordLayout = ???
    def padding(): Double = ???
    def padding(padding: Double): ChordLayout = ???
    def sortGroups(): js.Function2[Double, Double, Double] = ???
    def sortGroups(comparator: js.Function2[Double, Double, Double]): ChordLayout = ???
    def sortSubgroups(): js.Function2[Double, Double, Double] = ???
    def sortSubgroups(comparator: js.Function2[Double, Double, Double]): ChordLayout = ???
    def sortChords(): js.Function2[Double, Double, Double] = ???
    def sortChords(comparator: js.Function2[Double, Double, Double]): ChordLayout = ???
    def chords(): js.Array[GraphLink] = ???
    def groups(): js.Array[ArcDescriptor] = ???
  }

  trait ClusterLayout extends js.Object {
    def sort(): js.Function2[GraphNode, GraphNode, Double] = ???
    def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): ClusterLayout = ???
    def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = ???
    def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): ClusterLayout = ???
    def nodes(root: GraphNode): js.Array[GraphNode] = ???
    def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = ???
    def separation(): js.Function2[GraphNode, GraphNode, Double] = ???
    def separation(separation: js.Function2[GraphNode, GraphNode, Double]): ClusterLayout = ???
    def size(): js.Array[Double] = ???
    def size(size: js.Array[Double]): ClusterLayout = ???
    def value(): js.Function1[GraphNode, Double] = ???
    def value(value: js.Function1[GraphNode, Double]): ClusterLayout = ???
  }

  trait HierarchyLayout extends js.Object {
    def sort(): js.Function2[GraphNode, GraphNode, Double] = ???
    def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): HierarchyLayout = ???
    def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = ???
    def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): HierarchyLayout = ???
    def nodes(root: GraphNode): js.Array[GraphNode] = ???
    def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = ???
    def value(): js.Function1[GraphNode, Double] = ???
    def value(value: js.Function1[GraphNode, Double]): HierarchyLayout = ???
    def reValue(root: GraphNode): HierarchyLayout = ???
  }

  trait Bin extends js.Array[js.Any] {
    var x: Double = ???
    var dx: Double = ???
    var y: Double = ???
  }

  trait HistogramLayout extends js.Object {
    def apply(values: js.Array[js.Any], index: Double = ???): js.Array[Bin] = ???
    def value(): js.Function1[js.Any, Any] = ???
    def value(accessor: js.Function1[js.Any, Any]): HistogramLayout = ???
    def range(): js.Function2[js.Any, Double, js.Array[Double]] = ???
    def range(range: js.Function2[js.Any, Double, js.Array[Double]]): HistogramLayout = ???
    def bins(): js.Function2[js.Array[js.Any], Double, js.Array[Double]] = ???
    def bins(bins: js.Function2[js.Array[js.Any], Double, js.Array[Double]]): HistogramLayout = ???
    def frequency(): Boolean = ???
    def frequency(frequency: Boolean): HistogramLayout = ???
  }

  trait PackLayout extends js.Object {
    def sort(): js.Function2[GraphNode, GraphNode, Double] = ???
    def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): PackLayout = ???
    def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = ???
    def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): PackLayout = ???
    def nodes(root: GraphNode): js.Array[GraphNode] = ???
    def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = ???
    def value(): js.Function1[GraphNode, Double] = ???
    def value(value: js.Function1[GraphNode, Double]): PackLayout = ???
    def size(): js.Array[Double] = ???
    def size(size: js.Array[Double]): PackLayout = ???
    def padding(): Double = ???
    def padding(padding: Double): PackLayout = ???
  }

  trait PartitionLayout extends js.Object {
    def sort(): js.Function2[GraphNode, GraphNode, Double] = ???
    def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): PackLayout = ???
    def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = ???
    def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): PackLayout = ???
    def nodes(root: GraphNode): js.Array[GraphNode] = ???
    def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = ???
    def value(): js.Function1[GraphNode, Double] = ???
    def value(value: js.Function1[GraphNode, Double]): PackLayout = ???
    def size(): js.Array[Double] = ???
    def size(size: js.Array[Double]): PackLayout = ???
  }

  trait TreeMapLayout extends js.Object {
    def sort(): js.Function2[GraphNode, GraphNode, Double] = ???
    def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): TreeMapLayout = ???
    def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = ???
    def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): TreeMapLayout = ???
    def nodes(root: GraphNode): js.Array[GraphNode] = ???
    def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = ???
    def value(): js.Function1[GraphNode, Double] = ???
    def value(value: js.Function1[GraphNode, Double]): TreeMapLayout = ???
    def size(): js.Array[Double] = ???
    def size(size: js.Array[Double]): TreeMapLayout = ???
    def padding(): Double = ???
    def padding(padding: Double): TreeMapLayout = ???
    def round(): Boolean = ???
    def round(round: Boolean): TreeMapLayout = ???
    def sticky(): Boolean = ???
    def sticky(sticky: Boolean): TreeMapLayout = ???
    def mode(): String = ???
    def mode(mode: String): TreeMapLayout = ???
  }

}

package Color {

  trait Color extends js.Object {
    def brighter(k: Double = ???): Color = ???
    def darker(k: Double = ???): Color = ???
  }

  trait RGBColor extends Color {
    var r: Double = ???
    var g: Double = ???
    var b: Double = ???
    def hsl(): HSLColor = ???
  }

  trait HSLColor extends Color {
    var h: Double = ???
    var s: Double = ???
    var l: Double = ???
    def rgb(): RGBColor = ???
  }

  trait LABColor extends Color {
    var l: Double = ???
    var a: Double = ???
    var b: Double = ???
    def rgb(): RGBColor = ???
  }

  trait HCLColor extends Color {
    var h: Double = ???
    var c: Double = ???
    var l: Double = ???
    def rgb(): RGBColor = ???
  }

}

package Svg {

  trait Svg extends js.Object {
    def symbol(): Symbol = ???
    def axis(): Axis = ???
    def arc(): Arc = ???
    var line: js.Any = ???
    var area: js.Any = ???
    def brush(): Brush = ???
    def chord(): Chord = ???
    var diagonal: js.Any = ???
    var symbolTypes: js.Array[String] = ???
  }

  trait Symbol extends js.Object {
    var `type`: js.Function1[String, Symbol] = ???
    var size: js.Function1[Double, Symbol] = ???
    def apply(datum: js.Any, index: Double): String = ???
  }

  trait Brush extends js.Object {
    def apply(selection: D3.Selection): Unit = ???
    def x(): Scale.Scale = ???
    def x(scale: Scale.Scale): Brush = ???
    def y(): Scale.Scale = ???
    def y(scale: Scale.Scale): Brush = ???
    def extent(): js.Array[js.Any] = ???
    def extent(values: js.Array[js.Any]): Brush = ???
    def clear(): Brush = ???
    def empty(): Boolean = ???
    def on(`type`: String): js.Function2[js.Any, Double, Any] = ???
    def on(`type`: String, listener: js.Function2[js.Any, Double, Any], capture: Boolean = ???): Brush = ???
  }

  trait Axis extends js.Object {
    def apply(selection: D3.Selection): Unit = ???
    def apply(transition: Transition.Transition): Unit = ???
    def scale(): js.Dynamic = ???
    def scale(scale: js.Any): Axis = ???
    def orient(): String = ???
    def orient(orientation: String): Axis = ???
    def ticks(): js.Array[js.Any] = ???
    def ticks(arguments: js.Any*): Axis = ???
    def tickPadding(): Double = ???
    def tickPadding(padding: Double): Axis = ???
    def tickValues(): js.Array[js.Any] = ???
    def tickValues(values: js.Array[js.Any]): Axis = ???
    def tickSubdivide(count: Double): Axis = ???
    def tickSize(): Double = ???
    def tickSize(inner: Double, outer: Double = ???): Axis = ???
    def innerTickSize(): Double = ???
    def innerTickSize(value: Double): Axis = ???
    def outerTickSize(): Double = ???
    def outerTickSize(value: Double): Axis = ???
    def tickFormat(formatter: js.Function1[js.Any, String]): Axis = ???
    def nice(count: Double = ???): Axis = ???
  }

  trait Arc extends js.Object {
    def apply(data: js.Any, index: Double = ???): String = ???
    def innerRadius(): js.Function2[js.Any, Double, Double] = ???
    def innerRadius(radius: Double): Arc = ???
    def outerRadius(): js.Function2[js.Any, Double, Double] = ???
    def outerRadius(radius: Double): Arc = ???
    def startAngle(): js.Function2[js.Any, Double, Double] = ???
    def startAngle(angle: Double): Arc = ???
    def endAngle(): js.Function2[js.Any, Double, Double] = ???
    def endAngle(angle: Double): Arc = ???
    def centroid(data: js.Any, index: Double = ???): js.Array[Double] = ???
  }

  trait Line extends js.Object {
    def apply(data: js.Array[js.Any], index: Double = ???): String = ???
    def x(): js.Function2[js.Any, Double, Double] = ???
    def x(accessor: js.Function1[js.Any, Double]): Line = ???
    def x(cnst: Double): Line = ???
    def y(): js.Function2[js.Any, Double, Double] = ???
    def y(accessor: js.Function1[js.Any, Double]): Line = ???
    def y(cnst: Double): Line = ???
    def interpolate(): String = ???
    def interpolate(interpolate: String): Line = ???
    def tension(): Double = ???
    def tension(tension: Double): Line = ???
    def defined(): js.Function2[js.Any, Double, Boolean] = ???
    def defined(defined: js.Function2[js.Any, Double, Boolean]): Line = ???
  }

  trait LineRadial extends js.Object {
    def apply(data: js.Array[js.Any], index: Double = ???): String = ???
    def x(): js.Function2[js.Any, Double, Double] = ???
    def x(accessor: js.Function1[js.Any, Double]): LineRadial = ???
    def x(cnst: Double): LineRadial = ???
    def y(): js.Function2[js.Any, Double, Double] = ???
    def y(accessor: js.Function1[js.Any, Double]): LineRadial = ???
    def y(cnst: Double): LineRadial = ???
    def interpolate(): String = ???
    def interpolate(interpolate: String): LineRadial = ???
    def tension(): Double = ???
    def tension(tension: Double): LineRadial = ???
    def defined(): js.Function1[js.Any, Any] = ???
    def defined(defined: js.Function1[js.Any, Any]): LineRadial = ???
    def radius(): js.Function2[js.Any, Double, Double] = ???
    def radius(radius: Double): LineRadial = ???
    def angle(): js.Function2[js.Any, js.Any, Double] = ???
    def angle(angle: Double): LineRadial = ???
  }

  trait Area extends js.Object {
    def apply(data: js.Array[js.Any], index: Double = ???): String = ???
    def x(): js.Function2[js.Any, Double, Double] = ???
    def x(accessor: js.Function1[js.Any, Double]): Area = ???
    def x(cnst: Double): Area = ???
    def x0(): js.Function2[js.Any, Double, Double] = ???
    def x0(accessor: js.Function1[js.Any, Double]): Area = ???
    def x0(cnst: Double): Area = ???
    def x1(): js.Function2[js.Any, Double, Double] = ???
    def x1(accessor: js.Function1[js.Any, Double]): Area = ???
    def x1(cnst: Double): Area = ???
    def y(): js.Function2[js.Any, Double, Double] = ???
    def y(accessor: js.Function1[js.Any, Double]): Area = ???
    def y(cnst: Double): Area = ???
    def y0(): js.Function2[js.Any, Double, Double] = ???
    def y0(accessor: js.Function1[js.Any, Double]): Area = ???
    def y0(cnst: Double): Area = ???
    def y1(): js.Function2[js.Any, Double, Double] = ???
    def y1(accessor: js.Function1[js.Any, Double]): Area = ???
    def y1(cnst: Double): Area = ???
    def interpolate(): String = ???
    def interpolate(interpolate: String): Area = ???
    def tension(): Double = ???
    def tension(tension: Double): Area = ???
    def defined(): js.Function2[js.Any, Double, Any] = ???
    def defined(defined: js.Function2[js.Any, Double, Any]): Area = ???
  }

  trait AreaRadial extends js.Object {
    def apply(data: js.Array[js.Any], index: Double = ???): String = ???
    def x(): js.Function2[js.Any, Double, Double] = ???
    def x(accessor: js.Function1[js.Any, Double]): AreaRadial = ???
    def x(cnst: Double): AreaRadial = ???
    def x0(): js.Function2[js.Any, Double, Double] = ???
    def x0(accessor: js.Function1[js.Any, Double]): AreaRadial = ???
    def x0(cnst: Double): AreaRadial = ???
    def x1(): js.Function2[js.Any, Double, Double] = ???
    def x1(accessor: js.Function1[js.Any, Double]): AreaRadial = ???
    def x1(cnst: Double): AreaRadial = ???
    def y(): js.Function2[js.Any, Double, Double] = ???
    def y(accessor: js.Function1[js.Any, Double]): AreaRadial = ???
    def y(cnst: Double): AreaRadial = ???
    def y0(): js.Function2[js.Any, Double, Double] = ???
    def y0(accessor: js.Function1[js.Any, Double]): AreaRadial = ???
    def y0(cnst: Double): AreaRadial = ???
    def y1(): js.Function2[js.Any, Double, Double] = ???
    def y1(accessor: js.Function1[js.Any, Double]): AreaRadial = ???
    def y1(cnst: Double): AreaRadial = ???
    def interpolate(): String = ???
    def interpolate(interpolate: String): AreaRadial = ???
    def tension(): Double = ???
    def tension(tension: Double): AreaRadial = ???
    def defined(): js.Function1[js.Any, Any] = ???
    def defined(defined: js.Function1[js.Any, Any]): AreaRadial = ???
    def radius(): Double = ???
    def radius(radius: Double): AreaRadial = ???
    def innerRadius(): Double = ???
    def innerRadius(radius: Double): AreaRadial = ???
    def outerRadius(): Double = ???
    def outerRadius(radius: Double): AreaRadial = ???
    def angle(): Double = ???
    def angle(angle: Double): AreaRadial = ???
    def startAngle(): Double = ???
    def startAngle(angle: Double): AreaRadial = ???
    def endAngle(): Double = ???
    def endAngle(angle: Double): AreaRadial = ???
  }

  trait Chord extends js.Object {
    def apply(datum: js.Any, index: Double = ???): String = ???
    def radius(): Double = ???
    def radius(radius: Double): Chord = ???
    def startAngle(): Double = ???
    def startAngle(angle: Double): Chord = ???
    def endAngle(): Double = ???
    def endAngle(angle: Double): Chord = ???
    def source(): js.Dynamic = ???
    def source(angle: js.Any): Chord = ???
    def target(): js.Dynamic = ???
    def target(angle: js.Any): Chord = ???
  }

  trait Diagonal extends js.Object {
    def apply(datum: js.Any, index: Double = ???): String = ???
    def projection(): js.Function2[js.Any, Double, js.Array[Double]] = ???
    def projection(proj: js.Function1[js.Any, js.Array[Double]]): Diagonal = ???
    def source(): js.Function2[js.Any, Double, Any] = ???
    def source(src: js.Function1[js.Any, Any]): Diagonal = ???
    def target(): js.Function2[js.Any, Double, Any] = ???
    def target(target: js.Function1[js.Any, Any]): Diagonal = ???
  }

}

package Scale {

  trait ScaleBase extends js.Object {
    def linear(): LinearScale = ???
    def ordinal(): OrdinalScale = ???
    def quantize(): QuantizeScale = ???
    def category10(): OrdinalScale = ???
    def category20(): OrdinalScale = ???
    def category20b(): OrdinalScale = ???
    def category20c(): OrdinalScale = ???
    def identity(): IdentityScale = ???
    def log(): LogScale = ???
    def pow(): PowScale = ???
    def quantile(): QuantileScale = ???
    def sqrt(): SqrtScale = ???
    def threshold(): ThresholdScale = ???
  }

  trait GenericScale[S] extends js.Object {
    def apply(value: js.Any): js.Dynamic = ???
    def domain(values: js.Array[js.Any]): S = ???
    def domain(): js.Array[js.Any] = ???
    def range(values: js.Array[js.Any]): S = ???
    def range(): js.Array[js.Any] = ???
    def invertExtent(y: js.Any): js.Array[js.Any] = ???
    def copy(): S = ???
  }

  trait Scale extends GenericScale[Scale] {
  }

  trait GenericQuantitativeScale[S] extends GenericScale[S] {
    def apply(value: Double): Double = ???
    def invert(value: Double): Double = ???
    var rangeRound: js.Function1[js.Array[js.Any], S] = ???
    def interpolate(): Transition.Interpolate = ???
    def interpolate(factory: Transition.Interpolate): S = ???
    def clamp(): Boolean = ???
    def clamp(clamp: Boolean): S = ???
    def nice(count: Double = ???): S = ???
    def ticks(count: Double): js.Array[js.Any] = ???
    def tickFormat(count: Double, format: String = ???): js.Function1[Double, String] = ???
  }

  trait QuantitativeScale extends GenericQuantitativeScale[QuantitativeScale] {
  }

  trait LinearScale extends GenericQuantitativeScale[LinearScale] {
  }

  trait IdentityScale extends GenericScale[IdentityScale] {
    def apply(value: Double): Double = ???
    def invert(value: Double): Double = ???
    def ticks(count: Double): js.Array[js.Any] = ???
    def tickFormat(count: Double): js.Function1[Double, String] = ???
  }

  trait SqrtScale extends GenericQuantitativeScale[SqrtScale] {
  }

  trait PowScale extends GenericQuantitativeScale[PowScale] {
  }

  trait LogScale extends GenericQuantitativeScale[LogScale] {
  }

  trait OrdinalScale extends GenericScale[OrdinalScale] {
    def rangePoints(interval: js.Array[js.Any], padding: Double = ???): OrdinalScale = ???
    def rangeBands(interval: js.Array[js.Any], padding: Double = ???, outerPadding: Double = ???): OrdinalScale = ???
    def rangeRoundBands(interval: js.Array[js.Any], padding: Double = ???, outerPadding: Double = ???): OrdinalScale = ???
    def rangeBand(): Double = ???
    def rangeExtent(): js.Array[js.Any] = ???
  }

  trait QuantizeScale extends GenericScale[QuantizeScale] {
  }

  trait ThresholdScale extends GenericScale[ThresholdScale] {
  }

  trait QuantileScale extends GenericScale[QuantileScale] {
    def quantiles(): js.Array[js.Any] = ???
  }

  trait TimeScale extends GenericScale[TimeScale] {
    def apply(value: Date): Double = ???
    def invert(value: Double): Date = ???
    var rangeRound: js.Function1[js.Array[js.Any], TimeScale] = ???
    def interpolate(): Transition.Interpolate = ???
    def interpolate(factory: Transition.InterpolateFactory): TimeScale = ???
    def clamp(clamp: Boolean): TimeScale = ???
    def ticks(count: Double): js.Array[js.Any] = ???
    def ticks(range: Time.Range, count: Double): js.Array[js.Any] = ???
    def tickFormat(count: Double): js.Function1[Double, String] = ???
    def nice(count: Double = ???): TimeScale = ???
  }

}

package Behavior {

  trait Behavior extends js.Object {
    def drag(): Drag = ???
    def zoom(): Zoom = ???
  }

  trait Zoom extends js.Object {
    def apply(selection: D3.Selection): Unit = ???
    var on: js.Function2[String, js.Function2[js.Any, Double, Any], Zoom] = ???
    def scale(): Double = ???
    def scale(scale: Double): Zoom = ???
    def translate(): js.Array[Double] = ???
    def translate(translate: js.Array[Double]): Zoom = ???
    def scaleExtent(): js.Array[Double] = ???
    def scaleExtent(extent: js.Array[Double]): Zoom = ???
    def x(): Scale.Scale = ???
    def x(x: Scale.Scale): Zoom = ???
    def y(): Scale.Scale = ???
    def y(y: Scale.Scale): Zoom = ???
  }

  trait Drag extends js.Object {
    def apply(): js.Dynamic = ???
    var on: js.Function2[String, js.Function2[js.Any, Double, Any], Drag] = ???
    def origin(): js.Dynamic = ???
    def origin(origin: js.Any = ???): Drag = ???
  }

}

package Geo {

  trait Geo extends js.Object {
    def path(): Path = ???
    def circle(): Circle = ???
    def area(feature: js.Any): Double = ???
    def bounds(feature: js.Any): js.Array[js.Array[Double]] = ???
    def centroid(feature: js.Any): js.Array[Double] = ???
    def distance(a: js.Array[Double], b: js.Array[Double]): Double = ???
    def interpolate(a: js.Array[Double], b: js.Array[Double]): js.Function1[Double, js.Array[Double]] = ???
    def length(feature: js.Any): Double = ???
    def projection(raw: RawProjection): Projection = ???
    def projectionMutator(rawFactory: RawProjection): ProjectionMutator = ???
    def albers(): Projection = ???
    def albersUsa(): Projection = ???
    var azimuthalEqualArea: js.Any = ???
    var azimuthalEquidistant: js.Any = ???
    var conicConformal: js.Any = ???
    var conicEquidistant: js.Any = ???
    var conicEqualArea: js.Any = ???
    var equirectangular: js.Any = ???
    var gnomonic: js.Any = ???
    var mercator: js.Any = ???
    var orthographic: js.Any = ???
    var stereographic: js.Any = ???
    var transverseMercator: js.Any = ???
    def stream(`object`: GeoJSON, listener: Stream): Unit = ???
    def graticule(): Graticule = ???
    def greatArc(): GreatArc = ???
    def rotation(rotation: js.Array[Double]): Rotation = ???
  }

  trait Path extends js.Object {
    def apply(feature: js.Any, index: js.Any = ???): String = ???
    def projection(): Projection = ???
    def projection(projection: Projection): Path = ???
    def context(): String = ???
    def context(context: Context): Path = ???
    def area(feature: js.Any): js.Dynamic = ???
    def centroid(feature: js.Any): js.Dynamic = ???
    def bounds(feature: js.Any): js.Dynamic = ???
    def pointRadius(): Double = ???
    def pointRadius(radius: Double): Path = ???
  }

  trait Context extends js.Object {
    def beginPath(): js.Dynamic = ???
    def moveTo(x: Double, y: Double): js.Dynamic = ???
    def lineTo(x: Double, y: Double): js.Dynamic = ???
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): js.Dynamic = ???
    def closePath(): js.Dynamic = ???
  }

  trait Circle extends js.Object {
    def apply(args: js.Any*): GeoJSON = ???
    def origin(): js.Array[Double] = ???
    def origin(origin: js.Array[Double]): Circle = ???
    def angle(): Double = ???
    def angle(angle: Double): Circle = ???
    def precision(): Double = ???
    def precision(precision: Double): Circle = ???
  }

  trait Graticule extends js.Object {
    def apply(): GeoJSON = ???
    def lines(): js.Array[GeoJSON] = ???
    def outline(): GeoJSON = ???
    def extent(): js.Array[js.Array[Double]] = ???
    def extent(extent: js.Array[js.Array[Double]]): Graticule = ???
    def minorExtent(): js.Array[js.Array[Double]] = ???
    def minorExtent(extent: js.Array[js.Array[Double]]): Graticule = ???
    def majorExtent(): js.Array[js.Array[Double]] = ???
    def majorExtent(extent: js.Array[js.Array[Double]]): Graticule = ???
    def step(): js.Array[js.Array[Double]] = ???
    def step(extent: js.Array[js.Array[Double]]): Graticule = ???
    def minorStep(): js.Array[js.Array[Double]] = ???
    def minorStep(extent: js.Array[js.Array[Double]]): Graticule = ???
    def majorStep(): js.Array[js.Array[Double]] = ???
    def majorStep(extent: js.Array[js.Array[Double]]): Graticule = ???
    def precision(): Double = ???
    def precision(precision: Double): Graticule = ???
  }

  trait GreatArc extends js.Object {
    def apply(): GeoJSON = ???
    def distance(): Double = ???
    def source(): js.Dynamic = ???
    def source(source: js.Any): GreatArc = ???
    def target(): js.Dynamic = ???
    def target(target: js.Any): GreatArc = ???
    def precision(): Double = ???
    def precision(precision: Double): GreatArc = ???
  }

  trait GeoJSON extends js.Object {
    var coordinates: js.Array[js.Array[Double]] = ???
    var `type`: String = ???
  }

  trait RawProjection extends js.Object {
    def apply(lambda: Double, phi: Double): js.Array[Double] = ???
    def invert(x: Double, y: Double): js.Array[Double] = ???
  }

  trait Projection extends js.Object {
    def apply(coordinates: js.Array[Double]): js.Array[Double] = ???
    def invert(point: js.Array[Double]): js.Array[Double] = ???
    def rotate(): js.Array[Double] = ???
    def rotate(rotation: js.Array[Double]): Projection = ???
    def center(): js.Array[Double] = ???
    def center(location: js.Array[Double]): Projection = ???
    def parallels(): js.Array[Double] = ???
    def parallels(location: js.Array[Double]): Projection = ???
    def translate(): js.Array[Double] = ???
    def translate(point: js.Array[Double]): Projection = ???
    def scale(): Double = ???
    def scale(scale: Double): Projection = ???
    def clipAngle(): Double = ???
    def clipAngle(angle: Double): Projection = ???
    def clipExtent(): js.Array[js.Array[Double]] = ???
    def clipExtent(extent: js.Array[js.Array[Double]]): Projection = ???
    def precision(): Double = ???
    def precision(precision: Double): Projection = ???
    def stream(listener: Stream = ???): Stream = ???
  }

  trait Stream extends js.Object {
    def point(x: Double, y: Double, z: Double = ???): Unit = ???
    def lineStart(): Unit = ???
    def lineEnd(): Unit = ???
    def polygonStart(): Unit = ???
    def polygonEnd(): Unit = ???
    def sphere(): Unit = ???
  }

  trait Rotation extends js.Array[js.Any] {
    def apply(location: js.Array[Double]): Rotation = ???
    def invert(location: js.Array[Double]): Rotation = ???
  }

  trait ProjectionMutator extends js.Object {
    def apply(lambda: Double, phi: Double): Projection = ???
  }

}

package Geom {

  trait Geom extends js.Object {
    def voronoi[T](): Voronoi[T] = ???
    def voronoi(vertices: js.Array[Vertice]): js.Array[Polygon] = ???
    def delaunay(vertices: js.Array[Vertice] = ???): js.Array[Polygon] = ???
    def quadtree(): QuadtreeFactory = ???
    def quadtree(points: js.Array[Point], x1: Double, y1: Double, x2: Double, y2: Double): Quadtree = ???
    def quadtree(points: js.Array[Point], width: Double, height: Double): Quadtree = ???
    def polygon(vertices: js.Array[Vertice]): Polygon = ???
    def hull(): Hull = ???
    def hull(vertices: js.Array[Vertice]): js.Array[Vertice] = ???
  }

  trait Vertice extends js.Array[Double] {
    var angle: Double = ???
  }

  trait Polygon extends js.Array[Vertice] {
    def area(): Double = ???
    def centroid(): js.Array[Double] = ???
    def clip(subject: Polygon): Polygon = ???
  }

  trait QuadtreeFactory extends js.Object {
    def apply(): Quadtree = ???
    def apply(points: js.Array[Point], x1: Double, y1: Double, x2: Double, y2: Double): Quadtree = ???
    def apply(points: js.Array[Point], width: Double, height: Double): Quadtree = ???
    def x(): js.Function1[js.Any, Any] = ???
    def x(accesor: js.Function1[js.Any, Any]): QuadtreeFactory = ???
    def y(): js.Function1[js.Any, Any] = ???
    def y(accesor: js.Function1[js.Any, Any]): QuadtreeFactory = ???
    def size(): js.Array[Double] = ???
    def size(size: js.Array[Double]): QuadtreeFactory = ???
    def extent(): js.Array[js.Array[Double]] = ???
    def extent(points: js.Array[js.Array[Double]]): QuadtreeFactory = ???
  }

  trait Quadtree extends js.Object {
    def add(point: Point): Unit = ???
    def visit(callback: js.Any): Unit = ???
  }

  trait Point extends js.Object {
    var x: Double = ???
    var y: Double = ???
  }

  trait Voronoi[T] extends js.Object {
    def apply(data: js.Array[T]): js.Array[Polygon] = ???
    def links(data: js.Array[T]): js.Array[Layout.GraphLink] = ???
    def triangles(data: js.Array[T]): js.Array[js.Array[Double]] = ???
    def x(): js.Function2[T, Double, Double] = ???
    def x(accessor: js.Function2[T, Double, Double]): Voronoi[T] = ???
    def x(constant: Double): Voronoi[T] = ???
    def y(): js.Function2[T, Double, Double] = ???
    def y(accessor: js.Function2[T, Double, Double]): Voronoi[T] = ???
    def y(constant: Double): Voronoi[T] = ???
    def clipExtent(): js.Array[js.Array[Double]] = ???
    def clipExtent(extent: js.Array[js.Array[Double]]): Voronoi[T] = ???
    def size(): js.Array[Double] = ???
    def size(size: js.Array[Double]): Voronoi[T] = ???
  }

  trait Hull extends js.Object {
    def apply(vertices: js.Array[Vertice]): js.Array[Vertice] = ???
    def x(): js.Function1[js.Any, Any] = ???
    def x(accesor: js.Function1[js.Any, Any]): js.Dynamic = ???
    def y(): js.Function1[js.Any, Any] = ???
    def y(accesor: js.Function1[js.Any, Any]): js.Dynamic = ???
  }

}



