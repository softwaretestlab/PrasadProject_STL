package JavaLearning;

import org.junit.Test;

public class AT05_createAnObjectAndUseIt01 {

    @Test
    public void test07(){
        // using classname we create an object [class obj = new class();]
        AT05_createAnObjectAndUseIt01 obj = new AT05_createAnObjectAndUseIt01();
       // using this obj object we can call other methods [test08, test09] into [test07]
        obj.test08(); //30
        obj.test09(); //SoftwareTestLab
    }


    public void test08(){
        int i=10;
        int j=20;
        int k = i+j;
        System.out.println("K value is : " + k); //30
    }


    public void test09(){
        String FName="Software";
        String LName = "TestLab";
        String FullName= FName+LName;
        System.out.println("My Full Name is : "+FullName ); //SoftwareTestLab
    }
}
