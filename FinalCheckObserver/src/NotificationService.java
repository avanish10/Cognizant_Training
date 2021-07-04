

import java.util.ArrayList;
import java.util.List;


public class NotificationService implements INotificationService{

	 private List<INotificationObserver> list = new ArrayList<INotificationObserver>();
	@Override
	public void addSubscriber(INotificationObserver ino) {
		// TODO Auto-generated method stub
		this.list.add(ino);
		
		System.out.println(list);
		
	}
	
	

	



	@Override
	public void removeSubscriber(INotificationObserver ino) {
		// TODO Auto-generated method stub
		this.list.remove(ino);
		System.out.println(list);

	}



	@Override
	public void notifySubscriber() {
		// TODO Auto-generated method stub
		for(INotificationObserver i:list)
		{
			i.OnAdded();
		}
		
	}

	
}
