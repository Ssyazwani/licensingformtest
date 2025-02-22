package com.example.licensingformtest.model;

import java.security.SecureRandom;

public class Idgen{

    private static String Characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static int sizelength = 8;

    public static String generateUniqueId() {
        StringBuilder idBuilder = new StringBuilder(sizelength);
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < sizelength; i++) {
            int randomIndex = random.nextInt(Characters.length()); 
            idBuilder.append(Characters.charAt(randomIndex)); 
        }

        return idBuilder.toString();
    }
}
