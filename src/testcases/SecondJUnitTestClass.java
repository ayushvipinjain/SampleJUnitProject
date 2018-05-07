package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import  org.junit.AfterClass;

public class SecondJUnitTestClass {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Inside BeforeClass - Executes Once before all test");
    }

    @Before
    public  void beforeEveryTests()
    {
        System.out.println("Inside Before Every test");
    }
    @Test
    public  void One()
    {
        System.out.println("Inside One");

    }

    @Test
    public  void Two()
    {
        System.out.println("Inside Two");
    }

    @Test
    public  void Three()
    {
        System.out.println("Inside Three");
    }

    @After
    public  void afterEveryTests()
    {
        System.out.println("Inside After Every test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Inside AfterClass - Executes Once after all test execution completed");
    }
}
