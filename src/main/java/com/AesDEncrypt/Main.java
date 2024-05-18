package com.AesDEncrypt;

import com.AesDEncrypt.Services.PasswordEncryptDecryptService;
import com.AesDEncrypt.Services.PasswordEncryptDecryptServiceImpl;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println("Hello world!");
        PasswordEncryptDecryptService passwordEncryptDecryptService =new PasswordEncryptDecryptServiceImpl();
        System.out.println(passwordEncryptDecryptService.generateSecretKey(256));


    }
}