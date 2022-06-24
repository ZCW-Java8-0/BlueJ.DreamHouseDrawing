
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
    private Rectangl wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Rectangl pool;
    private Triangle tree;
    private Rectangl wall2;
    private Rectangl wall3;
    private Rectangl door;
    private Rectangl door2;
    private Square window2;
    private Rectangl ground;
    private Rectangl walkway;
    private Rectangl ground2;
    private Rectangl ground3;
    private Rectangl boardWalk;
    private Rectangl window3;
    private Rectangl window4;
    private Circle windowRound;
    private Rectangl rectangleWindow;
    private Rectangl rectangleWindow2;
    private Rectangl rectWind;
    private Rectangl squareGarage;
    private Rectangl squareGarageColor;
    private Square stars;
    private Rectangl treeBark;
    private Rectangl roofRec;
    

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
        
       
        sun = new Circle();
        sun.changeColor("Moon Yellow");
        //sun.moveHorizontal(600);
        //sun.moveVertical(-10);
        sun.makeInvisible();
        
        
        boardWalk = new Rectangl();
        boardWalk.changeWidth(400);
        boardWalk.changeHeight(20);
        boardWalk.moveVertical(400);
        boardWalk.moveHorizontal(300);
        boardWalk.changeColor("dark brown");
        boardWalk.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.changeSize(150, 10);
        tree.moveHorizontal(350);
        tree.moveVertical(250);
        tree.makeVisible();
        
        treeBark = new Rectangl();
        treeBark.changeHeight(40);
        treeBark.changeWidth(10);
        treeBark.moveHorizontal(365);
        treeBark.moveVertical(360);
        treeBark.changeColor("dark brown");
        treeBark.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.changeSize(150, 10);
        tree.moveHorizontal(380);
        tree.moveVertical(250);
        tree.makeVisible();
        
        treeBark = new Rectangl();
        treeBark.changeHeight(40);
        treeBark.changeWidth(10);
        treeBark.moveHorizontal(395);
        treeBark.moveVertical(360);
        treeBark.changeColor("dark brown");
        treeBark.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.changeSize(150, 10);
        tree.moveHorizontal(410);
        tree.moveVertical(250);
        tree.makeVisible();
        
        treeBark = new Rectangl();
        treeBark.changeHeight(40);
        treeBark.changeWidth(10);
        treeBark.moveHorizontal(425);
        treeBark.moveVertical(360);
        treeBark.changeColor("dark brown");
        treeBark.makeVisible();
        
        
        
        
        wall3 = new Rectangl();
        wall3.changeWidth(200);
        wall3.changeHeight(90);
        wall3.moveVertical(280);
        wall3.moveHorizontal(99);
        wall3.changeColor("tan");
        wall3.makeVisible();
        
        wall2 = new Rectangl();
        wall2.changeWidth(200);
        wall2.changeHeight(90);
        wall2.moveVertical(320);
        wall2.moveHorizontal(99);
        wall2.changeColor("tan");
        wall2.makeVisible();
        
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveVertical(300);
        window2.moveHorizontal(200);
        window2.makeVisible();
        
        
        window = new Square();
        window.changeColor("yellow");
        window.moveVertical(300);
        window.moveHorizontal(110);
        window.makeVisible();
        
        
        
        window3 = new Rectangl ();
        window3.changeColor("yellow");
        window3.moveVertical(350);
        window3.moveHorizontal(110);
        window3.changeHeight(45);
        window3.changeWidth(60);
        window3.makeVisible();
        
        
        window4 = new Rectangl ();
        window4.changeColor("yellow");
        window4.moveVertical(350);
        window4.moveHorizontal(230);
        window4.changeHeight(45);
        window4.changeWidth(55);
        window4.makeVisible();
        
        
        
        
        door2 = new Rectangl();
        door2.moveVertical(350);
        door2.moveHorizontal(180);
        door2.changeHeight(50);
        door2.changeWidth(40);
        door2.changeColor("dark brown");
        door2.makeVisible();
        
        door2 = new Rectangl();
        door2.moveVertical(370);
        door2.moveHorizontal(185);
        door2.changeHeight(5);
        door2.changeWidth(5);
        door2.changeColor("gold");
        door2.makeVisible();
        
        
        
        pool = new Rectangl();
        pool.changeWidth(400);
        pool.changeHeight(20);
        pool.moveVertical(400);
        pool.moveHorizontal(500);
        pool.changeColor("blue");
        pool.makeVisible();
        
    
        
        ground = new Rectangl();
        ground.changeWidth(300);
        ground.changeHeight(300);
        ground.moveVertical(400);
        ground.moveHorizontal(-100);
        ground.changeColor("dark green");
        ground.makeVisible();
        
        ground2 = new Rectangl();
        ground2.changeWidth(80);
        ground2.changeHeight(400);
        ground2.moveVertical(400);
        ground2.moveHorizontal(220);
        ground2.changeColor("dark green");
        ground2.makeVisible();
        
        
        ground3 = new Rectangl();
        ground3.changeWidth(700);
        ground3.changeHeight(300);
        ground3.moveVertical(420);
        ground3.moveHorizontal(270);
        ground3.changeColor("dark green");
        ground3.makeVisible();
        
        walkway = new Rectangl();
        walkway.changeWidth(50);
        walkway.changeHeight(500);
        walkway.moveVertical(400);
        walkway.moveHorizontal(180);
        walkway.changeColor("brown");
        walkway.makeVisible();
        
        

        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(100, 300);
        roof.moveVertical(230);
        roof.moveHorizontal(180);
        roof.makeVisible();
        
        windowRound = new Circle();
        windowRound.changeColor("yellow");
        windowRound.moveVertical(220);
        windowRound.moveHorizontal(185);
        windowRound.changeSize(50);
        windowRound.makeVisible();
        
        rectangleWindow = new Rectangl();
        rectangleWindow.moveVertical(250);
        rectangleWindow.moveHorizontal(175);
        rectangleWindow.changeHeight(10);
        rectangleWindow.changeWidth(50);
        rectangleWindow.changeColor("dark brown");
        rectangleWindow.makeVisible();
        
        rectangleWindow2 = new Rectangl();
        rectangleWindow2.moveVertical(230);
        rectangleWindow2.moveHorizontal(195);
        rectangleWindow2.changeHeight(50);
        rectangleWindow2.changeWidth(10);
        rectangleWindow2.changeColor("dark brown");
        rectangleWindow2.makeVisible();
        

        
        
        squareGarage = new Rectangl();
        squareGarage.changeColor("tan");
        squareGarage.moveVertical(320);
        squareGarage.moveHorizontal(-50);
        squareGarage.changeHeight(80);
        squareGarage.changeWidth(150);
        squareGarage.makeVisible();
        
        squareGarageColor = new Rectangl();
        squareGarageColor.changeColor("Gray");
        squareGarageColor.moveVertical(330);
        squareGarageColor.moveHorizontal(-50);
        squareGarageColor.changeHeight(70);
        squareGarageColor.changeWidth(150);
        squareGarageColor.makeVisible();
        
        roofRec = new Rectangl();
        roofRec.changeColor("black");
        roofRec.changeHeight(10);
        roofRec.changeWidth(148);
        roofRec.moveVertical(310);
        roofRec.moveHorizontal(-50);
        roofRec.makeVisible();
        
        walkway = new Rectangl();
        walkway.changeWidth(150);
        walkway.changeHeight(500);
        walkway.moveVertical(400);
        walkway.moveHorizontal(-50);
        walkway.changeColor("gravel");
        walkway.makeVisible();
        
        sun.makeVisible();
        sun.slowMoveHorizontal(600);
        
        
        
        
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
