//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String cypherWord = "BIVHA JVTTH";
        for(int j = 1; j <= 26; j++) {
            String decodedWord = "";
            for (int i = 0; i < cypherWord.length(); i++) {
                if(cypherWord.charAt(i) == ' ' || cypherWord.charAt(i) == '\n') {
                    decodedWord += cypherWord.charAt(i);
                    continue;
                }
                int charVal = cypherWord.charAt(i) - 'A';
                charVal = (charVal + j) % 26; // Shift back by j positions
                char decodedChar = (char) (charVal + 'A');
                decodedWord += decodedChar;
            }
            System.out.println("Decoded word with " + j + " shifts: " + decodedWord);
        }


    }
}