import java.util.ArrayList;
import java.util.TreeMap;

public class Scenario_2 {
    // Number of matches won of all teams over all the years of IPL
    public static void matchesWon(ArrayList<Matches> matches){
        TreeMap<String,Integer> tre = new TreeMap<>();
        for(Matches mat : matches){
            tre.put(mat.getWinner(), tre.getOrDefault(mat.getWinner(),0)+1);
        }
        System.out.println(tre);
    }
}
