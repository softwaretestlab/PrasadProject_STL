package JavaLearning;

import org.junit.Test;

public class AT10_ArrayLoop {
    @Test
    public void test14() {

        // variable  age is an array
        int[] age = {10, 20, 30, 40, 50, 60};
        // this length willl tell the total numer of items present in an array
        int ArraySize = age.length;
        System.out.println("length of array is : "+ArraySize);  //6
        //for loop
        for(int i=0; i<ArraySize;i++){
            System.out.println("Array index is : "+i+" its value is : "+age[i]);
        }

    }
}
