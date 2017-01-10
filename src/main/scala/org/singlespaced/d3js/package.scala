package org.singlespaced


import scala.scalajs.js
import scala.scalajs.js.`|`

package object d3js {
  type Primitive = Double | String | Boolean
  val d3: D3Static = js.Dynamic.global.d3.asInstanceOf[D3Static]
}