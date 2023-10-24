import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class WordTest{

    private static ArrayList<String> loadWordsFromFile(String filename) throws FileNotFoundException {
        File inFile = new File(filename);
        Scanner input = new Scanner(inFile);
        ArrayList<String> master = new ArrayList<String>();
        while(input.hasNext()){
            master.add(input.nextLine());
        }
        return master;
    }

    public static void main(String[] args) {
        ArrayList<String> master;
        try {
            master = loadWordsFromFile("wordlist.txt");
        } catch (FileNotFoundException fnfe){
            System.out.println("File required was not found");
            System.out.println(fnfe);
            return;
        }

        System.out.println("Welcome to the Wordle Solver!");
        System.out.println("Here's how to use it:");
        System.out.println("1. First, enter the length of the word.");
        System.out.println("2. Next, specify conditions using the following formats:");
        System.out.println("   - 'j0' means you're looking for words with the letter 'j' at position 0.");
        System.out.println("   - '!v1' means you don't want the letter 'v' at position 1.");
        System.out.println("   - '~e' means you don't want the letter 'e' anywhere in the word.");
        System.out.println("3. Type 'done' when finished setting conditions.");
        System.out.println("4. Type 'exit' when prompted for word length if you want to stop the program.");

        Scanner scanner = new Scanner(System.in);
        while(true) {
            ArrayList<String> myList = new ArrayList<String>(master);  // Copy to avoid modifying original list

            System.out.println("\nEnter length of the word or type 'exit' to stop: ");
            String input = scanner.nextLine();
            if("exit".equalsIgnoreCase(input)) break;

            int length = Integer.parseInt(input);
            myList = WordLists.lengthN(myList, length);

            while(true) {
                System.out.println("Enter condition (e.g. 'j0', '!v1', '~e') or 'done' when finished: ");
                input = scanner.nextLine();
                if("done".equalsIgnoreCase(input)) break;

                char letter = input.charAt(0);
                if (letter == '!') {
                    int index = Integer.parseInt(input.substring(2));
                    myList = WordLists.notAt(myList, input.charAt(1), index);
                } else if (letter == '~') {
                    myList = WordLists.notIn(myList, input.charAt(1));
                } else {
                    int index = Integer.parseInt(input.substring(1));
                    myList = WordLists.letterAt(myList, letter, index);
                }
            }

            System.out.println("Filtered words: ");
            for (String word : myList) {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}
