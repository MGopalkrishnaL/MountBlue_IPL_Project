import java.util.ArrayList;
import java.util.HashMap;

public class Scenario6 {

    public static void solution(ArrayList<Deliveries> arr){
        HashMap<String,Integer> has = new HashMap<>();
        for(Deliveries del : arr){
            has.put(del.getBowlingTeam(),has.getOrDefault(del.getBowlingTeam(),0)+del.getByeRuns());
        }
        System.out.println(has);
//        return has;
    }

}
