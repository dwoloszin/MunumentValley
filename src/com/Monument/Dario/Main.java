/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Monument.Dario;

import static com.Monument.Dario.Quadrado.animator;
import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GLCanvas;

/**
 *
 * @author dario.lwoloszin
 */
public class Main {
    
    
    public static void main(String[] args){
        Frame frame = new Frame("3D Shapes");

    
        GLCanvas canvas = new GLCanvas();
        canvas.addGLEventListener(new Quadrado.Renderer());
        
        
        frame.add(canvas);
        frame.setSize(640, 480);
        animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e)
      {
        animator.stop();
        System.exit(0);
      }
    });
    frame.show();
    animator.start();
    canvas.requestFocus();
  }
}
    

