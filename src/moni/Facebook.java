package moni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAIN\\Desktop\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");

		//driver setup
				ChromeOptions options = new ChromeOptions();
			    options.addArguments("--disable-notifications");
		        WebDriver driver = new ChromeDriver(options);
				    
		//url opening
				driver.get("https://www.facebook.com/" );
				driver.manage().window().maximize();
                
				driver.findElement(By.id("email")).sendKeys("monika6.jain2015@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("monikais96");
				driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//span[text()='Not Now'])[2]")).click();
				
				driver.findElement(By.xpath("(//div[contains(@class,'oajrlxb2 tdjehn4e')])[3]")).click();
				
				driver.findElement(By.xpath("//span[text()='Friends']")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[contains(@class,'k4urcfbm dp1hu0rb')]")).click();
				
				
				
				driver.findElement(By.cssSelector("#mount_0_0 > div > div:nth-child(1) > div.rq0escxv.l9j0dhe7.du4w35lb > div.rq0escxv.l9j0dhe7.du4w35lb > div > div > div.j83agx80.cbu4d94t.d6urw2fd.dp1hu0rb.l9j0dhe7.du4w35lb > div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.pfnyh3mw.jifvfom9.gs1a9yip.owycx6da.btwxx1t3.buofh1pr.dp1hu0rb.ka73uehy > div.rq0escxv.l9j0dhe7.tkr6xdv7.j83agx80.cbu4d94t.pfnyh3mw.d2edcug0.hpfvmrgz.dp1hu0rb.rek2kq2y.o36gj0jk > div > div.q5bimw55.rpm2j7zs.k7i0oixp.gvuykj2m.j83agx80.cbu4d94t.ni8dbmo4.eg9m0zos.l9j0dhe7.du4w35lb.ofs802cu.pohlnb88.dkue75c7.mb9wzai9.d8ncny3e.buofh1pr.g5gj957u.tgvbjcpo.l56l04vs.r57mb794.kh7kg01d.c3g1iek1.k4xni2cv > div.j83agx80.cbu4d94t.buofh1pr > div.aov4n071 > div > div:nth-child(3) > div:nth-child(2) > div > a > div.ow4ym5g4.auili1gw.rq0escxv.j83agx80.buofh1pr.g5gj957u.i1fnvgqd.oygrvhab.cxmmr5t8.hcukyx3x.kvgmc6g5.nnctdnn4.hpfvmrgz.qt6c0cv9.jb3vyjys.l9j0dhe7.du4w35lb.bp9cbjyn.btwxx1t3.dflh9lhu.scb9dxdr > div.ow4ym5g4.auili1gw.rq0escxv.j83agx80.buofh1pr.g5gj957u.i1fnvgqd.oygrvhab.cxmmr5t8.hcukyx3x.kvgmc6g5.tgvbjcpo.hpfvmrgz.qt6c0cv9.rz4wbd8a.a8nywdso.jb3vyjys.du4w35lb.bp9cbjyn.btwxx1t3.l9j0dhe7 > div > div.j83agx80.cbu4d94t.a9txdygg.fnu23jab.buofh1pr.iuny7tx3.ipjc6fyt > div > div > div:nth-child(2) > div.oajrlxb2.tdjehn4e.gcieejh5.bn081pho.humdl8nn.izx4hr6d.rq0escxv.nhd2j8a9.j83agx80.p7hjln8o.kvgmc6g5.cxmmr5t8.oygrvhab.hcukyx3x.jb3vyjys.d1544ag0.qt6c0cv9.tw6a2znq.i1ao9s8h.esuyzwwr.f1sip0of.lzcic4wl.l9j0dhe7.abiwlrkh.p8dawk7l.beltcj47.p86d2i9g.aot14ch1.kzx2olss.cbu4d94t.taijpn5t.ni8dbmo4.stjgntxs.k4urcfbm.tv7at329 > div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.pfnyh3mw.taijpn5t.bp9cbjyn.owycx6da.btwxx1t3.c4xchbtz.by2jbhx6 > div > span > span")).click();
	
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[contains(@class,'k4urcfbm dp1hu0rb')]")).click();
	}

}
