import java.time.Instant;

public class Main {
	
  public static void main(String[] args) {
    System.out.println("sanity check");
    double alienPlayerLat;
    double alienPlayerLon;

    Environment environment1 = new Environment("Denver",1,20000,"HunterIsHunted",20);
    Human player1 = new Human("Military",1,"Colonel Hicks","Kickass",39.791087,-104.825191);
    Alien player2 = new Alien("Crawler",39.653177,-105.053244,2,"ET","Humans R Tasty",39.653177,-105.053244);
    Alien player3 = new Alien("Thinker",39.653177,-105.053244,3,"Spok","Destroy all Humans!",39.653177,-105.053244);


	
	//!!! Game event loop here somewhere !!!
    while(environment1.active){
    	player2.setPlayerAlienLat(0.00001); //!!! simulated change would be set by android sensor
    	alienPlayerLat = player2.getPlayerAlienLat();
    	alienPlayerLon = player2.getPlayerAlienLon();
    	System.out.println(alienPlayerLat);
    	System.out.println(alienPlayerLon);

    	int winner = environment1.gameWinnerCheck(1,2,39.791087,-104.825191,alienPlayerLat,-104.825191);
    	if(winner != -1){
    		environment1.active = false;
    	}
    }
	//!!! Game event loop here somewhere !!!
	
	System.out.println(environment1.gameDuration());
	System.out.println(environment1.getDistance(39.791087,-104.825191,39.653177,-105.053244));
    System.out.println(environment1.active);
    //System.out.println(player1.getName() );
    //System.out.println(player2.getType() );
    //System.out.println(player3.getId() );
	//System.out.println(Instant.now());

  }
}