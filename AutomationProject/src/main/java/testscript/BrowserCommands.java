package testscript;

public class BrowserCommands extends Base {
	
	public void browsercommands() {
		String title = driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String page =driver.getPageSource();
		System.out.println(page);
		
	}

	public static void main(String[] args) {
		
		BrowserCommands a=new BrowserCommands();
		a.initializebrowser();// to be called first
		a.browsercommands();
		//a.driverQuitandClose();
	}

}
