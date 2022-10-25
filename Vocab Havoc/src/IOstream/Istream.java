package IOstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Luis
 * 
 * LEADERBOARD FORMAT
 * 
 * [FRENZY] // notice: enclosed in square brackets
 * NAME, SCORE, TIME
 * ...
 * 
 * [TIME ATTACK]
 * NAME, TIME
 * ...
 * 
 */
public class Istream {
    static String path = "savedata/leaderboard.txt";

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
    
    protected static int getWordEnclosedIndex(String string, String word, char start, char end) {
        int openBracketIndex = 0;  // position of '['
        int closeBracketIndex = 0;    // position of ']'
        String wordInBrackets = start + word + end;
        
        // will use this variable to check if word found inside brackets is what we are looking for
        String wordTest = "";
        
        while(!wordTest.equals(wordInBrackets)) {
            // look for '['
            boolean openBracketFound = false;
            for (int i = closeBracketIndex; i < string.length(); i++) {
                if (string.charAt(i) == start) {
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
                if (string.charAt(i) == end) {
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
    
    // n is what position it is in the scores list, starting from 1 (not 0!!!!!!)
    public static String[] getScore(int scorePosition, String mode) { 
        // import file as string so its easier to deal with
        String leaderboard = "";
        try {
            leaderboard = fileToString(path);
        } catch (IOException ex) {
            System.out.println("file not found :(");
        }
        
        // where is the start of the frenzy scores?
        int scoreStartIndex = getWordEnclosedIndex(leaderboard, mode.toUpperCase(), '[', ']');
        
        // find nth score
        // each score is enclosed in a newline
        int openNewline = 0;
        int closeNewline = 0;
        int newlineCount = 0;
        
        // find opening newline
        boolean openNewlineFound = false;
        for (int i = scoreStartIndex; i < leaderboard.length(); i++) {
            if (leaderboard.charAt(i) == '\n') {
                newlineCount++;
                if (newlineCount == scorePosition) {
                    openNewline = i + 1; // we add one as to not include the newline
                    openNewlineFound = true;
                    break;
                }
            }
        }
        if (!openNewlineFound) {
            System.out.println("save file invalid :( or parameters are wrong :(");
            return null;
        }

        // this part will never be reached if no newlines are found
        // find closing newline
        boolean closeNewlineFound = false;
        for (int i = openNewline; i < leaderboard.length(); i++) {
            if (leaderboard.charAt(i) == '\n') {
                closeNewline = i;
                closeNewlineFound = true;
                break;
            }
        }
        if (!closeNewlineFound) {
            System.out.println("save file invalid :( or method parameters are wrong :(");
            return null;
        }
        
        // if there are no scores
        if (openNewline - 1 == getWordEnclosedIndex(leaderboard, mode.toUpperCase(), '[', ']')) {
            System.out.println("there are no scores yet in this game mode.");
            return null;
        }
        
        
        // this part will never be reached if the closing newline is not found
        String score = leaderboard.substring(openNewline, closeNewline);
        String[] scoreArray = score.split(",");
        
        return scoreArray;
    }
}
