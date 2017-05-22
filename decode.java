import java.util.Scanner;
public class decode
{
	private int b=0;
	public decode()
	{
		
	}
	encode de=new encode();
	
	public String getMessage()
	{
		Scanner scanf=new Scanner(System.in);
	    String s;
		System.out.println("Enter a message");
	    s=scanf.next();
		
		
		return s;
	}
	
	public void Decode(String s)
	{
	
		do
		{
			if(b==0)
			{
				System.out.println("============================");
				System.out.println("||   Encryption Removed   ||");
				System.out.println("============================");
			}
			char check=s.charAt(b);
			if(check=='~')
			{
				System.out.print("a");
			}
			else if(check=='!')
			{
				System.out.print("b");
			}
			else if(check=='@')
			{
				System.out.print("c");
			}
			else if(check=='#')
			{
				System.out.print("d");
			}
			else if(check=='$')
			{
				System.out.print("e");
			}
			else if(check=='%')
			{
					System.out.print("f");
			}
			else if(check=='^')
			{
					System.out.print("g");
			}
			else if(check=='&')
			{
					System.out.print("h");
			}
			else if(check=='*')
			{
					System.out.print("i");
			}
			else if(check=='(')
			{
					System.out.print("j");
			}
			else if(check==')')
			{
					System.out.print("k");
			}
			else if(check=='_')
			{
					System.out.print("l");
			}
			else if(check=='+')
			{
					System.out.print("m");
			}
			else if(check=='}')
			{
					System.out.print("n");
			}
			else if(check=='{')
			{
					System.out.print("o");
			}
			else if(check==']')
			{
					System.out.print("p");
			}
			else if(check==':')
			{
					System.out.print("q");
			}
			else if(check=='?')
			{
					System.out.print("r");
			}
			else if(check=='>')
			{
					System.out.print("s");
			}
			else if(check=='<')
			{
					System.out.print("t");
			}
			else if(check=='9')
			{
					System.out.print("u");
			}
			else if(check=='8')
			{
					System.out.print("v");
			}
			else if(check=='7')
			{
					System.out.print("w");
			}
			else if(check=='6')
			{
					System.out.print("x");
			}
			else if(check=='5')
			{
					System.out.print("y");
			}
			else if(check=='4')
			{
					System.out.print("z");
			}
			else if(check=='-')
			{
				System.out.print(" ");
			}
			b++;
		
		}while(b<s.length());
	}
	public void all(String s)
	{
		String ss=de.encodeMessage(s);
		System.out.print(ss);
		
	}


}