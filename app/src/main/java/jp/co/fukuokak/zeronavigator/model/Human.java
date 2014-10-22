package jp.co.fukuokak.zeronavigator.model;

/**
 * Created by fukuokak on 2014/10/22.
 */
public class Human {
    private String headSize ;
    private String handSize ;
    private String footSize ;

    public Human(String headSize, String handSize, String footSize) {
        this.headSize = headSize;
        this.handSize = handSize;
        this.footSize = footSize;
    }

    public String getHeadSize() {
        return headSize;
    }

    public String getHandSize() {
        return handSize;
    }

    public String getFootSize() {
        return footSize;
    }
}
