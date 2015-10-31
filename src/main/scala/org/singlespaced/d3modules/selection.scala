package org.singlespaced.d3modules

import org.scalajs.dom
import org.singlespaced.d3
import org.singlespaced.d3.Primitive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSBracketAccess, JSName}

@JSName("d3.selection")
@js.native
trait SelectionObject extends js.Object {
  var prototype: Selection[js.Any] = js.native
}

package selectionModule {


@js.native
trait Group extends js.Array[dom.EventTarget] {
  var parentNode: dom.EventTarget = js.native
}


@js.native
trait Update[Datum] extends js.Object {
  @JSBracketAccess
  def apply(index: Double): Group = js.native

  @JSBracketAccess
  def update(index: Double, v: Group): Unit = js.native

  var length: Double = js.native

  def attr(name: String): String = js.native

  def attr(name: String, value: Primitive): Update[Datum] = js.native

  def attr(name: String, value: js.Function3[Datum, Double, Double, Primitive]): Update[Datum] = js.native

  def attr(obj: js.Dictionary[Primitive | js.Function3[Datum, Double, Double, Primitive]]): Update[Datum] = js.native

  def classed(name: String): Boolean = js.native

  def classed(name: String, value: Boolean): Update[Datum] = js.native

  def classed(name: String, value: js.Function3[Datum, Double, Double, Boolean]): Update[Datum] = js.native

  def classed(obj: js.Dictionary[Boolean | js.Function3[Datum, Double, Double, Boolean]]): Update[Datum] = js.native

  def style(name: String): String = js.native

  def style(name: String, value: Primitive): Update[Datum] = js.native

  def style(name: String, value: Primitive, priority: String): Update[Datum] = js.native

  def style(name: String, value: js.Function3[Datum, Double, Double, Primitive], priority: String): Update[Datum] = js.native

  def style(obj: js.Dictionary[Primitive | js.Function3[Datum, Double, Double, Primitive]], priority: String): Update[Datum] = js.native

  def property(name: String): js.Dynamic = js.native

  def property(name: String, value: js.Any): Update[Datum] = js.native

  def property(name: String, value: js.Function3[Datum, Double, Double, Any]): Update[Datum] = js.native

  def property(obj: js.Dictionary[js.Any | js.Function3[Datum, Double, Double, Any]]): Update[Datum] = js.native

  def text(): String = js.native

  def text(value: Primitive): Update[Datum] = js.native

  def text(value: js.Function3[Datum, Double, Double, Primitive]): Update[Datum] = js.native

  def html(): String = js.native

  def html(value: String): Selection[Datum] = js.native

  def html(value: js.Function3[Datum, Double, Double, String]): Selection[Datum] = js.native

  def append(name: String): Selection[Datum] = js.native

  def append(name: js.Function3[Datum, Double, Double, dom.EventTarget]): Update[Datum] = js.native

  def insert(name: String, before: String): Update[Datum] = js.native

  def insert(name: String, before: js.Function3[Datum, Double, Double, dom.EventTarget]): Update[Datum] = js.native

  def insert(name: js.Function3[Datum, Double, Double, dom.EventTarget], before: String): Update[Datum] = js.native

  def insert(name: js.Function3[Datum, Double, Double, dom.EventTarget], before: js.Function3[Datum, Double, Double, dom.EventTarget]): Update[Datum] = js.native

  def remove(): Update[Datum] = js.native

  def data(): js.Array[Datum] = js.native

  def data[NewDatum](data: js.Array[NewDatum]): Update[NewDatum] = js.native

  def data[NewDatum](data: js.Array[NewDatum], key: js.Function3[NewDatum, Double, Double, String]): Update[NewDatum] = js.native

  def data[NewDatum](data: js.Function3[Datum, Double, Double, js.Array[NewDatum]], key: js.Function3[NewDatum, Double, Double, String]): Update[NewDatum] = js.native

  def filter(selector: String): Update[Datum] = js.native

  def filter(selector: js.Function3[Datum, Double, Double, Boolean]): Update[Datum] = js.native

  def datum(): Datum = js.native

  def datum[NewDatum](value: NewDatum): Update[NewDatum] = js.native

  def datum[NewDatum](value: js.Function3[Datum, Double, Double, NewDatum]): Update[NewDatum] = js.native

  def sort(comparator: js.Function2[Datum, Datum, Double] = ???): Update[Datum] = js.native

  def order(): Update[Datum] = js.native

  def on(`type`: String): js.Function3[Datum, Double, Double, Any] = js.native

  def on(`type`: String, listener: js.Function3[Datum, Double, Double, Any], capture: Boolean = false): Update[Datum] = js.native

  def transition(name: String = null): Transition[Datum] = js.native

  def interrupt(name: String = null): Update[Datum] = js.native

  def select(selector: String): Update[Datum] = js.native

  def select(selector: js.Function3[Datum, Double, Double, dom.EventTarget]): Update[Datum] = js.native

  def selectAll(selector: String): Update[Datum] = js.native

  def selectAll(selector: js.Function3[Datum, Double, Double, js.Array[dom.EventTarget] | dom.NodeList]): Update[js.Any] = js.native

  def each(func: js.Function3[Datum, Double, Double, Any]): Update[Datum] = js.native

  def call(func: js.Function, args: js.Any*): Update[Datum] = js.native

  def empty(): Boolean = js.native

  def node(): dom.Node = js.native

  def size(): Double = js.native

  def enter(): Enter[Datum] = js.native

  def exit(): Selection[Datum] = js.native
}

@js.native
trait Enter[Datum] extends js.Object {
  def append(name: String): Selection[Datum] = js.native

  def append(name: js.Function3[Datum, Double, Double, dom.EventTarget]): Selection[Datum] = js.native

  def insert(name: String, before: String): Selection[Datum] = js.native

  def insert(name: String, before: js.Function3[Datum, Double, Double, dom.EventTarget]): Selection[Datum] = js.native

  def insert(name: js.Function3[Datum, Double, Double, dom.EventTarget], before: String): Selection[Datum] = js.native

  def insert(name: js.Function3[Datum, Double, Double, dom.EventTarget], before: js.Function3[Datum, Double, Double, dom.EventTarget]): Selection[Datum] = js.native

  def select(name: js.Function3[Datum, Double, Double, dom.EventTarget]): Selection[Datum] = js.native

  def call(func: js.Function, args: js.Any*): Enter[Datum] = js.native
}


}

@js.native
trait Selection[Datum] extends js.Object {
  @JSBracketAccess
  def apply(index: Double): selectionModule.Group = js.native

  @JSBracketAccess
  def update(index: Double, v: selectionModule.Group): Unit = js.native

  var length: Double = js.native

  def attr(name: String): String = js.native

  def attr(name: String, value: Primitive): Selection[Datum] = js.native

  def attr(name: String, value: js.Function2[Datum, Double, js.Any]): Selection[Datum] = js.native //MANUAL

  def attr(name: String, value: js.Function3[Datum, Double, Double, Primitive]): Selection[Datum] = js.native

  def attr(obj: js.Dictionary[Primitive | js.Function3[Datum, Double, Double, Primitive]]): Selection[Datum] = js.native

  def classed(name: String): Boolean = js.native

  def classed(name: String, value: Boolean): Selection[Datum] = js.native

  def classed(name: String, value: js.Function3[Datum, Double, Double, Boolean]): Selection[Datum] = js.native

  def classed(obj: js.Dictionary[Boolean | js.Function3[Datum, Double, Double, Boolean]]): Selection[Datum] = js.native

  def style(name: String): String = js.native

  //def style(name: String, value: Primitive): Selection[Datum] = js.native

  //def style(name: String, value: Primitive, priority: String = ???): Selection[Datum] = js.native

  def style(name: String, value: js.Function3[Datum, Double, Double, Primitive] | Primitive, priority: String = ???): Selection[Datum] = js.native

  def style(obj: js.Dictionary[Primitive | js.Function3[Datum, Double, Double, Primitive]], priority: String): Selection[Datum] = js.native

  def property(name: String): js.Dynamic = js.native

  def property(name: String, value: js.Any): Selection[Datum] = js.native

  def property(name: String, value: js.Function3[Datum, Double, Double, Any]): Selection[Datum] = js.native

  def property(obj: js.Dictionary[js.Any | js.Function3[Datum, Double, Double, Any]]): Selection[Datum] = js.native

  def text(): String = js.native

  def text(value: Primitive): Selection[Datum] = js.native

  def text(value: js.Function3[Datum, Double, Double, Primitive]): Selection[Datum] = js.native

  def html(): String = js.native

  def html(value: String): Selection[Datum] = js.native

  def html(value: js.Function3[Datum, Double, Double, String]): Selection[Datum] = js.native

  def append(name: String): Selection[Datum] = js.native

  def append(name: js.Function3[Datum, Double, Double, dom.EventTarget]): Selection[Datum] = js.native

  def insert(name: String, before: String): Selection[Datum] = js.native

  def insert(name: String, before: js.Function3[Datum, Double, Double, dom.EventTarget]): Selection[Datum] = js.native

  def insert(name: js.Function3[Datum, Double, Double, dom.EventTarget], before: String): Selection[Datum] = js.native

  def insert(name: js.Function3[Datum, Double, Double, dom.EventTarget], before: js.Function3[Datum, Double, Double, dom.EventTarget]): Selection[Datum] = js.native

  def remove(): Selection[Datum] = js.native

  def data(): js.Array[Datum] = js.native

  def data[NewDatum](data: js.Array[NewDatum]): selectionModule.Update[NewDatum] = js.native

  def data[NewDatum](data: js.Array[NewDatum], key: js.Function3[NewDatum, Double, Double, String]): selectionModule.Update[NewDatum] = js.native

  def data[NewDatum](data: js.Function3[Datum, Double, Double, js.Array[NewDatum]], key: js.Function3[NewDatum, Double, Double, String]): selectionModule.Update[NewDatum] = js.native

  def filter(selector: String): Selection[Datum] = js.native

  def filter(selector: js.Function3[Datum, Double, Double, Boolean]): Selection[Datum] = js.native

  def datum(): Datum = js.native

  def datum[NewDatum](value: js.Function3[Datum, Double, Double, NewDatum]): Selection[NewDatum] = js.native

  def datum[NewDatum](value: NewDatum): Selection[NewDatum] = js.native

  def sort(comparator: js.Function2[Datum, Datum, Double] = null): Selection[Datum] = js.native

  def order(): Selection[Datum] = js.native

  def on(`type`: String): js.Function3[Datum, Double, Double, Any] = js.native

  def on(`type`: String, listener: js.Function3[Datum, Double, Double, Any], capture: Boolean = false): Selection[Datum] = js.native

  def transition(name: String = null): Transition[Datum] = js.native

  def interrupt(name: String = null): Selection[Datum] = js.native

  def select(selector: String): Selection[Datum] = js.native

  def select(selector: js.Function3[Datum, Double, Double, dom.EventTarget]): Selection[Datum] = js.native

  //def selectAll(selector: String): Selection[js.Any] = js.native
  def selectAll[T](selector: String): Selection[T] = js.native

  //def selectAll(selector: js.Function3[Datum, Double, Double, js.Array[dom.EventTarget] | dom.NodeList]): Selection[js.Any] = js.native
  def selectAll[T](selector: js.Function3[Datum, Double, Double, js.Array[dom.EventTarget] | dom.NodeList]): Selection[T] = js.native

  def each(func: js.Function3[Datum, Double, Double, Any]): Selection[Datum] = js.native

  def call(func: js.Function, args: js.Any*): Selection[Datum] = js.native

  def empty(): Boolean = js.native

  def node(): dom.EventTarget = js.native

  def size(): Double = js.native
}

