val someNumbers = collection.mutable.Buffer(10,20,30,40,50)

val listBuilder = List.newBuilder[Int]

someNumbers.foreach(listBuilder+=_)

val reconstructedList = listBuilder.result

