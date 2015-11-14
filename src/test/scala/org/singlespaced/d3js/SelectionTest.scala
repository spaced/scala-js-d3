package org.singlespaced.d3js

import org.scalajs.dom
import utest._

object SelectionTest extends TestSuite {


  val elem=dom.document.createElement("p")
  dom.document.body.appendChild(elem)


  val tests = TestSuite {
    'd3_select_element {
      val sel:Selection[dom.Element]=d3.select("p")
      val n:dom.EventTarget=sel.node()
      assert(elem == n)
    }
    'd3_selectAll_element {
      val sel:Selection[dom.Element]=d3.selectAll("p")
      val n:dom.EventTarget=sel.node()
      assert(elem == n)
    }

  }
}

