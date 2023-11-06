package br.entity;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashTool {
    private String message;
    private String hash;
    private String hash_reverse;

    public HashTool(String message){
        this.message = message;
        StringBuilder message_reverse = new StringBuilder();
        message_reverse.append(message);
        this.hash = generetorHash(this.message);
        this.hash_reverse = generetorHash(message_reverse.reverse().toString());
    }

    private String generetorHash(String message) {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(message.getBytes(), 0, message.length());
            return new BigInteger(1, m.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String getHash() {
        return hash;
    }

    public String getMessage() {
        return message;
    }

    public String getHash_reverse() {
        return hash_reverse;
    }
}
