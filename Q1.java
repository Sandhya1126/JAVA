import java.util.Scanner;
class Q1
	{
		public static String largestSubString(String str)
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
			
			for(int i=0;i<ss.length();i++)
			{
				int c=0;
				for(int j=0;j<ss.length();j++)
				{
					if(ss.charAt(i)==ss.charAt(j))
					{
						c++;
					}
				}
				if(c!=1)
				{
					return false;
				}
			}
			return true;
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			System.out.print(largestSubString(str));
		}
	}