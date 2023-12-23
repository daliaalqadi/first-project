package first;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {
	
	WebDriver driver= new ChromeDriver();
	
	@BeforeTest
	public void setup() throws InterruptedException {
		
		driver.get("http://127.0.0.1:5500/index.html");
		// driver.manage().window().maximize();
		// driver.findElement(By.cssSelector("body > ol:nth-child(3) > a:nth-child(4) > li:nth-child(1)"y6t54r)).click();
		driver.findElement(By.name("inputForTheName")).sendKeys("Dalia");
		driver.findElement(By.name("inputForThePassword")).sendKeys("234345");
		driver.findElement(By.name("InputForTheEmail")).sendKeys("Dalia@gmail.com");
		
		
	}
	
	
	@Test(invocationCount=6)
	public void firstTest() throws InterruptedException {
		
		
		// task 1
		
		Random rand = new Random();
		String [] dates= {"12/12/2000","2/2/2002","3/3/1365","4/4/1998","5/5/2005"};
		String [] colors= {"#1068c9","#e8c8d5","#78fb5c","#99ffff","#9900cc"};
		String [] months= {"December","November","January","March"};
		String [] passwords= {"123555","989456","68725","684654","6155413","651424"};
		String [] usernames= {"dali","marrk","mememem","sosososo","iojdiusahd","ettrybhuie"};
		
		int randomDates= rand.nextInt(dates.length);
		int randomColors= rand.nextInt(colors.length);
		int randomMonths= rand.nextInt(months.length);
		int randomPasswors=rand.nextInt(passwords.length);
		int randomUsernames=rand.nextInt(usernames.length);
		
		WebElement birthday= driver.findElement(By.name("InputForThebirthday"));
		WebElement color = driver.findElement(By.name("InputForTheColor"));
		WebElement month = driver.findElement(By.name("InputForTheMonth"));
		WebElement password=driver.findElement(By.name("inputForThePassword"));
		WebElement username= driver.findElement(By.name("InputForThetext"));
		
		birthday.sendKeys(dates[randomDates]);
		color.sendKeys(colors[randomColors]);
		month.sendKeys(months[randomMonths]);
		password.sendKeys(passwords[randomPasswors]);
		username.sendKeys(usernames[randomUsernames]);
		Thread.sleep(2000);
		password.clear();
		username.clear();
	//	driver.findElement(By.id("submitButtonsoso")).click();


	}
	
	
	@AfterTest 
	public void postTest() {}
	
}
