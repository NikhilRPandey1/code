import java.util.Scanner;
class Duck
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n=Integer.parseInt(String.valueOf(ob.nextInt()));
int temp=n;
		int length=Integer.toString(n).length();
		int count=0,count1=0,flag=0,n1=0;
		while(n!=0)
			{
				n1=n%10;
				++count1;
				if(length==count1 &&n1==0)
				{
				flag=1;
				}
				n=n/10;

			}

		if(flag==1)
		{
		
		System.out.println("Duck Number :: ");
		}
		else
		{
		System.out.println("not Duck Number :: "+temp);	
		}
}		
}