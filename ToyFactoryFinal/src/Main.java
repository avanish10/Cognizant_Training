
public class Main {
	public static void main(String[] args)
	{
		System.out.println(ProductFactory.buildOrder(ProductType.Electronic,ChannelType.ECommerce));
		System.out.println(ProductFactory.buildOrder(ProductType.Toys,ChannelType.Agent)); 
		System.out.println(ProductFactory.buildOrder(ProductType.Electronic,ChannelType.Agent)); 
	}
}
