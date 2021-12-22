package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
	we can not make objects of abstract class:
	if we make objects of abstract class i'e
	Bank b1 = new Bank
	it will show an error and compiler will
	ask you to override the method in it too
	 */
        Scanner sc = new Scanner(System.in);
        Sbi s1 = new Sbi();
        s1.B = sc.nextInt();
        s1.transaction();

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
