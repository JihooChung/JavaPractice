package chap6_practice;
import java.util.Calendar;

public class WhatTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar now = Calendar.getInstance();
		System.out.println("현재 시간은 " + now.get(Calendar.HOUR_OF_DAY) + "시 " + now.get(Calendar.MINUTE) + "분 입니다.");
		
			
		if(4<=now.get(Calendar.HOUR_OF_DAY) && now.get(Calendar.HOUR_OF_DAY)<12) 
			System.out.println("Good Morning");
		else if(12<=now.get(Calendar.HOUR_OF_DAY) && now.get(Calendar.HOUR_OF_DAY)<18) 
			System.out.println("Good Afternoon");
		else if(18<=now.get(Calendar.HOUR_OF_DAY) && now.get(Calendar.HOUR_OF_DAY)<22) 
			System.out.println("Good Evening");
		else System.out.println("Good Night");

	}

}
