public class Human extends Player {

   private String type;
   private double lat;
   private double lon;

   // human constructor
   Human(String type, int id, String name, String tagline) {
   	super(id, name, tagline);
      this.type = type;
   }
   


}