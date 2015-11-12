package org.singlespaced.d3js

import org.scalajs.dom
import org.singlespaced.d3js
import d3js.d3.Primitive
import utest._

import scala.scalajs.js

object D3Test extends TestSuite {


  val elem=dom.document.createElement("p")
  dom.document.body.appendChild(elem)
  val sel=d3.selectAll("p").data(js.Array(5))

  val tests = TestSuite {
    'd3_selection_attr_fun3WithPrimitive {
      val f3:Function3[Int,Double,Double,Primitive]= (d:Int,i:Double,z:Double) => d*2
//      sel.attr("tabindex", f3 )
  //    assert("10" == elem.getAttribute("tabindex"))
    }
    'd3_selection_classed_fun3 {
      val f= (d:Int,i:Double,x:Double) => d==5
      //sel.classed("myclass", f )
    //  assert(elem.classList.contains("myclass"))
    }
    'd3_selection_attrfunx_update {
      import d3js.selection.Obs._
      val f3= (d:Int) => (d*2).asInstanceOf[Primitive]
      val tt=sel.attr("tabindex", f3 )
    }

  }
}

