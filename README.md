# Online Quiz App

This is a simple console-based quiz application developed in Java. It allows users to answer a series of multiple-choice questions and get a score at the end.

---

## Features

* **Multiple-Choice Questions:** Presents questions with several options.
* **User Input:** Accepts numerical input for answer selection.
* **Score Tracking:** Keeps track of correct answers and displays the final score.
* **Input Validation:** Ensures users enter valid options.

---

## How to Run

1.  **Save the Code:** Save the provided Java code as `OnlineQuizApp.java`.
2.  **Compile:** Open a terminal or command prompt, navigate to the directory where you saved the file, and compile the code using the Java compiler:
    ```bash
    javac OnlineQuizApp.java
    ```
3.  **Run:** After successful compilation, run the application:
    ```bash
    java OnlineQuizApp
    ```

---

## How to Play

1.  The quiz will present questions one by one.
2.  For each question, you'll see a list of numbered options.
3.  Enter the number corresponding to your chosen answer and press Enter.
4.  The application will tell you if your answer is correct or incorrect and then move to the next question.
5.  At the end of the quiz, your total score will be displayed.

---

## Code Structure

The application consists of two main classes:

* **`OnlineQuizApp.java`**: Contains the `main` method where the quiz logic resides. It initializes questions, handles user input, checks answers, and displays results.
* **`Question.java`**: A helper class that represents a single quiz question. It stores the question text, an array of options, and the index of the correct option. (Note: In the provided single-file code, this class is nested within `OnlineQuizApp.java` for simplicity.)

---

## Customization

You can easily customize the quiz by modifying the `main` method in `OnlineQuizApp.java` to:

* **Add/Remove Questions:** Simply add new `Question` objects to the `questions` list or remove existing ones.
* **Change Questions/Options:** Edit the strings and correct answer indices for existing `Question` objects.
