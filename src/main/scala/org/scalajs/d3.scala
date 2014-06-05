package org.scalajs.d3

import scala.scalajs.js
import js.annotation._
import scala.scalajs.js.Date
import org.scalajs.dom.XMLHttpRequest
import org.scalajs.dom.Document
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import org.scalajs.dom.EventTarget


  trait Selectors extends js.Object {
    def select(selector: js.String): Selection = ???
    def select(element: EventTarget): Selection = ???
    def selectAll(selector: js.String): Selection = ???
    def selectAll(elements: js.Array[EventTarget]): Selection = ???
  }

  trait Event extends js.Object {
    var dx: js.Number = ???
    var dy: js.Number = ???
    var clientX: js.Number = ???
    var clientY: js.Number = ???
    var translate: js.Array[js.Number] = ???
    var scale: js.Number = ???
    var sourceEvent: Event = ???
    var x: js.Number = ???
    var y: js.Number = ???
    var keyCode: js.Number = ???
    var altKey: js.Any = ???
    var `type`: js.String = ???
  }

  trait Base extends Selectors {
    var behavior: Behavior.Behavior = ???
    var event: Event = ???
    def ascending[T](a: T, b: T): js.Number = ???
    def descending[T](a: T, b: T): js.Number = ???
    def min[T, U](arr: js.Array[T], map: js.Function1[T, U]): U = ???
    def min[T](arr: js.Array[T]): T = ???
    def max[T, U](arr: js.Array[T], map: js.Function1[T, U]): U = ???
    def max[T](arr: js.Array[T]): T = ???
    def extent[T, U](arr: js.Array[T], map: js.Function1[T, U]): js.Array[U] = ???
    def extent[T](arr: js.Array[T]): js.Array[T] = ???
    def sum[T](arr: js.Array[T], map: js.Function1[T, js.Number]): js.Number = ???
    def sum(arr: js.Array[js.Number]): js.Number = ???
    def mean[T](arr: js.Array[T], map: js.Function1[T, js.Number]): js.Number = ???
    def mean(arr: js.Array[js.Number]): js.Number = ???
    def median[T](arr: js.Array[T], map: js.Function1[T, js.Number]): js.Number = ???
    def median(arr: js.Array[js.Number]): js.Number = ???
    var quantile: js.Function2[js.Array[js.Number], js.Number, js.Number] = ???
    def bisect[T](arr: js.Array[T], x: T, low: js.Number = ???, high: js.Number = ???): js.Number = ???
    def bisectLeft[T](arr: js.Array[T], x: T, low: js.Number = ???, high: js.Number = ???): js.Number = ???
    def bisectRight[T](arr: js.Array[T], x: T, low: js.Number = ???, high: js.Number = ???): js.Number = ???
    def bisector(accessor: js.Function2[js.Any, js.Number, Any]): js.Dynamic = ???
    def shuffle[T](arr: js.Array[T]): js.Array[T] = ???
    def permute(arr: js.Array[js.Any], indexes: js.Array[js.Any]): js.Array[js.Any] = ???
    def zip(arrs: js.Any*): js.Array[js.Any] = ???
    def transform(definition: js.String): js.Dynamic = ???
    def transpose(matrix: js.Array[js.Any]): js.Array[js.Any] = ???
    def keys(map: js.Any): js.Array[js.String] = ???
    def values(map: js.Array[js.Any]): js.Array[js.Any] = ???
    def entries(map: js.Any): js.Array[js.Any] = ???
    def merge(map: js.Any*): js.Array[js.Any] = ???
    def range(stop: js.Number, step: js.Number): js.Array[js.Number] = ???
    def range(start: js.Number, stop: js.Number, step: js.Number): js.Array[js.Number] = ???
    def nest(): Nest = ???
    def xhr(url: js.String, callback: js.Function1[XMLHttpRequest, Unit]): Xhr = ???
    def xhr(url: js.String, mime: js.String, callback: js.Function1[XMLHttpRequest, Unit]): Xhr = ???
    def text(url: js.String, callback: js.Function1[js.String, Unit]): Xhr = ???
    def text(url: js.String, mime: js.String, callback: js.Function1[js.String, Unit]): Xhr = ???
    var json: js.Function2[js.String, js.Function2[js.Any, js.Any, Unit], Xhr] = ???
    def xml(url: js.String, callback: js.Function1[Document, Unit]): Xhr = ???
    def xml(url: js.String, mime: js.String, callback: js.Function1[Document, Unit]): Xhr = ???
    var html: js.Function2[js.String, js.Function1[DocumentFragment, Unit], Xhr] = ???
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
    def format(specifier: js.String): js.Function1[js.Number, js.String] = ???
    def formatPrefix(value: js.Number, precision: js.Number = ???): MetricPrefix = ???
    var version: js.String = ???
    def selection(): Selection = ???
    var ns: js.Any = ???
    var ease: js.Function = ???
    def rgb(r: js.Number, g: js.Number, b: js.Number): Color.RGBColor = ???
    def rgb(color: js.String): Color.RGBColor = ???
    def hcl(h: js.Number, c: js.Number, l: js.Number): Color.HCLColor = ???
    def hcl(color: js.String): Color.HCLColor = ???
    def hsl(h: js.Number, s: js.Number, l: js.Number): Color.HSLColor = ???
    def hsl(color: js.String): Color.HSLColor = ???
    def lab(l: js.Number, a: js.Number, b: js.Number): Color.LABColor = ???
    def lab(color: js.String): Color.LABColor = ???
    var geo: Geo.Geo = ???
    var geom: Geom.Geom = ???
    def mouse(container: js.Any): js.Array[js.Number] = ???
    def touches(container: js.Any): js.Array[js.Array[js.Number]] = ???
    def functor[R, T](value: js.Function1[R, T]): js.Function1[R, T] = ???
    def functor[T](value: T): js.Function1[js.Any, T] = ???
    def map(`object`: js.Any = ???): Map = ???
    def set(array: js.Array[js.Any] = ???): Set = ???
    def dispatch(types: js.String*): Dispatch = ???
    def rebind(target: js.Any, source: js.Any, names: js.Any*): js.Dynamic = ???
    def requote(str: js.String): js.String = ???
    var timer: js.Any = ???
    def transition(): Transition.Transition = ???
    def round(x: js.Number, n: js.Number): js.Number = ???
  }

  trait Dispatch extends js.Object {
    @JSBracketAccess
    def apply(event: js.String): js.Any = ???
    @JSBracketAccess
    def update(event: js.String, v: js.Any): Unit = ???
    def on(`type`: js.String): js.Dynamic = ???
    def on(`type`: js.String, listener: js.Any): js.Dynamic = ???
  }

  trait MetricPrefix extends js.Object {
    var scale: js.Function1[js.Number, js.Number] = ???
    var symbol: js.String = ???
  }

  trait Xhr extends js.Object {
    def header(name: js.String): js.String = ???
    def header(name: js.String, value: js.String): Xhr = ???
    def mimeType(): js.String = ???
    def mimeType(`type`: js.String): Xhr = ???
    def response(): js.Function1[XMLHttpRequest, Any] = ???
    def response(value: js.Function1[XMLHttpRequest, Any]): Xhr = ???
    def get(callback: js.Function1[XMLHttpRequest, Unit] = ???): Xhr = ???
    def post(callback: js.Function1[XMLHttpRequest, Unit] = ???): Xhr = ???
    def post(data: js.Any, callback: js.Function1[XMLHttpRequest, Unit]): Xhr = ???
    def send(method: js.String, callback: js.Function1[XMLHttpRequest, Unit]): Xhr = ???
    def send(method: js.String, data: js.Any, callback: js.Function1[XMLHttpRequest, Unit]): Xhr = ???
    def abort(): Xhr = ???
    var on: js.Function2[js.String, js.Function2[js.Any, js.Number, Any], Xhr] = ???
  }

  trait Dsv extends js.Object {
    def apply(url: js.String, callback: js.Function2[js.Any, js.Array[js.Any], Unit] = ???): Xhr = ???
    def parse(string: js.String): js.Array[js.Any] = ???
    def parseRows(string: js.String, accessor: js.Function2[js.Array[js.Any], js.Number, Any]): js.Dynamic = ???
    def format(rows: js.Array[js.Any]): js.String = ???
  }

  trait Selection extends js.Array[js.Any] with Selectors {
    def attr(name: js.String): js.String = ???
    def attr(name: js.String, value: js.Any): Selection = ???
    def attr(name: js.String, valueFunction: js.Function2[js.Any, js.Number, Any]): Selection = ???
    def attr(attrValueMap: Object): Selection = ???
    def classed(name: js.String): js.String = ???
    def classed(name: js.String, value: js.Any): Selection = ???
    def classed(name: js.String, valueFunction: js.Function2[js.Any, js.Number, Any]): Selection = ???
    def style(name: js.String): js.String = ???
    def style(name: js.String, value: js.Any, priority: js.String=null): Selection = ???
    def style(name: js.String, valueFunction: js.Function2[js.Any, js.Number, Any], priority: js.String): Selection = ???
    def style(styleValueMap: Object): Selection = ???
    def property(name: js.String): Unit = ???
    def property(name: js.String, value: js.Any): Selection = ???
    def property(name: js.String, valueFunction: js.Function2[js.Any, js.Number, Any]): Selection = ???
    def property(propertyValueMap: Object): Selection = ???
    def text(): js.String = ???
    def text(value: js.Any): Selection = ???
    def text(valueFunction: js.Function2[js.Any, js.Number, Any]): Selection = ???
    def html(): js.String = ???
    def html(value: js.Any): Selection = ???
    def html(valueFunction: js.Function2[js.Any, js.Number, Any]): Selection = ???
    var append: js.Function1[js.String, Selection] = ???
    var insert: js.Function2[js.String, js.String, Selection] = ???
    var remove: js.Function0[Selection] = ???
    var empty: js.Function0[js.Boolean] = ???
    def data(values: js.Function2[js.Any, js.Number, js.Array[js.Any]], key: js.Function2[js.Any, js.Number, js.String] = ???): UpdateSelection = ???
    def data(): js.Array[js.Any] = ???
    def datum(values: js.Function2[js.Any, js.Number, Any]): UpdateSelection = ???
    def datum(): js.Dynamic = ???
    def filter(filter: js.Function2[js.Any, js.Number, js.Boolean], thisArg: js.Any = ???): UpdateSelection = ???
    def call(callback: js.Function, args: js.Any*): Selection = ???
    def each(eachFunction: js.Function2[js.Any, js.Number, Any]): Selection = ???
    def on(`type`: js.String): js.Function2[js.Any, js.Number, Any] = ???
    def on(`type`: js.String, listener: js.Function2[js.Any, js.Number, Any], capture: js.Boolean = ???): Selection = ???
    def size(): js.Number = ???
    def transition(): Transition.Transition = ???
    def sort[T](comparator: js.Function2[T, T, js.Number]): Selection = ???
    var order: js.Function0[Selection] = ???
    var node: js.Function0[Element] = ???
  }

  trait EnterSelection extends js.Object {
    var append: js.Function1[js.String, Selection] = ???
    var insert: js.Function2[js.String, js.String, Selection] = ???
    var select: js.Function1[js.String, Selection] = ???
    var empty: js.Function0[js.Boolean] = ???
    var node: js.Function0[Element] = ???
    var call: js.Function1[js.Function1[EnterSelection, Unit], EnterSelection] = ???
    var size: js.Function0[js.Number] = ???
  }

  trait UpdateSelection extends Selection {
    var enter: js.Function0[EnterSelection] = ???
    var update: js.Function0[Selection] = ???
    var exit: js.Function0[Selection] = ???
  }

  trait NestKeyValue extends js.Object {
    var key: js.String = ???
    var values: js.Any = ???
  }

  trait Nest extends js.Object {
    def key(keyFunction: js.Function2[js.Any, js.Number, js.String]): Nest = ???
    def sortKeys(comparator: js.Function2[js.Any, js.Any, js.Number]): Nest = ???
    def sortValues(comparator: js.Function2[js.Any, js.Any, js.Number]): Nest = ???
    def rollup(rollupFunction: js.Function2[js.Any, js.Number, Any]): Nest = ???
    def map(values: js.Array[js.Any]): js.Dynamic = ???
    def entries(values: js.Array[js.Any]): js.Array[NestKeyValue] = ???
  }

  trait Map extends js.Object {
    def has(key: js.String): js.Boolean = ???
    def get(key: js.String): js.Dynamic = ???
    def set[T](key: js.String, value: T): T = ???
    def remove(key: js.String): js.Boolean = ???
    def keys(): js.Array[js.String] = ???
    def values(): js.Array[js.Any] = ???
    def entries(): js.Array[js.Any] = ???
    def forEach(func: js.Function2[js.String, js.Any, Unit]): Unit = ???
  }

  trait Set extends js.Object {
    def has(value: js.Any): js.Boolean = ???
    def add(value: js.Any): js.Dynamic = ???
    def remove(value: js.Any): js.Boolean = ???
    def values(): js.Array[js.Any] = ???
    def forEach(func: js.Function1[js.Any, Unit]): Unit = ???
  }

  trait Random extends js.Object {
    def normal(mean: js.Number = ???, deviation: js.Number = ???): js.Function0[js.Number] = ???
    def logNormal(mean: js.Number = ???, deviation: js.Number = ???): js.Function0[js.Number] = ???
    def irwinHall(count: js.Number): js.Function0[js.Number] = ???
  }

  package Transition {

    trait Transition extends js.Object {
      def duration(duration: js.Number): Transition = ???
      def delay(delay: js.Number): Transition = ???
      def attr(name: js.String): js.String = ???
      def attr(name: js.String, value: js.Any): Transition = ???
      def attr(name: js.String, valueFunction: js.Function2[js.Any, js.Number, Any]): Transition = ???
      def attr(attrValueMap: js.Any): Transition = ???
      def style(name: js.String): js.String = ???
      def style(name: js.String, value: js.Any, priority: js.String): Transition = ???
      def style(name: js.String, valueFunction: js.Function2[js.Any, js.Number, Any], priority: js.String): Transition = ???
      def call(callback: js.Function1[Selection, Unit]): Transition = ???
      def select(selector: js.String): Transition = ???
      def select(element: EventTarget): Transition = ???
      def selectAll(selector: js.String): Transition = ???
      def selectAll(elements: js.Array[EventTarget]): Transition = ???
      var each: js.Function2[js.String, js.Function2[js.Any, js.Number, Any], Transition] = ???
      var transition: js.Function0[Transition] = ???
      var ease: js.Function = ???
      def attrTween(name: js.String, tween: js.Function3[js.Any, js.Number, js.Any, BaseInterpolate]): Transition = ???
      def styleTween(name: js.String, tween: js.Function3[js.Any, js.Number, js.Any, BaseInterpolate], priority: js.String = ???): Transition = ???
      def text(text: js.String): Transition = ???
      def tween(name: js.String, factory: InterpolateFactory): Transition = ???
      def filter(selector: js.String): Transition = ???
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
      def apply(start: Date, end: Date, step: js.Number = ???): js.Array[Date] = ???
    }

    trait Interval extends js.Object {
      def apply(date: Date): Date = ???
      var floor: js.Function1[Date, Date] = ???
      var round: js.Function1[Date, Date] = ???
      var ceil: js.Function1[Date, Date] = ???
      var range: Range = ???
      var offset: js.Function2[Date, js.Number, Date] = ???
      var utc: Interval = ???
    }

    trait TimeFormat extends js.Object {
      def apply(date: Date): js.String = ???
      var parse: js.Function1[js.String, Date] = ???
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
      def apply[T](layers: js.Array[T], index: js.Number = ???): js.Array[T] = ???
      def values(accessor: js.Function1[js.Any, Any] = ???): StackLayout = ???
      def offset(offset: js.String): StackLayout = ???
    }

    trait TreeLayout extends js.Object {
      def sort(): js.Function2[js.Any, js.Any, js.Number] = ???
      def sort(comparator: js.Function2[js.Any, js.Any, js.Number]): TreeLayout = ???
      def children(): js.Function1[js.Any, Any] = ???
      def children(children: js.Function1[js.Any, Any]): TreeLayout = ???
      def nodes(root: GraphNode): TreeLayout = ???
      def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = ???
      def seperation(): js.Function2[GraphNode, GraphNode, js.Number] = ???
      def seperation(seperation: js.Function2[GraphNode, GraphNode, js.Number]): TreeLayout = ???
      def size(): js.Array[js.Number] = ???
      def size(size: js.Array[js.Number]): TreeLayout = ???
    }

    trait PieLayout extends js.Object {
      def apply(values: js.Array[js.Any], index: js.Number = ???): js.Array[ArcDescriptor] = ???
      def value(): js.Function2[js.Any, js.Number, js.Number] = ???
      def value(accessor: js.Function2[js.Any, js.Number, js.Number]): PieLayout = ???
      def sort(): js.Function2[js.Any, js.Any, js.Number] = ???
      def sort(comparator: js.Function2[js.Any, js.Any, js.Number]): PieLayout = ???
      def startAngle(): js.Number = ???
      def startAngle(angle: js.Number): PieLayout = ???
      def endAngle(): js.Number = ???
      def endAngle(angle: js.Number): PieLayout = ???
    }

    trait ArcDescriptor extends js.Object {
      var value: js.Any = ???
      var data: js.Any = ???
      var startAngle: js.Number = ???
      var endAngle: js.Number = ???
      var index: js.Number = ???
    }

    trait GraphNode extends js.Object {
      var id: js.Number = ???
      var index: js.Number = ???
      var name: js.String = ???
      var px: js.Number = ???
      var py: js.Number = ???
      var size: js.Number = ???
      var weight: js.Number = ???
      var x: js.Number = ???
      var y: js.Number = ???
      var subindex: js.Number = ???
      var startAngle: js.Number = ???
      var endAngle: js.Number = ???
      var value: js.Number = ???
      var fixed: js.Boolean = ???
      var children: js.Array[GraphNode] = ???
      var _children: js.Array[GraphNode] = ???
      var parent: GraphNode = ???
      var depth: js.Number = ???
    }

    trait GraphLink extends js.Object {
      var source: GraphNode = ???
      var target: GraphNode = ???
    }

    trait ForceLayout extends js.Object {
      def apply(): ForceLayout = ???
      def size(): js.Number = ???
      def size(mysize: js.Array[js.Number]): ForceLayout = ???
      def size(accessor: js.Function2[js.Any, js.Number, js.Any]): ForceLayout = ???
      def linkDistance(): js.Number = ???
      def linkDistance(number: js.Number): ForceLayout = ???
      def linkDistance(accessor: js.Function2[js.Any, js.Number, js.Number]): ForceLayout = ???
      def linkStrength(): js.Number = ???
      def linkStrength(number: js.Number): ForceLayout = ???
      def linkStrength(accessor: js.Function2[js.Any, js.Number, js.Number]): ForceLayout = ???
      def friction(): js.Number = ???
      def friction(number: js.Number): ForceLayout = ???
      def friction(accessor: js.Function2[js.Any, js.Number, js.Number]): ForceLayout = ???
      def alpha(): js.Number = ???
      def alpha(number: js.Number): ForceLayout = ???
      def alpha(accessor: js.Function2[js.Any, js.Number, js.Number]): ForceLayout = ???
      def charge(): js.Number = ???
      def charge(number: js.Number): ForceLayout = ???
      def charge(accessor: js.Function2[js.Any, js.Number, js.Number]): ForceLayout = ???
      def theta(): js.Number = ???
      def theta(number: js.Number): ForceLayout = ???
      def theta(accessor: js.Function2[js.Any, js.Number, js.Number]): ForceLayout = ???
      def gravity(): js.Number = ???
      def gravity(number: js.Number): ForceLayout = ???
      def gravity(accessor: js.Function2[js.Any, js.Number, js.Number]): ForceLayout = ???
      def links(): js.Array[GraphLink] = ???
      def links(arLinks: js.Array[GraphLink]): ForceLayout = ???
      def nodes(): js.Array[GraphNode] = ???
      def nodes(arNodes: js.Array[GraphNode]): ForceLayout = ???
      def start(): ForceLayout = ???
      def resume(): ForceLayout = ???
      def stop(): ForceLayout = ???
      def tick(): ForceLayout = ???
      def on(`type`: js.String, listener: js.Function0[Unit]): ForceLayout = ???
      def drag(): ForceLayout = ???
    }

    trait BundleLayout extends js.Object {
      def apply(links: js.Array[GraphLink]): js.Array[js.Array[GraphNode]] = ???
    }

    trait ChordLayout extends js.Object {
      def matrix(): js.Array[js.Array[js.Number]] = ???
      def matrix(matrix: js.Array[js.Array[js.Number]]): ChordLayout = ???
      def padding(): js.Number = ???
      def padding(padding: js.Number): ChordLayout = ???
      def sortGroups(): js.Function2[js.Number, js.Number, js.Number] = ???
      def sortGroups(comparator: js.Function2[js.Number, js.Number, js.Number]): ChordLayout = ???
      def sortSubgroups(): js.Function2[js.Number, js.Number, js.Number] = ???
      def sortSubgroups(comparator: js.Function2[js.Number, js.Number, js.Number]): ChordLayout = ???
      def sortChords(): js.Function2[js.Number, js.Number, js.Number] = ???
      def sortChords(comparator: js.Function2[js.Number, js.Number, js.Number]): ChordLayout = ???
      def chords(): js.Array[GraphLink] = ???
      def groups(): js.Array[ArcDescriptor] = ???
    }

    trait ClusterLayout extends js.Object {
      def sort(): js.Function2[GraphNode, GraphNode, js.Number] = ???
      def sort(comparator: js.Function2[GraphNode, GraphNode, js.Number]): ClusterLayout = ???
      def children(): js.Function2[js.Any, js.Number, js.Array[GraphNode]] = ???
      def children(children: js.Function2[js.Any, js.Number, js.Array[GraphNode]]): ClusterLayout = ???
      def nodes(root: GraphNode): js.Array[GraphNode] = ???
      def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = ???
      def seperation(): js.Function2[GraphNode, GraphNode, js.Number] = ???
      def seperation(seperation: js.Function2[GraphNode, GraphNode, js.Number]): ClusterLayout = ???
      def size(): js.Array[js.Number] = ???
      def size(size: js.Array[js.Number]): ClusterLayout = ???
      def value(): js.Function1[GraphNode, js.Number] = ???
      def value(value: js.Function1[GraphNode, js.Number]): ClusterLayout = ???
    }

    trait HierarchyLayout extends js.Object {
      def sort(): js.Function2[GraphNode, GraphNode, js.Number] = ???
      def sort(comparator: js.Function2[GraphNode, GraphNode, js.Number]): HierarchyLayout = ???
      def children(): js.Function2[js.Any, js.Number, js.Array[GraphNode]] = ???
      def children(children: js.Function2[js.Any, js.Number, js.Array[GraphNode]]): HierarchyLayout = ???
      def nodes(root: GraphNode): js.Array[GraphNode] = ???
      def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = ???
      def value(): js.Function1[GraphNode, js.Number] = ???
      def value(value: js.Function1[GraphNode, js.Number]): HierarchyLayout = ???
      def reValue(root: GraphNode): HierarchyLayout = ???
    }

    trait Bin extends js.Array[js.Any] {
      var x: js.Number = ???
      var dx: js.Number = ???
      var y: js.Number = ???
    }

    trait HistogramLayout extends js.Object {
      def apply(values: js.Array[js.Any], index: js.Number = ???): js.Array[Bin] = ???
      def value(): js.Function1[js.Any, Any] = ???
      def value(accessor: js.Function1[js.Any, Any]): HistogramLayout = ???
      def range(): js.Function2[js.Any, js.Number, js.Array[js.Number]] = ???
      def range(range: js.Function2[js.Any, js.Number, js.Array[js.Number]]): HistogramLayout = ???
      def bins(): js.Function2[js.Array[js.Any], js.Number, js.Array[js.Number]] = ???
      def bins(bins: js.Function2[js.Array[js.Any], js.Number, js.Array[js.Number]]): HistogramLayout = ???
      def frequency(): js.Boolean = ???
      def frequency(frequency: js.Boolean): HistogramLayout = ???
    }

    trait PackLayout extends js.Object {
      def sort(): js.Function2[GraphNode, GraphNode, js.Number] = ???
      def sort(comparator: js.Function2[GraphNode, GraphNode, js.Number]): PackLayout = ???
      def children(): js.Function2[js.Any, js.Number, js.Array[GraphNode]] = ???
      def children(children: js.Function2[js.Any, js.Number, js.Array[GraphNode]]): PackLayout = ???
      def nodes(root: GraphNode): js.Array[GraphNode] = ???
      def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = ???
      def value(): js.Function1[GraphNode, js.Number] = ???
      def value(value: js.Function1[GraphNode, js.Number]): PackLayout = ???
      def size(): js.Array[js.Number] = ???
      def size(size: js.Array[js.Number]): PackLayout = ???
      def padding(): js.Number = ???
      def padding(padding: js.Number): PackLayout = ???
    }

    trait PartitionLayout extends js.Object {
      def sort(): js.Function2[GraphNode, GraphNode, js.Number] = ???
      def sort(comparator: js.Function2[GraphNode, GraphNode, js.Number]): PackLayout = ???
      def children(): js.Function2[js.Any, js.Number, js.Array[GraphNode]] = ???
      def children(children: js.Function2[js.Any, js.Number, js.Array[GraphNode]]): PackLayout = ???
      def nodes(root: GraphNode): js.Array[GraphNode] = ???
      def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = ???
      def value(): js.Function1[GraphNode, js.Number] = ???
      def value(value: js.Function1[GraphNode, js.Number]): PackLayout = ???
      def size(): js.Array[js.Number] = ???
      def size(size: js.Array[js.Number]): PackLayout = ???
    }

    trait TreeMapLayout extends js.Object {
      def sort(): js.Function2[GraphNode, GraphNode, js.Number] = ???
      def sort(comparator: js.Function2[GraphNode, GraphNode, js.Number]): TreeMapLayout = ???
      def children(): js.Function2[js.Any, js.Number, js.Array[GraphNode]] = ???
      def children(children: js.Function2[js.Any, js.Number, js.Array[GraphNode]]): TreeMapLayout = ???
      def nodes(root: GraphNode): js.Array[GraphNode] = ???
      def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = ???
      def value(): js.Function1[GraphNode, js.Number] = ???
      def value(value: js.Function1[GraphNode, js.Number]): TreeMapLayout = ???
      def size(): js.Array[js.Number] = ???
      def size(size: js.Array[js.Number]): TreeMapLayout = ???
      def padding(): js.Number = ???
      def padding(padding: js.Number): TreeMapLayout = ???
      def round(): js.Boolean = ???
      def round(round: js.Boolean): TreeMapLayout = ???
      def sticky(): js.Boolean = ???
      def sticky(sticky: js.Boolean): TreeMapLayout = ???
      def mode(): js.String = ???
      def mode(mode: js.String): TreeMapLayout = ???
    }

  }

  package Color {

    trait Color extends js.Object {
      def brighter(k: js.Number): Color = ???
      def darker(k: js.Number = ???): Color = ???
    }

    trait RGBColor extends Color {
      var r: js.Number = ???
      var g: js.Number = ???
      var b: js.Number = ???
      def hsl(): HSLColor = ???
    }

    trait HSLColor extends Color {
      var h: js.Number = ???
      var s: js.Number = ???
      var l: js.Number = ???
      def rgb(): RGBColor = ???
    }

    trait LABColor extends Color {
      var l: js.Number = ???
      var a: js.Number = ???
      var b: js.Number = ???
      def rgb(): RGBColor = ???
    }

    trait HCLColor extends Color {
      var h: js.Number = ???
      var c: js.Number = ???
      var l: js.Number = ???
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
      var symbolTypes: js.Array[js.String] = ???
    }

    trait Symbol extends js.Object {
      var `type`: js.Function1[js.String, Symbol] = ???
      var size: js.Function1[js.Number, Symbol] = ???
    }

    trait Brush extends js.Object {
      def apply(selection: Selection): Unit = ???
      def x(): Scale.Scale = ???
      def x(scale: Scale.Scale): Brush = ???
      def y(): Scale.Scale = ???
      def y(scale: Scale.Scale): Brush = ???
      def extent(): js.Array[js.Any] = ???
      def extent(values: js.Array[js.Any]): Brush = ???
      def clear(): Brush = ???
      def empty(): js.Boolean = ???
      def on(`type`: js.String): js.Function2[js.Any, js.Number, Any] = ???
      def on(`type`: js.String, listener: js.Function2[js.Any, js.Number, Any], capture: js.Boolean = ???): Brush = ???
    }

    trait Axis extends js.Object {
      def apply(selection: Selection): Unit = ???
      def scale(): js.Dynamic = ???
      def scale(scale: js.Any): Axis = ???
      def orient(): js.String = ???
      def orient(orientation: js.String): Axis = ???
      def ticks(): js.Array[js.Any] = ???
      def ticks(arguments: js.Any*): Axis = ???
      def tickPadding(): js.Number = ???
      def tickPadding(padding: js.Number): Axis = ???
      def tickValues(): js.Array[js.Any] = ???
      def tickValues(values: js.Array[js.Any]): Axis = ???
      def tickSubdivide(count: js.Number): Axis = ???
      def tickSize(major: js.Number = ???, minor: js.Number = ???, end: js.Number = ???): Axis = ???
      def tickFormat(formatter: js.Function1[js.Any, js.String]): Axis = ???
    }

    trait Arc extends js.Object {
      def apply(data: js.Any, index: js.Number = ???): js.String = ???
      def innerRadius(): js.Function2[js.Any, js.Number, js.Number] = ???
      def innerRadius(radius: js.Number): Arc = ???
      def outerRadius(): js.Function2[js.Any, js.Number, js.Number] = ???
      def outerRadius(radius: js.Number): Arc = ???
      def startAngle(): js.Function2[js.Any, js.Number, js.Number] = ???
      def startAngle(angle: js.Number): Arc = ???
      def endAngle(): js.Function2[js.Any, js.Number, js.Number] = ???
      def endAngle(angle: js.Number): Arc = ???
      def centroid(data: js.Any, index: js.Number = ???): js.Array[js.Number] = ???
    }

    trait Line extends js.Object {
      def apply(data: js.Array[js.Any], index: js.Number = ???): js.String = ???
      def x(): js.Function2[js.Any, js.Number, js.Number] = ???
      def x(accessor: js.Function1[js.Any, js.Number]): Line = ???
      def x(cnst: js.Number): Line = ???
      def y(): js.Function2[js.Any, js.Number, js.Number] = ???
      def y(accessor: js.Function1[js.Any, js.Number]): Line = ???
      def y(cnst: js.Number): Line = ???
      def interpolate(): js.String = ???
      def interpolate(interpolate: js.String): Line = ???
      def tension(): js.Number = ???
      def tension(tension: js.Number): Line = ???
      def defined(): js.Function2[js.Any, js.Number, js.Boolean] = ???
      def defined(defined: js.Function1[js.Any, js.Boolean]): Line = ???
    }

    trait LineRadial extends js.Object {
      def apply(data: js.Array[js.Any], index: js.Number = ???): js.String = ???
      def x(): js.Function2[js.Any, js.Number, js.Number] = ???
      def x(accessor: js.Function1[js.Any, js.Number]): LineRadial = ???
      def x(cnst: js.Number): LineRadial = ???
      def y(): js.Function2[js.Any, js.Number, js.Number] = ???
      def y(accessor: js.Function1[js.Any, js.Number]): LineRadial = ???
      def y(cnst: js.Number): LineRadial = ???
      def interpolate(): js.String = ???
      def interpolate(interpolate: js.String): LineRadial = ???
      def tension(): js.Number = ???
      def tension(tension: js.Number): LineRadial = ???
      def defined(): js.Function1[js.Any, Any] = ???
      def defined(defined: js.Function1[js.Any, Any]): LineRadial = ???
      def radius(): js.Function2[js.Any, js.Number, js.Number] = ???
      def radius(radius: js.Number): LineRadial = ???
      def angle(): js.Function2[js.Any, js.Any, js.Number] = ???
      def angle(angle: js.Number): LineRadial = ???
    }

    trait Area extends js.Object {
      def apply(data: js.Array[js.Any], index: js.Number = ???): js.String = ???
      def x(): js.Function2[js.Any, js.Number, js.Number] = ???
      def x(accessor: js.Function1[js.Any, js.Number]): Area = ???
      def x(cnst: js.Number): Area = ???
      def x0(): js.Function2[js.Any, js.Number, js.Number] = ???
      def x0(accessor: js.Function1[js.Any, js.Number]): Area = ???
      def x0(cnst: js.Number): Area = ???
      def x1(): js.Function2[js.Any, js.Number, js.Number] = ???
      def x1(accessor: js.Function1[js.Any, js.Number]): Area = ???
      def x1(cnst: js.Number): Area = ???
      def y(): js.Function2[js.Any, js.Number, js.Number] = ???
      def y(accessor: js.Function1[js.Any, js.Number]): Area = ???
      def y(cnst: js.Number): Area = ???
      def y0(): js.Function2[js.Any, js.Number, js.Number] = ???
      def y0(accessor: js.Function1[js.Any, js.Number]): Area = ???
      def y0(cnst: js.Number): Area = ???
      def y1(): js.Function2[js.Any, js.Number, js.Number] = ???
      def y1(accessor: js.Function1[js.Any, js.Number]): Area = ???
      def y1(cnst: js.Number): Area = ???
      def interpolate(): js.String = ???
      def interpolate(interpolate: js.String): Area = ???
      def tension(): js.Number = ???
      def tension(tension: js.Number): Area = ???
      def defined(): js.Function1[js.Any, Any] = ???
      def defined(defined: js.Function1[js.Any, Any]): Area = ???
    }

    trait AreaRadial extends js.Object {
      def apply(data: js.Array[js.Any], index: js.Number = ???): js.String = ???
      def x(): js.Function2[js.Any, js.Number, js.Number] = ???
      def x(accessor: js.Function1[js.Any, js.Number]): AreaRadial = ???
      def x(cnst: js.Number): AreaRadial = ???
      def x0(): js.Function2[js.Any, js.Number, js.Number] = ???
      def x0(accessor: js.Function1[js.Any, js.Number]): AreaRadial = ???
      def x0(cnst: js.Number): AreaRadial = ???
      def x1(): js.Function2[js.Any, js.Number, js.Number] = ???
      def x1(accessor: js.Function1[js.Any, js.Number]): AreaRadial = ???
      def x1(cnst: js.Number): AreaRadial = ???
      def y(): js.Function2[js.Any, js.Number, js.Number] = ???
      def y(accessor: js.Function1[js.Any, js.Number]): AreaRadial = ???
      def y(cnst: js.Number): AreaRadial = ???
      def y0(): js.Function2[js.Any, js.Number, js.Number] = ???
      def y0(accessor: js.Function1[js.Any, js.Number]): AreaRadial = ???
      def y0(cnst: js.Number): AreaRadial = ???
      def y1(): js.Function2[js.Any, js.Number, js.Number] = ???
      def y1(accessor: js.Function1[js.Any, js.Number]): AreaRadial = ???
      def y1(cnst: js.Number): AreaRadial = ???
      def interpolate(): js.String = ???
      def interpolate(interpolate: js.String): AreaRadial = ???
      def tension(): js.Number = ???
      def tension(tension: js.Number): AreaRadial = ???
      def defined(): js.Function1[js.Any, Any] = ???
      def defined(defined: js.Function1[js.Any, Any]): AreaRadial = ???
      def radius(): js.Number = ???
      def radius(radius: js.Number): AreaRadial = ???
      def innerRadius(): js.Number = ???
      def innerRadius(radius: js.Number): AreaRadial = ???
      def outerRadius(): js.Number = ???
      def outerRadius(radius: js.Number): AreaRadial = ???
      def angle(): js.Number = ???
      def angle(angle: js.Number): AreaRadial = ???
      def startAngle(): js.Number = ???
      def startAngle(angle: js.Number): AreaRadial = ???
      def endAngle(): js.Number = ???
      def endAngle(angle: js.Number): AreaRadial = ???
    }

    trait Chord extends js.Object {
      def apply(datum: js.Any, index: js.Number = ???): js.String = ???
      def radius(): js.Number = ???
      def radius(radius: js.Number): Chord = ???
      def startAngle(): js.Number = ???
      def startAngle(angle: js.Number): Chord = ???
      def endAngle(): js.Number = ???
      def endAngle(angle: js.Number): Chord = ???
      def source(): js.Dynamic = ???
      def source(angle: js.Any): Chord = ???
      def target(): js.Dynamic = ???
      def target(angle: js.Any): Chord = ???
    }

    trait Diagonal extends js.Object {
      def apply(datum: js.Any, index: js.Number = ???): js.String = ???
      def projection(): js.Function2[js.Any, js.Number, js.Array[js.Number]] = ???
      def projection(proj: js.Function1[js.Any, js.Array[js.Number]]): Diagonal = ???
      def source(): js.Function2[js.Any, js.Number, Any] = ???
      def source(src: js.Function1[js.Any, Any]): Diagonal = ???
      def target(): js.Function2[js.Any, js.Number, Any] = ???
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

    trait Scale extends js.Object {
      def apply(value: js.Any): js.Dynamic = ???
      def domain(values: js.Array[js.Any]): Scale = ???
      def domain(): js.Array[js.Any] = ???
      def range(values: js.Array[js.Any]): Scale = ???
      def range(): js.Array[js.Any] = ???
      def invertExtent(y: js.Any): js.Array[js.Any] = ???
      def copy(): Scale = ???
    }

    trait QuantitiveScale extends Scale {
      def apply(value: js.Number): js.Number = ???
      def invert(value: js.Number): js.Number = ???
      //def domain(values: js.Array[js.Any]): QuantitiveScale = ???
      //def domain(): js.Array[js.Any] = ???
      //def range(values: js.Array[js.Any]): QuantitiveScale = ???
      //def range(): js.Array[js.Any] = ???
      var rangeRound: js.Function1[js.Array[js.Any], QuantitiveScale] = ???
      def interpolate(): Transition.Interpolate = ???
      def interpolate(factory: Transition.Interpolate): QuantitiveScale = ???
      def clamp(clamp: js.Boolean): QuantitiveScale = ???
      def nice(count: js.Number = ???): QuantitiveScale = ???
      def ticks(count: js.Number): js.Array[js.Any] = ???
      def tickFormat(count: js.Number): js.Function1[js.Number, js.String] = ???
      //def copy(): QuantitiveScale = ???
    }

    trait LinearScale extends QuantitiveScale {
      //def apply(value: js.Number): js.Number = ???
    }

    trait IdentityScale extends Scale {
      def apply(value: js.Number): js.Number = ???
      def invert(value: js.Number): js.Number = ???
      def ticks(count: js.Number): js.Array[js.Any] = ???
      def tickFormat(count: js.Number): js.Function1[js.Number, js.String] = ???
    }

    trait SqrtScale extends QuantitiveScale {
      //def apply(value: js.Number): js.Number = ???
    }

    trait PowScale extends QuantitiveScale {
      //def apply(value: js.Number): js.Number = ???
    }

    trait LogScale extends QuantitiveScale {
      //def apply(value: js.Number): js.Number = ???
    }

    trait OrdinalScale extends Scale {
      //def apply(value: js.Any): js.Dynamic = ???
      //def domain(values: js.Array[js.Any]): OrdinalScale = ???
      //def domain(): js.Array[js.Any] = ???
      //def range(values: js.Array[js.Any]): OrdinalScale = ???
      //def range(): js.Array[js.Any] = ???
      def rangePoints(interval: js.Array[js.Any], padding: js.Number = ???): OrdinalScale = ???
      def rangeBands(interval: js.Array[js.Any], padding: js.Number = ???, outerPadding: js.Number = ???): OrdinalScale = ???
      def rangeRoundBands(interval: js.Array[js.Any], padding: js.Number = ???, outerPadding: js.Number = ???): OrdinalScale = ???
      def rangeBand(): js.Number = ???
      def rangeExtent(): js.Array[js.Any] = ???
      //def copy(): OrdinalScale = ???
    }

    trait QuantizeScale extends Scale {
      //def apply(value: js.Any): js.Dynamic = ???
      def domain(values: js.Array[js.Number]): QuantizeScale = ???
      //def domain(): js.Array[js.Any] = ???
      //def range(values: js.Array[js.Any]): QuantizeScale = ???
      //def range(): js.Array[js.Any] = ???
      //def copy(): QuantizeScale = ???
    }

    trait ThresholdScale extends Scale {
      //def apply(value: js.Any): js.Dynamic = ???
      def domain(values: js.Array[js.Number]): ThresholdScale = ???
      //def domain(): js.Array[js.Any] = ???
      //def range(values: js.Array[js.Any]): ThresholdScale = ???
      //def range(): js.Array[js.Any] = ???
      //def copy(): ThresholdScale = ???
    }

    trait QuantileScale extends Scale {
      //def apply(value: js.Any): js.Dynamic = ???
      def domain(values: js.Array[js.Number]): QuantileScale = ???
      //def domain(): js.Array[js.Any] = ???
      //def range(values: js.Array[js.Any]): QuantileScale = ???
      //def range(): js.Array[js.Any] = ???
      def quantiles(): js.Array[js.Any] = ???
      //def copy(): QuantileScale = ???
    }

    trait TimeScale extends Scale {
      def apply(value: Date): js.Number = ???
      def invert(value: js.Number): Date = ???
      //def domain(values: js.Array[js.Any]): TimeScale = ???
      //def domain(): js.Array[js.Any] = ???
      //def range(values: js.Array[js.Any]): TimeScale = ???
      //def range(): js.Array[js.Any] = ???
      var rangeRound: js.Function1[js.Array[js.Any], TimeScale] = ???
      def interpolate(): Transition.Interpolate = ???
      def interpolate(factory: Transition.InterpolateFactory): TimeScale = ???
      def clamp(clamp: js.Boolean): TimeScale = ???
      def ticks(count: js.Number): js.Array[js.Any] = ???
      def ticks(range: Range, count: js.Number): js.Array[js.Any] = ???
      def tickFormat(count: js.Number): js.Function1[js.Number, js.String] = ???
      //def copy(): TimeScale = ???
    }

  }

  package Behavior {

    trait Behavior extends js.Object {
      def drag(): Drag = ???
      def zoom(): Zoom = ???
    }

    trait Zoom extends js.Object {
      def apply(selection: Selection): Unit = ???
      var on: js.Function2[js.String, js.Function2[js.Any, js.Number, Any], Zoom] = ???
      def scale(): js.Number = ???
      def scale(scale: js.Number): Zoom = ???
      def translate(): js.Array[js.Number] = ???
      def translate(translate: js.Array[js.Number]): Zoom = ???
      def scaleExtent(): js.Array[js.Number] = ???
      def scaleExtent(extent: js.Array[js.Number]): Zoom = ???
      def x(): Scale.Scale = ???
      def x(x: Scale.Scale): Zoom = ???
      def y(): Scale.Scale = ???
      def y(y: Scale.Scale): Zoom = ???
    }

    trait Drag extends js.Object {
      def apply(): js.Dynamic = ???
      var on: js.Function2[js.String, js.Function2[js.Any, js.Number, Any], Drag] = ???
      def origin(): js.Dynamic = ???
      def origin(origin: js.Any = ???): Drag = ???
    }

  }

  package Geo {

    trait Geo extends js.Object {
      def path(): Path = ???
      def circle(): Circle = ???
      def area(feature: js.Any): js.Number = ???
      def bounds(feature: js.Any): js.Array[js.Array[js.Number]] = ???
      def centroid(feature: js.Any): js.Array[js.Number] = ???
      def distance(a: js.Array[js.Number], b: js.Array[js.Number]): js.Number = ???
      def interpolate(a: js.Array[js.Number], b: js.Array[js.Number]): js.Function1[js.Number, js.Array[js.Number]] = ???
      def length(feature: js.Any): js.Number = ???
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
      def rotation(rotation: js.Array[js.Number]): Rotation = ???
    }

    trait Path extends js.Object {
      def apply(feature: js.Any, index: js.Any = ???): js.String = ???
      def projection(): Projection = ???
      def projection(projection: Projection): Path = ???
      def context(): js.String = ???
      def context(context: Context): Path = ???
      def area(feature: js.Any): js.Dynamic = ???
      def centroid(feature: js.Any): js.Dynamic = ???
      def bounds(feature: js.Any): js.Dynamic = ???
      def pointRadius(): js.Number = ???
      def pointRadius(radius: js.Number): Path = ???
    }

    trait Context extends js.Object {
      def beginPath(): js.Dynamic = ???
      def moveTo(x: js.Number, y: js.Number): js.Dynamic = ???
      def lineTo(x: js.Number, y: js.Number): js.Dynamic = ???
      def arc(x: js.Number, y: js.Number, radius: js.Number, startAngle: js.Number, endAngle: js.Number): js.Dynamic = ???
      def closePath(): js.Dynamic = ???
    }

    trait Circle extends js.Object {
      def apply(args: js.Any*): GeoJSON = ???
      def origin(): js.Array[js.Number] = ???
      def origin(origin: js.Array[js.Number]): Circle = ???
      def angle(): js.Number = ???
      def angle(angle: js.Number): Circle = ???
      def precision(): js.Number = ???
      def precision(precision: js.Number): Circle = ???
    }

    trait Graticule extends js.Object {
      def apply(): GeoJSON = ???
      def lines(): js.Array[GeoJSON] = ???
      def outline(): GeoJSON = ???
      def extent(): js.Array[js.Array[js.Number]] = ???
      def extent(extent: js.Array[js.Array[js.Number]]): Graticule = ???
      def minorExtent(): js.Array[js.Array[js.Number]] = ???
      def minorExtent(extent: js.Array[js.Array[js.Number]]): Graticule = ???
      def majorExtent(): js.Array[js.Array[js.Number]] = ???
      def majorExtent(extent: js.Array[js.Array[js.Number]]): Graticule = ???
      def step(): js.Array[js.Array[js.Number]] = ???
      def step(extent: js.Array[js.Array[js.Number]]): Graticule = ???
      def minorStep(): js.Array[js.Array[js.Number]] = ???
      def minorStep(extent: js.Array[js.Array[js.Number]]): Graticule = ???
      def majorStep(): js.Array[js.Array[js.Number]] = ???
      def majorStep(extent: js.Array[js.Array[js.Number]]): Graticule = ???
      def precision(): js.Number = ???
      def precision(precision: js.Number): Graticule = ???
    }

    trait GreatArc extends js.Object {
      def apply(): GeoJSON = ???
      def distance(): js.Number = ???
      def source(): js.Dynamic = ???
      def source(source: js.Any): GreatArc = ???
      def target(): js.Dynamic = ???
      def target(target: js.Any): GreatArc = ???
      def precision(): js.Number = ???
      def precision(precision: js.Number): GreatArc = ???
    }

    trait GeoJSON extends js.Object {
      var coordinates: js.Array[js.Array[js.Number]] = ???
      var `type`: js.String = ???
    }

    trait RawProjection extends js.Object {
      def apply(lambda: js.Number, phi: js.Number): js.Array[js.Number] = ???
      def invert(x: js.Number, y: js.Number): js.Array[js.Number] = ???
    }

    trait Projection extends js.Object {
      def apply(coordinates: js.Array[js.Number]): js.Array[js.Number] = ???
      def invert(point: js.Array[js.Number]): js.Array[js.Number] = ???
      def rotate(): js.Array[js.Number] = ???
      def rotate(rotation: js.Array[js.Number]): Projection = ???
      def center(): js.Array[js.Number] = ???
      def center(location: js.Array[js.Number]): Projection = ???
      def parallels(): js.Array[js.Number] = ???
      def parallels(location: js.Array[js.Number]): Projection = ???
      def translate(): js.Array[js.Number] = ???
      def translate(point: js.Array[js.Number]): Projection = ???
      def scale(): js.Number = ???
      def scale(scale: js.Number): Projection = ???
      def clipAngle(): js.Number = ???
      def clipAngle(angle: js.Number): Projection = ???
      def clipExtent(): js.Array[js.Array[js.Number]] = ???
      def clipExtent(extent: js.Array[js.Array[js.Number]]): Projection = ???
      def precision(): js.Number = ???
      def precision(precision: js.Number): Projection = ???
      def stream(listener: Stream = ???): Stream = ???
    }

    trait Stream extends js.Object {
      def point(x: js.Number, y: js.Number, z: js.Number = ???): Unit = ???
      def lineStart(): Unit = ???
      def lineEnd(): Unit = ???
      def polygonStart(): Unit = ???
      def polygonEnd(): Unit = ???
      def sphere(): Unit = ???
    }

    trait Rotation extends js.Array[js.Any] {
      def apply(location: js.Array[js.Number]): Rotation = ???
      def invert(location: js.Array[js.Number]): Rotation = ???
    }

    trait ProjectionMutator extends js.Object {
      def apply(lambda: js.Number, phi: js.Number): Projection = ???
    }

  }

  package Geom {

    trait Geom extends js.Object {
      def voronoi[T](): Voronoi[T] = ???
      def voronoi(vertices: js.Array[Vertice]): js.Array[Polygon] = ???
      def delaunay(vertices: js.Array[Vertice] = ???): js.Array[Polygon] = ???
      def quadtree(): QuadtreeFactory = ???
      def quadtree(points: js.Array[Point], x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number): Quadtree = ???
      def quadtree(points: js.Array[Point], width: js.Number, height: js.Number): Quadtree = ???
      def polygon(vertices: js.Array[Vertice]): Polygon = ???
      def hull(): Hull = ???
      def hull(vertices: js.Array[Vertice]): js.Array[Vertice] = ???
    }

    trait Vertice extends js.Array[js.Number] {
      var angle: js.Number = ???
    }

    trait Polygon extends js.Array[Vertice] {
      def area(): js.Number = ???
      def centroid(): js.Array[js.Number] = ???
      def clip(subject: Polygon): Polygon = ???
    }

    trait QuadtreeFactory extends js.Object {
      def apply(): Quadtree = ???
      def apply(points: js.Array[Point], x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number): Quadtree = ???
      def apply(points: js.Array[Point], width: js.Number, height: js.Number): Quadtree = ???
      def x(): js.Function1[js.Any, Any] = ???
      def x(accesor: js.Function1[js.Any, Any]): QuadtreeFactory = ???
      def y(): js.Function1[js.Any, Any] = ???
      def y(accesor: js.Function1[js.Any, Any]): QuadtreeFactory = ???
      def size(): js.Array[js.Number] = ???
      def size(size: js.Array[js.Number]): QuadtreeFactory = ???
      def extent(): js.Array[js.Array[js.Number]] = ???
      def extent(points: js.Array[js.Array[js.Number]]): QuadtreeFactory = ???
    }

    trait Quadtree extends js.Object {
      def add(point: Point): Unit = ???
      def visit(callback: js.Any): Unit = ???
    }

    trait Point extends js.Object {
      var x: js.Number = ???
      var y: js.Number = ???
    }

    trait Voronoi[T] extends js.Object {
      def apply(data: js.Array[T]): js.Array[Polygon] = ???
      def links(data: js.Array[T]): js.Array[Layout.GraphLink] = ???
      def triangles(data: js.Array[T]): js.Array[js.Array[js.Number]] = ???
      def x(): js.Function2[T, js.Number, js.Number] = ???
      def x(accessor: js.Function2[T, js.Number, js.Number]): Voronoi[T] = ???
      def x(constant: js.Number): Voronoi[T] = ???
      def y(): js.Function2[T, js.Number, js.Number] = ???
      def y(accessor: js.Function2[T, js.Number, js.Number]): Voronoi[T] = ???
      def y(constant: js.Number): Voronoi[T] = ???
      def clipExtent(): js.Array[js.Array[js.Number]] = ???
      def clipExtent(extent: js.Array[js.Array[js.Number]]): Voronoi[T] = ???
      def size(): js.Array[js.Number] = ???
      def size(size: js.Array[js.Number]): Voronoi[T] = ???
    }

    trait Hull extends js.Object {
      def apply(vertices: js.Array[Vertice]): js.Array[Vertice] = ???
      def x(): js.Function1[js.Any, Any] = ???
      def x(accesor: js.Function1[js.Any, Any]): js.Dynamic = ???
      def y(): js.Function1[js.Any, Any] = ???
      def y(accesor: js.Function1[js.Any, Any]): js.Dynamic = ???
    }

  }


