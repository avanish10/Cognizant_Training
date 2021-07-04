


public interface INotificationService {

	public void addSubscriber(INotificationObserver ino);
	public void removeSubscriber(INotificationObserver ino);
	public void notifySubscriber();
	}
