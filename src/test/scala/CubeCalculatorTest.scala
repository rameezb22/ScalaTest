class CubeCalculatorTest extends AnyFunSuite {
       test("CubeCalculator.cube 3 should be 27") {
           assert(CubeCalculator.cube(3) === 27)
       }

       test("CubeCalculator.cube 4 should be 63") {
           assert(CubeCalculator.cube(4) === 63)
       }
   }