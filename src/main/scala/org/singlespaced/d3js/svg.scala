package org.singlespaced.d3js
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.JSName

@JSName("d3.svg")
@js.native
trait SvgObject extends js.Object {

  import svg._

  val line: Line[Any] = js.native

  val area: Area[Any] = js.native

  def arc[T](): Arc[T] = js.native

  def symbol[T](): Symbol[T] = js.native

  var symbolTypes: js.Array[String] = js.native

  def chord(): Chord[chordModule.Link[chordModule.Node], chordModule.Node] = js.native

  //TODO def chord[Node](): Chord[chordModule.Link[Node], Node] = js.native

  //TODO def chord[Link, Node](): Chord[Link, Node] = js.native

  def diagonal(): Diagonal[diagonalModule.Link[diagonalModule.Node], diagonalModule.Node] = js.native

  //TODO def diagonal[Node](): Diagonal[diagonalModule.Link[Node], Node] = js.native

  //TODO def diagonal[Link, Node](): Diagonal[Link, Node] = js.native

  def axis(): Axis = js.native

  def brush(): Brush[js.Any] = js.native

  //TODO def brush[T](): Brush[T] = js.native

}
package svg {

@js.native
trait Line[T] extends js.Function1[js.Array[T],String] {

  def apply[T]():Line[T] = js.native

  def x(): Double | js.Function2[T, Int, Double] = js.native

  def x(x: Double): Line[T] = js.native

  def x(x: js.Function2[T, Int, Double]): Line[T] = js.native

  def y(): Double | js.Function2[T, Int, Double] = js.native

  def y(x: Double): Line[T] = js.native

  def y(y: js.Function2[T, Int, Double]): Line[T] = js.native

  def interpolate(): String | js.Function1[js.Array[js.Tuple2[Double, Double]], String] = js.native

  def interpolate(interpolate: String | js.Function1[js.Array[js.Tuple2[Double, Double]], String]): Line[T] = js.native

  def tension(): Double = js.native

  def tension(tension: Double): Line[T] = js.native

  def defined(): js.Function2[T, Double, Boolean] = js.native

  def defined(defined: js.Function2[T, Int, Boolean]): Line[T] = js.native

  def radial(): Line[T] = js.native

  def radius(): js.Function2[T, Double, Double] = js.native

  def radius(radius: Double): Line[T] = js.native

  def radius(radius: js.Function2[T, Double, Double]): Line[T] = js.native

  def angle(): js.Function2[T, Double, Double] = js.native

  def angle(angle: Double): Line[T] = js.native

  def angle(angle: js.Function2[T, Double, Double]): Line[T] = js.native

}

@js.native
trait Diagonal[Link, Node] extends js.Function2[Link,Double,String] {

  def source(): js.Function2[Link, Double, Node] = js.native

  def source(source: Node): Diagonal[Link, Node] = js.native

  def source(source: js.Function2[Link, Double, Node]): Diagonal[Link, Node] = js.native

  def target(): js.Function2[Link, Double, Node] = js.native

  def target(target: Node): Diagonal[Link, Node] = js.native

  def target(target: js.Function2[Link, Double, Node]): Diagonal[Link, Node] = js.native

  def projection(): js.Function2[Node, Double, js.Tuple2[Double, Double]] = js.native

  def projection(projection: js.Function2[Node, Double, js.Tuple2[Double, Double]]): Diagonal[Link, Node] = js.native
}

@js.native
trait Axis extends js.Function1[Selection[js.Any] | Transition[js.Any],Unit] {
  def apply(selection: Selection[js.Any]): Unit = js.native

  def apply(selection: Transition[js.Any]): Unit = js.native

  def scale(): js.Dynamic = js.native

  def scale(scale: js.Any): Axis = js.native

  def orient(): String = js.native

  def orient(orientation: String): Axis = js.native

  def ticks(): js.Array[js.Any] = js.native

  def ticks(args: js.Any*): Axis = js.native

  def tickValues(): js.Array[js.Any] = js.native

  def tickValues(values: js.Array[js.Any]): Axis = js.native

  def tickSize(): Double = js.native

  def tickSize(size: Double): Axis = js.native

  def tickSize(inner: Double, outer: Double): Axis = js.native

  def innerTickSize(): Double = js.native

  def innerTickSize(size: Double): Axis = js.native

  def outerTickSize(): Double = js.native

  def outerTickSize(size: Double): Axis = js.native

  def tickPadding(): Double = js.native

  def tickPadding(padding: Double): Axis = js.native

  def tickFormat(): js.Function1[js.Any, String] = js.native

  def tickFormat(format: js.Function1[js.Any, String]): Axis = js.native

  def tickFormat(format: String): Axis = js.native
}


@js.native
trait Brush[T] extends js.Function1[Selection[T] | Transition[T], Unit] {

  def event(selection: Selection[T]): Unit = js.native

  def event(selection: Transition[T]): Unit = js.native

  def x(): brushModule.Scale = js.native

  def x[S<:BaseScale[_,_,S]](x:S): Brush[T] = js.native

  def y(): brushModule.Scale = js.native

  def y[S<:BaseScale[_,_,S]](x:S): Brush[T] = js.native

  def extent(): js.Tuple2[Double, Double] | js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native

  def extent(extent: js.Tuple2[Double, Double] | js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Brush[T] = js.native

  def clamp(): Boolean | js.Tuple2[Boolean, Boolean] = js.native

  def clamp(clamp: Boolean | js.Tuple2[Boolean, Boolean]): Brush[T] = js.native

  def clear(): Unit = js.native

  def empty(): Boolean = js.native

  def on(`type`: String): js.Function2[T, Double, Unit] = js.native

  def on(`type`: String, listener: js.Function2[T, Double, Unit]): Brush[T] = js.native
}


@js.native
trait Area[T] extends js.Function1[js.Array[T],String] {

  def apply[T]():Area[T] = js.native

  def x(): Double | js.Function2[T, Int, Double] = js.native

  def x(x: Double): Area[T] = js.native

  def x(x: js.Function2[T, Int, Double]): Area[T] = js.native

  def x0(): Double | js.Function2[T, Int, Double] = js.native

  def x0(x0: Double): Area[T] = js.native

  def x0(x0: js.Function2[T, Int, Double]): Area[T] = js.native

  def x1(): Double | js.Function2[T, Int, Double] = js.native

  def x1(x1: Double): Area[T] = js.native

  def x1(x1: js.Function2[T, Int, Double]): Area[T] = js.native

  def y(): Double | js.Function2[T, Int, Double] = js.native

  def y(y: Double): Area[T] = js.native

  def y(y: js.Function2[T, Int, Double]): Area[T] = js.native

  def y0(): Double | js.Function2[T, Int, Double] = js.native

  def y0(y0: Double): Area[T] = js.native

  def y0(y0: js.Function2[T, Int, Double]): Area[T] = js.native

  def y1(): Double | js.Function2[T, Int, Double] = js.native

  def y1(y1: Double): Area[T] = js.native

  def y1(y1: js.Function2[T, Int, Double]): Area[T] = js.native

  def radial(): Line[T] = js.native

  def interpolate(): String | js.Function1[js.Array[js.Tuple2[Double, Double]], String] = js.native

  def interpolate(interpolate: String | js.Function1[js.Array[js.Tuple2[Double, Double]], String]): Area[T] = js.native

  def tension(): Double = js.native

  def tension(tension: Double): Area[T] = js.native

  def defined(): js.Function2[T, Int, Boolean] = js.native

  def defined(defined: js.Function2[T, Int, Boolean]): Area[T] = js.native
}

@js.native
trait Arc[T] extends js.Object {
  def apply(d: T, i: Int = ???): String = js.native

  def innerRadius(): js.Function2[T, Int, Double] = js.native

  def innerRadius(radius: Double): Arc[T] = js.native

  def innerRadius(radius: js.Function2[T, Int, Double]): Arc[T] = js.native

  def outerRadius(): js.Function2[T, Int, Double] = js.native

  def outerRadius(radius: Double): Arc[T] = js.native

  def outerRadius(radius: js.Function2[T, Int, Double]): Arc[T] = js.native

  def cornerRadius(): js.Function2[T, Int, Double] = js.native

  def cornerRadius(radius: Double): Arc[T] = js.native

  def cornerRadius(radius: js.Function2[T, Int, Double]): Arc[T] = js.native

  def padRadius(): String | js.Function2[T, Int, Double] = js.native

  def padRadius(radius: String): Arc[T] = js.native

  def padRadius(radius: js.Function2[T, Int, Double]): Arc[T] = js.native

  def startAngle(): js.Function2[T, Int, Double] = js.native

  def startAngle(angle: Double): Arc[T] = js.native

  def startAngle(angle: js.Function2[T, Int, Double]): Arc[T] = js.native

  def endAngle(): js.Function2[T, Int, Double] = js.native

  def endAngle(angle: Double): Arc[T] = js.native

  def endAngle(angle: js.Function2[T, Int, Double]): Arc[T] = js.native

  def padAngle(): js.Function2[T, Int, Double] = js.native

  def padAngle(angle: Double): Arc[T] = js.native

  def padAngle(angle: js.Function2[T, Int, Double]): Arc[T] = js.native

  def centroid(d: T, i: Double = ???): js.Tuple2[Double, Double] = js.native
}

@js.native
trait Symbol[T] extends js.Object {
  def apply(d: T, i: Int = ???): String = js.native

  def `type`(): js.Function2[T, Int, String] = js.native

  def `type`(`type`: String): Symbol[T] = js.native

  def `type`(`type`: js.Function2[T, Int, String]): Symbol[T] = js.native

  def size(): js.Function2[T, String, Double] = js.native

  def size(size: Double): Symbol[T] = js.native

  def size(size: js.Function2[T, Double, Double]): Symbol[T] = js.native
}

@js.native
trait Chord[Link, Node] extends js.Object {
  def apply(d: Link, i: Double): String = js.native

  def source(): js.Function2[Link, Double, Node] = js.native

  def source(source: Node): Chord[Link, Node] = js.native

  def source(source: js.Function2[Link, Double, Node]): Chord[Link, Node] = js.native

  def target(): js.Function2[Link, Double, Node] = js.native

  def target(target: Node): Chord[Link, Node] = js.native

  def target(target: js.Function2[Link, Double, Node]): Chord[Link, Node] = js.native

  def radius(): js.Function2[Node, Double, Double] = js.native

  def radius(radius: Double): Chord[Link, Node] = js.native

  def radius(radius: js.Function2[Node, Double, Double]): Chord[Link, Node] = js.native

  def startAngle(): js.Function2[Node, Double, Double] = js.native

  def startAngle(angle: Double): Chord[Link, Node] = js.native

  def startAngle(angle: js.Function2[Node, Double, Double]): Chord[Link, Node] = js.native

  def endAngle(): js.Function2[Node, Double, Double] = js.native

  def endAngle(angle: Double): Chord[Link, Node] = js.native

  def endAngle(angle: js.Function2[Node, Double, Double]): Chord[Link, Node] = js.native
}


@JSName("d3.svg.line")
@js.native
trait LineObject extends js.Object {
  def radial(): lineModule.Radial[js.Tuple2[Double, Double]] = js.native

  //TODO def radial[T](): Radial[T] = js.native
}
package lineModule {

@js.native
trait Radial[T] extends js.Function1[js.Array[T],String] {

  def radius(): Double | js.Function2[T, Int, Double] = js.native

  def radius(radius: Double): Radial[T] = js.native

  def radius(radius: js.Function2[T, Int, Double]): Radial[T] = js.native

  def angle(): Double | js.Function2[T, Int, Double] = js.native

  def angle(angle: Double): Radial[T] = js.native

  def angle(angle: js.Function2[T, Int, Double]): Radial[T] = js.native

  def interpolate(): String | js.Function1[js.Array[js.Tuple2[Double, Double]], String] = js.native

  def interpolate(interpolate: String | js.Function1[js.Array[js.Tuple2[Double, Double]], String]): Radial[T] = js.native

  def tension(): Double = js.native

  def tension(tension: Double): Radial[T] = js.native

  def defined(): js.Function2[T, Int, Boolean] = js.native

  def defined(defined: js.Function2[T, Int, Boolean]): Radial[T] = js.native
}

}

@JSName("d3.svg.area")
@js.native
trait AreaObject extends js.Object {
  def radial(): areaModule.Radial[js.Tuple2[Double, Double]] = js.native

  //TODO def radial[T](): Radial[T] = js.native
}
package areaModule {

@js.native
trait Radial[T] extends js.Function1[js.Array[T],String] {

  def radius(): Double | js.Function2[T, Int, Double] = js.native

  def radius(radius: Double): Radial[T] = js.native

  def radius(radius: js.Function2[T, Int, Double]): Radial[T] = js.native

  def innerRadius(): Double | js.Function2[T, Int, Double] = js.native

  def innerRadius(innerRadius: Double): Radial[T] = js.native

  def innerRadius(innerRadius: js.Function2[T, Int, Double]): Radial[T] = js.native

  def outerRadius(): Double | js.Function2[T, Int, Double] = js.native

  def outerRadius(outerRadius: Double): Radial[T] = js.native

  def outerRadius(outerRadius: js.Function2[T, Int, Double]): Radial[T] = js.native

  def angle(): Double | js.Function2[T, Int, Double] = js.native

  def angle(angle: Double): Radial[T] = js.native

  def angle(angle: js.Function2[T, Int, Double]): Radial[T] = js.native

  def startAngle(): Double | js.Function2[T, Int, Double] = js.native

  def startAngle(startAngle: Double): Radial[T] = js.native

  def startAngle(startAngle: js.Function2[T, Int, Double]): Radial[T] = js.native

  def endAngle(): Double | js.Function2[T, Int, Double] = js.native

  def endAngle(endAngle: Double): Radial[T] = js.native

  def endAngle(endAngle: js.Function2[T, Int, Double]): Radial[T] = js.native

  def interpolate(): String | js.Function1[js.Array[js.Tuple2[Double, Double]], String] = js.native

  def interpolate(interpolate: String | js.Function1[js.Array[js.Tuple2[Double, Double]], String]): Radial[T] = js.native

  def tension(): Double = js.native

  def tension(tension: Double): Radial[T] = js.native

  def defined(): js.Function2[T, Int, Boolean] = js.native

  def defined(defined: js.Function2[T, Int, Boolean]): Radial[T] = js.native
}

}


@JSName("d3.svg.diagonal")
@js.native
trait DiagonalObject extends js.Object {

  import diagonalModule._

  def radial(): Radial[Link[Node], Node] = js.native

  //TODO def radial[Node](): Radial[Link[Node], Node] = js.native
  //TODO def radial[Link, Node](): Radial[Link, Node] = js.native
}
package diagonalModule {

@js.native
trait Link[Node] extends js.Object {
  var source: Node = js.native
  var target: Node = js.native
}

@js.native
trait Node extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
}

@js.native
trait Radial[Link, Node] extends js.Object {
  def apply(d: Link, i: Double): String = js.native

  def source(): js.Function2[Link, Double, Node] = js.native

  def source(source: Node): Radial[Link, Node] = js.native

  def source(source: js.Function2[Link, Double, Node]): Radial[Link, Node] = js.native

  def target(): js.Function2[Link, Double, Node] = js.native

  def target(target: Node): Radial[Link, Node] = js.native

  def target(target: js.Function2[Link, Double, Node]): Radial[Link, Node] = js.native

  def projection(): js.Function2[Node, Double, js.Tuple2[Double, Double]] = js.native

  def projection(projection: js.Function2[Node, Double, js.Tuple2[Double, Double]]): Radial[Link, Node] = js.native
}

}


package brushModule {

@js.native
trait Scale extends BaseScale[Double,Double,Scale] {

}

}

package chordModule {

@js.native
trait Link[Node] extends js.Object {
  var source: Node = js.native
  var target: Node = js.native
}

@js.native
trait Node extends js.Object {
  var radius: Double = js.native
  var startAngle: Double = js.native
  var endAngle: Double = js.native
}

}

package arcModule {

@js.native
trait Arc extends js.Object {
  var innerRadius: Double = js.native
  var outerRadius: Double = js.native
  var startAngle: Double = js.native
  var endAngle: Double = js.native
  var padAngle: Double = js.native
}

}

}
