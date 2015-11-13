package org.singlespaced.d3js

import org.scalajs.dom
import d3.Primitive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSBracketAccess, JSName}

@JSName("d3.selection")
@js.native
trait SelectionObject extends js.Object {
  var prototype: Selection[js.Any] = js.native
}

package selection {


@js.native
trait Group extends js.Array[dom.EventTarget] {
  var parentNode: dom.EventTarget = js.native
}



@js.native
trait BaseSelection[Datum] extends BaseDom[Datum] {
  type T<: BaseSelection[Datum]

  var length: Double = js.native

  @JSBracketAccess
  def apply(index: Double): Group = js.native

  @JSBracketAccess
  def update(index: Double, v: Group): Unit = js.native

  def attr(name: String): String = js.native

  def classed(name: String): Boolean = js.native
  def classed(name: String, value: Boolean): T = js.native
  def classed(name: String, value: DatumFunction[Boolean]): T = js.native
  def classed(obj: js.Dictionary[SelfOrDatumFunction[Boolean]]): T = js.native

  def style(name: String): String = js.native

  def style(obj: js.Dictionary[SelfOrDatumFunction[Primitive]], priority: String ): T = js.native

  def property(name: String): js.Dynamic = js.native
  def property(name: String, value: Any): T = js.native
  def property(name: String, value: DatumFunction[Any]): T = js.native
  def property(obj: js.Dictionary[SelfOrDatumFunction[Any]]): T = js.native

  def text(): String = js.native

  def html(): String = js.native
  def html(value: String): T = js.native
  def html(value: DatumFunction[String]): T = js.native

  def append(name: String): T = js.native
  def append(name: DatumFunction[dom.EventTarget]): T = js.native

  def insert(name: String, before: String): T = js.native
  def insert(name: String, before: DatumFunction[dom.EventTarget]): T = js.native
  def insert(name: DatumFunction[dom.EventTarget], before: String): T = js.native
  def insert(name: DatumFunction[dom.EventTarget], before: DatumFunction[dom.EventTarget]): T = js.native

  def data(): js.Array[Datum] = js.native
  def data[NewDatum](data: js.Array[NewDatum]): Update[NewDatum] = js.native
  def data[NewDatum](data: js.Array[NewDatum], key: js.Function3[NewDatum, Double, Double, String]): Update[NewDatum] = js.native
  def data[NewDatum](data: DatumFunction[js.Array[NewDatum]], key: js.Function3[NewDatum, Double, Double, String]): Update[NewDatum] = js.native

  def filter(selector: DatumFunction[Boolean]): T = js.native

  def datum(): Datum = js.native
  def datum[NewDatum](value: NewDatum): Update[NewDatum] = js.native
  def datum[NewDatum](value: DatumFunction[NewDatum]): Update[NewDatum] = js.native

  def sort(comparator: js.Function2[Datum, Datum, Double] = ???): T = js.native

  def order(): T = js.native

  def on(`type`: String): js.Function3[Datum, Double, Double, Any] = js.native
  def on(`type`: String, listener: js.Function3[Datum, Double, Double, Any], capture: Boolean = false): T = js.native

  def transition(name: String = ???): Transition[Datum] = js.native

  def interrupt(name: String = ???): T = js.native

  def select(selector: String): T = js.native
  def select(selector: DatumFunction[dom.EventTarget]): T = js.native

  def each(func: DatumFunction[js.Any]): T = js.native

}

@js.native
trait Update[Datum] extends BaseSelection[Datum] {
  type T = Update[Datum]

  def selectAll[SelData](selector: String): Update[SelData] = js.native

  def selectAll[SelData](selector: js.Function3[Datum, Double, Double, js.Array[dom.EventTarget] | dom.NodeList]): Update[SelData] = js.native

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
trait Selection[Datum] extends selection.BaseSelection[Datum] {
  type T = Selection[Datum]

  //def selectAll(selector: String): Selection[js.Any] = js.native
  def selectAll[SelData](selector: String): Selection[SelData] = js.native

  //def selectAll(selector: js.Function3[Datum, Double, Double, js.Array[dom.EventTarget] | dom.NodeList]): Selection[js.Any] = js.native
  def selectAll[SelData](selector: DatumFunction[js.Array[dom.EventTarget] | dom.NodeList]): Selection[SelData] = js.native
}

