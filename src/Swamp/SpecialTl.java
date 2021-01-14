package Swamp;

import java.awt.*;

public class SpecialTl {
    private int col,row,Size;

    public SpecialTl(int col,int row){
        this.col=col;
        this.row=row;
        this.Size=100;

    }
    public void render(Graphics g){

        int tileX = this.col * this.Size;
        int tileY = this.row * this.Size;
        g.setColor(Color.WHITE);
        g.fillRect(tileX,tileY,this.Size,this.Size);
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(tileX+25,tileY+25,50,50);
        g.setColor(Color.DARK_GRAY);
        g.drawOval(tileX+25,tileY+25,50,50);
        g.setColor(Color.BLACK);
        g.drawRect(tileX,tileY,this.Size,this.Size);

    }
}

