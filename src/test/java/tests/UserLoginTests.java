package tests;

import org.testng.annotations.Test;
import pageObjects.LoginPage;
import testBase.TestBase;

public class UserLoginTests extends TestBase {
    LoginPage loginPage=new LoginPage();
   // https://github.com/prakashnarkhede/Advanced_Selenium_Test_Automation_Framework/tree/master/src/test/resources
    @Test
    public void Testcase1() throws InterruptedException {
        Thread.sleep(2);
        loginPage.login("pravina","pravina@gmail.com");
        System.out.println("First");
    }
//    @Test
//    public void Testcase2(){
//        System.out.println("second");
//    }
//    @Test
//    public void Testcase3(){
//        System.out.println("Three");
//    }

}
