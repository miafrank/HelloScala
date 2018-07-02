object IdFactory {
  private var counter = 0
  def create(): Int = {
    counter += 1
    counter
  }
}

val newId = IdFactory.create()
val newerId: Int = IdFactory.create()
