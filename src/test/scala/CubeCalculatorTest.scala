import org.scalatest.funsuite.AnyFunSuite
    
   class CubeCalculatorTest extends AnyFunSuite {
       test("CubeCalculator.cube 3 should be 27") {
           assert(CubeCalculator.cube(3) === 27)
       }

       test("CubeCalculator.cube 4 should be 64") {
           assert(CubeCalculator.cube(4) === 64)
       }

       test("CubeCalculator.cube 0 should be 0") {
           assert(CubeCalculator.cube(0) === 0)
       }
   }