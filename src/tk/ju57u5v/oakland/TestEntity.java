package tk.ju57u5v.oakland;

import java.awt.Graphics2D;
import static tk.ju57u5v.engine.Game.*;
import tk.ju57u5v.engine.Entity;
import tk.ju57u5v.engine.Game;

public class TestEntity extends Entity {
	public TestEntity() {
		super();

		initialise();
		getSavedAnimation("walk", "dorfzentrum_walk");
		getSavedAnimation("stand", "dorfzentrum_stand");
		animationManager.selectAnimation("walk");
		getResourceManager().setDimensionsFromResource("katze3", this);
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(getResourceManager().getResource(getAnimationQuery()), getRelativX(), getRelativY(), null);
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
