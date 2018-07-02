package hackerrank

object Solution {
//  def printResult(a:String) : Unit = {
//    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
//    printWriter.println(a)
//    printWriter.close()
//  }
  def getPerimeter(matrix: Array[Array[Int]], rowCount: Int, colCount: Int): Array[Int] = {
    val matrixWithoutMiddle = matrix.zipWithIndex.map {case (row,rowIndex) =>
      if(rowIndex == 0) row
      else if (rowIndex == rowCount-1) row.reverse
      else Array(row(0), row(rowCount-1))
    }
    val matrixEdges = matrixWithoutMiddle.drop(1).dropRight(1)
    val rightMatrixEdge = matrixEdges.map(_(1))
    val leftMatrixEdge = matrixEdges.map(_(0)).reverse
    val matrixPerimeter = matrixWithoutMiddle.head ++ rightMatrixEdge ++ matrixWithoutMiddle.tail ++ leftMatrixEdge
    matrixPerimeter.flatMap{ case i: Int => Array(i); case ai: Array[Int] => ai }
  }
  // Complete the matrixRotation function below.
  def matrixRotation(matrix: Array[Array[Int]], colCount:Int,
                     rowCount:Int, rotations:Int) : Unit = {
//    val NormalMatrixPerimeter = getPerimeter(matrix, colCount, rowCount)
//
//    val InnerMatrix = matrix.zipWithIndex.map { case (row: Array[Int], rowIndex: Int) =>
////      if (rowIndex != 0 && rowIndex != rowCount - 1) Some(row.drop(1))
//      if(rowIndex == 0 || rowIndex == rowCount-1) Array()
//      else row.drop(1).dropRight(1)
//    }.filter(_!=Nil)
    val InnerMatrix = matrix.zipWithIndex.map {
      case (row: Array[Int], rowIndex: Int) => {
        val asdf =
          (if(rowIndex == 0 || rowIndex == rowCount-1) Array()
          else row.drop(1).dropRight(1))
        asdf match {
          case Array() => Array(1)
          case _ => asdf
        }
      }
    }
    val InnerMatrixPerimeter = getPerimeter(InnerMatrix, colCount, rowCount)
    println(InnerMatrix.deep.mkString(" "))

  }

  def main(args: Array[String]) {
    val stdin = Array(
      Array(1,2,3,4),
      Array(5,6,7,8),
      Array(9,10,11,12),
      Array(13,14,15,16)
    )

    val row = stdin.length
    val col = stdin.head.length
    val rot = 1

    matrixRotation(stdin, row, col, rot)
  }
}