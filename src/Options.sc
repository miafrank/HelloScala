
def fraction(numer:Double, denom:Double): Option[Double] = {
  if (denom == 0)
    None
  else
    Some(numer/denom)
}

fraction(22,7)
fraction(22,0)

val pi = fraction(22,7) getOrElse "Oops, something went wrong"
val pi2 = fraction(22,0) getOrElse "Oops, something went wrong"

fraction(22,7) match {
  case Some(pi) => pi
  case None => "Something bad happened"
}

fraction(22,0) match {
  case Some(pi) => pi
  case None => "Something bad happened"
}

val stateCodes = Map("California" -> "CA", "New York" -> "NY", "Vermont" -> "VT")

val stateCode = util.Try(stateCodes("NoSuchState"))

stateCode match {
  case util.Success(code) => code
  case util.Failure(error) => "No such code"
}

val employees = Set("Nora", "Anna", "Nuala", "Callie", "Courtney")
employees.find(_ == "Nora")
employees.find(_ == "Courtney")
employees.find(_ == "Nora").get

val maybeCourtney = employees.find(_ == "Courtney")
if (maybeCourtney.isDefined) println(maybeCourtney.get)
employees.find(_ == "Courtney").getOrElse("Employee with name Courtney not found!")
