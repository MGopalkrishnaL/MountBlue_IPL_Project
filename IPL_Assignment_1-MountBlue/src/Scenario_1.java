import java.util.ArrayList;
import java.util.TreeMap;

public class Scenario_1 {
    //Number of matches played per year of all the years in IPL
    public static void getTotalMatchesPlayedInIPL(ArrayList<Matches> mat){
        TreeMap<Integer,Integer> tre = new TreeMap<>();
        for (Matches math : mat){
            tre.put(math.getSeason(),tre.getOrDefault(math.getSeason(),0)+1);
        }
        System.out.println(tre);
    }
}
