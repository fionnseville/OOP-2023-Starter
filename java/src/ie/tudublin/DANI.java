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
                w= word.replaceAll("[^\\w\\s]", ""); 
                w= word.toLowerCase();
                System.out.print(word + " ");
				Word word= new Word(w);

            }
            //System.out.println();
        }
		/*for (int i = 0; i < lines.length; i++) {
			String line = lines[i];
			split(line,' ');
			line = lines[i].replaceAll("[^\\w\\s]","");
			line=lines[i].toLowerCase();
			System.out.print(line);
		}*/
	
	}
	public void findWord(String str){
		for(String w:words){
			if(str == w){
				return false;

			}
		}
		return true;
	}
	/*public void printModel(){
		for (int i = 0; i < lines.size(); i++) {
			
		}
	}*/


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



