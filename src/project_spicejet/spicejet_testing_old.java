package project_spicejet;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class spicejet_testing_old {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the name to register in GUVI website");
//        String inputname = scanner.next();
//        System.out.print("Enter the email to register in GUVI website");
//        String inputemail = scanner.next();
//        System.out.print("Enter the password to register in GUVI website");
//        String inputpassword = scanner.next();
		String url="https://spiceclub.spicejet.com/signup";
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		  driver.get(url);
		  driver.manage().window().maximize();
		  		  WebElement title=driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/select"));//to be updated
		  		  title.sendKeys("Mr");
		  		  WebElement firstname=driver.findElement(By.xpath("//input[@id='first_name']"));
		  		  firstname.sendKeys("Test");
		  		  WebElement lastname=driver.findElement(By.xpath("//input[@id='last_name']"));
		  		  lastname.sendKeys("Test");
		  		  WebElement countryname=driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[3]/div[1]/select"));//to be updated
		  		  countryname.sendKeys("India");
		  		  WebElement dateofbirth=driver.findElement(By.xpath("//input[@id='dobDate']"));
		  		  dateofbirth.sendKeys("01/20/1985");
		  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[4]/div[1]/div/div[1]/input"))).click();
		  		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[4]/div[1]/div/div[1]/input"))).sendKeys("9840012345");
		  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email_id']"))).click();
		  		Thread.sleep(3000);
		  		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email_id']"))).sendKeys("test1@gmail.com");
		  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email_id']"))).click();
		  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email_id']"))).sendKeys(Keys.TAB);
		  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='new-password']"))).click();
		  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='new-password']"))).sendKeys("Test@123");
	              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='c-password']"))).sendKeys("Test@123");
	              WebElement confirmcheckbox=driver.findElement(By.xpath("//input[@id='defaultCheck1']"));
	              JavascriptExecutor executor = (JavascriptExecutor) driver;
	              executor.executeScript("arguments[0].click();", confirmcheckbox);
	}

}
