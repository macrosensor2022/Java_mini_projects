import java.util.Scanner;

public  class Main {
    static void main() {
        //Java quiz game

        //Question array
        //Options array [][]
        //Declare Variables
        //Welcome message
        //Question(loop)
        //  Options
        //  Get guess from user
        //  check our guess for correctness
        // Display final score
        String[] questions =   {" What is the main function of a router?", " which part of the computer is considered the brain?", "What year was facebook launched?","Who is known as the father of computers?","What was the first programming language?"};

        String[][] Options = { {"1. Storing Files ", "2. Encrypting data ", "3. Directing internet traffic","4. Managing passwords"},
                {"1.CPU","2.Harddrive","3.Ram","4. GPU"},
                {"1.2000","2. 2004","3. 2006 ","4.2008 "},
                {"1.Steve Jobs","2.Bill Gates","3.Alan tuning","4.Charles Barbage"},
                {"1.COBOL","2. C","3.Fortran","4.Assembly"}

        };

        int[]answers={3,1,2,4,3};
        int score= 0;
        int guess;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to java quiz game");

        for(int i=0;i<questions.length;i++) {
            System.out.println(questions[i]);
            for(String opt:Options[i]) {
                System.out.println(opt);
            }
            System.out.print("What is your choice?");
            guess=scanner.nextInt();
            if(guess==answers[i]) {
                System.out.println("Correct!");

                score+=1;

            }
            else {
                System.out.println("Wrong!");
            }
        }
        scanner.close();

        System.out.println("The score is "+score+" Out of "+questions.length);


    }
}