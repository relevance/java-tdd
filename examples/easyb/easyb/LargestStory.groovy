import examples.Largest;

scenario "Calculating the largest of an array of integers",{
  when "null is passed"
  then "an exception should be thrown", {
    ensureThrows(NullPointerException.class) {
      Largest.largest(null)
    }
  }
  when "an empty array is passed"
  //Issues:
  //passempty is still in scope here...
  //reported exception is not helpful
  //report is number of scenarios, not number of ensures
  then "an exception should be thrown", {
    ensureThrows(RuntimeException.class) {
      Largest.largest([])
    }
  }
  when "the largest value is first"
  then "it is returned", {
    Largest.largest([3,1,2] as int[]).shouldBe 3 
  }
  when "the largest value is last"
  then "it is returned", {
    Largest.largest([3,1,2,5] as int[]).shouldBe 5 
  }
}


