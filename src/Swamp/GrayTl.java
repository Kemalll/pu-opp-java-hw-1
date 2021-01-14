package Swamp;

import java.awt.*;

public class GrayTl {
    private int col,row,Size;

    public GrayTl(int col,int row){
        this.col=col;
        this.row=row;
        this.Size=100;

    }
    public void render (Graphics g){
        int tileX = this.col * this.Size;
        int tileY = this.row * this.Size;

        g.setColor(Color.GRAY);
        g.fillRect(tileX,tileY,this.Size,this.Size);
        g.setColor(Color.BLACK);
        g.drawRect(tileX,tileY,this.Size,this.Size);
    }
}
