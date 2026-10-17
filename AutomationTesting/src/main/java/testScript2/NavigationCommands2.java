package testScript2;

public class NavigationCommands2 extends Base2{
	
	public void navigationCommand() {
		driver.navigate().to("https://www.nevefragrances.com/?srsltid=AU7gw4U36GHwZsBcKYSENsJMztNjfiZG1qSReWH8s6ySstpLZzNxeFCk");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
	}

	public static void main(String[] args) {
		NavigationCommands2 nv2 = new NavigationCommands2();
		nv2.browserIntialization();
		nv2.navigationCommand();

	}

}
