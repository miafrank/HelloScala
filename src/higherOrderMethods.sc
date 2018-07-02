val weekDays = List("Mon", "Tue", "Wed", "Thu", "Fri")

weekDays.foreach(println(_))

weekDays.map(_ == "Mon")

val IsManicMonday = (x:String) => {x == "Mon"}:Boolean

weekDays.map(IsManicMonday)

weekDays.filter(IsManicMonday)

weekDays.partition(IsManicMonday)

weekDays.sortBy(_(0))
weekDays.sortBy(_(1))

