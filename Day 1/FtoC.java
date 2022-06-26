import java.util.Scanner;

import java.util.Scanner;
class cal{
    double f;
    double c;
    Scanner scan = new Scanner(System.in);
    void input(){
        System.out.println("Enter temp in f : ");
        f = scan.nextDouble();
    }
    void compute(){
        // Fahrenheit to Celsius degree
        c = ((f - 32) * 5)/9;
    }

    void display(){
        // display value of c
        System.out.println("temp in C : " + c );
    }
}

public class ftoc {
    public static void main(String[] args){
        cal c = new cal();
        c.input();
        c.compute();
        c.display();

    }
    
}
