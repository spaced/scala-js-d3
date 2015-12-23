package org.singlespaced.d3js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.JSName

@JSName("d3.layout")
@js.native
trait LayoutObject extends js.Object {
  def bundle(): Bundle[bundleModule.Node] = js.native

  //TODO def bundle[T <: bundle_.Node](): Bundle[T] = js.native

  def chord(): Chord = js.native

  def cluster(): Cluster[clusterModule.Result] = js.native

  //TODO def cluster[T <: cluster_.Result](): Cluster[T] = js.native

  //def force(): forceModule.Force[forceModule.Node, forceModule.Link[forceModule.Node]] = js.native

  def force[N <: forceModule.Node, L <: forceModule.Link[N] ](): forceModule.Force[N, L] = js.native

  def hierarchy(): Hierarchy[hierarchyModule.Result] = js.native

  //TODO def hierarchy[T <: hierarchy_.Result](): Hierarchy[T] = js.native

  def histogram(): Histogram[Double] = js.native

  //TODO def histogram[T](): Histogram[T] = js.native

  def pack(): Pack[packModule.Node] = js.native

  def partition(): Partition[partitionModule.Node] = js.native

  //TODO def pack[T <: pack_.Node](): Pack[T] = js.native

  def pie(): Pie[Double] = js.native

  //TODO def pie[T](): Pie[T] = js.native

  def stack(): Stack[js.Array[stackModule.Value], stackModule.Value] = js.native

  //TODO def stack[Value](): Stack[js.Array[Value], Value] = js.native

  //TODO def stack[Series, Value](): Stack[Series, Value] = js.native

  def tree(): Tree[treeModule.Node] = js.native

  //TODO def tree[T <: tree_.Node](): Tree[T] = js.native

  def treemap(): Treemap[treemapModule.Node] = js.native

  //TODO def treemap[T <: treemap_.Node](): Treemap[T] = js.native


}

@js.native
trait Bundle[T <: bundleModule.Node] extends js.Object {
  def apply(links: js.Array[bundleModule.Link[T]]): js.Array[js.Array[T]] = js.native
}

package bundleModule {

@js.native
trait Node extends js.Object {
  var parent: Node = js.native
}

@js.native
trait Link[T <: Node] extends js.Object {
  var source: T = js.native
  var target: T = js.native
}

}


package chordModule {

@js.native
trait Link extends js.Object {
  var source: Node = js.native
  var target: Node = js.native
}

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

  def chords(): js.Array[chordModule.Link] = js.native

  def groups(): js.Array[chordModule.Group] = js.native
}

package clusterModule {

@js.native
trait Result extends js.Object {
  var parent: Result = js.native
  var children: js.Array[Result] = js.native
  var depth: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

@js.native
trait Link[T <: Result] extends js.Object {
  var source: T = js.native
  var target: T = js.native
}

}

@js.native
trait Cluster[T <: clusterModule.Result] extends js.Object {
  def apply(root: T): js.Array[T] = js.native

  def nodes(root: T): js.Array[T] = js.native

  def links(nodes: js.Array[T]): js.Array[clusterModule.Link[T]] = js.native

  def children(): js.Function1[T, js.Array[T]] = js.native

  def children(accessor: js.Function1[T, js.Array[T]]): Cluster[T] = js.native

  def sort(): js.Function2[T, T, Double] = js.native

  def sort(comparator: js.Function2[T, T, Double]): Cluster[T] = js.native

  def separation(): js.Function2[T, T, Double] = js.native

  def separation(separation: js.Function2[T, T, Double]): Cluster[T] = js.native

  def size(): js.Tuple2[Double, Double] = js.native

  def size(size: js.Tuple2[Double, Double]): Cluster[T] = js.native

  def nodeSize(): js.Tuple2[Double, Double] = js.native

  def nodeSize(nodeSize: js.Tuple2[Double, Double]): Cluster[T] = js.native

  def value(): js.Function1[T, Double] = js.native

  def value(value: js.Function1[T, Double]): Cluster[T] = js.native
}

package forceModule {

@js.native
trait Link[T <: Node] extends js.Object {
  var source: T = js.native
  var target: T = js.native
}

@js.native
trait Node extends js.Object {
  var index: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var px: Double = js.native
  var py: Double = js.native
  var fixed: Boolean = js.native
  var weight: Double = js.native
}

@js.native
trait Event extends js.Object {
  var `type`: String = js.native
  var alpha: Double = js.native
}

@js.native
trait Force[Node <: forceModule.Node, Link <: forceModule.Link[Node] ] extends js.Object {
  def size(): js.Tuple2[Double, Double] = js.native

  def size(size: js.Tuple2[Double, Double]): Force[Node,Link] = js.native

  def linkDistance(): Double | js.Function2[Link, Double, Double] = js.native

  def linkDistance(distance: Double): Force[Node,Link] = js.native

  def linkDistance(distance: js.Function2[Link, Double, Double]): Force[Node,Link] = js.native

  def linkStrength(): Double | js.Function2[Link, Double, Double] = js.native

  def linkStrength(strength: Double): Force[Node,Link] = js.native

  def linkStrength(strength: js.Function2[Link, Double, Double]): Force[Node,Link] = js.native

  def friction(): Double = js.native

  def friction(friction: Double): Force[Node,Link] = js.native

  def charge(): Double | js.Function2[Node, Double, Double] = js.native

  def charge(charge: Double): Force[Node,Link] = js.native

  def charge(charge: js.Function2[Node, Double, Double]): Force[Node,Link] = js.native

  def chargeDistance(): Double = js.native

  def chargeDistance(distance: Double): Force[Node,Link] = js.native

  def theta(): Double = js.native

  def theta(theta: Double): Force[Node,Link] = js.native

  def gravity(): Double = js.native

  def gravity(gravity: Double): Force[Node,Link] = js.native

  def nodes(): js.Array[Node] = js.native

  def nodes(nodes: js.Array[Node]): Force[Node,Link] = js.native

  def links(): js.Array[Link] = js.native

  //def links(links: js.Array[js.Any]): Force[Node,Link] = js.native

  def links(links: js.Array[Link] ): Force[Node,Link] = js.native

  def start(): Force[Node,Link] = js.native

  def alpha(): Double = js.native

  def alpha(value: Double): Force[Node,Link] = js.native

  def resume(): Force[Node,Link] = js.native

  def stop(): Force[Node,Link] = js.native

  def on(`type`: String): js.Function1[forceModule.Event, Unit] = js.native

  def on(`type`: String, listener: js.Function1[forceModule.Event, Unit]): Force[Node,Link] = js.native

  def drag(): behavior.Drag[Node] = js.native

  def drag(selection: Selection[Node]): Unit = js.native
}

}


package hierarchyModule {

@js.native
trait Result extends js.Object {
  var parent: Result = js.native
  var children: js.Array[Result] = js.native
  var value: Double = js.native
  var depth: Double = js.native
}

}

@js.native
trait Hierarchy[T <: hierarchyModule.Result] extends js.Object {
  def apply(root: T): js.Array[T] = js.native

  def children(): js.Function1[T, js.Array[T]] = js.native

  def children(accessor: js.Function1[T, js.Array[T]]): Hierarchy[T] = js.native

  def sort(): js.Function2[T, T, Double] = js.native

  def sort(comparator: js.Function2[T, T, Double]): Hierarchy[T] = js.native

  def value(): js.Function1[T, Double] = js.native

  def value(accessor: js.Function1[T, Double]): Hierarchy[T] = js.native

  def revalue(root: T): js.Array[T] = js.native
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

@js.native
trait Node extends js.Object {
  var parent: Node = js.native
  var children: js.Array[Node] = js.native
  var value: Double = js.native
  var depth: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var r: Double = js.native
}

@js.native
trait Link[T <: Node] extends js.Object {
  var source: Node = js.native
  var target: Node = js.native
}

}

@js.native
trait Pack[T <: packModule.Node] extends js.Object {
  def apply(root: T): js.Array[T] = js.native

  def nodes(root: T): js.Array[T] = js.native

  def links(nodes: js.Array[T]): js.Array[packModule.Link[T]] = js.native

  def children(): js.Function2[T, Double, js.Array[T]] = js.native

  def children(children: js.Function2[T, Double, js.Array[T]]): Pack[T] = js.native

  def sort(): js.Function2[T, T, Double] = js.native

  def sort(comparator: js.Function2[T, T, Double]): Pack[T] = js.native

  def value(): js.Function1[T, Double] = js.native

  def value(value: js.Function1[T, Double]): Pack[T] = js.native

  def size(): js.Tuple2[Double, Double] = js.native

  def size(size: js.Tuple2[Double, Double]): Pack[T] = js.native

  def radius(): Double | js.Function1[T, Double] = js.native

  def radius(radius: Double): Pack[T] = js.native

  def radius(radius: js.Function1[T, Double]): Pack[T] = js.native

  def padding(): Double = js.native

  def padding(padding: Double): Pack[T] = js.native
}

package partitionModule {

@js.native
trait Link[T <: Node] extends js.Object {
  var source: T = js.native
  var target: T = js.native
}

@js.native
trait Node extends js.Object {
  var parent: Node = js.native
  var children: Double = js.native
  var value: Double = js.native
  var depth: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var dx: Double = js.native
  var dy: Double = js.native
}

}

@js.native
trait Partition[T <: partitionModule.Node] extends js.Object {
  def nodes(root: T): js.Array[T] = js.native
  def links(nodes: js.Array[T]): js.Array[partitionModule.Link[T]] = js.native
  def children(): js.Function2[T, Double, js.Array[T]] = js.native
  def children(children: js.Function2[T, Double, js.Array[T]]): Partition[T] = js.native
  def sort(): js.Function2[T, T, Double] = js.native
  def sort(comparator: js.Function2[T, T, Double]): Partition[T] = js.native
  def value(): js.Function1[T, Double] = js.native
  def value(value: js.Function1[T, Double]): Partition[T] = js.native
  def size(): js.Tuple2[Double, Double] = js.native
  def size(size: js.Tuple2[Double, Double]): Partition[T] = js.native
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
trait Pie[T] extends js.Object {
  def apply(data: js.Array[T], index: Double): js.Array[pieModule.Arc[T]] = js.native

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

@js.native
trait Value extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
  var y0: Double = js.native
}

}

@js.native
trait Stack[Series, Value] extends js.Object {
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

  def y(accesor: js.Function2[Value, Double, Double]): Stack[Series, Value] = js.native

  def out(): js.Function3[Value, Double, Double, Unit] = js.native

  def out(setter: js.Function3[Value, Double, Double, Unit]): Stack[Series, Value] = js.native
}
package treeModule {

@js.native
trait Link[T <: Node] extends js.Object {
  var source: T = js.native
  var target: T = js.native
}

@js.native
trait Node extends js.Object {
  var parent: Node = js.native
  var children: js.Array[Node] = js.native
  var depth: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

}

@js.native
trait Tree[T] extends js.Object {
  def apply(root: T, index: Double = ???): js.Array[T] = js.native

  def nodes(root: T, index: Double = ???): js.Array[T] = js.native

  //todo:fix T must be node subtype 
  
  def links(nodes: js.Array[T]): js.Array[Link[T]] = js.native
  
  def children(): js.Function2[T, Double, js.Array[T]] = js.native

  def children(children: js.Function2[T, Double, js.Array[T]]): Tree[T] = js.native

  def separation(): js.Function2[T, T, Double] = js.native

  def separation(separation: js.Function2[T, T, Double]): Tree[T] = js.native

  def size(): js.Tuple2[Double, Double] = js.native

  def size(size: js.Tuple2[Double, Double]): Tree[T] = js.native

  def nodeSize(): js.Tuple2[Double, Double] = js.native

  def nodeSize(size: js.Tuple2[Double, Double]): Tree[T] = js.native

  def sort(): js.Function2[T, T, Double] = js.native

  def sort(comparator: js.Function2[T, T, Double]): Tree[T] = js.native

  def value(): js.Function2[T, Double, Double] = js.native

  def value(value: js.Function2[T, Double, Double]): Tree[T] = js.native
}

@JSName("d3.layout.treemap")
@js.native
object treemapObject extends js.Object {
  type Padding = Double | js.Tuple4[Double, Double, Double, Double]
}
package treemapModule {

@js.native
trait Node extends js.Object {
  var parent: Node = js.native
  var children: js.Array[Node] = js.native
  var value: Double = js.native
  var depth: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var dx: Double = js.native
  var dy: Double = js.native
}

@js.native
trait Link[T <: Node] extends js.Object {
  var source: T = js.native
  var target: T = js.native
}

}


@js.native
trait Treemap[T <: treemapModule.Node] extends js.Object {
  def apply(root: T, index: Double = ???): js.Array[T] = js.native

  def nodes(root: T, index: Double = ???): js.Array[T] = js.native

  def links(nodes: js.Array[T]): js.Array[treemapModule.Link[T]] = js.native

  def children(): js.Function2[T, Double, js.Array[T]] = js.native

  def children(children: js.Function2[T, Double, js.Array[T]]): Treemap[T] = js.native

  def sort(): js.Function2[T, T, Double] = js.native

  def sort(comparator: js.Function2[T, T, Double]): Treemap[T] = js.native

  def value(): js.Function2[T, Double, Double] = js.native

  def value(value: js.Function2[T, Double, Double]): Treemap[T] = js.native

  def size(): js.Tuple2[Double, Double] = js.native

  def size(size: js.Tuple2[Double, Double]): Treemap[T] = js.native

  def padding(): js.Function2[T, Double, treemapObject.Padding] = js.native

  def padding(padding: treemapObject.Padding): Treemap[T] = js.native

  def padding(padding: js.Function2[T, Double, treemapObject.Padding]): Treemap[T] = js.native

  def round(): Boolean = js.native

  def round(round: Boolean): Treemap[T] = js.native

  def sticky(): Boolean = js.native

  def sticky(sticky: Boolean): Boolean = js.native

  def mode(): String = js.native

  def mode(mode: String): Treemap[T] = js.native

  def ratio(): Double = js.native

  def ratio(ratio: Double): Treemap[T] = js.native
}



