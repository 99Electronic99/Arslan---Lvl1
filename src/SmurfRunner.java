
public class SmurfRunner {
 public static void main(String[] args) {
	Smurf smurf = new Smurf("Handy");
	smurf.eat();
   System.out.println(smurf.getName()); 
   Smurf papa = new Smurf("Papa");
	System.out.println(papa.getName());
	System.out.println(papa.getHatColor());
	System.out.println(papa.isGirlOrBoy());
}
}
