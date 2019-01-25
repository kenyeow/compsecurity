import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // get selection input
        Integer selection = getMenuSelection();

        // exit loop if input is 0
        while(selection != 0) {
            /**
             * addictive cipher encryption
             * 1) get additive cipher operation selection
             * 2) Back to menu on input 0
             * **/
            if (selection == 1) {
                Integer addCipherSelection = getAddtiveCipherSelection();
                while(addCipherSelection != 0){
                    if(addCipherSelection == 1){
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Please enter the plaintext: ");
                        String plaintext = scanner.nextLine();
                        System.out.print("Please enter the encryption key: ");
                        Integer key = scanner.nextInt();
                        AdditiveCipher.encryption(plaintext, key);
                    } else if (addCipherSelection == 2){
                        System.out.println("Decryption");
                    } else {
                        System.out.println("Wrong Input, Try again.");
                    }

                    addCipherSelection = getAddtiveCipherSelection();
                }
            }

            selection = getMenuSelection();
        }
    }

    /**
     *  print out menu selection
     * **/
    public static Integer getMenuSelection(){
        System.out.println("Please select a classical symmetric ciphers");
        System.out.println("1) Additive Ciphers");
        System.out.println("0) Quit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Selection: ");
        Integer input = scanner.nextInt();
        System.out.print("\n\n");
        return input;
    }

    public static Integer getAddtiveCipherSelection(){
        System.out.println("Please an operation");
        System.out.println("1) Encryption");
        System.out.println("2) Decryption");
        System.out.println("0) Back to menu");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Selection: ");
        Integer input = scanner.nextInt();
        System.out.print("\n\n");
        return input;
    }
}
