package org.cats.application;

import java.util.Scanner;

import org.cats.domain.Cat;

public class Interfejs {
	
	static Scanner inputSrc = new Scanner(System.in);
	
	static CatDAO catdao = new CatDAO();
	
	public static String getUserInput(){
		return inputSrc.nextLine().trim();
		
	}
	
	static void showMenu(){
		System.out.println("Welcome in menu, please select an option: ");
		System.out.println("To add new cat:   1");
		System.out.println("To say hello:     2");
		System.out.println("To close program: x");
	}
	
	public static void showNamesOfAllCats(){
		int i = 0;
		
		for(Cat cat : catdao.listOfCats){
			System.out.println(i +": "+cat.getCatName());
			i++;
			}
		}
	
	public static void selectCatToSayWelcome(){
		System.out.println("Select cat: ");
		int numberOfCat = inputSrc.nextInt();
		if(numberOfCat != -1){	
			String selectedCatName = catdao.listOfCats.get(numberOfCat).getCatName();
			System.out.println("Cat nr "+ numberOfCat +": Hi, my name is " + selectedCatName); 
		}else
			System.out.println("There is no Cat witch that number");
	}
	
	public static void main(String [] args){
	char condition;
	Cat cat;
	
	showMenu();
	for(;;){
		String option = getUserInput();
		condition = option.charAt(0);
		
		if(condition == '1'){
			cat = new Cat();
			CatDAO.addCatToCollection(cat);
			showMenu();	
		}
		if(condition == '2'){
			showNamesOfAllCats();
			selectCatToSayWelcome();
			showMenu();	
		}
		if(condition == 'x'){
			System.out.println("goodbye!");
			break;
		}
	}//for
	}
}
