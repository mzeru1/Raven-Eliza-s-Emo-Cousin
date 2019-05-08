package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String > chatHistory = new ArrayList<>();

        boolean done = true;
        // used to start converston
        String starter = "Good evening, how are you feeling today?";
        System.out.println(starter);
        // adding the conversation starter into a list of conversation
        chatHistory.add(starter);
        String conversation = "";
        int cal=0;
        int post=0,neg=0;
        // do starts the conversation runinf for the first time
        do {
        // created a Raven class
            Raven chat = new Raven();
        // accepts string for the question of starter
            conversation = scan.nextLine();
            if(!conversation.equalsIgnoreCase("q")){
                chatHistory.add(conversation);
            }
            int countPositive = chat.modepositive(conversation);
            int counterNevetige = chat.modeNegative(conversation);

            if(countPositive>counterNevetige){

                String resp = "Really ! why? that's not good ";
                chatHistory.add(resp);
                System.out.println(resp);
                post =+ chat.posvalue(countPositive,counterNevetige);

            } else if (countPositive < counterNevetige){
                String resp2 = "yey!! i'm so happy for youir";
                chatHistory.add(resp2);
                System.out.println(resp2);
                neg += chat.negValue(counterNevetige,countPositive);

            }else {
                String resp3 = "Meh!!! you're life is boaring";
                chatHistory.add(resp3);
                System.out.println(resp3);
            }

            System.out.println("i'm listening keep going just pres Q to exit ");
        } while (!conversation.equalsIgnoreCase("Q"));

        for(String x:chatHistory){
            System.out.println(x);
        }
        cal += post - neg;
        if(cal>0){
            System.out.println("you don't seem to be happy");
        }else if (cal<0){
            System.out.println("I like your attitude");
        } else {
            System.out.println("you don't seem to be interesting person");
        }
    }
}
