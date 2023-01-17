package LoopsNConditionalStatments;

import org.junit.Test;

public class AT03_DoWhileLoop {
    @Test
    public void DoWhileLoopLearn() {
     int TickerNum=45;

        do{
            System.out.println("Ticket Number is : "+ TickerNum);
            TickerNum++;
    }while(TickerNum<=50);
}
}