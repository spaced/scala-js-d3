package org.singlespaced.d3js

import org.scalajs.dom
import utest._
import scala.scalajs.js
import scala.scalajs.js.`|`
import org.singlespaced.d3js.Ops._
object SelectionTest extends TestSuite {


  val elem=dom.document.createElement("p")
  dom.document.body.appendChild(elem)


  val tests = TestSuite {
    'd3_select_element {
      val sel:Selection[dom.EventTarget]=d3.select("p")
      val n:dom.EventTarget=sel.node()
      assert(elem == n)
    }
    'd3_selectAll_element {
      val sel:Selection[dom.EventTarget]=d3.selectAll("p")
      val n:dom.EventTarget=sel.node()
      assert(elem == n)
    }
    'd3_dataWithKey_twoLoopsAndThisFunction {
      val sel:Selection[dom.EventTarget]=d3.selectAll("p")
      val function= { (t: dom.EventTarget | Int ,d:js.UndefOr[Int],i:Int) =>
        //dom.window.console.log("d is "+d+" and i is "+i+" and this is "+t)
        "a"
      }
      sel.data[Int](js.Array(5),function).enter().append("p")
    }
    'd3_dataWithKey_simpleFunction {
      //arrange
      class MyData(val id:String)
      class MySubData(id:String) extends MyData(id)
      val sel=d3.selectAll("p").data(js.Array(new MyData("1")))
      val function= (d:MyData) => d.id
      //act
      sel.data[MySubData](js.Array(new MySubData("2")),function).enter().append("p")
      //assert
    }


  }
}

