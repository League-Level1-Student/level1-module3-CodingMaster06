import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
	World w = new World();
	w.show();
	Bug b = new Bug();
	Bug r = new Bug();
	Location lb = new Location(5, 8);
	Location lr = new Location(2, 8);
	Location lf = new Location(5, 7);
	Location lf2 = new Location(5, 9);
	Location lr1 = new Location(2, 7);
	Location lr2 = new Location(2, 9);
	w.add(lr, r);
	w.add(lb, b);
	Color c = new Color(0);
	r.setColor(c);
	r.turn();
	r.turn();
	Flower f = new Flower();
	w.add(lf, f);
	w.add(lf2, f);
	w.add(lr1, f);
	w.add(lr2, f);
	for (int i = 0; i <10; i++) {
		for (int j = 0; j < 10; j++) {
			Location l = new Location(i, j);	
			w.add(l, f);
			
			
		}
		
	}
}
}
