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

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile();
		draw();
       
	}

	public void loadFile(){
		String[] lines = loadStrings("small.txt");
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
		writeSonnet();
	}

	float off = 0;

	/*public writeSonnet(){

	}*/


	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
		//text(words)
        
	}
}

