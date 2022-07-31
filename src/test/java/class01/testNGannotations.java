package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGannotations {
// writing down my first test case
    @Test // Test annotation is used to indicate that this is a test case
    public void firstTestCase (){

        System.out.println("Hey I am the first test case");
    }

    @Test
    public void secondTestCase(){
        System.out.println("I am the second test case");
    }

    @Test
    public void thirdTestCase (){
        System.out.println("I am the third test case");
    }
    @BeforeMethod
    public void beforeMethod (){
        System.out.println("I am the before Method");
    }
    @AfterMethod
    public void afterMethod (){
        System.out.println("I am after method");
    }
}
