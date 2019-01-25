public class AdditiveCipher {

    static String alphabetString = "abcdefghijklmnopqrstuvwxyz";

    /**
     * Additive Cipher Encryption Algorithm (no plaintext checking)
     * @param plaintext
     * @param key
     * **/
    public static void encryption(String plaintext, Integer key) {
        if(checkKey(key) == false){
            System.out.println("Invalid Key");
            return;
        }

        String tempCipher = "";
        String tempCipherText = "";

        // remove spaces
        plaintext = plaintext.replaceAll("\\s+","");

        for(int i = 0; i < plaintext.length(); i++){
            char p = plaintext.charAt(i);

            // get index of each character in the string
            int index = alphabetString.indexOf(p);

            // adding key + alphabet index
            int temp = index + key;

            // modulus operation
            int cipher = temp % 26;

            // push all cipher into temporary string
            tempCipher += " " + cipher;

            // convert cipher into alphabet (ciphertext)
            char cipherText = alphabetString.charAt(cipher);

            // push cipher text into temporary string
            tempCipherText += " " + cipherText;
        }

        // print out cipher + ciphertext
        System.out.println("Cipher: " + tempCipher);
        System.out.println("Cipher Text: " + tempCipherText);
    }

    /**
     * Additive Cipher Decryption Algorithm (no ciphertext checking)
     * @param ciphertext
     * @param key
     * **/
    public static void decryption(String ciphertext, Integer key) {
        if(checkKey(key) == false){
            System.out.println("Invalid Key");
            return;
        }

        String tempPlain = "";
        String tempPlainText = "";

        // remove spaces
        ciphertext = ciphertext.replaceAll("\\s+","");

        for(int i = 0; i < ciphertext.length(); i++){
            char c = ciphertext.charAt(i);

            // get index of each character of the string
            int index = alphabetString.indexOf(c);

            // subtract key and index
            int temp = index - key;

            // modulus operation
            int plain = (((temp % 26) + 26) % 26);

            // push all plain into temporary plain decimal
            tempPlain += " " + plain;

            // covert plain decimal into alphabet (plaintext)
            char plaintext = alphabetString.charAt(plain);

            // push all plaintext into temporary string
            tempPlainText += plaintext;
        }

        System.out.println("Plaintext Decimal: " + tempPlain);
        System.out.println("Plaintext: " + tempPlainText);
    }

    private static boolean checkKey(Integer key){
        if(key > 25 || key < 1){
            return false;
        }

        return true;
    }
}
