
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Subject subject = new Subject();

	      new Observer3(subject);
	      new Observer2(subject);
	      new Observer1(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);

	}

}