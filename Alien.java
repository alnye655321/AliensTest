public class Alien extends Player {

   private String type;

   // alien constructor
   Alien(String type, int id, String name, String tagline) {
   	super(id, name, tagline);
      this.type = type;
   }
   
	public String getType() {
		return this.type;
	}

}