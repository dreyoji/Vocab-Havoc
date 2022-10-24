package IOstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 * 
 * LEADERBOARD FORMAT
 * 
 * (frenzy mode)
 * [FRENZY] // notice: enclosed in square brackets
 * NAME, SCORE, TIME
 * ...
 * 
 * (time attack mode)
 * [TIME ATTACK]
 * NAME, TIME
 * ...
 * 
 */
public class Istream {
    protected static String fileToString(String path) throws FileNotFoundException, IOException {
        FileReader fr; 
        fr = new FileReader(path);
        
        String result = "";
        for (int c = fr.read(); c != -1 ;c = fr.read()) {
            result += (char)c;
        }       
        
        fr.close();
        return result;
    }
    
    // looks for a word in brackets in the string and returns the position at the end of it.
    // if word is not found, return 0.
//    protected static int getWordInBracketsIndex(String string, String word) {
//        int wordStartIndex = 0; // position of '[' in "[FRENZY]"
//        int wordEndIndex = 0; // position of ']' in "[FRENZY]"
//        String wordTest = "";
//        word = "[" + word + "]";
//        
//        while (!wordTest.equals(word)) {
//            // find '['
//            for (int i = wordEndIndex ; i < string.length(); i++) {
//                if (string.charAt(i) == '[') {
//                    wordStartIndex = i;
//                    break;
//                }        
//            }
//            
//            System.out.println("here");
//            
//            // find ']'
//            for (int i = wordStartIndex; i < string.length(); i++) {
//                if (string.charAt(i) == ']') {
//                    wordEndIndex = i;
//                    break;
//                }
//            }
//            
//            System.out.println("here2");
//            // check if word between brackets is equal to word
//            for (int i = wordStartIndex; i < wordEndIndex + 1; i++) {
//                wordTest += string.charAt(i);
//            }
//            
//            // if the entire string has been checked and still no match
//            if (wordEndIndex > word.length()) {
//                if (wordEndIndex > string.length)
//            }
//        }
//        
//        return wordEndIndex + 1;
//    }
    
    public static int getWordInBracketsIndex(String string, String word) {
        int openBracketIndex = 0;  // position of '['
        int closeBracketIndex = 0;    // position of ']'
        String wordInBrackets = "[" + word + "]";
        
        // will use this variable to check if word found inside brackets is what we are looking for
        String wordTest = "";
        
        while(!wordTest.equals(wordInBrackets)) {
            // look for '['
            boolean openBracketFound = false;
            for (int i = closeBracketIndex; i < string.length(); i++) {
                if (string.charAt(i) == '[') {
                    openBracketIndex = i;
                    openBracketFound = true;
                    break;
                }
            }
            if (!openBracketFound) {
                return 0;
            }
            
            // this part will not be reached if the opening bracket is not found
            // look for ']'
            boolean closeBracketFound = false;
            for (int i = openBracketIndex; i < string.length(); i++) {
                if (string.charAt(i) == ']') {
                    closeBracketIndex = i;
                    closeBracketFound = true;
                    break;
                }
            }
            if (!closeBracketFound) {
                return 0;
            }
            
            // this part will not be reached if either bracket is not found
            // check if word in brackets is the word we want
            wordTest = string.substring(openBracketIndex, closeBracketIndex + 1);
            
            // if its not the word we are looking for
            if (!wordTest.equals(wordInBrackets)) {
                wordTest = ""; // reset shit
            }
        }
        
        return closeBracketIndex + 1;
    }
}
