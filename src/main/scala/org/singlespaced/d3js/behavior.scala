package org.singlespaced.d3js


import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("d3.behavior")
@js.native
trait BehaviorObject extends js.Object {
  def drag[Datum](): behavior.Drag[Datum] = js.native

  def zoom[Datum](): behavior.Zoom[Datum] = js.native

}
package behavior {

@js.native
trait Drag[Datum] extends js.Function1[Selection[Datum],Unit] {

  def on(`type`: String): js.Function2[Datum, Double, Any] = js.native

  def on(`type`: String, listener: js.Function2[Datum, Double, Any]): Drag[Datum] = js.native

  def origin(): js.Function2[Datum, Double, js.Any] = js.native

  def origin(accessor: js.Function2[Datum, Double, js.Any]): Drag[Datum] = js.native
}

@js.native
trait Zoom[Datum] extends js.Function1[Selection[Datum],Unit] {

  def translate(): js.Tuple2[Double, Double] = js.native

  def translate(translate: js.Tuple2[Double, Double]): Zoom[Datum] = js.native

  def scale(): Double = js.native

  def scale(scale: Double): Zoom[Datum] = js.native

  def scaleExtent(): js.Tuple2[Double, Double] = js.native

  def scaleExtent(extent: js.Tuple2[Double, Double]): Zoom[Datum] = js.native

  def center(): js.Tuple2[Double, Double] = js.native

  def center(center: js.Tuple2[Double, Double]): Zoom[Datum] = js.native

  def size(): js.Tuple2[Double, Double] = js.native

  def size(size: js.Tuple2[Double, Double]): Zoom[Datum] = js.native

  def x(): zoom.Scale = js.native

  def x(x: zoom.Scale): Zoom[Datum] = js.native

  def y(): zoom.Scale = js.native

  def y(y: zoom.Scale): Zoom[Datum] = js.native

  def on(`type`: String): js.Function2[Datum, Double, Any] = js.native

  def on(`type`: String, listener: js.Function2[Datum, Double, Any]): Zoom[Datum] = js.native

  def event(selection: Selection[Datum]): Unit = js.native

  def event(transition: Transition[Datum]): Unit = js.native
}

package zoom {


@js.native
trait Scale extends js.Object {
  def domain(): js.Array[Double] = js.native

  def domain(values: js.Array[Double]): Scale = js.native

  def invert(y: Double): Double = js.native

  def range(values: js.Array[Double]): Scale = js.native

  def range(): js.Array[Double] = js.native
}


}


}


