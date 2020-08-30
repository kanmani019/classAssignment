package assignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capability {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "kanmani");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.get("https://m.cricbuzz.com");
		driver.findElement(By.xpath("//body[@id=\"top\"]/div/div[3]/div[2]/a")).click();
		driver.findElement(By.xpath("//body[@id=\"top\"]/div/div[12]/table/tbody/tr[1]/td[1]/a")).click();
		//WebElement webview = driver.findElement(By.xpath("//body[@id=\"top\"]/div/div[8]");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Morgan, Malan help England prevail in high-scoring encounter\"));");
		

	}

}
