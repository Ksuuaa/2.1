package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Background {
    class BGPictures{
        private Texture tx;
        private Vector2 pos;
        public BGPictures(Vector2 pos){
            tx=new Texture("back.png");
            this.pos=pos;
        }
    }
    private int speed;
    private BGPictures[] backs;
    public Background(){
        speed=4;
        backs=new BGPictures[2];
        backs[0] = new BGPictures(new Vector2(0,0));
        backs[1] = new BGPictures(new Vector2(800,0));
    }
    public void render(SpriteBatch batch){
        for (int i = 0; i < backs.length; i++) {
            batch.draw(backs[i].tx,backs[i].pos.x,backs[i].pos.y);
        }
    }
    public void update(){
        for (int i = 0; i < backs.length; i++) {
            backs[i].pos.x-=speed;
            if (backs[0].pos.x<-800){
                backs[0].pos.x=0;
                backs[1].pos.x=800;
            }
        }
    }
}
