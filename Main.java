import java.util.Scanner;

import static java.lang.Math.*;

class Main {
    public static void main(String[] args) {
        int myNum = (int)(random()*100);
        Scanner sc = new Scanner(System.in);
        int yourNum;
        System.out.println("lets play a game where you have to guess my number between 1- 100 !");
        do{
            System.out.print("Enter the number: ");
            yourNum = sc.nextInt();
            if (myNum == yourNum) {
                System.out.println("YEAAAAAA YOU GUESSED IT RIGHT !");
                break;
            }
            else if (myNum > yourNum){
                System.out.println("OHh you guessed number is small ");
            }
            else {
                System.out.println("OHh you guessed number is large ");
            }
        }while(yourNum >=0);
            System.out.print("My Guessed number was: ");
            System.out.println(myNum);
    }
}

