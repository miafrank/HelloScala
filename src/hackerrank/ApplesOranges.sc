val houseStart: Int = 7
val houseEnd: Int = 11
val appleTree = 5
val orangeTree = 15
val numberApples = 3
val numberOranges = 2
val appleDistances = Array(-2, 2, 1)
val orangeDistances = Array(5, -6)

def getCountItemsOnHouse(itemDistances: Array[Int], treeLocation: Int, houseS: Int, houseE: Int) : Int = {
  val itemFinalDistances = itemDistances.map(_+treeLocation)
  val houseRange = (houseS to houseE by 1).toArray
  val itemsOnHouse = itemFinalDistances.filter(houseRange.contains(_))
  itemsOnHouse.length
}

val applesOnHouse = getCountItemsOnHouse(appleDistances, appleTree, houseStart, houseEnd)
val orangesOnHouse = getCountItemsOnHouse(orangeDistances, orangeTree, houseStart, houseEnd)

println(applesOnHouse)
println(orangesOnHouse)


























