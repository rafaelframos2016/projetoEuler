import java.util.Scanner;
public class ProjectEuler4{

public static void main(String args[]) throws Exception
{
Scanner scanner = new Scanner(System.in);
short a=0;
do{
	System.out.printf("Entre o número de dígitos dos fatores do palindromo[1-9]:\n");
	a = scanner.nextShort();
}while(a<1 || a>9);
//System.out.printf("Os fatores tem %d dígitos. \n",a);

final long MAX = (long)Math.pow(10,a);
final long MIN = (long)Math.pow(10,a-1);
System.out.printf("Aguarde...");
long i,j;
long maiorPalindrome=0;
for(i=MIN;i<MAX;i++)
{
	for(j=i;j<MAX;j++)
	{
		if((i*j)>maiorPalindrome)
		if(isPalindrome(i*j))
		{
			maiorPalindrome=(i*j);
		}
	}
}

System.out.printf("O maior palindromo com fatores de %d digitos é %d",a,maiorPalindrome);
}

public static boolean isPalindrome(long num)
{
String str = String.valueOf(num);
int end = str.length();
int beg = 0;
for (int i=0;i<end/2;i++)
{
	if(str.charAt(beg+i)==str.charAt(end-1-i))
	{}
	else
	{return false;}
}
return true;
}
}
