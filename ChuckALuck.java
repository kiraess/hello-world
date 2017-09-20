/*Betting game. See if you can guess the right number and get money(sum)
  exeter */


import java.util.Scanner;

public class ChuckALuck {
  public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("Welcome to Chuck-A-Luck!");

int die1 = (int)(Math.random()*6+1);
int die2 = (int)(Math.random()*6+1);
int die3 = (int)(Math.random()*6+1);
int sum = 0;
int user = 1;

while (user == 1)
  {System.out.println("Guess a number between 1 to 5");
	   user = input.nextInt();
	    {if (user == die1)
		       sum = sum + 1;
	     if (user == die2)
		       sum = sum + 1;
	     if (user ==die3)
		       sum = sum + 1;
	     if (user != die1 && user != die2 && user != die3)
		       sum = sum-1;
	   System.out.println("Die 1: " + die1);
	   System.out.println("Die 2: " + die2);
	   System.out.println("Die 3: " + die3);
	   System.out.println("Money: " + sum);
      }// end of if

	 System.out.println("");
	 System.out.println("Do you want to play again?");
	 System.out.println("1=yes 2=no");
	 user = input.nextInt();
  }//end of While loop

if (sum<0)
	System.out.println("haha you owe me $" + sum);
else
	System.out.println("You win $" +sum);

	}//end of Main
}//end of class
