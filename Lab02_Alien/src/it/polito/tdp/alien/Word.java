package it.polito.tdp.alien;

public class Word {
private String alienWord;
private String translation; 

public Word (String alienWord, String translation) {
	this.setAlienWord(alienWord.toLowerCase());
	this.setTranslation(translation.toLowerCase());
}

public String getAlienWord() {
	return alienWord;
}

public void setAlienWord(String alienWord) {
	this.alienWord = alienWord;
}

public String getTranslation() {
	return translation;
}

public void setTranslation(String translation) {
	this.translation = translation;
}


public boolean equals (Object w) {
	Word wtemp= (Word) w;
	if (this.alienWord.compareTo(wtemp.alienWord)==0)
		return true;
	return false;
}








}
