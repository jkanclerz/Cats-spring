package org.cats.application;

import java.util.ArrayList;
import java.util.List;

import org.cats.domain.Cat;
import org.springframework.stereotype.Repository;

@Repository
public class CatDAO{

	//static Scanner inputScr = new Scanner(System.in);
	static List <Cat> listOfCats = new ArrayList<Cat>();

	
	public static void addCatToCollection(Cat cat){
		listOfCats.add(cat);
	}
	
	public List<Cat> getCats(){
		return listOfCats;
	}
	
	public Cat getCatID(Integer id) {
		if (id<listOfCats.size()) {
			return listOfCats.get(id);
		} else {
			return null;
		}
	}

}
