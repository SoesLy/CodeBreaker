public class CodeBreaker {
    public static void main(String[] args) {

        System.out.println(numberCypherEncoder("hej"));

        int[] hej = {8, 5, 18};
        System.out.println(numberCypherDecoder());

    }
    //Methode Encoder//
    public static String numberCypherEncoder(String encoder) {

        //Type of return
        String stringToEncode = "";

        //Make the alphabet
        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";

        //Run the string through a for loop
        for (int i = 0; i < encoder.length(); i++) {
            char stringToIndex = encoder.charAt(i);

            //Give the alphabet some index numbers
            int indexNumbers = alphabet.indexOf(stringToIndex) + 1;

            //Gonna add my type to my int
            stringToEncode = stringToEncode + indexNumbers + ";";
        }

        return stringToEncode;
    }


    //Methode Decoder//
    public static String numberCypherDecoder(String decoder) {

        String stringToDecode = "";

        //Finde the alphabet
        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";

        for (int i = 0; i < decoder.length(); i++) {
            int indexToString = decoder.indexOf(i);

            int letterIndexNumbers = alphabet.charAt(indexToString-1);

            stringToDecode = stringToDecode + letterIndexNumbers ++;
        }

        return stringToDecode;
    }


}
