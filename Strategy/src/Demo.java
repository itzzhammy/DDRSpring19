
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		      Context context = new Context(new Algorithm1());		
		      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		      context = new Context(new Algorithm2());		
		      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		      context = new Context(new Algorithm3());		
		      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
		   }

}
