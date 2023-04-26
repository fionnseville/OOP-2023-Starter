package ie.tudublin;

import java.util.ArrayList;

public class Word {
    String word2;
    ArrayList<Follow> follows = new ArrayList<Follow>();
    public String getWord2() {
        return word2;
    }
    public void setWord2(String word2) {
        this.word2 = word2;
    }
    public ArrayList<Follow> getFollows() {
        return follows;
    }
    public void setFollows(ArrayList<Follow> follows) {
        this.follows = follows;
    }


    
}
