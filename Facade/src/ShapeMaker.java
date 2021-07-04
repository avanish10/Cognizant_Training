
public class ShapeMaker {
	
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker()
	{
		
	}
	
	public void drawCircle()
	{
		Circle c = new Circle();
		c.draw();
	}
	public void drawRectangle()
	{
		Rectangle  r = new Rectangle();
		r.draw();
	}
	public void drawSquare()
	{
		Square s = new Square();
		s.draw();
	}
	

}
