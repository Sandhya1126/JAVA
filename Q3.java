import java.util.Scanner;
public class Q3 {
	
		public static String largestpalindrome(String str)
		{
			String ss1="";
			for(int i=0;i<str.length();i++)
			{
				for(int j=i;j<str.length();j++)
				{
					String ss=str.substring(i,j+1);
					if(isValid(ss)&&ss.length()>ss1.length())
					{
						ss1=ss;
					}
				}
			}
			return ss1;
		}
		public static boolean isValid(String ss)
		{
			String ss1="";
			for(int i=ss.length()-1;i>=0;i--)
			{
				ss1=ss1+ss.charAt(i);
			}
			if(ss.equals(ss1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			System.out.print(largestpalindrome(str));
		}
	}
