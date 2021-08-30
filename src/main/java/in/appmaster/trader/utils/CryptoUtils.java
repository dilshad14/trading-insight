package in.appmaster.trader.utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
 
/**
 * A utility class that encrypts or decrypts a file.
 * @author www.codejava.net
 *
 */
public class CryptoUtils {
    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES";
 
    public static String encrypt(String key, String inputFile, String outputFile)
            throws Exception {
      return   doCrypto(Cipher.ENCRYPT_MODE, key, inputFile, outputFile);
    }
 
    public static String decrypt(String key, String inputFile, String outputFile)
            throws Exception {
        return doCrypto(Cipher.DECRYPT_MODE, key, inputFile, outputFile);
    }
 
    private static String doCrypto(int cipherMode, String key, String inputFile,
    		String outputFile) throws Exception {
        try {
            Key secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(cipherMode, secretKey);
             
            /*FileInputStream inputStream = new FileInputStream(inputFile);
            byte[] inputBytes = new byte[(int) inputFile.length()];
            inputStream.read(inputBytes);*/
             
           // byte[] outputBytes = cipher.doFinal(inputBytes);
            byte[] outputBytes = cipher.doFinal(inputFile.getBytes());
             
           /* FileOutputStream outputStream = new FileOutputStream(outputFile);
            outputStream.write(outputBytes);*/
             
           return  outputFile=  new String(outputBytes);
            //System.out.println(outputFile);
             
        } catch (  Exception ex) {
            throw new Exception("Error encrypting/decrypting file", ex);
        }
    }
}