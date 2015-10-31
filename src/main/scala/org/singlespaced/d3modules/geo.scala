package org.singlespaced.d3modules



import scala.scalajs.js
import js.annotation.JSName
import org.scalajs.dom
import js.`|`

@JSName("d3.geo")
@js.native
trait GeoObject extends js.Object {
  import geoModule._

  def path(): Path = js.native

  def graticule(): Graticule = js.native

  def circle(): Circle = js.native

  def area(feature: js.Any): Double = js.native

  def centroid(feature: js.Any): js.Tuple2[Double, Double] = js.native

  def bounds(feature: js.Any): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native

  def distance(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = js.native

  def length(feature: js.Any): Double = js.native

  def interpolate(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Function1[Double, js.Tuple2[Double, Double]] = js.native

  def rotation(rotate: js.Tuple2[Double, Double] | js.Tuple3[Double, Double, Double]): Rotation = js.native

  def stream(`object`: js.Any, listener: Listener): Unit = js.native

  def transform(methods: TransformMethods): Transform = js.native

  def clipExtent(): ClipExtent = js.native

  def projection(raw: RawInvertibleProjection): InvertibleProjection = js.native

  def projection(raw: RawProjection): Projection = js.native

  def projectionMutator(factory: js.Function): js.Function = js.native

  def albers(): ConicProjection = js.native

  def albersUsa(): ConicProjection = js.native

  def azimuthalEqualArea(): InvertibleProjection = js.native

  def azimuthalEquidistant(): InvertibleProjection = js.native

  def conicConformal(): ConicProjection = js.native

  def conicEqualArea(): ConicProjection = js.native

  def conicEquidistant(): ConicProjection = js.native

  def equirectangular(): InvertibleProjection = js.native

  def gnomonic(): InvertibleProjection = js.native

  def mercator(): InvertibleProjection = js.native

  def orthographic(): InvertibleProjection = js.native

  def stereographic(): InvertibleProjection = js.native

  def transverseMercator(): InvertibleProjection = js.native

  //forwarders
  //TODO define forwarders

}
package geoModule {
  @js.native
  trait Path extends js.Object {
    def apply(feature: js.Any, index: Double): String = js.native
    def area(feature: js.Any): Double = js.native
    def centroid(feature: js.Any): js.Tuple2[Double, Double] = js.native
    def bounds(feature: js.Any): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
    def projection(): Transform | js.Function1[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
    def projection(stream: Transform): Path = js.native
    def projection(projection: js.Function1[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Path = js.native
    def pointRadius(): Double | js.Function2[js.Any, Double, Double] = js.native
    def pointRadius(radius: Double): Path = js.native
    def pointRadius(radius: js.Function2[js.Any, Double, Double]): Path = js.native
    def context(): dom.CanvasRenderingContext2D = js.native
    def context(context: dom.CanvasRenderingContext2D): Path = js.native
  }
@js.native
trait Graticule extends js.Object {
  def apply(): js.Dynamic = js.native
  def lines(): js.Array[js.Any] = js.native
  def outline(): js.Dynamic = js.native
  def extent(): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  def extent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Graticule = js.native
  def majorExtent(): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  def majorExtent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Graticule = js.native
  def minorExtent(): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  def minorExtent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Graticule = js.native
  def step(): js.Tuple2[Double, Double] = js.native
  def step(step: js.Tuple2[Double, Double]): Graticule = js.native
  def majorStep(): js.Tuple2[Double, Double] = js.native
  def majorStep(step: js.Tuple2[Double, Double]): Graticule = js.native
  def minorStep(): js.Tuple2[Double, Double] = js.native
  def minorStep(step: js.Tuple2[Double, Double]): Graticule = js.native
  def precision(): Double = js.native
  def precision(precision: Double): Graticule = js.native
}

  @js.native
  trait Circle extends js.Object {
    def apply(args: js.Any*): js.Dynamic = js.native
    def origin(): js.Tuple2[Double, Double] | js.Function = js.native
    def origin(origin: js.Tuple2[Double, Double]): Circle = js.native
    def origin(origin: js.Function): Circle = js.native
    def angle(): Double = js.native
    def angle(angle: Double): Circle = js.native
    def precision(): Double = js.native
    def precision(precision: Double): Circle = js.native
  }

@js.native
trait Rotation extends js.Object {
  def apply(location: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  def invert(location: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
}

@js.native
trait Listener extends js.Object {
  def point(x: Double, y: Double, z: Double): Unit = js.native
  def lineStart(): Unit = js.native
  def lineEnd(): Unit = js.native
  def polygonStart(): Unit = js.native
  def polygonEnd(): Unit = js.native
  def sphere(): Unit = js.native
}

@js.native
trait TransformMethods extends js.Object {
  def point(x: Double, y: Double, z: Double): Unit = js.native
  def lineStart(): Unit = js.native
  def lineEnd(): Unit = js.native
  def polygonStart(): Unit = js.native
  def polygonEnd(): Unit = js.native
  def sphere(): Unit = js.native
}

@js.native
trait Transform extends js.Object {
  def stream(stream: Listener): Listener = js.native
}

@js.native
trait ClipExtent extends Transform {
  def extent(): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  def extent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): ClipExtent = js.native
}

  @JSName("d3.geo.azimuthalEqualArea")
  @js.native
object azimuthalEqualArea_ extends js.Object {
    def raw(lambda: Double, phi: Double): js.Tuple2[Double, Double] = js.native

@JSName("d3.geo.azimuthalEqualArea.raw")
@js.native
object raw extends js.Object {
  def invert(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
}

}

  @JSName("d3.geo.azimuthalEquidistant")
  @js.native
object azimuthalEquidistant_ extends js.Object {

  def raw(lambda: Double, phi: Double): js.Tuple2[Double, Double] = js.native
@JSName("d3.geo.azimuthalEquidistant.raw")
@js.native
object raw extends js.Object {
  def invert(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
}

}


@JSName("d3.geo.conicConformal")
@js.native
object conicConformal_ extends js.Object {
  def raw(phi0: Double, phi1: Double): RawInvertibleProjection = js.native
}

@JSName("d3.geo.conicEqualArea")
@js.native
object conicEqualArea_ extends js.Object {
  def raw(phi0: Double, phi1: Double): RawInvertibleProjection = js.native
}

@JSName("d3.geo.conicEquidistant")
@js.native
object conicEquidistant_ extends js.Object {
  def raw(phi0: Double, phi1: Double): RawInvertibleProjection = js.native
}


@JSName("d3.geo.equirectangular")
@js.native
object equirectangular_ extends js.Object {
  def raw(lambda: Double, phi: Double): js.Tuple2[Double, Double] = js.native
  @JSName("d3.geo.equirectangular.raw")
  @js.native
  object raw extends js.Object {
    def invert(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  }
}


@JSName("d3.geo.gnomonic")
@js.native
object gnomonic_ extends js.Object {

  def raw(lambda: Double, phi: Double): js.Tuple2[Double, Double] = js.native
  @JSName("d3.geo.gnomonic.raw")
  @js.native
  object raw extends js.Object {
    def invert(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  }

}


@JSName("d3.geo.mercator")
@js.native
object mercator_ extends js.Object {
  def raw(lambda: Double, phi: Double): js.Tuple2[Double, Double] = js.native
    @JSName("d3.geo.mercator.raw")
    @js.native
    object raw extends js.Object {
      def invert(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
    }

  }


@JSName("d3.geo.orthographic")
@js.native
object orthographic_ extends js.Object {
  def raw(lambda: Double, phi: Double): js.Tuple2[Double, Double] = js.native
  @JSName("d3.geo.orthographic.raw")
  @js.native
  object raw extends js.Object {
    def invert(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  }

}


@JSName("d3.geo.stereographic")
@js.native
object stereographic_ extends js.Object {
  def raw(lambda: Double, phi: Double): js.Tuple2[Double, Double] = js.native
  @JSName("d3.geo.stereographic.raw")
  @js.native
  object raw extends js.Object {
    def invert(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  }

}


@JSName("d3.geo.transverseMercator")
@js.native
object transverseMercator_ extends js.Object {
  def raw(lambda: Double, phi: Double): js.Tuple2[Double, Double] = js.native
  @JSName("d3.geo.transverseMercator.raw")
  @js.native
  object raw extends js.Object {
    def invert(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  }

}

@js.native
trait Projection extends js.Object {
  def apply(location: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  def rotate(): js.Tuple3[Double, Double, Double] = js.native
  def rotate(rotation: js.Tuple3[Double, Double, Double]): Projection = js.native
  def center(): js.Tuple2[Double, Double] = js.native
  def center(location: js.Tuple2[Double, Double]): Projection = js.native
  def translate(): js.Tuple2[Double, Double] = js.native
  def translate(point: js.Tuple2[Double, Double]): Projection = js.native
  def scale(): Double = js.native
  def scale(scale: Double): Projection = js.native
  def clipAngle(): Double = js.native
  def clipAngle(angle: Double): Projection = js.native
  def clipExtent(): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  def clipExtent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Projection = js.native
  def precision(): Double = js.native
  def precision(precision: Double): Projection = js.native
  def stream(listener: Listener): Listener = js.native
}

@js.native
trait InvertibleProjection extends Projection {
  def invert(point: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
}

@js.native
trait ConicProjection extends InvertibleProjection {
  def parallels(): js.Tuple2[Double, Double] = js.native
  def parallels(parallels: js.Tuple2[Double, Double]): ConicProjection = js.native
  override def rotate(): js.Tuple3[Double, Double, Double] = js.native
  override def rotate(rotation: js.Tuple3[Double, Double, Double]): ConicProjection = js.native
  override def center(): js.Tuple2[Double, Double] = js.native
  override def center(location: js.Tuple2[Double, Double]): ConicProjection = js.native
  override def translate(): js.Tuple2[Double, Double] = js.native
  override def translate(point: js.Tuple2[Double, Double]): ConicProjection = js.native
  override def scale(): Double = js.native
  override def scale(scale: Double): ConicProjection = js.native
  override def clipAngle(): Double = js.native
  override def clipAngle(angle: Double): ConicProjection = js.native
  override def clipExtent(): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  override def clipExtent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): ConicProjection = js.native
  override def precision(): Double = js.native
  override def precision(precision: Double): ConicProjection = js.native
}

@js.native
trait RawProjection extends js.Object {
  def apply(lambda: Double, phi: Double): js.Tuple2[Double, Double] = js.native
}

@js.native
trait RawInvertibleProjection extends RawProjection {
  def invert(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
}

}

