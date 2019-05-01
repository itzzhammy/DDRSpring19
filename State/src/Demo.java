
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		      Context context = new Context();

		      Initialize initialize = new Initialize();
		      initialize.doAction(context);

		      System.out.println(context.getState().toString());

		      Started start = new Started();
		      start.doAction(context);
		      
		      System.out.println(context.getState().toString());
		      
		      Stop stopState = new Stop();
		      stopState.doAction(context);

		      System.out.println(context.getState().toString());
	}

}
