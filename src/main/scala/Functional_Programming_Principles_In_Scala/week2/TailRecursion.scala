package Functional_Programming_Principles_In_Scala.week2

/**
  * Created by svegesna on 8/27/18.
  */
object TailRecursion extends App {

  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a>b) acc
      else loop(a + 1, f(a) + acc)
    }
    loop(a, 0)
  }

  println( "Returned Value : " + sum(x => x * x)( 3, 5) )

}
