public class Alien extends Player {

   private String type;
   private double playerAlienLat;
   private double playerAlienLon;

   // alien constructor
   Alien(String type, double playerAlienLat, double playerAlienLon, int id, String name, String tagline, 
		   double playerStartLat, double playerStartLon) {
   	super(id, name, tagline, playerStartLat, playerStartLon);
      this.type = type;
      this.playerAlienLat = playerAlienLat;
      this.playerAlienLon = playerAlienLon;
   }
   
	public String getType() {
		return this.type;
	}

	public double getPlayerAlienLat() {
		return playerAlienLat;
	}

	public void setPlayerAlienLat(double addVal) {
		this.playerAlienLat = this.playerAlienLat + addVal; //!!! simulated change would be set by android sensor
	}

	public double getPlayerAlienLon() {
		return playerAlienLon;
	}

	public void setPlayerAlienLon(double addVal) {
		this.playerAlienLon = this.playerAlienLon + addVal;
	}
	

}