import java.util.ArrayList;

public class ConvertingStringToObject {
    public static ArrayList<Deliveries> deliveryList = new ArrayList<>();
    public static ArrayList<Matches> matchesList = new ArrayList<>();
    public static void listOfDeliveries (String [] arr){
        int id =0;
        Deliveries delivery = new Deliveries();
        delivery.setMatchId(Integer.parseInt(arr[id++]));
        delivery.setInnings(Integer.valueOf(arr[id++]));
        delivery.setBattingTeam(arr[id++]);
        delivery.setBowlingTeam(arr[id++]);
        delivery.setOver(Integer.valueOf(arr[id++]));
        delivery.setBall(Integer.valueOf(arr[id++]));
        delivery.setBatsman(arr[id++]);
        delivery.setNonStriker(arr[id++]);
        delivery.setBowler(arr[id++]);
        delivery.setIsSuperOver(Integer.valueOf(arr[id++]));
        delivery.setWideRuns(Integer.valueOf(arr[id++]));
        delivery.setByeRuns(Integer.valueOf(arr[id++]));
        delivery.setLegByes(Integer.valueOf(arr[id++]));
        delivery.setNoBalls(Integer.valueOf(arr[id++]));
        delivery.setPenaltyRuns(Integer.valueOf(arr[id++]));
        delivery.setBatsmanRuns(Integer.valueOf(arr[id++]));
        delivery.setExtraRuns(Integer.valueOf(arr[id++]));
        delivery.setTotalRuns(Integer.valueOf(arr[id++]));
        if(id!=arr.length) {
            delivery.setPlayerDismissed(arr[id]);
            id++;
        }else{
            delivery.setFielder("Empty");
        }
        if (id != arr.length) {
            delivery.setDismissalKind(arr[id]);
            id++;
        }else {
            delivery.setPlayerDismissed("Empty");
        }
        if (id != arr.length) {
            delivery.setFielder(arr[id]);
        } else{
            delivery.setFielder("Empty");
        }
        deliveryList.add(delivery);
    }
    public static void listOfMatches (String [] mat){
        int id =0;
        Matches match = new Matches();
        match.setId(Integer.parseInt(mat[id++]));
        match.setSeason(Integer.parseInt(mat[id++]));
        match.setCity(mat[id++]);
        match.setDate(mat[id++]);
        match.setTeam1(mat[id++]);
        match.setTeam2(mat[id++]);
        match.setTossWinner(mat[id++]);
        match.setTossDecision(mat[id++]);
        match.setResult(mat[id++]);
        match.setDlApplied(Integer.parseInt(mat[id++]));
        match.setWinner(mat[id++]);
        match.setWinByRuns(Integer.parseInt(mat[id++]));
        match.setWinByWickets(Integer.parseInt(mat[id++]));
        match.setPlayOfMatch(mat[id++]);
        match.setVenu(mat[id++]);
        match.setUmpire1(mat[id++]);
        match.setUmpire2(mat[id++]);
        if(id!=mat.length){
            match.setUmpire3(mat[id++]);
        }else{
            match.setUmpire3("No_3rd_Umpire");
        }
        matchesList.add(match);
    }
}
