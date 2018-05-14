package testcases;

import com.sun.javafx.scene.traversal.ContainerTabOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import javax.jws.Oneway;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTest {


    private  String userName;
    private  String Password;
    public ParameterizedTest(String userName,String Password){

        this.userName=userName;
        this.Password=Password;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> GetParameters()
    {
        Object[][] data = new Object[3][2];
        data[0][0]="First";
        data[0][1]="User";
        data[1][0]="Second";
        data[1][1]="Usr";
        data[2][0]="Third";
        data[2][1]="user";
        return Arrays.asList(data);
    }

    @Test
    public void ParameterizedTestExample()
    {
        System.out.println(String.format( "UserName = %s Passowrd = %s",userName,Password));

    }


}


