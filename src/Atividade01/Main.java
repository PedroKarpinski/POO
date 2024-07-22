package Atividade01;

public class Main {
    public static double sqrt(double n, double epsilon) {
        double cur = n/2;
        double prev = n;
        double dif = Math.abs(prev - cur);
        
        while (dif >= epsilon) {
            prev = cur;
            cur = (prev + (n/prev))/2;
            dif = Math.abs(cur - prev);
        } 

        return cur;
    }

    public static boolean isPerfectNumber(long number) {
        long cont = 0;

        for (int i = 1; i < number; i++) {
            if (number%i == 0) {
                cont += i;
            }
        }

        return cont == number;
    }

    public static String encrypt(String message, int key) {
        String ret = "";
        char cur;
        for (int i = 0; i < message.length(); i++) {
            cur = message.charAt(i);
            if ((int) cur+key > 122) {
                ret += (char) (cur + key - 26);
            } else if ((int) cur+key > 90 && (int) cur <= 90) {
                ret += (char) (cur + key - 26);
            } else {
                ret += (char) (cur + key);
            }
        }
        
        return ret;
    }

    public static String decrypt(String encryptedMessage, int key) {
        String ret = "";
        char cur;
        for (int i = 0; i < encryptedMessage.length(); i++) {
            cur = encryptedMessage.charAt(i);
            if ((int) cur-key < 97 && (int) cur >= 97) {
                ret += (char) (cur - key + 26);
            } else if ((int) cur-key < 65) {
                ret += (char) (cur - key + 26);
            } else {
                ret += (char) (cur - key);
            }
        }
        
        return ret;
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println(sqrt(9, 6));
        System.out.println(isPerfectNumber(6));
        System.out.println(encrypt("Hello", 3));
        System.out.println(decrypt("Khoor", 3));
    }
}