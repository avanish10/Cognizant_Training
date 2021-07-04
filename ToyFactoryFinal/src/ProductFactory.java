
public class ProductFactory {
	
	private ProductFactory(){
		
	}
	
	public static Order buildOrder(ProductType product,ChannelType channel)
	{
		Order order=null;
		switch(channel)
		{
		case ECommerce:
			order =Ecommerce.buildOrder(product);
			break;
		case Agent:
			order =Agent.buildOrder(product);
			break;
		
		
		}
		return order;
		
	}
}
