def compareStrings(s1:String, s2:String): Int = {
  if (s1==s2) 0
  else if (s1 > s2) -1
  else {1}
}

def curriedCompare(cmpFn:(String,String) => Int)(s1:String,s2:String):Int = {
  cmpFn(s1, s2)
}

curriedCompare(compareStrings)("abc","xyz")

val defaultCompare = curriedCompare(compareStrings)(_:String,_:String)

defaultCompare("abc", "xyz")

val mul = (x: Int, y: Int) => x *y
val mulOneAtATime = (x: Int) => ((y: Int) => x * y)
mul(6,7)
mulOneAtATime(6)(7)




