
public class Electronic extends Order {
	Electronic(ChannelType channel) { 
		super(ProductType.Electronic, channel); 
		constructOrder(); 
		} 
	@Override
	 void constructOrder() { 
		System.out.println("Product in Making"); 
	}
}
