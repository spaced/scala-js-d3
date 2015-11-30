package org.singlespaced.d3js

import org.scalajs.dom
import utest._

import scala.scalajs.js

trait TestNode extends forceModule.Node

trait TestLink extends forceModule.Link[TestNode]

object LayoutTest extends TestSuite {


  val elem = dom.document.createElement("p")
  dom.document.body.appendChild(elem)

  val tests = TestSuite {
    'd3_forcelayout_nodes_links {

      val nodes = js.Array[TestNode]()
      val links = js.Array[TestLink]()

      var force = d3.layout.force[TestNode, TestLink]()
        .nodes(nodes)
        .links(links)
      //act
      force.start()

    }

  }
}

