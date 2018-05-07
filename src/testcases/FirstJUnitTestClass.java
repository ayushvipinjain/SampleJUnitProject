package testcases;

import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Test;

public class FirstJUnitTestClass {

    @Test
    @Ignore
    public void First()
    {
        PrintMessage("Inside First Test");
    }

    @Test
    public void Second()
    {
        PrintMessage("Inside Second Test");
    }

    @Test
    public void Third()
    {
        PrintMessage("Inside Third Test");
    }

    private void PrintMessage(String message)
    {
        System.out.println("Initiate Printing Messages");
        System.out.println(message);
        System.out.println("End Printing Messages");
    }
}
