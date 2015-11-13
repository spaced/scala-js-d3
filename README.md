scala-js-d3
===============

Static types for the d3 API for [Scala.js](http://www.scala-js.org/) programs.

Release 0.0.1
-------------
- Strongly typed with tuples, dictionaries and functions
- Ops implicits


Warning
-------
Pre-alpha: types, parameters and defaults may not work as expected.


Usage
-----
Enjoy the types available in `org.scalajs.d3`:
```
package example

import scala.scalajs.js
import org.scalajs.dom
import org.singlespaced.d3js._

object ScalaJSExample extends js.JSApp {

  def main() {
    val sel=d3.selectAll("div").data(js.Array(5,2,4,6))
    sel.style("width", (d:Int) => d*2 )
  }

```

more about [d3js.org](http://d3js.org)



scalajs-d3 0.1-SNAPSHOT is for Scala.js 0.6.5, with both Scala 2.10 and 2.11.

License
-------

Copyright (c) 2002-2015

All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

*   Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.
*   Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.
*   Neither the name of the EPFL nor the names of its contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
