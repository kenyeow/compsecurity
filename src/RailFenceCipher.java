import java.util.ArrayList;
import java.util.Scanner;

public class RailFenceCipher {

    public static void encodeFunction(String input){
        input = input.replaceAll("\\s","");

        String[] array = input.split("");
        ArrayList<String> temp = new ArrayList<>();

        for (int i = 0; i < array.length; i = i + 2){
            temp.add(array[i]);
        }

        for (int i = 1; i < array.length; i = i + 2){
            temp.add(array[i]);
        }

        System.out.print("Ciphertext: ");
        for(int k = 0; k < temp.size(); k++) {
            System.out.print(temp.get(k));
        }

        System.out.print("\n\n");
    }

    public static void decodeFunction(String input){
        input = input.replaceAll("\\s","");

        String[] array = input.split("");
        ArrayList<String> temp = new ArrayList<>();

        Double arrayTemp = new Double(array.length);

        Double jTemp = Math.ceil(arrayTemp / 2);

        for(int i = 0; i < (arrayTemp.intValue() + 1) / 2; i++){
            int j = jTemp.intValue();
            j = j + i;

            try {
                temp.add(array[i]);
                temp.add(array[j]);
            } catch (ArrayIndexOutOfBoundsException e){

            }
        }

        System.out.print("Plaintext: ");
        for(int k = 0; k < temp.size(); k++) {
            System.out.print(temp.get(k));
        }

        System.out.print("\n\n");
    }
}
