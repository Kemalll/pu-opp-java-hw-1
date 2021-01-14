package Swamp;

import java.awt.*;

public class GameTile {
    private int col;
    private int row;
    private int Size;

    public GameTile(int col, int row) {
        this.col = col;
        this.row = row;
        this.Size = 100;
    }

    public void render(Graphics g) {             //Тук дъската бива отцветявана

        /*
        BlackTl bt1=new BlackTl(1,0);               //Ako използвам класове за полета
        bt1.render(g);                                //ще се надвиши лимита за метод
        BlackTl bt2=new BlackTl(3,0);                 //заради това използвах алтернативата
        bt2.render(g);                                //но реших да запазя и начина с класове
        BlackTl bt3=new BlackTl(0,4);                 //случай че е поредпочитан
        bt3.render(g);
        BlackTl bt4=new BlackTl(4,4);
        bt4.render(g);
        OrangeTl ort1=new OrangeTl(0,0);
        ort1.render(g);
        OrangeTl ort2=new OrangeTl(4,0);
        ort2.render(g);
        OrangeTl ort3=new OrangeTl(1,4);
        ort3.render(g);
        OrangeTl ort4=new OrangeTl(3,4);
        ort4.render(g);
        GrayTl grt1=new GrayTl(1,1);
        grt1.render(g);
        GrayTl grt2=new GrayTl(0,1);
        grt2.render(g);
        GrayTl grt3=new GrayTl(3,1);
        grt3.render(g);
        GrayTl grt4=new GrayTl(4,1);
        grt4.render(g);
        GrayTl grt5=new GrayTl(0,3);
        grt5.render(g);
        GrayTl grt6=new GrayTl(1,3);
        grt6.render(g);
        GrayTl grt7=new GrayTl(3,3);
        grt7.render(g);
        GrayTl grt8=new GrayTl(4,3);
        grt8.render(g);
        WhiteTl whtl1= new WhiteTl(2,0);
        whtl1.render(g);
        WhiteTl whtl2=new WhiteTl(2,1);
        whtl2.render(g);
        .......
        .......
        .......
        */


        int tileX=this.col*this.Size;          //Определя позицията на полето
        int tileY=this.row*this.Size;

        if((this.col==0&&this.row==0||this.col==4&&this.row==0)||
       (this.col==1 && this.row==4||this.col==3 && this.row==4))  //If Else проверява кое поле как да се оцвети
        {
            g.setColor(Color.ORANGE);     //Промяна на цвета на полето(ПНЦНП)
        }
        else if((this.col==1 && this.row==1||this.col==0 && this.row==1)||
                (this.col==3 && this.row==1||this.col==4 && this.row==1)||
                (this.col==1 && this.row==3||this.col==0 && this.row==3)||
                (this.col==3 && this.row==3||this.col==4 && this.row==3))
        {
            g.setColor(Color.GRAY);   //(ПНЦНП)
        }
        else if((this.col==1 && this.row==0||this.col==3 && this.row==0)||
                (this.col==0 && this.row==4||this.col==4 && this.row==4))
        {
            g.setColor(Color.BLACK);   //(ПНЦНП)
        }
        else
            {
            g.setColor(Color.WHITE);   //(ПНЦНП)
        }
        g.fillRect(tileX,tileY,this.Size,this.Size);        //Четката за отцветяването

        g.setColor(Color.BLACK);                          //Прави границите на полетата по видни
        g.drawRect(tileX,tileY,this.Size,this.Size);
    }
}