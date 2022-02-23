package com.syntax.homeworks;

public class Task6HomeworkClass13 {
	
	char getGrade(int score) {
		
		if(score>=90) {
			return 'A';
		}else if (score < 90 && score>80){
			return 'B';
		}else if (score <80 && score>70) {
			return 'C';
		}else if (score <70 && score>50) {
			return 'D';
		}else {
			return 'F';
		}
		
		
	}


	public static void main(String[] args) {
		
		Task6HomeworkClass13 grade=new Task6HomeworkClass13();
		System.out.println(grade.getGrade(45));

	}

}
