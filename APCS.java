import java.util.*;
public class APCS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();
        r.intro();
        String response = sc.nextLine();
        response = response.toLowerCase();
        r.compare(response);
        sc.close();
    }
}

class Result {

    public void intro() {
        System.out.println("Human, let’s have an epic game of Rock, Paper, Crossblades! ");
    }
    public void compare(String response) {
        int ComChoice = (int) (Math.random()*3)+1;
        String ComWords = "";
        if(ComChoice == 1) {
            ComWords = "rock";
        } else if(ComChoice == 2) {
            ComWords = "paper";
        } else if(ComChoice == 3) {
            ComWords = "scissor";
        }
        if(response.length()>=50) {
            if(response.lastIndexOf("rock") == response.length()-4) {
                if(ComWords == "rock") {
                    System.out.println("Does he know my strategy? Did he steal my notes? Did he follow me into the archives? No, stay the course: ROCK!");
                    System.out.println("Result: Unbelievable! We have tied! *Eye twitches*");
                } else if(ComWords == "paper") {
                    System.out.println("Something has to be done, I must take risk to catch him on surprise. This is the risk I'll have to take to win: PAPER!");
                    System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
                } else if(ComWords == "scissor") {
                    System.out.println("This will be risky, to change the course of my strategy. There's one third of the chance to win and here it comes: SCISSOR!");
                    System.out.println("Result: How is this happening, I have calculated everything perfectly, how does it ends up like this?");
                }
            } else if(response.lastIndexOf("paper") == response.length()-5) {
                if(ComWords == "rock") {
                    System.out.println("Does he know my strategy? Did he steal my notes? Did he follow me into the archives? No, stay the course: ROCK!");
                    System.out.println("Result: How is this happening, I have calculated everything perfectly, how does it ends up like this?");
                } else if(ComWords == "paper") {
                    System.out.println("Something has to be done, I must take risk to catch him on surprise. This is the risk I'll have to take to win: PAPER!");
                    System.out.println("Result: Unbelievable! We have tied! *Eye twitches*");
                } else if(ComWords == "scissor") {
                    System.out.println("This will be risky, to change the course of my strategy. There's one third of the chance to win and here it comes: SCISSOR!");
                    System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
                }
            } else if(response.lastIndexOf("scissor") == response.length()-7) {
                if(ComWords == "rock") {
                    System.out.println("Does he know my strategy? Did he steal my notes? Did he follow me into the archives? No, stay the course: ROCK!");
                    System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
                } else if(ComWords == "paper") {
                    System.out.println("Something has to be done, I must take risk to catch him on surprise. This is the risk I'll have to take to win: PAPER!");
                    System.out.println("Result: How is this happening, I have calculated everything perfectly, how does it ends up like this?");
                } else if(ComWords == "scissor") {
                    System.out.println("This will be risky, to change the course of my strategy. There's one third of the chance to win and here it comes: SCISSOR!");
                    System.out.println("Result: Unbelievable! We have tied! *Eye twitches*");
                }
            } else {
                System.out.println("You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful!");
                System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
            }
        } else {
            if(response.length()>6) {
                
            }
            if(response.contains("rock")) {
                System.out.println("Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose PAPER!");
            } else if(response.contains("paper")) {
                System.out.println("Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose SCISSOR!");
            } else if(response.contains("scissor")) {
                System.out.println("Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose ROCK!");
            } else {
                System.out.println("You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful!");
            }
            System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
        }
    }
}