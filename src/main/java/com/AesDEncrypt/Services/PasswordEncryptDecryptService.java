package com.AesDEncrypt.Services;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public interface PasswordEncryptDecryptService {

    public  String encrypt(String plainText, String secretKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException;

    public  String decrypt(String encryptedText, String secretKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException;

    public  String generateSecretKey(int keysize) throws NoSuchAlgorithmException;


}
