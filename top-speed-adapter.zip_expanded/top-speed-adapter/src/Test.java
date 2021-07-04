import static org.junit.jupiter.api.Assertions.*;
import com.cognizant.adapter.concrete.BugattiVeyron;
import com.cognizant.adapter.interfaces.Movable;
import com.cognizant.adapter.interfaces.MovableAdapter;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		// fail("Not yet implemented");
	}

	@org.junit.jupiter.api.Test
	public void whenCovertingMPHToKMPH_thenSuccessfullyConverted() {
		Movable buggatiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(buggatiVeyron);

		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}

}
