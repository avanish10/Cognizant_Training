

public class Name implements INotificationObserver {
	
	private String name;
	
	public Name(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}

	@Override
	public void OnAdded() {
		// TODO Auto-generated method stub
		System.out.println(name + " : received");
		
	}

	
	

}
