
public class Athlete {

     static int nextBibNumber;
     static String raceLocation = "New York";
     static String raceStartTime = "9.00am";

     String name;
     int speed;
     int bibNumber;

Athlete (String name, int speed){
     this.name = name;
     this.speed = speed;
}

public static void main(String[] args) {
     //create two athletes      //print their names, bibNumbers, and the location of their race.
	Athlete a = new Athlete("Lily", 5);
	Athlete b = new Athlete("Lila", 3);
	System.out.println(a);
	System.out.println("Lily");
	System.out.println("New York");
	System.out.println(b);
	System.out.println("Lila");
	System.out.println("New York");
	
	}
}