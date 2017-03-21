package org.test.possiblePatterns;

public class PossiblePattern {

	public static void printPattern(String str, int left, int right){
		
		if(left == 0 && right == 0){
			System.out.println(str);
			return ;
		}
		
		if(left > 0){
			printPattern(str + "(", left-1, right);
		}
	
		if(left >= 0 && left < right){
			printPattern(str + ")", left, right-1);
		}

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		printPattern("", n, n);
	}

}
