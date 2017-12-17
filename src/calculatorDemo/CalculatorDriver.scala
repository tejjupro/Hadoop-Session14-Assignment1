/*
 * Driver program to implement calculator which works with rational numbers and whole numbers.
 * 
 */

package calculatorDemo

object CalculatorDriver {
  def main(args: Array[String]): Unit = {
    
    println("Calculator demo Operation")
    
    println("Rational Number Demo: ")
    //Creating object with rational numbers
    val rationalObjectX = new Calculator(20, 5);
    
    //Creating object with rational numbers
    val rationalObjectY = new Calculator(25, 5)
    
    //Perfrom calculator operations
    println((rationalObjectX.+(rationalObjectY)).*(rationalObjectX))
   
    println("Whole Number Demo: ")
    

    //Creating object with rational numbers
     val RationalX = new Calculator(2, 3)

     val wholeObjectY = RationalX * RationalX
    

     //calling method which takes only integer values

     val wholeObjectZ = wholeObjectY * 2
     
     //printing the output
     println(wholeObjectZ)
  }
}