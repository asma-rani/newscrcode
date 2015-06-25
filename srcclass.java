import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class srcclass {
	
	public static void main(String[]args)
	{
		WebDriver web1=new FirefoxDriver();
		web1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		web1.navigate().to("http://www.shophive.com/apple/mac?p=1");
		web1.manage().window().maximize();

		java.util.List<WebElement>
		priceList = web1.findElements(By.className("price-box")); 
		java.util.List<WebElement>
		productNameList = web1.findElements(By.className("product-name"));
		
		for(int i=0;i<=priceList.size();i++)
		{
		System.out.println("Product Number: "+i+1+ "\n Product name = " + productNameList.get(i).getText() + "\nPrice = "+priceList.get(i).getText() ); 
		}
		{
		System.out.println("The End");
		}

		web1.close();
	}
}
