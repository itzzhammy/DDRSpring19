
public class Stop implements State {
	public void doAction(Context context) {
	      System.out.println("System is in Stoping");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Stop State";
	   }
}
