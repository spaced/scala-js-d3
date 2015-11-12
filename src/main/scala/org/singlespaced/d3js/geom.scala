package org.singlespaced.d3js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.JSName

@JSName("d3.geom")
@js.native
trait GeomObject extends js.Object {

  import geom._

  def voronoi(): Voronoi[js.Tuple2[Double, Double]] = js.native

  //TODO def voronoi[T](): Voronoi[T] = js.native
  def delaunay(vertices: js.Array[js.Tuple2[Double, Double]]): js.Array[js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]]] = js.native

  def quadtree(): Quadtree[js.Tuple2[Double, Double]] = js.native

  def quadtree[T](nodes: js.Array[T], x1: Double = ???, y1: Double = ???, x2: Double = ???, y2: Double = ???): quadtreeModule.Quadtree[T] = js.native

  def hull(vertices: js.Array[js.Tuple2[Double, Double]]): js.Array[js.Tuple2[Double, Double]] = js.native

  def hull(): Hull[js.Tuple2[Double, Double]] = js.native

  //TODO def hull[T](): Hull[T] = js.native
  def polygon(vertices: js.Array[js.Tuple2[Double, Double]]): Polygon = js.native


}
package geom {

@js.native
trait Voronoi[T] extends js.Object {
  def apply(data: js.Array[T]): js.Array[js.Tuple2[Double, Double]] = js.native

  def x(): js.Function1[T, Double] = js.native

  def x(x: js.Function1[T, Double]): Voronoi[T] = js.native

  def y(): js.Function1[T, Double] = js.native

  def y(y: js.Function1[T, Double]): Voronoi[T] = js.native

  def clipExtent(): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native

  def clipExtent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Voronoi[T] = js.native

  def links(data: js.Array[T]): js.Array[voronoiModule.Link[T]] = js.native

  def triangles(data: js.Array[T]): js.Array[js.Tuple3[T, T, T]] = js.native
}


@js.native
trait Quadtree[T] extends js.Object {
  def apply(points: js.Array[T]): quadtreeModule.Quadtree[T] = js.native

  def x(): js.Function2[T, Double, Double] = js.native

  def x(x: Double): Quadtree[T] = js.native

  def x(x: js.Function2[T, Double, Double]): Quadtree[T] = js.native

  def y(): js.Function2[T, Double, Double] = js.native

  def y(y: Double): Quadtree[T] = js.native

  def y(y: js.Function2[T, Double, Double]): Quadtree[T] = js.native

  def extent(): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native

  def extent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Quadtree[T] = js.native
}


@js.native
trait Hull[T] extends js.Object {
  def apply(vertices: js.Array[T]): js.Array[js.Tuple2[Double, Double]] = js.native

  def x(): js.Function1[T, Double] = js.native

  def x(x: js.Function1[T, Double]): Hull[T] = js.native

  def y(): js.Function1[T, Double] = js.native

  def y(y: js.Function1[T, Double]): Hull[T] = js.native
}

@js.native
trait Polygon extends js.Object {
  def area(): Double = js.native

  def centroid(): js.Tuple2[Double, Double] = js.native

  def clip(subject: js.Array[js.Tuple2[Double, Double]]): js.Array[js.Tuple2[Double, Double]] = js.native
}

package quadtreeModule {


@js.native
trait Node[T] extends js.Object {
  var nodes: js.Tuple4[Node[T], Node[T], Node[T], Node[T]] = js.native
  var leaf: Boolean = js.native
  var point: T = js.native
  var x: Double = js.native
  var y: Double = js.native
}

@js.native
trait Quadtree[T] extends Node[T] {
  def add(point: T): Unit = js.native

  def visit(callback: js.Function5[Node[T], Double, Double, Double, Double, Boolean | Unit]): Unit = js.native

  def find(point: js.Tuple2[Double, Double]): T = js.native
}

}

package voronoiModule {


@js.native
trait Link[T] extends js.Object {
  var source: T = js.native
  var target: T = js.native
}

}

}

