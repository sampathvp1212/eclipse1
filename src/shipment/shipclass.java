package shipment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class shipclass
{

	public static void main(String[] args) throws FindFailed, InterruptedException 
	{
			        
		        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://coreapp-weekly.vvsandbox.com/");
		        
		        WebElement username=driver.findElement(By.id("uname"));
		        WebElement password=driver.findElement(By.id("pass"));
		        WebElement login=driver.findElement(By.xpath("//input[@Value='SIGN IN NOW']"));
		        hellp odakgjalkl
		        username.sendKeys("IrfanullahAnsari");
		        password.sendKeys("irfan@123");
		        Thread.sleep(3000);
		        login.click();
		        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		        driver.findElement(By.xpath("//*[@id='navigation']/div/ul/li[5]/a/span[1]")).click();
		        driver.findElement(By.xpath("//div[@id='navigation']/div[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]")).click();
		        driver.findElement(By.xpath("//input[@class='form-control datepick1']"));
		        
		        //Screen s=new Screen();
		        //Pattern p=new Pattern("E:\images\1.png");
		        //s.click(p);
	}
             		        
}