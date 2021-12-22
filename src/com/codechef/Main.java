package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
	we can not make objects of abstract class:
	 */
        Scanner sc = new Scanner(System.in);
        Sbi s1 = new Sbi();
        s1.B = sc.nextInt();
        System.out.println(s1.transaction(););

    }
}
class Sbi extends Bank {
    int A=1000;
    int B;
    @Override
    void transaction() {
        if(B<1000){
            System.out.println("transaction can not be done");
        }
        else{
            System.out.println("transaction can be done");
        }
    }
}
 abstract class Bank{
    abstract void transaction();
 }
