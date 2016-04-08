package com.Monument.Dario;

import com.sun.opengl.util.Animator;
import java.awt.*;
import java.awt.event.*;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

public class TorreArk
{
  static Animator animator = null;
  

  static class Renderer implements GLEventListener,KeyListener{
              
        private float rquad = 0.0f;
        private float rtri = 0.0f;
        float x = 0.8f;
        

         
       public void display(GLAutoDrawable drawable) {
            GL gl = drawable.getGL();

        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();

        // Move the "drawing cursor" around
        gl.glTranslatef(-1.5f, 0.0f, -6.0f);
      
      
      gl.glLoadIdentity();
      gl.glPushMatrix();
      gl.glTranslatef(1.5f, 0.0f, -6.0f);
      gl.glRotatef(rquad, 0f, 1.0f, 0f);
      gl.glBegin(GL.GL_QUADS);           	// Draw A Quad
      //Torre
        
        gl.glColor3f(0.47f,0.53f,0.42f);			// Set The Color To Cinza
        gl.glVertex3f( 1.0f*x, 1.0f*x,-1.0f*x);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f*x, 1.0f*x,-1.0f*x);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f*x, 1.0f*x, 1.0f*x);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f*x, 1.0f*x, 1.0f*x);			// Bottom Right Of The Quad (Top)

        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glVertex3f( 1.0f*x, 1.0f*x, 1.0f*x);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f*x, 1.0f*x, 1.0f*x);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f*x, 1.0f*x,-1.0f*x);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f*x, 1.0f*x,-1.0f*x);			// Top Left Of The Quad (Back)

        gl.glVertex3f(-1.0f*x, 1.0f*x, 1.0f*x);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f*x, 1.0f*x,-1.0f*x);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glVertex3f( 1.0f*x, 1.0f*x,-1.0f*x);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f*x, 1.0f*x, 1.0f*x);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);
        
        
        //escada
        gl.glColor3f(1.0f,1.0f,0f);
        gl.glVertex3f( (1.0f*x*0.02f)/2, ((1.0f*x)*0.8f), 1.08f*x);			// Top Right Of The Quad (Front)
        gl.glVertex3f((-1.0f*x*0.02f)/2, ((1.0f*x)*0.8f), 1.08f*x);			// Top Left Of The Quad (Front)
        gl.glVertex3f((-1.0f*0.02f)/2,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( (1.0f*0.02f)/2,-1.0f, 1.0f);	
        
         
        gl.glEnd();
        gl.glPopMatrix();
        gl.glFlush();
      
      //rota��o do quadrado
      rquad += 0.1f;
    }
    
    
      public void init(GLAutoDrawable drawable)
    {
      GL gl = drawable.getGL();
      gl.glShadeModel(GL.GL_SMOOTH);              // Enable Smooth Shading
      gl.glClearColor(0.0f, 0.0f, 0.0f, 0.5f);    // Black Background
      gl.glClearDepth(1.0f);                      // Depth Buffer Setup
      gl.glEnable(GL.GL_DEPTH_TEST);							// Enables Depth Testing
      gl.glDepthFunc(GL.GL_LEQUAL);								// The Type Of Depth Testing To Do
      gl.glHint(GL.GL_PERSPECTIVE_CORRECTION_HINT, GL.GL_NICEST);	// Really Nice Perspective Calculations
     // gLDrawable.addKeyListener(this);
    }
  
      public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

       
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(90.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
        
    }

    public void keyPressed(KeyEvent e)
    {
      if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
      {
        animator.stop();
        System.exit(0);
      }
    }

    public void keyReleased(KeyEvent e) {}
 
    public void keyTyped(KeyEvent e) {}

        public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
  }

 
}