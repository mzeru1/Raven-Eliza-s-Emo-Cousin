package com.company;

import javax.annotation.PostConstruct;
import java.security.PublicKey;
import java.util.Scanner;

public class Raven {

    private int postCount = 0;
    private int negCount = 0;
    private String[] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};
    private String[] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};

    public int moodAlexa(String str) {
        String[] typedWords = str.split(" ");
        for (int i = 0; i < positive.length; i++) {
            for (int j = 0; j < typedWords.length; j++) {
                if (positive[i].equalsIgnoreCase(typedWords[j])) {
                    postCount++;
                }
            }
        }
        return postCount;
    }

        public int modeNegative(String str){
            String[] typedWords = str.split(" ");
        for (int i = 0; i < negative.length; i++) {
            for (int j = 0; j < typedWords.length; j++) {
                if (negative[i].equalsIgnoreCase(typedWords[j])) {
                    negCount++;
                }
            }
        }
        return negCount;
    }

    public int getPostCount(int x ) {
        return x;
    }


}
