package java_methods;

import java.util.Scanner;

public class method_b {
    public static void main(String[] args) {
        int x,y,z;
        int largest;
        int smallest;
        Scanner X = new Scanner(System.in);

        System.out.print("Enter Num 1: ");
        x = X.nextInt();

        System.out.print("Enter Num 2: ");
        y = X.nextInt();

        System.out.print("Enter Num 3: ");
        z = X.nextInt();

        if( x>y && x> z)
            largest = x;
        else if(y>x && y>z)
            largest = y;
        else
            largest = z;

        System.out.println("Largest Number is : "+largest);

        if( x<y && x< z)
            smallest = x;
        else if(y<x && y<z)
            smallest = y;
        else
            smallest = z;
        System.out.println("smallest Number is : "+smallest);


        System.out.print("your smallest number is " + smallest);
        System.out.println(" and your largest number is " + largest);


    }
}