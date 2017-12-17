package calculatorDemo

/*
 * class Rational takes two parameters n and d which represent the numerator and denominator of the fraction.
 */
class Calculator(n: Int, d: Int ){
 
//  Auxiliary constructor to work with whole numbers which are also rational numbers i.e. (n/1)
def this(n: Int) = this(n, 1)

private val g = gcd(n, d)

val numerator: Int = n / g

val denominator: Int = d / g


/* This method takes rational as argument
 * To compute 1/2+ 2/3 , you first obtain the same denominator by multiplying both parts of the left operand with 3 and both parts of the right operand with 2.
 * This gives 3/6 + 4/6 . After that you add the two numerators, which gives 7/6
 */
def +(value: Calculator): Calculator =new Calculator(numerator * value.denominator + value.numerator * denominator,denominator * value.denominator)


//Overloading + method which  takes integer as argument
def +(value: Int): Calculator = this + new Calculator(value)

//This method takes rational as argument
def -(value: Calculator): Calculator =new Calculator(numerator * value.denominator - value.numerator * denominator,denominator * value.denominator)

//Overloading - method which  takes integer as argument
def -(value: Int): Calculator = this - new Calculator(value)

/*This method takes rational as argument
 * Multiplying two rational numbers is done by multiplying their numerators and multiplying their denominators
 */
def *(value: Calculator): Calculator =new Calculator(numerator * value.numerator, denominator * value.denominator)

//Overloading * method which  takes integer as argument
def *(value: Int): Calculator = this * new Calculator(value)

/*This method takes rational as argument
 *Division is done by swapping numerator and denominator of the right operand and then multiplying.
 */
def /(value: Calculator): Calculator =new Calculator(numerator * value.denominator, denominator * value.numerator)

//Overloading / method which  takes integer as argument
def /(value: Int): Calculator = this / new Calculator(value)

private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)



//Overriding toString method of objects class, which is invoked when we print an object
override def toString() = numerator+"/"+denominator
}