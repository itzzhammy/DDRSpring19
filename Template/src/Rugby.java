
public class Rugby extends Game {

	 @Override
	   void endPlay() {
	      System.out.println("Rugby Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("Rugby Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("Rugby Game Started. Enjoy the game!");
	   }
}
