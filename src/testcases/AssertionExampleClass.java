package testcases;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import javax.print.DocFlavor;

public class AssertionExampleClass {

    @Rule
    public ErrorCollector errCollector = new  ErrorCollector();


    @Test
    public void TestAsserts()
    {
        String abc="Test",xyz="Tests";
        System.out.println("Before Execute Assert for Test");
            Assert.assertEquals(abc,xyz);
System.out.println("Will Not Execute");
    }

    @Test
    public void TestAssertsWIthoutRecordingErrors()
    {
        String abc="Test",xyz="Tests";
        System.out.println("Before Execute Assert");
        try{
            Assert.assertEquals(abc,xyz);
        }
        catch (Throwable throwable) {

        }
        System.out.println("Will Execute");
    }

    @Test
    public void TestAssertsWithRecordingErrors()
    {
        String abc="Test",xyz="Tests";

        try{
            Assert.assertEquals(abc,xyz);
        }
        catch (Throwable t){

            errCollector.addError(t);
        }

        Assert.assertTrue(true);

    }

}
