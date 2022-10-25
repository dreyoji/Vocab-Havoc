package IOstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 * 
 * LEADERBOARD FORMAT
 * 
 * [FRENZY] // notice: surrounded by brackets
 * NAME, SCORE, TIME
 * ...
 * 
 * [TIME ATTACK]
 * NAME, TIME
 * 
 */
public class Ostream {
    static String path = "savedata/leaderboard.txt";
    
    protected static void stringToFile(String data, String path) throws IOException {
        File leaderboard = new File(path);
        FileWriter fw = new FileWriter(leaderboard);
        fw.write(data);
        fw.close();
    }
    
    protected static String numToTime(int num) {
        int sec = num % 60;
        int min = num / 60;
        
        String time = String.format("%02d:%02d", min, sec);
        return time;
    }
    
    public static void saveScoreFrenzy(String name, int wordsGuessed, int time) {
        String scoreString = "\n" + name + "," + Integer.toString(wordsGuessed) + "/5," + numToTime(time);
        saveScore(scoreString, "FRENZY");
    }
    
    public static void saveScoreTimeAttack(String name, int time) {
        String scoreString = "\n" + name + "," + numToTime(time);
        saveScore(scoreString, "TIME ATTACK");
    }
    
    protected static void saveScore(String score, String mode) {
        // load the file as string so we can manipulate it
        String leaderboard = "";
        try {
            leaderboard = Istream.fileToString(path);
        } catch (IOException ex) {
            System.out.println("failed to save score :(");
            return;
        }

        int startIndex = Istream.getWordEnclosedIndex(leaderboard, mode, '[', ']');
        
        // we will append the new scores here
        String startOfScores = leaderboard.substring(0, startIndex);
        
        // and then concat it with the rest of the string
        String everythingElse = leaderboard.substring(startIndex);
    
        startOfScores += score;
        leaderboard = startOfScores + everythingElse;
        
        // and then write the concatinated string to the save file
        try {
            stringToFile(leaderboard, path);
        } catch (IOException ex) {
            System.out.println("failed to save score :(");
        }
    }
}
