import java.security.SecureRandom;

/**
 * author smokeed_
 * project PasswordGenerator
 */

class Main {


    public static String randompass(int length) {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*_";
        SecureRandom random = new SecureRandom();
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<length; i++) {
            int randomIndex = random.nextInt(chars.length());
            builder.append(chars.charAt(randomIndex));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        int len = 10;
        System.out.println(randompass(len));
    }
}
