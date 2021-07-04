



public class Main {
	public static void main(String[] args)
	{
	
	INotificationObserver s = new BookEvent();
	INotificationObserver j = new FoodEvent();
	
	NotificationService ns = new NotificationService();
	ns.addSubscriber(s);
	ns.addSubscriber(j);
	
	ns.notifySubscriber();
	ns.removeSubscriber(j);
	ns.notifySubscriber();
	
	
	}
	
	
	
	

}
