val someNumbers = List(10,20,30,40,50, 60)

someNumbers.scanRight(0)(_ - _)

someNumbers.scanLeft(10)(_ - _)

someNumbers.foldRight(0)(_ - _)

someNumbers.foldLeft(10)(_ - _)

someNumbers.reduceRight(_ - _)

someNumbers.reduceLeft(_ - _)





