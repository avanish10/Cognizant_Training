import java.nio.channels.Channel;

public abstract class Order {
   Order(ProductType product,ChannelType channel)
   {
	   this.product = product;
	   this.channel = channel;
   }
   
   abstract void constructOrder();
   
   ProductType product = null;
   ChannelType channel = null;
public ProductType getProduct() {
	return product;
}

public void setProduct(ProductType product) {
	this.product = product;
}

public ChannelType getChannel() {
	return channel;
}

public void setChannel(ChannelType channel) {
	this.channel = channel;
}

@Override
public String toString() {
	return "Order [product=" + product + ", channel=" + channel + "]";
}
   
   
}
