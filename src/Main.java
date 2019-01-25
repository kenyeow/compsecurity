import java.util.Scanner;

import static java.lang.Math.abs;

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

                        // get plaintext input
                        System.out.print("Please enter the plaintext: ");
                        String plaintext = scanner.nextLine();

                        // get encryption key
                        System.out.print("Please enter the encryption key: ");
                        Integer key = scanner.nextInt();

                        // start time for time complexity calculation
                        long startTime = System.currentTimeMillis();

                        // additive cipher encryption algorithm
                        AdditiveCipher.encryption(plaintext, key);

                        // stop time for time complexity calculation
                        long stopTime = System.currentTimeMillis();

                        // print out the result of time complexity
                        System.out.println("Time complexity: " + (stopTime - startTime) + "ms\n");

                        // covert plaintext length to double
                        double plaintextLength = new Double(plaintext.length());

                        // calculate byte
                        double bytes =  Math.ceil(plaintextLength / 8);

                        // calculate throughput -> bytes / executed time
                        double throughput = bytes / (stopTime - startTime);

                        // print throughput
                        System.out.println("Throughput: " + throughput);
                    } else if (addCipherSelection == 2){

                        Scanner scanner = new Scanner(System.in);

                        // get ciphertext input
                        System.out.print("Please enter the ciphertext: ");
                        String ciphertext = scanner.nextLine();

                        // get decryption key
                        System.out.print("Please enter the decryption key: ");
                        Integer key = scanner.nextInt();

                        // start time for time complexity calculation in ms.
                        long startTime = System.currentTimeMillis();

                        // additive cipher decryption algorithm
                        AdditiveCipher.decryption(ciphertext, key);

                        // stop time for time complexity calculation
                        long stopTime = System.currentTimeMillis();

                        // print out complexity result
                        System.out.println("Time complexity: " + (stopTime - startTime) + "ms\n");

                        // covert ciphertext length to double
                        double ciphertextLength = new Double(ciphertext.length());

                        // covert to bytes
                        double bytes =  Math.ceil(ciphertextLength / 8);

                        // calculate throughput -> bytes/time executed
                        double throughput = bytes / (stopTime - startTime);

                        // print throughput
                        System.out.println("Throughput: " + throughput);
                    } else {
                        System.out.println("Wrong Input, Try again.");
                    }

                    addCipherSelection = getAddtiveCipherSelection();
                }
            } else if (selection == 2){
                Integer railfenceSelection = getRailFenceSelection();
                while(railfenceSelection != 0){
                    // encryption
                    if(railfenceSelection == 1){
                        Scanner scanner = new Scanner(System.in);

                        // get plaintext input
                        System.out.print("Please enter the plaintext: ");
                        String plaintext = scanner.nextLine();

                        // start time for time complexity calculation in ms.
                        long startTime = System.currentTimeMillis();

                        RailFenceCipher.encodeFunction(plaintext);

                        // stop time for time complexity calculation
                        long stopTime = System.currentTimeMillis();

                        // print out complexity result
                        System.out.println("Time complexity: " + (stopTime - startTime) + "ms\n");

                        // covert ciphertext length to double
                        double plaintextLength = new Double(plaintext.length());

                        // covert to bytes
                        double bytes =  Math.ceil(plaintextLength / 8);

                        // calculate throughput -> bytes/time executed
                        double throughput = bytes / (stopTime - startTime);

                        // print throughput
                        System.out.println("Throughput: " + throughput);
                    } else if (railfenceSelection == 2){ // decryption
                        Scanner scanner = new Scanner(System.in);

                        // get ciphertext input
                        System.out.print("Please enter the ciphertext: ");
                        String ciphertext = scanner.nextLine();

                        // start time for time complexity calculation in ms.
                        long startTime = System.currentTimeMillis();

                        RailFenceCipher.decodeFunction(ciphertext);

                        // stop time for time complexity calculation
                        long stopTime = System.currentTimeMillis();

                        // print out complexity result
                        System.out.println("Time complexity: " + (stopTime - startTime) + "ms\n");

                        // covert ciphertext length to double
                        double ciphertextlength = new Double(ciphertext.length());

                        // covert to bytes
                        double bytes =  Math.ceil(ciphertextlength / 8);

                        // calculate throughput -> bytes/time executed
                        double throughput = bytes / (stopTime - startTime);

                        // print throughput
                        System.out.println("Throughput: " + throughput);
                    } else {
                        System.out.println("Wrong Input, Try again.");
                    }

                    railfenceSelection = getRailFenceSelection();
                }
            }
            else if (selection == 3){
                Integer autokeySelection = getAutoKeySelection();
                while(autokeySelection != 0){
                    // encryption
                    if(autokeySelection == 1){
                        Scanner scanner = new Scanner(System.in);

                        // get plaintext input
                        System.out.print("Please enter the plaintext: ");
                        String plaintext = scanner.nextLine();

                        // get encryption key
                        System.out.print("Please enter the encryption key: ");
                        Integer key = scanner.nextInt();

                        // start time for time complexity calculation
                        long startTime = System.currentTimeMillis();

                        // additive cipher encryption algorithm
                        AutoKeyCipher.encryption(plaintext, key);

                        // stop time for time complexity calculation
                        long stopTime = System.currentTimeMillis();

                        // print out the result of time complexity
                        System.out.println("Time complexity: " + (stopTime - startTime) + "ms\n");

                        // covert plaintext length to double
                        double plaintextLength = new Double(plaintext.length());

                        // calculate byte
                        double bytes =  Math.ceil(plaintextLength / 8);

                        // calculate throughput -> bytes / executed time
                        double throughput = bytes / (stopTime - startTime);

                        // print throughput
                        System.out.println("Throughput: " + throughput);
                    } else if (autokeySelection == 2){ // decryption
                        Scanner scanner = new Scanner(System.in);

                        // get plaintext input
                        System.out.print("Please enter the ciphertext: ");
                        String plaintext = scanner.nextLine();

                        // get encryption key
                        System.out.print("Please enter the encryption key: ");
                        Integer key = scanner.nextInt();

                        // start time for time complexity calculation
                        long startTime = System.currentTimeMillis();

                        // additive cipher encryption algorithm
                        AutoKeyCipher.decryption(plaintext, key);

                        // stop time for time complexity calculation
                        long stopTime = System.currentTimeMillis();

                        // print out the result of time complexity
                        System.out.println("Time complexity: " + (stopTime - startTime) + "ms\n");

                        // covert plaintext length to double
                        double plaintextLength = new Double(plaintext.length());

                        // calculate byte
                        double bytes =  Math.ceil(plaintextLength / 8);

                        // calculate throughput -> bytes / executed time
                        double throughput = bytes / (stopTime - startTime);

                        // print throughput
                        System.out.println("Throughput: " + throughput);
                    } else {
                        System.out.println("Wrong Input, Try again.");
                    }

                    autokeySelection = getAutoKeySelection();
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
        System.out.println("2) Rail Fence Ciphers");
        System.out.println("3) AutoKey Ciphers");
        System.out.println("0) Quit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Selection: ");
        Integer input = scanner.nextInt();
        System.out.print("\n\n");
        return input;
    }

    public static Integer getAddtiveCipherSelection(){
        System.out.println("Please an operation (Additive Cipher)");
        System.out.println("1) Encryption");
        System.out.println("2) Decryption");
        System.out.println("0) Back to menu");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Selection: ");
        Integer input = scanner.nextInt();
        System.out.print("\n\n");
        return input;
    }

    public static Integer getRailFenceSelection(){
        System.out.println("Please an operation (Rail Fence Cipher)");
        System.out.println("1) Encryption");
        System.out.println("2) Decryption");
        System.out.println("0) Back to menu");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Selection: ");
        Integer input = scanner.nextInt();
        System.out.print("\n\n");
        return input;
    }

    public static Integer getAutoKeySelection(){
        System.out.println("Please an operation (AutoKey Cipher)");
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
