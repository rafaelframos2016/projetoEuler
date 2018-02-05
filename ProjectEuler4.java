public class ProjectEuler4{

public static void main(String args[]) throws Exception
{
//System.out.printf("Número de dígitos dos fatores do palindromo é\n");
//int a = System.in.read();
//System.out.printf("o numero  de dígitos é: %d\n",a);
int i,j;
int maiorPalindrome=0;
for(i=100000;i<1000000;i++)
{
	for(j=100000;j<1000000;j++)
	{
		if((i*j)>maiorPalindrome && isPalindrome(i*j))
		{
			maiorPalindrome=(i*j);
		}
	}
}
System.out.printf("O maior palindromo é %d",maiorPalindrome);
}

public static boolean isPalindrome(int num)
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
