package pr.practice.design.factory;

public class OSClient {

	public static void main(String[] args) {
		OSFactory factory = new OSFactory();
		
		String str = "opensource";
		System.out.println("Your are using "+str+" type OS.");		
		OS android = factory.getOSInstance(str);		
		android.osInfo();
		
		String str2 = "secure";
		System.out.println("Your are using "+str2+" type OS.");		
		OS ios = factory.getOSInstance(str2);		
		ios.osInfo();
		
		String str3 = "worst";
		System.out.println("Your are using "+str3+" type OS.");		
		OS windows = factory.getOSInstance(str3);		
		windows.osInfo();
		
	}
}
