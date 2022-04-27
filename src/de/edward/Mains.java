package de.edward;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Mains extends JFrame {

    int wl = 100;   // distance from wall
    int sz = 25;    // size of squares
    int sp = sz * 2;    // distance from squares
    int x = wl;     // x coordinate
    int y = wl;     // y coordinate
    int N = 5;      // Amount per/of rows
    Color colours[][] = new Color [N][N];   // color of the squares

    public Mains(){

        for(int i = 0; i < N; i++){
            for(int j = 0;j < N; j++){
                colours[i][j] = Color.black;    // I'm not really sure what these are supposed to do
            }
        }

        addMouseListener( new MouseAdapter(){
            public void mouseClicked( MouseEvent me ){
                if( ASquareHasBeenClicked( me ) ) {
                    int i = ClickedSquareX(me);
                    int j = ClickedSquareY(me);
                    if( colours[i][j]==Color.black ){
                        colours[i][j]=Color.yellow;
                    } else {
                        colours[i][j]=Color.black;
                    };
                    repaint();
                }
            }
        });
    }

    private int ClickedSquareX( MouseEvent me ){
        // your task!
        // use me.getX()
        /*

        if (me.getX() > something && me.getX() < somethingElse){
            return true;
        } else {
            return false;
        }

         */
    }

    private int ClickedSquareY( MouseEvent me ){
        // your task!
        // use me.getY()
    }

    private boolean ASquareHasBeenClicked( MouseEvent me ){
        // your task!
    }

    @Override public void paint( Graphics g ){
        g.setColor(Color.black);
        for (int i = 0; i < N; i++ ){
            for (int j = 0; j < N; j++ ){
                g.fillRect(x,y, sz, sz);
                x += sp;
                colours[i][j] = Color.black;
            }
            x = wl;
            y += sp;
        }
    }

    void option(){

    }

    public static void main(String[] args) {
        Mains m = new Mains();
        m.setSize(600,600);
        m.setResizable(false);
        m.setTitle("Black Squares");
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.option();
        System.out.print("\n\n ======= This code has been provided by TheBoringEdward =======\n");
    }
}
