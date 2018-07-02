case class Event(location: String, dayOfWeek: String, sessionTimeInSeconds: Integer, source: String)

val event1 = Event("US", "Sun", 10, "Twitter")
val event2 = Event("China", "Mon", 15, "WeChat")
val event3 = Event("New Zealand", "Sun", 30, "Twitter")
val event4 = Event("US", "Tue", 5, "Facebook")
val event5 = Event("US", "Thu", 24, "LinkedIn")
val event6 = Event("US", "Sat", 60, "Facebook")

val events = List(event1, event2, event3, event4, event5, event6)

val locations = events.map(event => event.location)
val days = events.map(_.dayOfWeek)

val nestedList = List(List(1,2,3,4), List(5,6,7))
nestedList.map(aList => aList.map(_+1)).flatten
nestedList.flatMap(aList => aList.map(_+1))
