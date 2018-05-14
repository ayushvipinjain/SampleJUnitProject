package testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FirstJUnitTestClass.class,
        SecondJUnitTestClass.class,
        AssertionExampleClass.class,
        ParameterizedTest.class
})
public class TestSuiteCreationClass {


}


