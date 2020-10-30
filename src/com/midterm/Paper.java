package com.midterm;

public class Paper {
    String cpuAnswer;


    public Paper(int choice) {
        switch (choice) {
            case 1:
                cpuAnswer = "rock";
                break;
            case 2:
                cpuAnswer = "paper";
                break;
            case 3:
                cpuAnswer = "scissors";
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public int checkOutcome() {
        if(cpuAnswer.equals("rock")){
            return 1;
        } else {
            return 0;
        }
    }
}
