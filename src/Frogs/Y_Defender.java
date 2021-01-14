package Frogs;

import java.awt.*;

public class Y_Defender {

    private int col,row,Size;

    public Y_Defender(int col,int row) {    // Задаване на позиция
        this.col = col;
        this.row = row;
        this.Size=100;
    }
    public void render(Graphics g) {    //Задаване на цвят и размер на едениците

        int tileX = this.col * this.Size;                    //Намира мястото в което трябва да е
        int tileY = this.row * this.Size;
        g.setColor(Color.YELLOW);                                      //Задава основния цвят
        g.fillOval(tileX + 30, tileY + 30, 45, 45);
        g.setColor(Color.GREEN);                                       //Задава заобикалящия цвят
        g.drawOval(tileX + 30, tileY + 30, 45, 45);

    }
}

