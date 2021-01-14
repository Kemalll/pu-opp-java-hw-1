package Frogs;

import java.awt.*;

public class G_Defender {

    private int col,row,Size;

    public G_Defender(int col,int row) {
        this.col = col;
        this.row = row;
        this.Size=100;
    }
    public void render(Graphics g) {

        int tileX = this.col * this.Size;
        int tileY = this.row * this.Size;
        g.setColor(Color.GREEN);
        g.fillOval(tileX + 30, tileY + 30, 45, 45);
        g.setColor(Color.YELLOW);
        g.drawOval(tileX + 30, tileY + 30, 45, 45);

    }
}