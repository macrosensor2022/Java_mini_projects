import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
Scanner sc = new Scanner(System.in);
int balance=100;
int bet;
int payout;
String[] row;
        System.out.println("***********************");
        System.out.println("Welcome to java slots ");
        System.out.println("symbols :🍒,🍉,🍋,🔔,⭐ ");
        System.out.println("***************************");

        while (balance>0){
            System.out.println("current balance : $"+balance);
            System.out.println("Place your bet amount: ");
            bet = sc.nextInt();

sc.nextLine();

            if(bet>balance)
            {
                System.out.println("Insufficient balance");
                continue;
            }
            else if(bet<=0)
            {
                System.out.println("Bet greater than zero");
                continue;
            }
            else {
                balance-=bet;
                System.out.println("$"+balance);
            }
            System.out.println("Spinning....");
            row= spinrow();
            if(row[0].equals(row[1]) && row[1].equals(row[2]))
            {
payout=bet*5;
                System.out.println("Jackpot you've won $  "+ payout);
                balance+=payout;


            }
            else {
                System.out.println("You've lost $"+bet);
            }

            System.out.println("would you like to quit? (yes/no)");
            String qt= sc.nextLine().toLowerCase();

            if(qt.equals("yes"))
            {
                System.out.println("Thanks for playing the final balance is $"+balance);
                break;
            }

            else if(qt.equals("no") && balance>0)
            {
                System.out.println("Well you continue ");
                continue;
            }

            if(balance<=0)
            {
                System.out.println("Out of money  game over");
            }

        }

        sc.close();
    }

    static String[] spinrow(){
        String[] symbols={"🍒","🍉","🍋","🔔","⭐"};
        String[] row = new String[3];
        Random rand = new Random();
        for(int i= 0 ;i< row.length;i++){
            row[i]=symbols[rand.nextInt(symbols.length)];


        }
        System.out.println(row[0]+"|"+row[1]+"|"+row[2]);
        return row;

    }
}
