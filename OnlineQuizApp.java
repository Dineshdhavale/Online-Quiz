package com.elevateLabs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineQuizApp {
	 
	public static void main(String[] args) {
		
		List<Question> questions = new ArrayList<>();
		
		questions.add(new Question("What is 7 + 8?",new String[] {"13","14","15","16"},2));
		
		 questions.add(new Question("What is the capital of india?",
	                new String[]{"Mumbai", "Pune", "Benglore", "Dehli"},3));
		
		questions.add(new Question("In which year did India gain independence?",
				new String[] {"1946","1947","1945","1948"},1));
		
		questions.add(new Question("Which animal is known as the Ship of the Desert?",
				new String[] {"lion","ostrich","camel","giraffe"},2));
		
		questions.add(new Question("Rainbow consist of how many colours?",new String[] 
				{"7","6","5","8"},0));
		
		questions.add(new Question("Which is the tallest mountain in the world?",
				new String[] {"K2","Lhotse","Kangchenjunga","Mount Everest"},3));
		
		questions.add(new Question("Name of the largest 'Democracy' of the world?",
				new String[] {"India","USA","China","Brazil"},0));
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		System.out.println("Welcome to the Online Quiz!!!");
		System.out.println("Answer the follwing question by entring number corresponding"
				+ "to your choice.");
		
		for(int i=0;i<questions.size();i++) {
			Question q = questions.get(i);
			System.out.println("\nQuestion " + (i + 1) + ": " + q.getQuestionText());
			
			String[] options = q.getOptions();
			for (int j=0; j< options.length; j++) {
				System.out.println((j+1) + ". " + options[j]);
			}
			
			int userAnswer = -1;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Your answer (1-" + options.length + "): ");
                if (sc.hasNextInt()) {
                    userAnswer = sc.nextInt();
                    if (userAnswer >= 1 && userAnswer <= options.length) {
                        validInput = true;
                    } else {
                        System.out.println("Invalid input. Please enter a number between 1 and " + options.length + ".");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.next(); 
                }
            }

            if (userAnswer - 1 == q.getCorrectOptionIndex()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + options[q.getCorrectOptionIndex()]);
            }
        }

        System.out.println("\n--- Quiz Finished! ---");
        System.out.println("You scored " + score + " out of " + questions.size() + " questions.");
        System.out.println("----------------------");

        sc.close();
    }
}

class Question {
    private String questionText;
    private String[] options;
    private int correctOptionIndex; 

    public Question(String questionText, String[] options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }

		 
	}

        

        
             

      
                   
       