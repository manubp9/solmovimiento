/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle campo;
    private Person persona;
    private Person child;
    private Circle wheel1;
    private Circle wheel2;
    private Square box;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

       
        campo = new Circle();
        campo.changeColor("green");
        campo.changeSize(1250);
        campo.moveHorizontal(-650);
        campo.moveVertical(125);
        campo.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.changeSize(80);
        sun.makeVisible();
       
      }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            campo.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
      /**
     * move sun and change color 
     */
    public void moveSun()
   {
         sun.slowMoveVertical(65);
        
        
       }   
        /**
     * walking person 
     */
    public void walkPerson()
    {
        persona = new Person();
        persona.makeVisible();
        persona.moveHorizontal(-270);
        persona.moveVertical(65);
        persona.slowMoveHorizontal(200);
    }
       /**
     * make a child car
     */
    public void childCar()
     {
         child = new Person();
         child.changeSize(30,20);
         child.moveVertical(40);
         child.moveHorizontal(140);
         child.makeVisible();
         
         wheel1 = new Circle();
         wheel1.changeSize(20);
         wheel1.moveVertical(190);
         wheel1.moveHorizontal(160);
         wheel1.makeVisible();
         
         wheel2 = new Circle();
         wheel2.changeSize(20);
         wheel2.moveVertical(190);
         wheel2.moveHorizontal(200);
         wheel2.makeVisible();
         
         box = new Square();
         box.changeSize(40);
         box.moveVertical(130);
         box.moveHorizontal(90);
         box.makeVisible();
       
         
        
}
  /**
     * make a child car run
     */
    public void childCarRun()
    {    child = new Person();
         child.changeSize(30,20);
         child.moveVertical(40);
         child.moveHorizontal(140);
         child.makeVisible();
         
         wheel1 = new Circle();
         wheel1.changeSize(20);
         wheel1.moveVertical(190);
         wheel1.moveHorizontal(160);
         wheel1.makeVisible();
         
         wheel2 = new Circle();
         wheel2.changeSize(20);
         wheel2.moveVertical(190);
         wheel2.moveHorizontal(200);
         wheel2.makeVisible();
         
         box = new Square();
         box.changeSize(40);
         box.moveVertical(130);
         box.moveHorizontal(90);
         box.makeVisible();
         
         child.slowMoveHorizontal(-100);
         wheel1.slowMoveHorizontal(-100);
         wheel2.slowMoveHorizontal(-100);
         box.slowMoveHorizontal(-100);
}
}