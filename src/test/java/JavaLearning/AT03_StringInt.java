package JavaLearning;
import org.junit.Test;

public class AT03_StringInt {


    @Test
    public void test03(){
        //declare local vraibales
        //integers
        int i=10;
        int j=20;
        int k = i+j;
        System.out.println("K value is : " + k);

    }
    @Test
    public void test04(){
    //declare local variables
        // Strings
        String FName="Software";
        String LName = "TestLab";
        String FullName= FName+LName;
        System.out.println("My Full Name is : "+FullName );

    }
}
