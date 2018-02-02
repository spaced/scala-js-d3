package org.singlespaced.d3js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSExportAll, JSName, ScalaJSDefined}

@JSName("d3.layout")
@js.native
trait LayoutObject extends js.Object {

  def bundle[Node <: bundleModule.Node](): Bundle[Node] = js.native

  def chord(): Chord = js.native

  def cluster[Node](): Cluster[Node] = js.native

  def force[Node, L <: Link[Node] ](): forceModule.Force[Node, L] = js.native

  def hierarchy[Node](): Hierarchy[Node] = js.native

  def histogram[T](): Histogram[T] = js.native

  def partition[Node](): Partition[Node] = js.native

  def pack[Node](): Pack[Node] = js.native

  def pie[T](): Pie[T] = js.native

  def stack[Value](): Stack[js.Array[Value], Value] = js.native

  //TODO def stack[Series, Value](): Stack[Series, Value] = js.native

  def tree[Node](): Tree[Node] = js.native

  def treemap[Node](): Treemap[Node] = js.native


}

@JSExportAll
trait Link[Node] {
  def source:Node
  def target:Node
}

case class SimpleLink[Node](sourceNode:Node,targetNode:Node) extends Link[Node] {
  def source=sourceNode
  def target=targetNode
}


@js.native
trait Bundle[T <: bundleModule.Node] extends js.Function1[js.Array[Link[T]], js.Array[js.Array[T]]] {
}

package bundleModule {

@JSExportAll
trait Node  {
  def parent: Node
}


}


package chordModule {

@js.native
trait Node extends js.Object {
  var index: Double = js.native
  var subindex: Double = js.native
  var startAngle: Double = js.native
  var endAngle: Double = js.native
  var value: Double = js.native
}

@js.native
trait Group extends js.Object {
  var index: Double = js.native
  var startAngle: Double = js.native
  var endAngle: Double = js.native
  var value: Double = js.native
}

}

@js.native
trait Chord extends js.Object {
  def matrix(): js.Array[js.Array[Double]] = js.native

  def matrix(matrix: js.Array[js.Array[Double]]): Chord = js.native

  def padding(): Double = js.native

  def padding(padding: Double): Chord = js.native

  def sortGroups(): js.Function2[Double, Double, Double] = js.native

  def sortGroups(comparator: js.Function2[Double, Double, Double]): Chord = js.native

  def sortSubgroups(): js.Function2[Double, Double, Double] = js.native

  def sortSubgroups(comparator: js.Function2[Double, Double, Double]): Chord = js.native

  def sortChords(): js.Function2[Double, Double, Double] = js.native

  def sortChords(comparator: js.Function2[Double, Double, Double]): Chord = js.native

  def chords(): js.Array[Link[chordModule.Group]] = js.native

  def groups(): js.Array[chordModule.Group] = js.native
}

package clusterModule {


trait Node extends hierarchyModule.Node {
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}


}

@js.native
trait Cluster[Node] extends BaseHierarchy[Node,Hierarchy[Node]] {

  def nodes(root: Node): js.Array[Node] = js.native

  def separation(): js.Function2[Node, Node, Double] = js.native

  def separation(separation: js.Function2[Node, Node, Double]): Cluster[Node] = js.native

  def size(): js.Tuple2[Double, Double] = js.native

  def size(size: js.Tuple2[Double, Double]): Cluster[Node] = js.native

  def nodeSize(): js.Tuple2[Double, Double] = js.native

  def nodeSize(nodeSize: js.Tuple2[Double, Double]): Cluster[Node] = js.native

}

package forceModule {


@JSExportAll
trait Node {
  var index: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var px: js.UndefOr[Double] = js.undefined
  var py: js.UndefOr[Double] = js.undefined
  var fixed: js.UndefOr[Double] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

@js.native
trait Event extends org.scalajs.dom.Event {
  var alpha: Double = js.native
}

@js.native
trait Force[Node, L <: Link[Node] ] extends js.Object {
  def size(): js.Tuple2[Double, Double] = js.native

  def size(size: js.Tuple2[Double, Double]): Force[Node,L] = js.native

  def linkDistance(): Double | js.Function2[L, Double, Double] = js.native

  def linkDistance(distance: Double): Force[Node,L] = js.native

  def linkDistance(distance: js.Function2[L, Double, Double]): Force[Node,L] = js.native

  def linkStrength(): Double | js.Function2[L, Double, Double] = js.native

  def linkStrength(strength: Double): Force[Node,L] = js.native

  def linkStrength(strength: js.Function2[L, Double, Double]): Force[Node,L] = js.native

  def friction(): Double = js.native

  def friction(friction: Double): Force[Node,L] = js.native

  def charge(): Double | js.Function2[Node, Double, Double] = js.native

  def charge(charge: Double): Force[Node,L] = js.native

  def charge(charge: js.Function2[Node, Double, Double]): Force[Node,L] = js.native

  def chargeDistance(): Double = js.native

  def chargeDistance(distance: Double): Force[Node,L] = js.native

  def theta(): Double = js.native

  def theta(theta: Double): Force[Node,L] = js.native

  def gravity(): Double = js.native

  def gravity(gravity: Double): Force[Node,L] = js.native

  def nodes(): js.Array[Node] = js.native

  def nodes(nodes: js.Array[Node]): Force[Node,L] = js.native

  def links(): js.Array[L] = js.native

  def links(links: js.Array[L] ): Force[Node,L] = js.native

  def start(): Force[Node,L] = js.native

  def alpha(): Double = js.native

  def alpha(value: Double): Force[Node,L] = js.native

  def resume(): Force[Node,L] = js.native

  def stop(): Force[Node,L] = js.native

  def on(`type`: String): js.Function1[org.scalajs.dom.Event, Unit] = js.native

  def on(`type`: String, listener: js.Function1[org.scalajs.dom.Event, Unit]): Force[Node,L] = js.native

  def drag(): behavior.Drag[Node] = js.native

  def drag(selection: Selection[Node]): Unit = js.native
}

}


package hierarchyModule {

@JSExportAll
trait Node {
  var parent: js.UndefOr[Node] = js.undefined
  var children: js.UndefOr[js.Array[Node]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var depth: js.UndefOr[Int] = js.undefined
}

}



@js.native
trait BaseHierarchy[Node, T <: BaseHierarchy[Node,T]] extends js.Function1[Node,js.Array[Node]] {

  def links(nodes: js.Array[Node]): js.Array[Link[Node]] = js.native

  def children(): js.Function1[Node, js.Array[Node]] = js.native

  def children(accessor: js.Function1[Node, js.Array[Node]]): T = js.native

  def sort(): js.Function2[Node, Node, Double] = js.native

  def sort(comparator: js.Function2[Node, Node, Double]): T = js.native

  def value(): js.Function1[Node, Double] = js.native

  def value(accessor: js.Function1[Node, Double]): T = js.native

  def revalue(root: Node): js.Array[Node] = js.native
}

@js.native
trait Hierarchy[Node] extends BaseHierarchy[Node,Hierarchy[Node]] {

}


package histogramModule {

@js.native
trait Bin[T] extends js.Array[T] {
  var x: Double = js.native
  var dx: Double = js.native
  var y: Double = js.native
}

}

@js.native
trait Histogram[T] extends js.Object {
  def apply(values: js.Array[T], index: Double = ???): js.Array[histogramModule.Bin[T]] = js.native

  def value(): js.Function2[T, Double, Double] = js.native

  def value(value: js.Function2[T, Double, Double]): Histogram[T] = js.native

  def range(): js.Function2[js.Array[T], Double, js.Tuple2[Double, Double]] = js.native

  def range(range: js.Function2[js.Array[T], Double, js.Tuple2[Double, Double]]): Histogram[T] = js.native

  def bins(): js.Function3[js.Tuple2[Double, Double], js.Array[T], Double, js.Array[Double]] = js.native

  def bins(count: Double): Histogram[T] = js.native

  def bins(thresholds: js.Array[Double]): Histogram[T] = js.native

  def bins(func: js.Function3[js.Tuple2[Double, Double], js.Array[T], Double, js.Array[Double]]): Histogram[T] = js.native

  def frequency(): Boolean = js.native

  def frequency(frequency: Boolean): Histogram[T] = js.native
}

package packModule {


trait Node extends hierarchyModule.Node {
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var r: js.UndefOr[Double] = js.undefined
}

}

@js.native
trait Pack[Node] extends BaseHierarchy[Node,Hierarchy[Node]] {

  def nodes(root: Node): js.Array[Node] = js.native

  def children(children: js.Function2[Node, Double, js.Array[Node]]): Pack[Node] = js.native

  def size(): js.Tuple2[Double, Double] = js.native

  def size(size: js.Tuple2[Double, Double]): Pack[Node] = js.native

  def radius(): Double | js.Function1[Node, Double] = js.native

  def radius(radius: Double): Pack[Node] = js.native

  def radius(radius: js.Function1[Node, Double]): Pack[Node] = js.native

  def padding(): Double = js.native

  def padding(padding: Double): Pack[Node] = js.native
}

package partitionModule {



@JSExportAll
trait Node extends hierarchyModule.Node {
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var dx: js.UndefOr[Double] = js.undefined
  var dy: js.UndefOr[Double] = js.undefined
}

}

@js.native
trait Partition[Node] extends BaseHierarchy[Node,Partition[Node]] {
  def nodes(root: Node): js.Array[Node] = js.native
  def size(): js.Tuple2[Double, Double] = js.native
  def size(size: js.Tuple2[Double, Double]): Partition[Node] = js.native
}

package pieModule {

@js.native
trait Arc[T] extends js.Object {
  var value: Double = js.native
  var startAngle: Double = js.native
  var endAngle: Double = js.native
  var padAngle: Double = js.native
  var data: T = js.native
}

}


@js.native
trait Pie[T] extends js.Function1[js.Array[T],js.Array[pieModule.Arc[T]]] {

  def apply(values: js.Array[T], index:Double): js.Array[pieModule.Arc[T]] = js.native

  def value(): js.Function2[T, Double, Double] = js.native

  def value(accessor: js.Function2[T, Double, Double]): Pie[T] = js.native

  def sort(): js.Function2[T, T, Double] = js.native

  def sort(comparator: js.Function2[T, T, Double]): Pie[T] = js.native

  def startAngle(): Double | js.Function2[js.Array[T], Double, Double] = js.native

  def startAngle(angle: Double): Pie[T] = js.native

  def startAngle(angle: js.Function2[js.Array[T], Double, Double]): Pie[T] = js.native

  def endAngle(): Double | js.Function2[js.Array[T], Double, Double] = js.native

  def endAngle(angle: Double): Pie[T] = js.native

  def endAngle(angle: js.Function2[js.Array[T], Double, Double]): Pie[T] = js.native

  def padAngle(): Double | js.Function2[js.Array[T], Double, Double] = js.native

  def padAngle(angle: Double): Pie[T] = js.native

  def padAngle(angle: js.Function2[js.Array[T], Double, Double]): Pie[T] = js.native
}

package stackModule {

@JSExportAll
trait Value {
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var y0: js.UndefOr[Double] = js.undefined
}

}

@js.native
trait Stack[Series, Value] extends js.Function1[js.Array[Series],js.Array[Series]] {
  def apply(layers: js.Array[Series], index: Double): js.Array[Series] = js.native

  def values(): js.Function2[Series, Double, js.Array[Value]] = js.native

  def values(accessor: js.Function2[Series, Double, js.Array[Value]]): Stack[Series, Value] = js.native

  def offset(): js.Function1[js.Array[js.Tuple2[Double, Double]], js.Array[Double]] = js.native

  def offset(offset: String): Stack[Series, Value] = js.native

  def offset(offset: js.Function1[js.Array[js.Tuple2[Double, Double]], js.Array[Double]]): Stack[Series, Value] = js.native

  def order(): js.Function1[js.Array[js.Tuple2[Double, Double]], js.Array[Double]] = js.native

  def order(order: String): Stack[Series, Value] = js.native

  def order(order: js.Function1[js.Array[js.Tuple2[Double, Double]], js.Array[Double]]): Stack[Series, Value] = js.native

  def x(): js.Function2[Value, Double, Double] = js.native

  def x(accessor: js.Function2[Value, Double, Double]): Stack[Series, Value] = js.native

  def y(): js.Function2[Value, Double, Double] = js.native

  def y(accessor: js.Function2[Value, Double, Double]): Stack[Series, Value] = js.native

  def out(): js.Function3[Value, Double, Double, Unit] = js.native

  def out(setter: js.Function3[Value, Double, Double, Unit]): Stack[Series, Value] = js.native
}
package treeModule {


@JSExportAll
trait Node extends hierarchyModule.Node {
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}



}

@js.native
trait Tree[Node] extends BaseHierarchy[Node,Tree[Node]] {

  def nodes(root: Node, index: Double = ???): js.Array[Node] = js.native

  def separation(): js.Function2[Node, Node, Double] = js.native

  def separation(separation: js.Function2[Node, Node, Double]): Tree[Node] = js.native

  def size(): js.Tuple2[Double, Double] = js.native

  def size(size: js.Tuple2[Double, Double]): Tree[Node] = js.native

  def nodeSize(): js.Tuple2[Double, Double] = js.native

  def nodeSize(size: js.Tuple2[Double, Double]): Tree[Node] = js.native

}

@JSName("d3.layout.treemap")
@js.native
object treemapObject extends js.Object {
  type Padding = Double | js.Tuple4[Double, Double, Double, Double]
}
package treemapModule {

@JSExportAll
trait Node extends treeModule.Node {
  var dx: js.UndefOr[Double] = js.undefined
  var dy: js.UndefOr[Double] = js.undefined
}


}


@js.native
trait Treemap[Node] extends BaseHierarchy[Node,Treemap[Node]] {

  def nodes(root: Node, index: Double = ???): js.Array[Node] = js.native

  def size(): js.Tuple2[Double, Double] = js.native

  def size(size: js.Tuple2[Double, Double]): Treemap[Node] = js.native

  def padding(): js.Function2[Node, Double, treemapObject.Padding] = js.native

  def padding(padding: treemapObject.Padding): Treemap[Node] = js.native

  def padding(padding: js.Function2[Node, Double, treemapObject.Padding]): Treemap[Node] = js.native

  def round(): Boolean = js.native

  def round(round: Boolean): Treemap[Node] = js.native

  def sticky(): Boolean = js.native

  def sticky(sticky: Boolean): Boolean = js.native

  def mode(): String = js.native

  def mode(mode: String): Treemap[Node] = js.native

  def ratio(): Double = js.native

  def ratio(ratio: Double): Treemap[Node] = js.native
}



