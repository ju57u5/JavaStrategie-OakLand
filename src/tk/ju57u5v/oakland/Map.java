package tk.ju57u5v.oakland;

import tk.ju57u5v.engine.Game;

public class Map extends tk.ju57u5v.engine.world.Map{

	public Map(Game game) {
		super(game);
	}
	
	@Override
	public void onLoad() {
		game.getConsole().log("Oakland geladen!");
		TestEntity entity = new TestEntity(game);
		entity.setPosition(500, 100);
	}
	
	public void onUnLoad() {
		
	}

}
