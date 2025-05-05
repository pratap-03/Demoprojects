
package Project;

import java.util.Scanner;

class Question{
    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    int Answer;
    Question(String q, String op1, String op2, String op3, String op4, int cAns) {
        question = q;
        option1 = op1;
        option2 = op2;
        option3 = op3;
        option4 = op4;
        Answer = cAns;
    }
    void Display(){
        System.out.println("");
        System.out.println("1." +question);
        System.out.println("1." +option1);
        System.out.println("2." +option2);
        System.out.println("3." +option3);
        System.out.println("4." +option4);
        System.out.println("");
        System.out.println("Please Enter the option");

    }
}

public class Quize {
    public static void main(String[] args) {
        Question Q1=new Question("What is Full from of JVM?","Java Virtual Machine ","Java View Machine ","Java Visual Manager ","Java Verified Machine ",1);
        Question Q2=new Question("Which keyword is used to create an object in Java?","new ","make ","object ","create ",1);
        Question Q3=new Question("Which method is the entry point of a Java program?","main() ","start() ","run() ","void() ",1);
        Question Q4=new Question(" Which of the following is not a primitive data type in Java?","String ","int ","double ","float ",1);

        int mark =0;
        System.out.println("");
        System.out.println("Lets Start the Quize");
        System.out.println("Question 1");
        Q1.Display();
        Scanner sc = new Scanner(System.in);
        int Ans1=sc.nextInt();
        if(Ans1 ==1){
            System.out.println("Your Answer is correct");
            mark++;
        }
        else {
            System.out.println(" Your Answer is Wrong ");
        }


        System.out.println("");
        System.out.println("Question 2");
        Q2.Display();
        Scanner sc2 = new Scanner(System.in);
        int Ans2=sc2.nextInt();
        if(Ans2 ==1){
            System.out.println("Your Answer is correct");
            mark++;
        }
        else {
            System.out.println(" Your Answer is Wrong ");
        }

        System.out.println("");
        System.out.println("Question 3");
        Q3.Display();
        Scanner sc3 = new Scanner(System.in);
        int Ans3=sc3.nextInt();
        if(Ans3 ==1){
            System.out.println("Your Answer is correct");
            mark++;
        }
        else {
            System.out.println(" Your Answer is Wrong ");
        }


        System.out.println("");
        System.out.println("Question 4");
        Q4.Display();
        Scanner sc4 = new Scanner(System.in);
        int Ans4=sc4.nextInt();
        if(Ans4 ==1){
            System.out.println("Your Answer is correct");
            mark++;
        }
        else {
            System.out.println(" Your Answer is Wrong ");
        }
        System.out.println("your Score is :- "+mark);
        System.out.println("");
        System.out.println("-------------------------------------------------------------------");
        if(mark>=4)
        {
            System.out.println("You are very good at concept and being into top list");
        } else if (mark>=3) {
            System.out.println("you are becoming toppr and just bit of extra efforts little required");

        } else if (mark>=2) {
            System.out.println("you are studing good but you need some extra effort");

        } else if (mark==1) {
            System.out.println("you must study much harder");

        }
        System.out.println("-------------------------------------------------------------------");
    }


}
