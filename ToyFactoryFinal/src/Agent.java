
public class Agent {

	public static Order buildOrder(ProductType product)
	{
		Order order = null;
		if(product == ProductType.Electronic)
		{
			order = new Electronic(ChannelType.Agent);
		}
		else if(product == ProductType.Furniture)
		{
			order = new Furniture(ChannelType.Agent);
		}
		else
		{
			order = new Toys(ChannelType.Agent);
		}
		return order;
	}
}
