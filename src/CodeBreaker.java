public class CodeBreaker {
    public static void main(String[] args) {

        System.out.println(numberCypherEncoder("hej"));

    }

    public static int numberCypherEncoder(String encoder) {

        //Make the alphabet
        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";

        //Take a String to encode
        //String stringToEncode = "Hope is a good thing, maybe the best of things";

        //Give the alphabet some index numbers
        int indexNumbers = alphabet.indexOf(encoder)+1;

        return indexNumbers;
    }

    public static String numberCypherDecoder(int decoder) {

        //Finde the alphabet
        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";

        //Find the index numbers to the letters
        int letterIndexNumbers = alphabet.charAt(decoder);

        return "";
    }
}
