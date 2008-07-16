import "examples.Largest"

describe "Largest" do
  it "should throw a NullPointerException for null array" do
    lambda { Largest.largest(nil) }.should raise_error(java.lang.NullPointerException)
  end
  
  it "should throw ArgumentError for empty array" do
    lambda { Largest.largest(Java::int[0].new)}.should raise_error(java.lang.RuntimeException)
  end
  
  it "should return the first element if it is largest" do
    Largest.largest([3,2,1].to_java(:int)).should == 3
  end
  
  it "should return the last element if it is the largest" do
    Largest.largest([1,2,3].to_java(:int)).should == 3
  end
end
