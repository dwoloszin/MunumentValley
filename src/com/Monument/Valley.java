package com.Monument;

import com.sun.opengl.util.Animator;
import java.awt.*;
import java.awt.event.*;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

public class Valley
{
  static Animator animator = null;

  static class Renderer
    implements GLEventListener,
               KeyListener
  {
    private float rquad = 0.0f;
    private float rtri = 0.0f;

    /** Called by the drawable to initiate OpenGL rendering by the client.
     * After all GLEventListeners have been notified of a display event, the 
     * drawable will swap its buffers if necessary.
     * @param gLDrawable The GLDrawable object.
     */    
         
       public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();

        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();

        // Move the "drawing cursor" around
        gl.glTranslatef(-1.5f, 0.0f, -6.0f);
      
      gl.glRotatef(rtri, 0.0f, 1.0f, 0.0f);
      gl.glBegin(GL.GL_TRIANGLES);		    // Drawing Using Triangles
        gl.glColor3f(1.0f,0.0f,0.0f);			// Red
        gl.glVertex3f( 0.0f, 1.0f, 0.0f);			// Top Of Triangle (Front)
        gl.glColor3f(0.0f,1.0f,0.0f);			// Green
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Left Of Triangle (Front)
        gl.glColor3f(0.0f,0.0f,1.0f);			// Blue
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Right Of Triangle (Front)
        gl.glColor3f(1.0f,0.0f,0.0f);			// Red
        gl.glVertex3f( 0.0f, 1.0f, 0.0f);			// Top Of Triangle (Right)
        gl.glColor3f(0.0f,0.0f,1.0f);			// Blue
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Left Of Triangle (Right)
        gl.glColor3f(0.0f,1.0f,0.0f);			// Green
        gl.glVertex3f( 1.0f,-1.0f, -1.0f);			// Right Of Triangle (Right)
        gl.glColor3f(1.0f,0.0f,0.0f);			// Red
        gl.glVertex3f( 0.0f, 1.0f, 0.0f);			// Top Of Triangle (Back)
        gl.glColor3f(0.0f,1.0f,0.0f);			// Green
        gl.glVertex3f( 1.0f,-1.0f, -1.0f);			// Left Of Triangle (Back)
        gl.glColor3f(0.0f,0.0f,1.0f);			// Blue
        gl.glVertex3f(-1.0f,-1.0f, -1.0f);			// Right Of Triangle (Back)
        gl.glColor3f(1.0f,0.0f,0.0f);			// Red
        gl.glVertex3f( 0.0f, 1.0f, 0.0f);			// Top Of Triangle (Left)
        gl.glColor3f(0.0f,0.0f,1.0f);			// Blue
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Left Of Triangle (Left)
        gl.glColor3f(0.0f,1.0f,0.0f);			// Green
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Right Of Triangle (Left)
      gl.glEnd();				// Finished Drawing The Triangle
      gl.glLoadIdentity();
      gl.glTranslatef(1.5f, 0.0f, -6.0f);
      gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
      gl.glBegin(GL.GL_QUADS);           	// Draw A Quad
        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f,0.5f,0.0f);			// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f,1.0f,0.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.0f,0.0f,1.0f);			// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f,0.0f,1.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
      gl.glEnd();				// Done Drawing The Quad
      gl.glFlush();
      rtri += 0.2f;
      rquad += 0.15f;
    }
       public void displayChanged(GLDrawable gLDrawable, boolean modeChanged, boolean deviceChanged)
    {
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

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
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

  public static void main(String[] args)
  {
    Frame frame = new Frame("3D Shapes");
    
    GLCanvas canvas = new GLCanvas();
    canvas.addGLEventListener(new Renderer());
    frame.add(canvas);
    frame.setSize(640, 480);
    animator = new Animator(canvas);
    frame.addWindowListener(new WindowAdapter()
    {
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