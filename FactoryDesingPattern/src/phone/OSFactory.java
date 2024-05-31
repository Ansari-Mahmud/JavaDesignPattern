package phone;

public class OSFactory {
	public static OS getInstance(String str) {
		if(str.trim().equalsIgnoreCase("Open")) 
			return new Android();
		else if(str.trim().equalsIgnoreCase("Open")) 
			return new IOS();
		else 
			return new Windows();
		
	}
}
