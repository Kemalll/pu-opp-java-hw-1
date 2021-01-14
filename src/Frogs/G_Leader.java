package Frogs;

import java.awt.*;

public class G_Leader {

    private int col,row,Size;

    public G_Leader(int col, int row) {
        this.col = col;
        this.row = row;
        this.Size = 100;
    }
    public void render(Graphics g){

        int tileX = this.col * this.Size;
        int tileY = this.row * this.Size;
        g.setColor(Color.GREEN);
        g.fillRect(tileX+25,tileY+25,55,55);
    }
}

