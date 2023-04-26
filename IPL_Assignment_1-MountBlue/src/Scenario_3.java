import java.util.*;

public class Scenario_3 {
    //for the year 2016 get the extra runs conceded per team
    //1.we need to filter the team which are played in 2016.
//    we need to pass two parameters like list and which year we need
    public static ArrayList<Integer> get2016Teams (ArrayList<Matches> list,Integer year){
       ArrayList<Integer> has = new ArrayList<>();
        for(Matches mat : list){
            if(mat.getSeason()==year){
                has.add(mat.getId());
            }
        }
        return has;
    }
    //2.we need to get the extra runs per team
    public static TreeMap<String,Integer> extraRuns(ArrayList<Integer> teamIdPlayedin2016, ArrayList<Deliveries> DeliveriesList){
        TreeMap<String,Integer> answer = new TreeMap<>();
            int i=0;
        for(Integer id : teamIdPlayedin2016){
            if(DeliveriesList.get(i).getMatchId()==id){
                answer.put(DeliveriesList.get(i).getBattingTeam(),answer.getOrDefault(DeliveriesList.get(i).getBattingTeam(),0)+DeliveriesList.get(i).getExtraRuns());
            }
        }
                    return answer;
    }


}
