public class ProjectEuler4{

public static void main(String args[]){
int i,j;
int maiorPalindrome=0;
for(i=100;i<1000;i++)
{
	for(j=100;j<1000;j++)
	{
		if((i*j)>maiorPalindrome && isPalindrome(i*j))
		{
			maiorPalindrome=(i*j);
		}
	}
}
System.out.printf("O maior palindromo é %d",maiorPalindrome);
}

public static boolean isPalindrome(int num){
if(num>99999)
{
int p = 100000;
	if((num%10)==(num/p))
	{
	p/=10;
		if( (num/p)%10 == (num%100)/10 )
		{
			String str = String.valueOf(num);
			if(str.charAt(2)==str.charAt(3))
			return true;
		}
	}
}
return false;
}
}
