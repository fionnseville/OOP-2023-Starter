package ie.tudublin;

import javax.swing.text.TableView.TableRow;

public class Follow {
    public String word;
    public int count;

    public void follow(String word,int count){
        this.word=word;
        this.count= count;
    }
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    /*public Follow(TableRow tr) {
        this();
    }
    @Override
    public String toString(){
        return ;
    }*/
    
}

