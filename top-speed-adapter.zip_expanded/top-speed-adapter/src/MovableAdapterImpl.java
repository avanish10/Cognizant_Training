import com.cognizant.adapter.interfaces.Movable;
import com.cognizant.adapter.interfaces.MovableAdapter;

public class MovableAdapterImpl implements MovableAdapter {

	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}

	private Movable luxuryCars;

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

}
