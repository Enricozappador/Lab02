package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<Word> dizionario;
	
	public AlienDictionary() { 
		this.dizionario = new ArrayList<Word>();
	}
		public void addWord(String alienWord, String translation) {
					Word w = new Word(alienWord, translation);
					
					for (wtemp : dizionario)
					{ if (wtemp.equals(w) == true) {
						wtemp.setTranslation(translation);
						return;
					}
					
						}
					}

		
	
	
	public void addWord(String alienWord, String translation){ 
		
	}

	}
