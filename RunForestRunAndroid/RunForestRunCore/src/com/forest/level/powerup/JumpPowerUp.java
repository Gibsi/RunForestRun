package com.forest.level.powerup;

import com.forest.level.Level;
import com.forest.level.Player;

/**
 * Created by Mathias on 15.05.16.
 */
public class JumpPowerUp extends PowerUp {
    public JumpPowerUp(int x, int y, String powerUpImageName, Level level) {
        super(x, y, powerUpImageName, level);
    }

    @Override
    public void applyPowerUp(Player player) {
        player.setSpeedMultiplier(2.f);
    }
}
