import java.util.ArrayList;


public class WordLists{

  

   public static ArrayList<String> lengthN(ArrayList<String> words, int n){
      // an temp array where the new words are going to be copied to
      ArrayList<String> temp = new ArrayList<String>();
      for (int i = 0; i < words.size(); i++){
         String checkWord = words.get(i);
         // check for the words which have this number of letters
         if (checkWord.length() == n){
            temp.add(checkWord);
         }
      }
      return temp;
      
   }

   public static ArrayList<String> letterAt(ArrayList<String> words, 
      char included, int index){
         // an temp array where the new words are going to be copied to
         ArrayList<String> temp = new ArrayList<String>();
         // goes through the elements in the array
            for (int i = 0; i < words.size(); i++){
               String checkWord = words.get(i);
               // checks if the index is valid
               if (index >= 0 && index < checkWord.length()){
                  char ch = checkWord.charAt(index);
                  // if character appears at that index, word gets added
                  if (ch == included){
                     temp.add(checkWord);
                  }
               }
            }
         return temp;
      }
         


      public static ArrayList<String> notAt(ArrayList<String> words,
      char excluded, int index){
         ArrayList<String> temp = new ArrayList<String>();
         for (String checkWord : words){
            if (index >= 0 && index < checkWord.length()){
               char ch = checkWord.charAt(index);
               if (ch != excluded){
                  temp.add(checkWord);
               }
            }
         }
         return temp;
   }


 
   public static ArrayList<String> notIn(ArrayList<String> words,
      char included){
         // an temp array where the new words are going to be copied to
         ArrayList<String> temp = new ArrayList<String>();
         // goes through the elements in the array
         for (int i = 0; i < words.size(); i++){
            String checkWord = words.get(i);
            int counter = 0;
            // using counter we determine if the letter
            // doesn't appear anywhere in the word
            for (int x = 0; x < checkWord.length(); x++){
               char ch = checkWord.charAt(x);
               if (ch != included){
                  counter++;
               }
            }
            if (counter == (checkWord.length())){
               temp.add(checkWord);
            }
         }
         return temp;
   }

} // end of class








