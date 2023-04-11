import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class WordTest{

    public static void main(String[] args) {
        // try for FileNotFoundException
        try {
            // looks up a file
            File inFile = new File("wordlist.txt");
            Scanner input = new Scanner(inFile);
            // try for IOException
            String word;
            ArrayList<String> master = new ArrayList<String>();
            // copies content from the file into the array
            while(input.hasNext()){
                word=input.nextLine();
                master.add(word);
            }
            // conditions
            ArrayList<String> myList=WordLists.lengthN(master,4);
            myList=WordLists.letterAt(myList,'j',0);
            myList=WordLists.notAt(myList,'v',1);
            myList=WordLists.notIn(myList,'e');
            myList=WordLists.notIn(myList,'i');

            //prints the result in the new file
            PrintWriter output = new PrintWriter("out.txt");
            for (int i = 0; i < myList.size(); i++){
                String addNew = myList.get(i);
                output.println(addNew);
            }
            output.close();
        }
        // catch for FileNotFoundException  
        catch (FileNotFoundException fnfe){
            System.out.println("File required was not found");
            System.out.println(fnfe);
        } 
            // catch for IOException
        // catch for general exception
        catch (Exception e){
            System.out.println("Something is wrong");
            System.out.println(e);
        } 
    }
}
