package org.singlespaced.d3js

import org.scalajs.dom
import scala.scalajs.js
import utest._

object AxisTest extends TestSuite {


  val elem=dom.document.createElement("p")
  dom.document.body.appendChild(elem)


  val tests = TestSuite {
    'd3_axis_call {
      //arrange
      val x = d3.time.scale().range(js.Array(0,  1000))
      val xAxis = d3.svg.axis().scale(x).orient("bottom").ticks(5)
      //act
      d3.select("p").append("svg").call(xAxis)
      //assert
      val actual=dom.document.getElementsByClassName("tick")
      assert( actual.length == 2)
    }


  }
}

