package ie.tudublin;

import java.lang.annotation.Target;
import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

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
				//follows.add(word);
				printModel(words);

            }
            //System.out.println();
        }
	
	}
	/*public boolean findWord(String[] str){
		for(String word: str){
			if(str == word[]){
				return false;

			}
		}
		return true;
	}*/
	public void printModel(String[] words){
		for (String word:words) {
			System.out.print(word+" "+"\n");
		}
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}



