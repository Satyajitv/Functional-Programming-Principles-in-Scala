package Functional_Programming_Principles_In_Scala.week2

/**
  * Created by svegesna on 8/27/18.
  */
object product extends App {

   def product(f: Int => Int)(a:Int, b:Int): Int = {
     if (a>b) 1
     else f(a) * product(f)(a+1 ,b)
   }

  def factorial(n:Int) = product(x => x)(1, n)

  println(product(x => x * x)(3, 7))
  println(factorial(8))

  //Generic method for both product and sum

  def mapReduce(f: Int => Int, combine: Int => Int, zero:Int)(a:Int, b:Int):Int = {
    if (a>b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
  }

}
