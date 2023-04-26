public class Deliveries {
    private Integer matchId;
    private Integer innings;
    private String battingTeam;
    private String bowlingTeam;
    private Integer over;
    private Integer ball;
    private String batsman;
    private String nonStriker;
    private String bowler;
    private Integer isSuperOver;
    private Integer WideRuns;
    private Integer byeRuns;
    private Integer legByes;
    private Integer noBalls;
    private Integer penaltyRuns;
    private Integer batsmanRuns;
    private Integer extraRuns;
    private Integer totalRuns;
    private String playerDismissed;
    private String dismissalKind;
    private String fielder;
    public Deliveries(){}
    public Deliveries(Integer matchId, Integer innings, String battingTeam, String bowlingTeam, Integer over, Integer ball, String batsman, String nonStriker, String bowler, Integer isSuperOver, Integer wideRuns, Integer byeRuns, Integer legByes, Integer noBalls, Integer penaltyRuns, Integer batsmanRuns, Integer extraRuns, Integer totalRuns, String playerDismissed, String dismissalKind,String fielder) {
        this.matchId = matchId;
        this.innings = innings;
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.over = over;
        this.ball = ball;
        this.batsman = batsman;
        this.nonStriker = nonStriker;
        this.bowler = bowler;
        this.isSuperOver = isSuperOver;
        WideRuns = wideRuns;
        this.byeRuns = byeRuns;
        this.legByes = legByes;
        this.noBalls = noBalls;
        this.penaltyRuns = penaltyRuns;
        this.batsmanRuns = batsmanRuns;
        this.extraRuns = extraRuns;
        this.totalRuns = totalRuns;
        this.playerDismissed = playerDismissed;
        this.dismissalKind = dismissalKind;
        this.fielder =fielder;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getInnings() {
        return innings;
    }

    public void setInnings(Integer innings) {
        this.innings = innings;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBowlingTeam() {
        return bowlingTeam;
    }

    public void setBowlingTeam(String bowlingTeam) {
        this.bowlingTeam = bowlingTeam;
    }

    public Integer getOver() {
        return over;
    }

    public void setOver(Integer over) {
        this.over = over;
    }

    public Integer getBall() {
        return ball;
    }

    public void setBall(Integer ball) {
        this.ball = ball;
    }

    public String getBatsman() {
        return batsman;
    }

    public void setBatsman(String batsman) {
        this.batsman = batsman;
    }

    public String getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(String nonStriker) {
        this.nonStriker = nonStriker;
    }

    public String getBowler() {
        return bowler;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }

    public Integer getIsSuperOver() {
        return isSuperOver;
    }

    public void setIsSuperOver(Integer isSuperOver) {
        this.isSuperOver = isSuperOver;
    }

    public Integer getWideRuns() {
        return WideRuns;
    }

    public void setWideRuns(Integer wideRuns) {
        WideRuns = wideRuns;
    }

    public Integer getByeRuns() {
        return byeRuns;
    }

    public void setByeRuns(Integer byeRuns) {
        this.byeRuns = byeRuns;
    }

    public Integer getLegByes() {
        return legByes;
    }

    public void setLegByes(Integer legByes) {
        this.legByes = legByes;
    }

    public Integer getNoBalls() {
        return noBalls;
    }

    public void setNoBalls(Integer noBalls) {
        this.noBalls = noBalls;
    }

    public Integer getPenaltyRuns() {
        return penaltyRuns;
    }

    public void setPenaltyRuns(Integer penaltyRuns) {
        this.penaltyRuns = penaltyRuns;
    }

    public Integer getBatsmanRuns() {
        return batsmanRuns;
    }

    public void setBatsmanRuns(Integer batsmanRuns) {
        this.batsmanRuns = batsmanRuns;
    }

    public Integer getExtraRuns() {
        return extraRuns;
    }

    public void setExtraRuns(Integer extraRuns) {
        this.extraRuns = extraRuns;
    }

    public Integer getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(Integer totalRuns) {
        this.totalRuns = totalRuns;
    }

    public String getPlayerDismissed() {
        return playerDismissed;
    }

    public void setPlayerDismissed(String playerDismissed) {
        this.playerDismissed = playerDismissed;
    }

    public String getDismissalKind() {
        return dismissalKind;
    }

    public void setDismissalKind(String dismissalKind) {
        this.dismissalKind = dismissalKind;
    }

    public String getFielder() {
        return fielder;
    }

    public void setFielder(String fielder) {
        this.fielder = fielder;
    }
}
