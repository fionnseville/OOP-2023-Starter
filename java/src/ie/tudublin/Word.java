package ie.tudublin;

import java.util.ArrayList;

public class Word {
    String word;
    ArrayList<Follow> follows = new ArrayList<Follow>();
    public String getWord() {
        return word;
    }
    public void setWord2(String word) {
        this.word = word;
    }
    public ArrayList<Follow> getFollows() {
        return follows;
    }
    public void setFollows(ArrayList<Follow> follows) {
        this.follows = follows;
    }

    public Word(String word){
        this.word=word;
        

    }
    

    public String toString(){
        return word+"not yet";
    }
    
}
