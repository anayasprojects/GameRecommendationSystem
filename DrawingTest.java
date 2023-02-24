/* 
   This is a multi-line comment.  You can write notes here.
   And here...
   And here...
*/

import gpdraw.*;
import java.awt.Color;

public class DrawingTest {
    
    public static void main(String[] args) {

        // This is a single-line comment
        
        SketchPad paper;                 // declare a SketchPad variable
        DrawingTool pencil;
        Color green = new Color(0, 255, 0);              // declare a DrawingTool variable
  
        paper = new SketchPad(400,400);  // create the SketchPad
        pencil = new DrawingTool(paper); // create the DrawingTool
        
        pencil.down();
        pencil.setColor(green);                   // follow these commands to
        pencil.fillRect(400,400);
    }   
}