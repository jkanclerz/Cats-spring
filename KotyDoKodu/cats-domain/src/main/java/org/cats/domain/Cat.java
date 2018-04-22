package org.cats.domain;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Cat{
	private String cat,owner;
	private float weight;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date date = null;
	boolean isDateCorrect, isWeightCorrect;
	static Scanner inputScr = new Scanner(System.in);
	
	public Cat(){
		System.out.println("Set cat's name: ");
		setCatName(getUserInput());
		
		System.out.println("Set owner's name: ");
		setOwnerName(getUserInput());
		
		System.out.println("Set date of birth: ");
		do{
			setDate(getUserInput());
		}while(date==null);
		
		System.out.println("Set cat's weight");
		do{
			setWeight(getUserInput());
		}while(weight == 0);
	} 
	
	public static String getUserInput(){
		return inputScr.nextLine().trim();
	}

	public void setDate(String dateToSet){
		Date date = null;
		
		try{
			date = sdf.parse(dateToSet);
			this.date = date;
		}catch(ParseException e){
			System.out.println("wrong date format!");
		}
	}
	public void setWeight(String weightToSet){
		float weight;
		weight = 0;
		try{
			weight = Float.parseFloat(weightToSet);
		}catch(NumberFormatException e){
			System.out.println("wrong weight format!");
		}
		this.weight = weight;
	}
	
	public Date getDate(){
		return this.date;
	}
	
	public Float getWeight(){
		return this.weight;
	}
	
	public void setCatName(String cat){
		this.cat = cat;
	}
	
	public void setOwnerName(String owner){
		this.owner = owner;
	}
	
	public String getCatName(){
		return this.cat;
	}
	
	public String getOwnerName(){
		return this.owner;
	}
	
	
}

/*Pattern pattern = Pattern.compile("([1-3]-){2}[0-9]{1}");			PATTERN DATY
Matcher match = pattern.matcher(dateToSet);
boolean b = match.matches();
this.isDateCorrect = b;
if(b== true)

else{
	System.out.println("wrong date format!");
}*/

/*Pattern pattern = Pattern.compile("[1-9]{1}.[0-9]?");				PATTERN WAGI
Matcher match = pattern.matcher(weightToSet);
boolean b = match.matches();
this.isWeightCorrect = b;
*/