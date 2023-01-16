package JavaLearning;

import org.junit.Test;

import java.util.ArrayList;

public class AT11_ArrayList {
    @Test
    public void ArrayList() {
        //syntax of arraylist
        ArrayList<String> ListOfCars = new ArrayList<>();
        // let add items into arraylist
        ListOfCars.add("BMW");
        ListOfCars.add("Toyota");
        ListOfCars.add("Benz");
        ListOfCars.add("RangeRover");
        ListOfCars.remove(1);
        System.out.println("Cars inside ListOfCars : " + ListOfCars);
        //index count
        int CarsCount =ListOfCars.size();
        System.out.println("CarsCount : "+CarsCount); //4
        //for loop
        for(int i=0;i<CarsCount;i++){
            System.out.println("Array index is : "+i+" and its value is : "+ListOfCars.get(i));

        }
    }
}