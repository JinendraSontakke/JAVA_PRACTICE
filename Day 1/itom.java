// program that reads a number in inches, converts it to meters
import java.util.*;
public class itom {
    double i;
    double m;
    Scanner scan = new Scanner(System.in);
    void input(){
        System.out.println("Enter value : ");
        i = scan.nextDouble();
    }
    void compute(){
        m = i * 0.0254;
    }
    void display(){
        System.out.println("value in meter : " + m);
    }
    
    public static void main(String[] args){
        itom i = new itom();
        i.input();
        i.compute();
        i.display();
    }

}
