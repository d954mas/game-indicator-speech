package com.d954mas.game.indicator2019.speech.model.enemies;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.generated.ResGame;

public class BatEnemy extends Enemy {
    public BatEnemy(int hp, int minAtk, int maxAtk,
                    int minShield, int maxShield) { super(ResGame.res.bat_atlas.sprite1,
            hp, minAtk, maxAtk, minShield, maxShield); }
}
