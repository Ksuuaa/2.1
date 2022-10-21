package com.mygdx.game;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Score {
    private Texture txScore;
    private Vector2 pos;
    MyGdxGame myGdxGame;

    Score() {
        txScore = new Texture("0.gif");
        pos = new Vector2(100, 200);
    }

    public void render(SpriteBatch batch) {
        batch.draw(txScore, 100, 200);
        if (myGdxGame.getCount() > 0)
            batch.draw(getTexture(myGdxGame.getCount()), 200, 200);
    }

    public void update() {
        int count = myGdxGame.getCount();
    }

    public Texture getTexture(int textureNumber) {

        return new Texture(textureNumber, 100, Pixmap.Format.fromGdx2DPixmapFormat(200));
    }
}