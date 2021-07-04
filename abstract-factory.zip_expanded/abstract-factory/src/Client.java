import com.cognizant.factory.abs.HeadLight;
import com.cognizant.factory.abs.Tire;

public class Client {
	public void doSomeClientJob() {
		Tire tire = FactoryMaker.getFactory("audi").makeTire();
		System.out.print(tire.getTireModel());
		HeadLight light = FactoryMaker.getFactory("audi").makeHeadlight();
		System.out.print(light.get_headLightModel());
	}
}
