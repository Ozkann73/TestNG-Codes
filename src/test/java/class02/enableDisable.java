package class02;

import org.testng.annotations.Test;

public class enableDisable {
    @Test(enabled=false)
    public void firstTest(){
        System.out.println("hello! 1st test");

    }
    @Test
    public void secondTest(){

        System.out.println("hello! 2nd test");
    }

    @Test(groups="smoke")
    public void thirdTest(){

        System.out.println("hello! 3rd test");
    }
}
