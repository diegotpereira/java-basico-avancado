package br.com.java.view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListener extends KeyAdapter{

    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
           case 39:	// -> Right 
                       //if it's not the opposite direction
                       if(ThreadsController.direcaoCobra!=2) 
                           ThreadsController.direcaoCobra=1;
                         break;
           case 38:	// -> Top
                       if(ThreadsController.direcaoCobra!=4) 
                           ThreadsController.direcaoCobra=3;
                       break;
                       
           case 37: 	// -> Left 
                       if(ThreadsController.direcaoCobra!=1)
                           ThreadsController.direcaoCobra=2;
                       break;
                       
           case 40:	// -> Bottom
                       if(ThreadsController.direcaoCobra!=3)
                           ThreadsController.direcaoCobra=4;
                       break;
           
           default: 	break;
        }
    }
    
}
