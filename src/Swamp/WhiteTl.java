package Swamp;

import java.awt.*;

public class WhiteTl {                                 //Това е клас за белите полета
                                                       //слуцай че ми се наложи да използвам
    private int col,row,Size;                          //класове за полетата

    public WhiteTl(int col,int row){
        this.col=col;
        this.row=row;
        this.Size=100;

    }
    public void render (Graphics g){
        int tileX = this.col * this.Size;
        int tileY = this.row * this.Size;

        g.setColor(Color.WHITE);
        g.fillRect(tileX,tileY,this.Size,this.Size);
        g.setColor(Color.BLACK);
        g.drawRect(tileX,tileY,this.Size,this.Size);
    }
}
