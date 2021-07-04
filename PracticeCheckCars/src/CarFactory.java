
public class CarFactory {
	
	private CarFactory()
	{
		
	}
	
	public static Car buildCar(CarType type,Location location)
	{
		Car car=null;
		switch(location)
		{
		case USA:
			car =USACarFactory.buildCar(type);
			break;
		case INDIA:
			car =IndiaCarFactory.buildCar(type);
			break;
		case DEFAULT:
			car =DefaultCarFactory.buildCar(type);
			break;
		
		}
		return car;
		
	}


}
