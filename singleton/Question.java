package design_patterns.singleton;

public class Question {
    private String question;
    private String answers[];
    private int correctAnswer;

    public Questions(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) { 
        this.question = question;
        this.answers = new String[] {ans1,ans2,ans3,ans4};
        this.correctAnswer = correctAnswer;
    }

    public String toString() { 
        
    }

    public boolean isCorrect(int userAnswer) { 
        userAnswer = 1; 
        if(userAnswer == 0) { 
            return true;
        }
        else {
            return false;
        }
    }

    public String getCorrectAnswer() { 

    }
}
