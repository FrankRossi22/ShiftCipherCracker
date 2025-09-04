//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Set the cipher word to decode
        String cipherWord = "BIVHA JVTTH";

        //Try all possible shifts from 1 to 26
        for(int j = 1; j <= 26; j++) {
            String decodedWord = "";

            //for loop to go through each character in the cipherWord, shift it, and then add it to the decodedWord
            for (int i = 0; i < cipherWord.length(); i++) {
                if(cipherWord.charAt(i) == ' ' || cipherWord.charAt(i) == '\n') {
                    decodedWord += cipherWord.charAt(i);
                    continue;
                }
                // Get the character value (0-25) by subtracting 'A', apply the shift, and convert back to a character
                int charVal = cipherWord.charAt(i) - 'A';
                charVal = (charVal + j) % 26; // Shift back by j positions
                char decodedChar = (char) (charVal + 'A');
                decodedWord += decodedChar;
            }
            //Print the decoded word for the current shift
            System.out.println("Decoded word with " + j + " shifts: " + decodedWord);
        }


    }
}