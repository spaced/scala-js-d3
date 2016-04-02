package org.singlespaced.d3js

import org.scalajs.dom
import utest._

import scala.scalajs.js
import org.singlespaced.d3js.Ops._



object SvgLineTest extends TestSuite {


  val elem=dom.document.createElement("svg")
  dom.document.body.appendChild(elem)


  val tests = TestSuite {
    'd3_line_xy {
      //arrange
      case class TestDatum(v:Int)
      val data=js.Array[TestDatum](TestDatum(1),TestDatum(4))
      val testee = d3.svg.line[TestDatum]()
      //act
      val result=testee
        .x((d:TestDatum,i:Int) =>  d.v.toDouble )
        .y((d:TestDatum,i:Int) =>  d.v.toDouble )
      //assert
      d3.select(elem).datum(data)
        .append("path")
        .attr("d", result)

      val actual=dom.document.getElementsByTagName("path")
      assert( actual.length == 1)
      assert( actual.item(0).asInstanceOf[dom.Element].getAttribute("d") =="M1,1L4,4")
    }
    'd3_line_function1 {
      //arrange
      case class TestDatum(v:Int)
      val data=js.Array[TestDatum](TestDatum(1),TestDatum(4))
      val testee = d3.svg.line[TestDatum]()
      //act
      val result=testee
        .x((d:TestDatum) =>  d.v.toDouble )
        .y((d:TestDatum) =>  d.v.toDouble )
    }
    'd3_line_radial_issue_21 {
      val line = d3.svg.line.radial().interpolate("basis").tension(0).radius(100)
    }

  }
}

