package com.midterm;

public class Rock {

    String cpuAnswer;


    public Rock(int choice) {
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
        if(cpuAnswer.equals("scissors")){
            return 1;
        } else {
            return 0;
        }
    }
}
