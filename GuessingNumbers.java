/*
 * This game enables the user to input a number and runs until the user guesses the number
 * 
 * 
 */

import javax.swing.*;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int computerNum = (int) Math.random()*100+1;
		int userAnswer = 0;
		System.out.println("The correct answer would be "+ computerNum);
		
		int count = 1;
		
		while(userAnswer != computerNum) {
			String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", 3);
			
			userAnswer = Integer.parseInt(response);
			
			JOptionPane.showMessageDialog(null, ""+ detGuess(userAnswer, computerNum, count));
			
			count ++;
			
			
			
			
			
		}
		
		
	}
	
	public static String detGuess(int userAnswer, int computerNum, int count){
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNum ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNum) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < computerNum) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
	

}
