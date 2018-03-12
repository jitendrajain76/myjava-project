
public class Rectangular()
{
	public static void main(Stting[] args)
	{
		int length = Integer.parseInt(args[0]);
		int width= Integer.parseInt(args[1]);
	}
	
	Rectangle myrect = new Rectange(length,width);
	String output = String.format("***Your rectangle *** Area is: %d",myrect.getArea());
	System.out.println(output);
}
