package indigo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.indigo.model.Model;
import com.indigo.model.Passengers;
import com.indigo.service.Service;

public class IndigoTest {
	Service service = new Service();
	Model model = new Model("business","1200456");
	Passengers passenger = new Passengers("Saran",true,model);
	
	Model mode3 = new Model("business","1200456");
	Passengers passenger3 = new Passengers("Saran",false,model);
	
	Model model1 = new Model("economy","1200456");
	Passengers passenger1 = new Passengers("Kaarthik",false,model1);
	
	Model model2 = new Model("economy","1200456");
	Passengers passenger2 = new Passengers("Kaarthik",true,model1);
	
	@Test
	public void addFlightTest(){
		assertNotNull(service.addPassenger(passenger));
		assertNotNull(service.addPassenger(passenger1));
		
	}
	@Test
	public void addPassangerTest(){
		assertNotNull(service.addPassenger(passenger));
		assertNotNull(service.addPassenger(passenger1));
		assertNotNull(service.addPassenger(passenger2));
		assertNull(service.addPassenger(passenger3));
		
	}
	@Test
	public void removePassangerTest() {
		assertFalse(service.removePassenger(passenger));
		assertFalse(service.removePassenger(passenger2));
		assertTrue(service.removePassenger(passenger1));
		assertTrue(service.removePassenger(passenger3));
	}
	
}
