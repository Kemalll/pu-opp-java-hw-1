package Frogs;

import java.awt.*;

public class Y_Leader {
    private int col,row;
    private int Size;

    public Y_Leader(int col, int row) {  // Задаване на позиция
        this.col = col;
        this.row = row;
        this.Size = 100;
    }
    public void render(Graphics g){     //Задаване на цвят и размер на едениците

        int tileX = this.col * this.Size;
        int tileY = this.row * this.Size;
        g.setColor(Color.YELLOW);
        g.fillRect(tileX+25,tileY+25,55,55);

    }
}


