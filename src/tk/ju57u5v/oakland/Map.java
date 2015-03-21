package tk.ju57u5v.oakland;

import tk.ju57u5v.engine.Game;
import static tk.ju57u5v.engine.Game.*;

public class Map extends tk.ju57u5v.engine.world.Map{

	
	public Map() {
		super();
	}
	
	@Override
	public void onLoad() {
		getConsole().log("Oakland geladen!");
		mapEntities.add(new TestEntity());
		mapEntities.get(0).setPosition(500, 100);
	}
	
	public void onUnLoad() {
		for (int c=0; c<mapEntities.size();c++) {
			mapEntities.get(c).unload();
		}
		getConsole().log("Oakland unloaded!");
	}

}
