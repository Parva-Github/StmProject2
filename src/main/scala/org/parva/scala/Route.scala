package org.parva.scala

case class Route(
                  routeId: Int,
                  agencyId: String,
                  routeShortName: String,
                  routeLongName: String,
                  routeType: String,
                  routeUrl: String,
                  routeColor: String
                )

object Route {
  def toCsv(oute: Route): String = {
    oute.routeId + "," +
      oute.agencyId + "," +
      oute.routeShortName + "," +
      oute.routeLongName + "," +
      oute.routeType + "," +
      oute.routeUrl + "," +
      oute.routeColor
  }
}

case class TripRoute(trip: Trip, route: Route)

case class EnrichedTrip(tripRoute: TripRoute, calendar: Calendar)