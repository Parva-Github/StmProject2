package org.parva.scala

case class Trip(
                 routeId: Int,
                 serviceId: String,
                 tripId: String,
                 tripHeadsign: String,
                 directionId:Int ,
                 shapeId:Int,
                 wheelchairAccessible: Int

               )
object Trip {
  def toCsv(rip: Trip): String = {
    rip.routeId+ "," +
      rip.serviceId + "," +
      rip.tripId+ "," +
      rip.tripHeadsign + "," +
      rip.directionId + "," +
      rip.shapeId + "," +
      rip.wheelchairAccessible
  }
}
