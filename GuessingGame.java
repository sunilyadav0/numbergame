import java.lang.Math;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int rt=0,t=0;
        char ch = 'y';
        do{
            t++;
            int r = (int)(Math.random()*(max-min+1)+min);
            c=0;
            while(true){
                if(c==5){
                    System.out.println("Sorry, Play again!");
                    break;
                }
                System.out.print("Enter a number between 1-100 : ");
                int k = sc.nextInt();
                c++;
                if(k<r){
                    System.out.println("Too Low");
                }else if(k>r){
                    System.out.println("Too high");
                }else{
                    rt++;
                    System.out.println("You have correctly guessed in "+c+" attempts");
                    break;
                }
            }
            System.out.println("Your Score : "+rt+"/"+t);
            System.out.print("Do you wanna play again(y/n) : ");
            ch = sc.next().charAt(0);
        }while(ch=='y'||ch=='Y');
        sc.close();
    }
}
