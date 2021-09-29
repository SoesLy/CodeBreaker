import java.util.Locale;

public class CodeBreaker {
    public static void main(String[] args) {

        //Encoder//
        String encodedString = "Halløj";
        encodedString = encodedString.toLowerCase();

        String stringEncodedToNumbers = numberCypherEncoder(encodedString);

        String encodedToNumbersResult = "The encoded message: " + stringEncodedToNumbers;
        System.out.println(encodedToNumbersResult);


        //Decoder//
        String[] encodedStringArray = stringEncodedToNumbers.split("");

        String decodedString = numberCypherDecoder(encodedStringArray);
        String decodedStringResult = "The decoded message: " + decodedString;
        System.out.println(decodedStringResult);

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
    public static String numberCypherDecoder(String[] decode) {

        String stringToDecode = "";

        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";

        for (int i = 0; i < decode.length; i++) {
            String indexToString = decode[i];
            int stringToInt = Integer.parseInt(indexToString) - 1;

            int letterIndexNumbers = alphabet.charAt(stringToInt);

            stringToDecode = stringToDecode + letterIndexNumbers ++;
        }

        return stringToDecode;
    }


}
