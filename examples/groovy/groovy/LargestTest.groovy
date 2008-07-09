package groovy
import examples.Largest;

class LargestTest extends GroovyTestCase {
  public void testNullArray(){
    shouldFail(NullPointerException) {
      Largest.largest(null)
    }
  }

  public void testEmptyArray(){
    shouldFail(RuntimeException) {
      Largest.largest([] as int[])
    }
  }

  public void testFirstIsLargest(){
    assertEquals 3, Largest.largest([3,2,1] as int[])
  }

  public void testLastIsLargest() {
    assertEquals 3, Largest.largest([1,2,3] as int[])
  }

}