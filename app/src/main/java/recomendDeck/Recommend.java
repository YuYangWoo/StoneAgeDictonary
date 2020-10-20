package recomendDeck;

public class Recommend {
    private String Tier;

    public String getTier() {
        return Tier;
    }

    public String getTopic() {
        return Topic;
    }

    public String getExplain() {
        return explain;
    }

    private String Topic;
    private String explain;

     Recommend(String Tier, String Topic, String explain){
        this.Tier = Tier;
        this.Topic = Topic;
        this.explain = explain;
     }
}
