package org.singlespaced.d3js

import org.scalajs.dom
import utest._

import scala.scalajs.js

object LayoutTest extends TestSuite {

  val elem = dom.document.createElement("p")
  dom.document.body.appendChild(elem)

  val tests = TestSuite {

    'd3_forcelayout_link_source {
      //arrange
      val node1 = "one"
      val node2 = "two"
      //act
      val testee=new Link[String] {
        def source=node1
        def target=node2
      }
      //assert
      val actualSource=testee.asInstanceOf[js.Dynamic].source
      assert(node1 == actualSource)
    }

    'd3_forcelayout_node_afterstart_runtime_attr {
      //arrange
      case class Test(id:String) extends forceModule.Node
      val node1 = new Test("one")
      val node2 = new Test("two")
      val link = new Link[Test] {
        def source=node1
        def target=node2
      }

      val force = d3.layout.force[Test, Link[Test]]()
        .nodes(js.Array(node1,node2))
        .links(js.Array(link))
        .charge(-400)
        .linkDistance(120)
        .size(js.Tuple2(100, 100))
      //act
      force.start()
      //assert
      val actualX=node1.asInstanceOf[js.Dynamic].x

      assert( actualX.isInstanceOf[Double] )
      assert( node1.x.isInstanceOf[Double] )
      assert( node1.x == actualX )
    }


  }
}

