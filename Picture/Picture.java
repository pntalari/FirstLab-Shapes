
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
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Triangle treeTop;
    private Square treeBottom;
    private Circle knob;
    private Square door;

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
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(1);
        window.moveVertical(100);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(70);
        window.moveVertical(100);
        window.makeVisible();
        
        door = new Square();
        door.changeColor("magenta");
        door.moveHorizontal(35);
        door.moveVertical(150);
        door.makeVisible();
        
        knob = new Circle();
        knob.changeColor("black");
        knob.moveHorizontal(90);
        knob.moveVertical(150);
        knob.changeSize(10);
        knob.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        treeTop = new Triangle();
        treeTop.changeColor("green");
        treeTop.changeSize(90, 50);
        treeTop.moveHorizontal(150);
        treeTop.moveVertical(90);
        treeTop.makeVisible();
        
        treeBottom = new Square();
        treeBottom.changeColor("magenta");
        treeBottom.changeSize(25);
        treeBottom.moveHorizontal(130);
        treeBottom.moveVertical(145);
        treeBottom.makeVisible();
        
        
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
