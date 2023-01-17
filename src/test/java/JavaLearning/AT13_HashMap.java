package JavaLearning;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class AT13_HashMap {
    @Test
    public void test16() {
        // here we created an object of Hashmap and this hashmap takes Stringer and Integer as Key:Value
        HashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("Ricky",12);
        map.put("Bianca",8);
        map.put("Jasper",10);
        System.out.println("Print data in the map on the console : "+ map);
        int mapSize=map.size();
        System.out.println("hasmap size is : "+mapSize); //3
        //if statment
        if(map.containsKey("Bianca")){
            int KeyVal=map.get("Bianca");
            System.out.println("KeyVal : "+ KeyVal); //8
        }

    }
}