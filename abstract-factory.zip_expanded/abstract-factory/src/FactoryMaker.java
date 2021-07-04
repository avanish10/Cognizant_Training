import com.cognizant.factory.AudiFactory;
import com.cognizant.factory.MercedesFactory;
import com.cognizant.factory.abs.Factory;

public class FactoryMaker {
	public static Factory getFactory(String factoryName) {
		if (factoryName.equals("audi")) {
			return new AudiFactory();
		} else if (factoryName.equals("mercedes")) {
			return new MercedesFactory();
		} else
			return null;
	}
}
