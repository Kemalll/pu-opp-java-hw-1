package Swamp;

import Frogs.G_Defender;
import Frogs.G_Leader;
import Frogs.Y_Defender;
import Frogs.Y_Leader;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Battelfield extends JFrame {
    private ArrayList<Object> formation;

    public Battelfield() {
        this.formation = new ArrayList<>();

        this.formation.add(new G_Defender(0, 0));
        this.formation.add(new G_Defender(0, 1));
        this.formation.add(new G_Defender(0, 2));
        this.formation.add(new G_Defender(0, 3));
        this.formation.add(new G_Leader(0, 4));

        this.formation.add(new Y_Defender(4, 1));
        this.formation.add(new Y_Defender(4, 2));
        this.formation.add(new Y_Defender(4, 3));
        this.formation.add(new Y_Defender(4, 3));
        this.formation.add(new Y_Leader(4, 4));


        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int row = 0; row < 5; row++) {                         //Създава полето
            for (int col = 0; col < 5; col++) {

                GameTile tile = new GameTile(row, col);
                tile.render(g);

                SpecialTl st=new SpecialTl(2,2);           //Специално поле извиква се от класа си
                st.render(g);
                //Green
                G_Defender Gdef1=new G_Defender(0,0);      //Създават се фигорите
                Gdef1.render(g);
                G_Defender Gdef2=new G_Defender(1,0);
                Gdef2.render(g);
                G_Defender Gdef3=new G_Defender(2,0);
                Gdef3.render(g);
                G_Defender Gdef4=new G_Defender(3,0);
                Gdef4.render(g);
                G_Leader Glea1=new G_Leader(4,0);
                Glea1.render(g);
                //Yellow
                Y_Defender Ydef1=new Y_Defender(1,4);
                Ydef1.render(g);
                Y_Defender ydef2=new Y_Defender(2,4);
                ydef2.render(g);
                Y_Defender ydef3=new Y_Defender(3,4);
                ydef3.render(g);
                Y_Defender ydef4=new Y_Defender(4,4);
                ydef4.render(g);
                Y_Leader ylea1=new Y_Leader(0,4);
                ylea1.render(g);



            }
        }

    }
}



