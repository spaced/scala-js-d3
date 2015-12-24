package org.singlespaced.d3js

import org.scalajs.dom
import utest._

import scala.scalajs.js

object ScaleTest extends TestSuite {


  val elem=dom.document.createElement("p")
  dom.document.body.appendChild(elem)


  val tests = TestSuite {
    'd3_timeScale_withZoomBehavior {
      //arrange
      val timeScale = d3.time.scale().range(js.Array(0,  1000))
      val zoomBehavior = d3.behavior.zoom()
      //act
      zoomBehavior.x(timeScale)
    }


  }
}

