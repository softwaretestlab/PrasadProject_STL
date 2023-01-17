package JavaOOPSconcepts;

import org.junit.Test;

public class AT04_Encapsulation02 {
    @Test
    public void envMethod03() {
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        //void
        obj.encMethod01(60,70);
        obj.encMethod01(50,50);

// here we are using the value from return statement into code
        int x = obj.encMethod02(90,90);
        int z = x+90;
        System.out.println("Value of z is : "+ z);


    }
}
