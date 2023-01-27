// 2. Design a class for a basic point in 2D space. The class should have the following features:
//- Instance variables for the x and y coordinates of the point.
//- A constructor that allows the user to create a point with given x and y coordinates.
//- An equals method that returns true if the given object is a point with the same x and y coordinates, and false otherwise.
//- A clone method that creates and returns a new point with the same x and y coordinates as the original point.

package assignment;
import java.util.Scanner;
import java.util.logging.Logger;


class getInput implements Cloneable{
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");
    int x,y;
    Scanner sc = new Scanner(System.in);
    getInput(){
        LOGGER.info("Enter coordinate x: ");
        x = sc.nextInt();
        LOGGER.info("Enter the coordinate y: ");
        y = sc.nextInt();
    }
    boolean check(int x1, int y1){
        return x==x1 && y==y1;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}


class App{
    public static final Logger LOGGER = Logger.getLogger("IndoLogging");
    public static void main(String[] args)throws CloneNotSupportedException { 
        
            getInput obj1 = new getInput();
            getInput objclone = (getInput)obj1.clone();
            Scanner sc = new Scanner(System.in);
            LOGGER.info("Enter new coordinate x1: ");
            int x1 = sc.nextInt();
            LOGGER.info("Enter new coordinate y1: ");
            int y1 = sc.nextInt();
            boolean result1 = obj1.check(x1,y1);
            LOGGER.info(String.valueOf(result1));
            LOGGER.info("Original Coordinate: "+obj1.x);
            LOGGER.info("Original Coordinate: "+obj1.y);
            int Clonedx = objclone.x=x1;
            LOGGER.info("Clonned Coordinate x2: "+Clonedx);
            int Clonedy = objclone.y=y1;
            LOGGER.info("Clonned Coordinate: "+Clonedy);
            
            
    }
}
