package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String > chatHistory = new ArrayList<>();

        boolean done = true;
        String starter = "Good evening, how are you feeling today?";
        System.out.println(starter);
        chatHistory.add(starter);
        String conversation = "";
        do {
            Raven chat = new Raven();
            conversation = scan.nextLine();
            if(!conversation.equalsIgnoreCase("q")){
                chatHistory.add(conversation);
            }
            int countPositive = chat.moodAlexa(conversation);
            int counterNevetige = chat.modeNegative(conversation);
            if(countPositive>counterNevetige){

                String resp = "Really ! why? that's not good ";
                chatHistory.add(resp);
                System.out.println(resp);

            } else if (countPositive < counterNevetige){
                String resp2 = "yey!! i'm so happy for youir";
                chatHistory.add(resp2);
                System.out.println(resp2);

            }else {
                String resp3 = "Meh!!! you're life is boaring";
                chatHistory.add(resp3);
                System.out.println(resp3);
            }
            System.out.println("i'm listening keep going just pres Q to exit ");
             //endConv = scan.nextLine();
        } while (!conversation.equalsIgnoreCase("Q"));

        for(String x:chatHistory){
            System.out.println(x);
        }
    }
}
