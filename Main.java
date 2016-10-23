import java.time.Instant;

public class Main {
	
  public static void main(String[] args) {
    System.out.println("sanity check");

    Environment environment1 = new Environment("Denver",1,20000,"HunterIsHunted",20);
    Human player1 = new Human("Military",1,"Colonel Hicks","Kickass");
    Alien player2 = new Alien("Crawler",2,"ET","Humans R Tasty");
    Alien player3 = new Alien("Thinker",3,"Spok","Destroy all Humans!");

    //System.out.println(player1.getName() );
    //System.out.println(player2.getType() );
    //System.out.println(player3.getId() );
	//System.out.println(Instant.now());
	
	//!!! Game event loop here somewhere !!!
	int winner = environment1.gameWinnerCheck(1,3,39.791087,-104.825191,39.653177,-105.053244);
	if(winner != -1){
		environment1.active = false;
	}
	//!!! Game event loop here somewhere !!!
	
	System.out.println(environment1.gameDuration());
	System.out.println(environment1.getDistance(39.791087,-104.825191,39.653177,-105.053244));
    System.out.println(environment1.active);

  }
}