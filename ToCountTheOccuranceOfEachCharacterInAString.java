import java.util.Scanner;
public class ToCountTheOccuranceOfEachCharacterInAString {
	public static void main(String[] args) {
		String s="Sandhya";
		int count=0;
		char ch[] =s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			System.out.print(ch[i] +"is found in" +count+ "times");
			count=0;
			System.out.println();
		}
		
	}
			
		}

