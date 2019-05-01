
public class Started implements State{

	public void doAction(Context context) {
	      System.out.println("System is in Starting");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Start State";
	   }
}
