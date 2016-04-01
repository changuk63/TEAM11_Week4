package com.team11.phonebill;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class InfoGetter {
	private String plan;
	private int minutesUsed;
	private int numberOfLines;
	private Logger log;
	
	public InfoGetter(){
		log = Logger.getLogger("Logger");
		Scanner scan = new Scanner(System.in);
		
		log.log(Level.INFO, "Input the plan : (Gold or Silver)");
		this.plan = scan.next();
		
		log.log(Level.INFO, "Input the minutes used : ");
		this.minutesUsed = scan.nextInt();
		
		log.log(Level.INFO, "Input the number of lines : ");
		this.numberOfLines = scan.nextInt();
	}
	
	public String getPlan(){
		return plan;
	}
	
	public int getMinutesUsed(){
		return minutesUsed;
	}
	
	public int getNumberOfLines(){
		return numberOfLines;
	}
	
}
