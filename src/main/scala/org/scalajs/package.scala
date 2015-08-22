package org.scalajs

import scalajs.js
//package object d3 extends d3.Base with scalajs.js.GlobalScope


package object d3 extends scalajs.js.GlobalScope {
  val d3: D3.Base = js.native
}