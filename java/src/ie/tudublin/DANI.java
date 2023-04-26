package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<Word>hitandhope =new ArrayList<Word>();

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    

	public void setup() {
		colorMode(HSB);
		loadFile();
		draw();
       
	}

	public void loadFile(){
		String[] lines = loadStrings("shakespere.txt");
		for (String line : lines) {
            String[] words = split(line, ' ');
            for (String word : words) {
                word= word.replaceAll("[^\\w\\s]", ""); 
                word= word.toLowerCase();
                //System.out.print(word + " ");
				Word w= new Word(word);
				Word fWord = findWord(word);
				if (fWord == null) {
					Word newWord = new Word(word);
					hitandhope.add(newWord);
				}
				//follows.add(word);
				//printModel(hitandhope);
				//printModel(words);
				printModel();
				

            }
            //System.out.println();
        }
	
	}



	public Word findWord(String word) {
		for (Word w : hitandhope) {
			if (w.getWord().equals(word)) {
				return w;
				//int count=getCount();
			}
		}
		return null;
	}

	/*public void printModel(String[] words){
		for (String word:words) {
			System.out.print(word+" "+"\n");
		}
		for (Word word : hitandhope) {
			println(word);
		}
	}*/

	
    public void printModel() {
        for (Word word : hitandhope) {
            println(word);
        }
    }

	public void keyPressed() {
		//writeSonnet();
	}

	float off = 200;

	/*public String[] writeSonnet(){

		/*for(Word word :hitandhope){
			draw();
		}

		for (int i = 0; i < 14; i++) {
			draw(i);
		}
		return ;
	}*/


	public void draw(int i) 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
		/*for(Word word:hitandhope){
			float x=PApplet.map(word,off ,height/2 , width-off , height/2);
			//text(word,0, 0, 0, 0);
			text(word, 0, 0, 0, 0);
		}*/
		text("From fairest creatures we desire increase,", 0, 0, 0, 0);
		
        
	}
}

//    