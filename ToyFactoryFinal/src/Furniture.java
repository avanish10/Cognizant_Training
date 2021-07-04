
public class Furniture extends Order {
	Furniture(ChannelType channel) { 
		super(ProductType.Furniture, channel); 
		constructOrder(); 
		} 
	@Override
	 void constructOrder() { 
		System.out.println("Furniture in Making"); 
	}
 
}
