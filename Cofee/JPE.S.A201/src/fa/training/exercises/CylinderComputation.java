package fa.training.exercises;

import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius number:");
        double a =0 ;
        a = sc.nextDouble();
        System.out.println("Input height number:");
        double b =0 ;
        b = sc.nextDouble();
        double surface_area = 0, base_area = 0, volume = 0;
        System.out.println("Surface area is:" + (2*Math.PI*a*b));
        System.out.println("Base area is:" + (Math.PI*a*a));
        System.out.println("Volume is:" + (Math.PI*a*a*b));
    }
}
