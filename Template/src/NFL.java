
public class NFL extends Game {

	@Override
	   void endPlay() {
	      System.out.println("NFL Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("NFL Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("NFL Game Started. Enjoy the game!");
	   }
}
