package pr.practice.design.factory;

public class OSFactory {

	public OS getOSInstance(String str)
	{
		if(str.equals("opensource"))
		{
			return new Android();
		}
		else if(str.equals("secure"))
		{
			return new IOS();
		}
		else if(str.equals("worst"))
		{
			return new Windows();
		}
		else
		{
			return null;
		}		
	}
}
