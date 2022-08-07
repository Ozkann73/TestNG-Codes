package class02;

import org.testng.annotations.Test;

public class Priority {
    @Test(groups= "smoke")
    public void firstTest(){
        System.out.println("hello! 1st test");

    }
    @Test(priority = 1)
    public void secondTest(){

        System.out.println("hello! 2nd test");
    }

    @Test(priority = 3)
    public void thirdTest(){

        System.out.println("hello! 3rd test");
    }

    @Test(priority = 2)
    public void fourthTest(){
        System.out.println("hello! 4th test");
    }
}
