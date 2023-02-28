package assignment;

import java.util.Scanner;
import java.util.logging.Logger;

class Getinput implements Cloneable{
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");
    int x;
    int y;
    Scanner sc = new Scanner(System.in);
    Getinput(){
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