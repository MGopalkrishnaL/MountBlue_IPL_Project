public class Matches {
    private Integer id;
    private Integer season;
    private String city;
    private String date;
    private String team1;
    private String team2;
    private String tossWinner;
    private String tossDecision;
    private String result;
    private Integer dlApplied;
    private String winner;
    private Integer winByRuns;
    private Integer winByWickets;
    private String playOfMatch;
    private String venu;
    private String umpire1;
    private String umpire2;
    private String umpire3;
    public Matches(){}

    public Matches(Integer id, Integer season, String city, String date, String team1, String team2,String tossWinner, String tossDecision, String result, Integer dlApplied, String winner, Integer winByRuns, Integer winByWickets, String playOfMatch, String venu, String umpire1, String umpire2, String umpire3) {
        this.id = id;
        this.season = season;
        this.city = city;
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.tossWinner = tossWinner;
        this.tossDecision = tossDecision;
        this.result = result;
        this.dlApplied = dlApplied;
        this.winner = winner;
        this.winByRuns = winByRuns;
        this.winByWickets = winByWickets;
        this.playOfMatch = playOfMatch;
        this.venu = venu;
        this.umpire1 = umpire1;
        this.umpire2 = umpire2;
        this.umpire3 = umpire3;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getTossDecision() {
        return tossDecision;
    }

    public void setTossDecision(String tossDecision) {
        this.tossDecision = tossDecision;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getDlApplied() {
        return dlApplied;
    }

    public void setDlApplied(Integer dlApplied) {
        this.dlApplied = dlApplied;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public Integer getWinByRuns() {
        return winByRuns;
    }

    public void setWinByRuns(Integer winByRuns) {
        this.winByRuns = winByRuns;
    }

    public Integer getWinByWickets() {
        return winByWickets;
    }

    public void setWinByWickets(Integer winByWickets) {
        this.winByWickets = winByWickets;
    }

    public String getPlayOfMatch() {
        return playOfMatch;
    }

    public void setPlayOfMatch(String playOfMatch) {
        this.playOfMatch = playOfMatch;
    }

    public String getVenu() {
        return venu;
    }

    public void setVenu(String venu) {
        this.venu = venu;
    }

    public String getUmpire1() {
        return umpire1;
    }

    public void setUmpire1(String umpire1) {
        this.umpire1 = umpire1;
    }

    public String getUmpire2() {
        return umpire2;
    }

    public void setUmpire2(String umpire2) {
        this.umpire2 = umpire2;
    }

    public String getUmpire3() {
        return umpire3;
    }

    public void setUmpire3(String umpire3) {
        this.umpire3 = umpire3;
    }

    public String getTossWinner() {
        return tossWinner;
    }

    public void setTossWinner(String tossWinner) {
        this.tossWinner = tossWinner;
    }
}
