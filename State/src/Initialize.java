
public class Initialize implements State{
	public void doAction(Context context) {
	      System.out.println("System is in Initializing");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Initialize State";
	   }
}
