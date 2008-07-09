package demo.iphone;

import junit.framework.Test;
import junit.framework.TestSuite;

public class SuiteTest {
  
   public static Test suite(){
     TestSuite testSuite = new TestSuite();
     testSuite.addTestSuite(ContactTest.class);
     testSuite.addTestSuite(IPhoneTest.class);
     testSuite.addTestSuite(IPhoneHelperTest.class);
     testSuite.addTestSuite(PhoneNumberTest.class);
     testSuite.addTestSuite(AddressGroovyTest.class);
     return testSuite;
   }
}
