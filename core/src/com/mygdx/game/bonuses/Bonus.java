package com.mygdx.game.bonuses;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public abstract class Bonus {

    /**
     * bonus parameters
     */
    public Vector2 position;
    public Texture texture;
    public Vector2 cloud;
    public boolean exists;
    public int bonusType;

    /**
     * bonus constructor
     * @param cloud
     * @param exists
     */
    Bonus(Vector2 cloud, boolean exists) {
        this.exists = exists;
        this.cloud = cloud;
        position = new Vector2();
    }
}
