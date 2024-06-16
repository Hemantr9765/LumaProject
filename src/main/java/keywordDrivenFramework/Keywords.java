package keywordDrivenFramework;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;


import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Keywords {
	RemoteWebDriver driver;
	FluentWait<WebDriver> fluent= new FluentWait(driver);
public static final Logger log= Logger.getLogger(Keywords.class);


	public void OpenBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
			log.info("ChromeBrowser is Lauch");
		}else if(browserName.equalsIgnoreCase("Edge")) {
			driver= new EdgeDriver();
			log.info("EdgeBrowser is Lauch");
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			driver= new FirefoxDriver();
			log.info("FirefoxBrowser is Lauch");
		}else {
			System.out.println("Invalid Browser ");
		}

	}
	public void UrlLaunch(String url) {
		driver.get(url);

	}
	public void Maximize() {
		driver.manage().window().maximize();	
	}
	public void Click(String element) {
		driver.findElement(By.xpath(element)).click();
	}
	public void SendKeys(String element,String text) {
		driver.findElement(By.xpath(element)).sendKeys(text);	
	}
	public String GetText(String element) {
		return driver.findElement(By.xpath(element)).getText();
	}
	public void Wait() {
		fluent.withTimeout(Duration.ofMillis(5000));
		fluent.pollingEvery(Duration.ofMillis(500));
		fluent.withMessage("Element is not found in 5 second");
		fluent.ignoring(Exception.class);
		
	}
	
	
	
	public void Screenshot(String classNmae) throws IOException {
		AShot as = new AShot();
		as.shootingStrategy(ShootingStrategies.viewportPasting(1500));
		Screenshot sc=as.takeScreenshot(driver);
		BufferedImage img=sc.getImage();
		ImageIO.write(img, "jpg",new File(classNmae+"Luma.jpg"));
	}
	public void TearDown() {
		driver.close();
		
	}
}
