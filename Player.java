public class Player {
   private int id; 
   private String name; 
   private String tagline;
   private double playerLat;
   private double playerLon;

   // player constructor
   Player(int id, String name, String tagline) {
      this.id = id;
      this.name = name;
      this.tagline = tagline;
   }
   
	public String getName() {
		  return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getTagline() {
		return this.tagline;
	}
	
	//method to run an update on location -->  add to game event loop
	//should be grabbing android sensor values here
	//possibly a put request to api server as well
	public void setLatLon(double lat, double lon) {
		playerLat = lat;
		playerLon = lon;

	}
   

}