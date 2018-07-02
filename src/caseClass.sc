case class Course(title: String, author: String)

val scalaCourse = Course("Scala", "Nora")

val anotherScalaCourse = Course("Scala", "Nora")

scalaCourse == anotherScalaCourse

scalaCourse.title
scalaCourse.author

val newScalaCourse = scalaCourse.copy(title = "New Scala Course")
newScalaCourse.author



