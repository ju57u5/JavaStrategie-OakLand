package tk.ju57u5v.oakland;

import java.awt.Graphics2D;
import tk.ju57u5v.engine.Entity;
import tk.ju57u5v.engine.Game;

public class TestEntity extends Entity {
	public TestEntity(Game game) {
		super(game);

		initialise();
		getSavedAnimation("walk", "dorfzentrum_walk");
		getSavedAnimation("stand", "dorfzentrum_stand");
		animationManager.selectAnimation("walk");
		game.getResourceManager().setDimensionsFromResource("katze3", this);
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(game.getResourceManager().getResource(getAnimationQuery()), getRelativX(), getRelativY(), null);
	}

	@Override
	public void update() {
		if (isMoving()) {
			animationManager.selectAnimation("walk");
		} else {
			animationManager.selectAnimation("stand");
		}
	}
}
