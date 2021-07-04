
public class Toys extends Order {
	
		Toys(ChannelType channel) { 
			super(ProductType.Toys, channel); 
			constructOrder(); 
			} 
		@Override
		 void constructOrder() { 
			System.out.println("Toys in Making"); 
		}
	


}
