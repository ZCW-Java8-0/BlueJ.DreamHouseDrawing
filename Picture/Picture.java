
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square window2;
    private Circle door;
    private Square wall;
    private Square window;
    private Square windowpane;
    private Square windowpane2;
    private Triangle roof;
    private Circle sun;
    private Square lawn;
    private Square garage;
    private Square garagedoor;

    
    
    
    

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
        wall.moveVertical(80);
        wall.changeColor("blue");
        wall.changeSize(400);
        wall.makeVisible();
        

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.changeSize(85);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(180);
        window2.moveVertical(100);
        window2.changeSize(85);
        window2.makeVisible();
        
        windowpane = new Square();
        windowpane.changeColor("white");
        windowpane.moveHorizontal(22);
        windowpane.moveVertical(105);
        windowpane.changeSize(75);
        windowpane.makeVisible();
        
        windowpane2 = new Square();
        windowpane2.changeColor("white");
        windowpane2.moveHorizontal(182);
        windowpane2.moveVertical(105);
        windowpane2.changeSize(75);
        windowpane2.makeVisible();
        
        
        roof = new Triangle();
        roof.changeSize(120, 416);
        roof.moveHorizontal(258);
        roof.moveVertical(13);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(500);
        sun.moveVertical(-10);
        sun.changeSize(200);
        sun.makeVisible();
        
        door = new Circle();
        door.changeColor("brown");
        door.moveHorizontal(200);
        door.moveVertical(350);
        door.changeSize(100);
        door.makeVisible();
        
        lawn = new Square();
        lawn.changeColor("green");
        lawn.moveHorizontal(-58);
        lawn.moveVertical(475);
        lawn.changeSize(800);
        lawn.makeVisible();

        garage = new Square();
        garage.changeColor("red");
        garage.moveHorizontal(397);
        garage.moveVertical(350);
        garage.changeSize(130);
        garage.makeVisible();
        
        garagedoor = new Square();
        garagedoor.changeColor("black");
        garagedoor.moveHorizontal(420);
        garagedoor.moveVertical(400);
        garagedoor.changeSize(80);
        garagedoor.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
