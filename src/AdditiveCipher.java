public class AdditiveCipher {

    static String alphabetString = "abcdefghijklmnopqrstuvwxyz";
    static char[] alphabet = alphabetString.toCharArray();

    /**
     * Additive Cipher Encryption Algorithm
     * @param plaintext
     * @param key
     * **/
    public static void encryption(String plaintext, Integer key) {
        String tempCipherText;

        // remove spaces
        plaintext = plaintext.replaceAll("\\s+","");

        for(int i = 0; i < plaintext.length(); i++){
            char p = plaintext.charAt(i);
            int index = alphabetString.indexOf(p);

            System.out.println("plaintext decimal :" + index);
        }
    }
}
