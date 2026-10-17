package testScript2;

public class BrowserCommands2 extends Base2{
	
	public void browserCommandMethod() {
		
		String source = driver.getPageSource();
		System.out.println(source);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}

	public static void main(String[] args) {
		BrowserCommands2 brwcmd = new BrowserCommands2();
		brwcmd.browserIntialization();
		brwcmd.browserCommandMethod();

	}

}
