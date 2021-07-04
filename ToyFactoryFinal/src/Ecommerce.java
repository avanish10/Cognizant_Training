
public class Ecommerce {
	
	public static Order buildOrder(ProductType product)
	  {
	    Order order = null;
	    switch (product)
	    {
	      case Electronic:
	      order = new Electronic(ChannelType.ECommerce);
	      break;
	 
	      case Toys:
	      order = new Toys(ChannelType.ECommerce);
	      break;
	 
	      case Furniture:
	      order = new Furniture(ChannelType.ECommerce);
	      break;
	 
	      default:
	      //throw some exception
	      break;
	    }
	  return order;
	 
	}

}
