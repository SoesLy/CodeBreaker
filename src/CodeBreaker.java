import java.util.Locale;

public class CodeBreaker {
    public static void main(String[] args) {

        //Encoder//
        String encodedString = "Halløj med dig";
        encodedString = encodedString.toLowerCase();

        String stringEncodedToNumbers = numberCypherEncoder(encodedString);

        String encodedToNumbersResult = "The encoded message: " + stringEncodedToNumbers;
        System.out.println(encodedToNumbersResult);


        //Decoder//
        String[] encodedStringArray = stringEncodedToNumbers.split(stringEncodedToNumbers);

        String decodedString = numberCypherDecoder(encodedStringArray);
        String decodedStringResult = "The decoded message: " + decodedString;
        System.out.println(decodedStringResult);

        //CaesarEncoder//
        String caesarEncodedString = "Ohøj";
        caesarEncodedString = caesarEncodedString.toLowerCase(Locale.ROOT);

        String stringEncodedCaesar = ceasarEncoder(caesarEncodedString);

        String caesarEncodeStringResult = "The encode caesar message: " + stringEncodedCaesar;
        System.out.println(caesarEncodeStringResult);

        //CaesarDecoder//
        String caesarDecodedString = caesarDecoder(caesarEncodedString);
        String caesarDecodedResult = "The decoded caesar message: " + caesarDecodedString;
        System.out.println(caesarDecodedResult);

    }
    //Methods//

    //Make the alphabet
    static String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";

    //Use method to find characters index number
    public static int charToIndexNum(char character) {
        int charIndexNumbers = alphabet.indexOf(character) + 1;

        return charIndexNumbers;
    }

    //Use method to find index numbers character
    public static char indexNumToChar(int index) {
        char indexNumbersChar = alphabet.charAt(index - 1);

        return indexNumbersChar;
    }

    //Method Encoder//
    public static String numberCypherEncoder(String encoder) {

        //Type of return
        String stringToEncode = "";

        //Run the string through a for loop
        for (int i = 0; i < encoder.length(); i++) {
            char stringToIndex = encoder.charAt(i);
            int charIndex = alphabet.indexOf(stringToIndex) + 1;

            //Add the return with the int
            stringToEncode = stringToEncode + charIndex + ";";
        }

        return stringToEncode;
    }


    //Method Decoder//
    public static String numberCypherDecoder(String[] decode) {

        String stringToDecode = "";

        for (int i = 0; i < decode.length; i++) {
            String indexToString = decode[i];
            int stringToInt = Integer.parseInt(indexToString) - 1;

            int indexToChar = alphabet.charAt(stringToInt);

            stringToDecode = stringToDecode + indexToChar ++;
        }

        return stringToDecode;
    }

    //Method CeasarEncoder//
    public static String ceasarEncoder(String message) {

        String encodedString = "";

        for (int i = 0; i < message.length(); i++) {
            char messageIndex = message.charAt(i);
            int charIndex = charToIndexNum(messageIndex);

            int indexShift = (charIndex + 6) % alphabet.length();
            char encodedChar = indexNumToChar(indexShift);

            encodedString = encodedString + encodedChar;
        }
        return encodedString;
    }

    //Method CaesarDecoder//
    public static String caesarDecoder(String message) {

        String decodedString = "";

        for (int i = 0; i < message.length(); i++) {
            char messageIndex = message.charAt(i);
            int charIndex = charToIndexNum(messageIndex);

            int indexShift = (charIndex - 6) % alphabet.length();
            char decodedChar = indexNumToChar(indexShift);

            decodedString = decodedString + decodedChar;

        }
        return decodedString;
    }

}
