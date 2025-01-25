package testscript;

public class NavigationCommands extends Base {
	
	public void navigation() {
		driver.navigate().to("https://www.amazon.in/");//to go to amazon page from obsqura page
		driver.navigate().back();//go back to obsqura page
		driver.navigate().forward();// again go to amazon
		driver.navigate().refresh();// to refresh page		
	}

	public static void main(String[] args) {
		NavigationCommands navigationcommands= new NavigationCommands();
		navigationcommands.initializebrowser();
		navigationcommands.navigation();
		//navigationcommands.driverQuitandClose();
		

	}

}
