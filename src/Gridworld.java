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
	w.add(lr, r);
	w.add(lb, b);
	Color c = new Color(0);
	r.setColor(c);
	Flower f = new Flower();
	w.add(lf, f);
}
}
