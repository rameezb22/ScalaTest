import org.scalatest.funsuite.AnyFunSuite
    
   class SquareCalculatorTest extends AnyFunSuite {
       test("SquareCalculator.square 2 should be 4") {
           assert(SquareCalculator.square(2) === 4)
       }

       test("SquareCalculator.square 4 should be 16") {
           assert(SquareCalculator.square(4) === 16)
       }

       test("SquareCalculator.square 8 should be 64") {
           assert(SquareCalculator.square(8) === 64)
       }
   }