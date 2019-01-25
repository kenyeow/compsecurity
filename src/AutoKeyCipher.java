public class AutoKeyCipher {

    static String alphabetString = "abcdefghijklmnopqrstuvwxyz";

    public static void encryption(String plaintext, Integer key){
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
            int index;

            int temp;

            if(i<=0){
                index = alphabetString.indexOf(p);
                System.out.println("index:" + index);
                // adding key + alphabet index
                temp = index + key;
            }else{
                index = alphabetString.indexOf(p);
                key = alphabetString.indexOf(plaintext.charAt(i-1));
                System.out.println("index:" + index);
                temp = index + key;
            }

            // modulus operation
            int cipher = temp % 26;
            System.out.println("Cipher's value:" + cipher);

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

    public static void decryption(String ciphertext, Integer key){
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

            // get index of each character in the string
            int index;

            int temp;

            if(i<=0){
                // get index of each character of the string
                index = alphabetString.indexOf(c);
                // subtract key and index
                temp = index - key;
            }else{
                index = alphabetString.indexOf(c);
                String tempValue = tempPlainText.replaceAll("\\s+","");
                key = alphabetString.indexOf(tempValue.charAt(i-1));
                temp = index - key;
            }

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
