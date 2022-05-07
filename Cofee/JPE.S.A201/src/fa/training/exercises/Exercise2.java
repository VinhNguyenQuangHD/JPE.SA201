package fa.training.exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st number:");
        int a =0 ;
        a = sc.nextInt();
        System.out.println("Input 2nd number:");
        int b =0 ;
        b = sc.nextInt();
        System.out.println("Input 3rd number:");
        int c =0 ;
        c = sc.nextInt();
        System.out.println("Input 4th number:");
        int d =0 ;
        d = sc.nextInt();
        if(a == b || b == c || c == d || d == a || b == d || a == c){
            System.out.println("Number are equal");
        }else {
            System.out.println("Number are not equal !!");
        }
    }
}
