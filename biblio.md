This list is eclectic, not exhaustive.

## Groovy Tools
* [Groovy - Unit Testing](http://groovy.codehaus.org/Unit+Testing). Unit testing is built in with Groovy. This landing page is a high Google hit but could use some love.

## Java Tools
* [EasyMock](http://www.easymock.org/) is a popular mock object framework for Java. The [2.4 README](http://www.easymock.org/EasyMock2_4_Documentation.html) is a good introduction to key features.
* [JUnit](http://www.junit.org/). The dominant test framework. Start here.
* [TestNG](http://testng.org/doc/) was built to address limitations in JUnit. It is much more feature-rich. When you are just getting started, this won't matter much, but as your test suite becomes larger TestNG's advanced features have more impact.

## Ruby Tools
TBD

## Additional Reading
* A bunch of people. [Manifesto for Agile Softare Development](http://agilemanifesto.org/). The manifesto doesn't have the word "test", but try to live by it and you will find yourself testing.  
* Almiray, Andres [Follow up on Writing unit tests using Groovy](http://groovy.dzone.com/news/follow-writing-unit-tests-usin). Continuing where Malmsten left off, shows how to use builders to create test data.
* Beust, Cedric. [Don't Call Super](http://beust.com/weblog/archives/000077.html). It can be difficult to reuse code across JUnit test cases. Inheritance more than one-deep from TestCase is fragile and error-prone.
* Beust, Cedric. [Using annotation inheritance for testing](http://www.beust.com/weblog/archives/000170.html). You might want to explicitly state dependencies between tests, and how to do it in TestNG.
* Fields, Jay [Developer Testing and the Importance of Context](http://blog.jayfields.com/2008/06/developer-testing-and-importance-of.html). Links to about a dozen articles that Jay has written about testing. Read each, and consider how/whether they would apply on your project.
* Ford, Neal. [Building Bridges without Engineering](http://memeagora.blogspot.com/2007/11/building-bridges-without-engineering.html). Testing is the engineering rigor of software development.
* Fowler, Martin. [Mocks Aren't Stubs](http://martinfowler.com/articles/mocksArentStubs.html). Mocks are part of a larger family of test objects, that can be used to support testing both state and behavior.
* Jeffries, Ron. [(Software Download Page)](http://www.xprogramming.com/software.htm). Descriptions and download links for testing tools in a variety of languages.
* Malmsten, Thomas [Writing unit tests using Groovy](http://groovy.dzone.com/news/writing-unit-tests-using-groov). Groovy is a much easier language to work in than Java.
* North, Dan [Introducing BDD](http://dannorth.net/introducing-bdd). Words matter, and the difference between "behavior" and "test" is important. BDD evolved from TDD, but it has become something quite different, and can drive the way you think about software.
* Rudolph, Jason. [A Brief Discussion of Code Coverage Types](http://jasonrudolph.com/blog/2008/06/10/a-brief-discussion-of-code-coverage-types/). Understand the different types of code coverage, and how you can use them *in conjunction with* other techniques to improve your tests.
* Rudolph, Jason. [Testing Anti-Patterns: Incidental Coverage](http://jasonrudolph.com/blog/2008/06/17/testing-anti-patterns-incidental-coverage/). Code coverage can go wrong: lines of code are encountered, but not tested in any meaningful way.
* Rudolph, Jason. [Testing Anti-Patterns: Overspecification](http://jasonrudolph.com/blog/2008/07/01/testing-anti-patterns-overspecification/). You can have too much testing. If tests specify details irrelevant to the real purpose of the code, they make it unnecessarily difficult to refactor the code in the future.
* Rudolph, Jason. [Testing Anti-Patterns: Underspecification](http://jasonrudolph.com/blog/2008/07/08/testing-anti-patterns-underspecification/). Tests often do too little, and cover only part of the behavior. It is impossible to test every case, but it is critical that you develop a sense for testing boundary cases.
