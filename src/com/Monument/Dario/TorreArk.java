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
                 
       public void display(GLAutoDrawable drawable) {
            GL gl = drawable.getGL();

        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        //Torre
        gl.glLoadIdentity();
        gl.glPushMatrix();
        gl.glTranslatef(1.5f, 0.0f, -6.0f);
        //gl.glRotatef(rquad, 0f, 1.0f, 0f);
        gl.glBegin(GL.GL_QUADS);
        // Torre Base
            gl.glColor3f(0.83f,0.83f,0.83f);
            //front
            gl.glVertex3f( -0.5f, -0.5f, 0.5f);
            gl.glVertex3f( 0.5f, -0.5f, 0.5f);
            gl.glVertex3f( 0.38f, 0.5f, 0.38f);
            gl.glVertex3f( -0.38f, 0.5f, 0.38f);
            
            //back
            gl.glVertex3f( -0.5f, -0.5f, -0.5f);
            gl.glVertex3f( 0.5f, -0.5f, -0.5f);
            gl.glVertex3f( 0.38f, 0.5f, -0.38f);
            gl.glVertex3f( -0.38f, 0.5f, -0.38f);

            //lateral esquerda
            gl.glVertex3f( -0.5f, -0.5f, 0.5f);
            gl.glVertex3f( -0.38f, 0.5f, 0.38f);
            gl.glVertex3f( -0.38f, 0.5f, -0.38f);
            gl.glVertex3f( -0.5f, -0.5f, -0.5f);
            
            //Latwral direuta
            gl.glVertex3f( 0.5f, -0.5f, 0.5f);
            gl.glVertex3f( 0.38f, 0.5f, 0.38f);
            gl.glVertex3f( 0.38f, 0.5f, -0.38f);
            gl.glVertex3f( 0.5f, -0.5f, -0.5f);
            
        //torre superior
            //base
            gl.glVertex3f( -0.38f, 0.5f, 0.38f);
            gl.glVertex3f( 0.38f, 0.5f, 0.38f);
            gl.glVertex3f( 0.38f, 0.5f, -0.38f);
            gl.glVertex3f( -0.38f, 0.5f, -0.38f);
            
            //superior
            gl.glVertex3f( 0.37f, 0.62f, 0.37f);
            gl.glVertex3f( 0.37f, 0.62f, 0.19f);
            gl.glVertex3f( 0.37f, 0.5f, 0.19f);
            gl.glVertex3f( 0.37f, 0.5f, 0.37f);
                 
            gl.glVertex3f( 0.37f, 0.62f, -0.37f);
            gl.glVertex3f( 0.37f, 0.62f, -0.19f);
            gl.glVertex3f( 0.37f, 0.5f, -0.19f);
            gl.glVertex3f( 0.37f, 0.5f, -0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, 0.37f);
            gl.glVertex3f( -0.37f, 0.62f, 0.19f);
            gl.glVertex3f( -0.37f, 0.5f, 0.19f);
            gl.glVertex3f( -0.37f, 0.5f, 0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, -0.37f);
            gl.glVertex3f( -0.37f, 0.62f, -0.19f);
            gl.glVertex3f( -0.37f, 0.5f, -0.19f);
            gl.glVertex3f( -0.37f, 0.5f, -0.37f);
            
            //espelho2
            gl.glVertex3f( 0.37f, 0.62f, 0.37f);
            gl.glVertex3f( 0.19f, 0.62f, 0.37f);
            gl.glVertex3f( 0.19f, 0.5f, 0.37f);
            gl.glVertex3f( 0.37f, 0.5f, 0.37f);
            
            gl.glVertex3f( 0.37f, 0.62f, -0.37f);
            gl.glVertex3f( 0.19f, 0.62f, -0.37f);
            gl.glVertex3f( 0.19f, 0.5f, -0.37f);
            gl.glVertex3f( 0.37f, 0.5f, -0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, 0.37f);
            gl.glVertex3f( -0.19f, 0.62f, 0.37f);
            gl.glVertex3f( -0.19f, 0.5f, 0.37f);
            gl.glVertex3f( -0.37f, 0.5f, 0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, -0.37f);
            gl.glVertex3f( -0.19f, 0.62f, -0.37f);
            gl.glVertex3f( -0.19f, 0.5f, -0.37f);
            gl.glVertex3f( -0.37f, 0.5f, -0.37f);
 
            //escada
            gl.glColor3f(1.0f,1.0f,0.0f);
            gl.glVertex3f( -0.26f, -0.5f, 0.51f);
            gl.glVertex3f( -0.22f, -0.5f, 0.51f);
            gl.glVertex3f( -0.22f, 0.26f, 0.42f);
            gl.glVertex3f( -0.26f, 0.26f, 0.42f);
            
            gl.glColor3f(1.0f,1.0f,0.0f);
            gl.glVertex3f( -0.08f, -0.5f, 0.51f);
            gl.glVertex3f( -0.04f, -0.5f, 0.51f);
            gl.glVertex3f( -0.04f, 0.26f, 0.42f);
            gl.glVertex3f( -0.08f, 0.26f, 0.42f);
            
            //degraus
            
            gl.glVertex3f( -0.05f, -0.32f, 0.49f);
            gl.glVertex3f( -0.25f, -0.32f, 0.49f);
            gl.glVertex3f( -0.25f, -0.38f, 0.50f);
            gl.glVertex3f( -0.05f, -0.38f, 0.50f);
            
            gl.glVertex3f( -0.05f, -0.14f, 0.47f);
            gl.glVertex3f( -0.25f, -0.14f, 0.47f);
            gl.glVertex3f( -0.25f, -0.20f, 0.48f);
            gl.glVertex3f( -0.05f, -0.20f, 0.48f);
            
            gl.glVertex3f( -0.05f, 0.02f, 0.45f);
            gl.glVertex3f( -0.25f, 0.02f, 0.45f);
            gl.glVertex3f( -0.25f, -0.04f, 0.46f);
            gl.glVertex3f( -0.05f, -0.04f, 0.46f);
            
            gl.glVertex3f( -0.05f, 0.15f, 0.43f);
            gl.glVertex3f( -0.25f, 0.15f, 0.43f);
            gl.glVertex3f( -0.25f, 0.21f, 0.42f);
            gl.glVertex3f( -0.05f, 0.21f, 0.42f);
            
            //Janela
            gl.glColor3f(0.0f,0.0f,0.0f);
            gl.glVertex3f( 0.06f, 0.28f, 0.41f);
            gl.glVertex3f( 0.25f, 0.28f, 0.41f);
            gl.glVertex3f( 0.25f, 0.10f, 0.43f);
            gl.glVertex3f( 0.06f, 0.10f, 0.43f);
            
  
         
        gl.glEnd();
        gl.glPopMatrix();
        
        
        //TORRE 2
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, 0.0f, -6.0f);
        //gl.glRotatef(rquad, 0f, 1.0f, 0f);
        gl.glBegin(GL.GL_QUADS);
        // Torre Base
            gl.glColor3f(0.83f,0.83f,0.83f);
            //front
            gl.glVertex3f( -0.5f, -0.5f, 0.5f);
            gl.glVertex3f( 0.5f, -0.5f, 0.5f);
            gl.glVertex3f( 0.38f, 0.5f, 0.38f);
            gl.glVertex3f( -0.38f, 0.5f, 0.38f);
            
            //back
            gl.glVertex3f( -0.5f, -0.5f, -0.5f);
            gl.glVertex3f( 0.5f, -0.5f, -0.5f);
            gl.glVertex3f( 0.38f, 0.5f, -0.38f);
            gl.glVertex3f( -0.38f, 0.5f, -0.38f);

            //lateral esquerda
            gl.glVertex3f( -0.5f, -0.5f, 0.5f);
            gl.glVertex3f( -0.38f, 0.5f, 0.38f);
            gl.glVertex3f( -0.38f, 0.5f, -0.38f);
            gl.glVertex3f( -0.5f, -0.5f, -0.5f);
            
            //Latwral direuta
            gl.glVertex3f( 0.5f, -0.5f, 0.5f);
            gl.glVertex3f( 0.38f, 0.5f, 0.38f);
            gl.glVertex3f( 0.38f, 0.5f, -0.38f);
            gl.glVertex3f( 0.5f, -0.5f, -0.5f);
            
        //torre superior
            //base
            gl.glVertex3f( -0.38f, 0.5f, 0.38f);
            gl.glVertex3f( 0.38f, 0.5f, 0.38f);
            gl.glVertex3f( 0.38f, 0.5f, -0.38f);
            gl.glVertex3f( -0.38f, 0.5f, -0.38f);
            
            //superior
            gl.glVertex3f( 0.37f, 0.62f, 0.37f);
            gl.glVertex3f( 0.37f, 0.62f, 0.19f);
            gl.glVertex3f( 0.37f, 0.5f, 0.19f);
            gl.glVertex3f( 0.37f, 0.5f, 0.37f);
                 
            gl.glVertex3f( 0.37f, 0.62f, -0.37f);
            gl.glVertex3f( 0.37f, 0.62f, -0.19f);
            gl.glVertex3f( 0.37f, 0.5f, -0.19f);
            gl.glVertex3f( 0.37f, 0.5f, -0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, 0.37f);
            gl.glVertex3f( -0.37f, 0.62f, 0.19f);
            gl.glVertex3f( -0.37f, 0.5f, 0.19f);
            gl.glVertex3f( -0.37f, 0.5f, 0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, -0.37f);
            gl.glVertex3f( -0.37f, 0.62f, -0.19f);
            gl.glVertex3f( -0.37f, 0.5f, -0.19f);
            gl.glVertex3f( -0.37f, 0.5f, -0.37f);
            
            //espelho2
            gl.glVertex3f( 0.37f, 0.62f, 0.37f);
            gl.glVertex3f( 0.19f, 0.62f, 0.37f);
            gl.glVertex3f( 0.19f, 0.5f, 0.37f);
            gl.glVertex3f( 0.37f, 0.5f, 0.37f);
            
            gl.glVertex3f( 0.37f, 0.62f, -0.37f);
            gl.glVertex3f( 0.19f, 0.62f, -0.37f);
            gl.glVertex3f( 0.19f, 0.5f, -0.37f);
            gl.glVertex3f( 0.37f, 0.5f, -0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, 0.37f);
            gl.glVertex3f( -0.19f, 0.62f, 0.37f);
            gl.glVertex3f( -0.19f, 0.5f, 0.37f);
            gl.glVertex3f( -0.37f, 0.5f, 0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, -0.37f);
            gl.glVertex3f( -0.19f, 0.62f, -0.37f);
            gl.glVertex3f( -0.19f, 0.5f, -0.37f);
            gl.glVertex3f( -0.37f, 0.5f, -0.37f);
 
            //escada
            gl.glColor3f(1.0f,1.0f,0.0f);
            gl.glVertex3f( -0.26f, -0.5f, 0.51f);
            gl.glVertex3f( -0.22f, -0.5f, 0.51f);
            gl.glVertex3f( -0.22f, 0.26f, 0.42f);
            gl.glVertex3f( -0.26f, 0.26f, 0.42f);
            
            gl.glColor3f(1.0f,1.0f,0.0f);
            gl.glVertex3f( -0.08f, -0.5f, 0.51f);
            gl.glVertex3f( -0.04f, -0.5f, 0.51f);
            gl.glVertex3f( -0.04f, 0.26f, 0.42f);
            gl.glVertex3f( -0.08f, 0.26f, 0.42f);
            
            //degraus
            
            gl.glVertex3f( -0.05f, -0.32f, 0.49f);
            gl.glVertex3f( -0.25f, -0.32f, 0.49f);
            gl.glVertex3f( -0.25f, -0.38f, 0.50f);
            gl.glVertex3f( -0.05f, -0.38f, 0.50f);
            
            gl.glVertex3f( -0.05f, -0.14f, 0.47f);
            gl.glVertex3f( -0.25f, -0.14f, 0.47f);
            gl.glVertex3f( -0.25f, -0.20f, 0.48f);
            gl.glVertex3f( -0.05f, -0.20f, 0.48f);
            
            gl.glVertex3f( -0.05f, 0.02f, 0.45f);
            gl.glVertex3f( -0.25f, 0.02f, 0.45f);
            gl.glVertex3f( -0.25f, -0.04f, 0.46f);
            gl.glVertex3f( -0.05f, -0.04f, 0.46f);
            
            gl.glVertex3f( -0.05f, 0.15f, 0.43f);
            gl.glVertex3f( -0.25f, 0.15f, 0.43f);
            gl.glVertex3f( -0.25f, 0.21f, 0.42f);
            gl.glVertex3f( -0.05f, 0.21f, 0.42f);
            
            //Janela
            gl.glColor3f(0.0f,0.0f,0.0f);
            gl.glVertex3f( 0.06f, 0.28f, 0.41f);
            gl.glVertex3f( 0.25f, 0.28f, 0.41f);
            gl.glVertex3f( 0.25f, 0.10f, 0.43f);
            gl.glVertex3f( 0.06f, 0.10f, 0.43f);
            
  
         
        gl.glEnd();
        gl.glPopMatrix();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Arena
            gl.glPushMatrix();
            gl.glTranslatef(1.9f, 0.0f, -6.0f);
            //gl.glRotatef(rquad, 0f, 1.0f, 0f);
            gl.glBegin(GL.GL_QUADS);
            gl.glColor3f(0.48f,0.63f,0.14f);
            gl.glVertex3f( 0.84f, -0.5f, 1.56f);
            gl.glVertex3f( -6f, -0.5f, 1.56f);
            gl.glVertex3f( -6f, -0.5f, -12.56f);
            gl.glVertex3f( 0.84f, -0.5f, -12.56f);
            gl.glEnd();
            gl.glPopMatrix();
            
            
            
        // Trilha
            gl.glPushMatrix();
            gl.glTranslatef(0.0f, 0.01f, -6.0f);
            gl.glBegin(GL.GL_QUADS);
            gl.glColor3f(1.0f, 0.84f, 0.0f);
            gl.glVertex3f(-2.0f, -0.5f, -1.0f);
            gl.glVertex3f(-3.0f, -0.5f, -1.06f);
            gl.glVertex3f(-3.0f, -0.5f, -12.56f);
            gl.glVertex3f(-2.0f, -0.5f, -12.56f);
            gl.glEnd();
            gl.glPopMatrix();
            
            
            
        gl.glFlush();
      
      //rotação do quadrado
     // rquad += 0.5f;
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
        glu.gluPerspective(45.0f, h, 5.0, 50.0);
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