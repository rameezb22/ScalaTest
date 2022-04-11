class CubeCalculatorTest extends org.scalatest.funsuite.AnyFunSuite {

  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("CubeCalculator.cube 2 should be 8") {
           assert(CubeCalculator.cube(2) === 8)
       }

    test("CubeCalculator.cube 4 should be 63") {
           assert(CubeCalculator.cube(4) === 63)
       }     


}
