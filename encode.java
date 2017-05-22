
//========================Encoding a messgae
public class encode
{
	String make="";
	public String encodeMessage(String toMake)
	{
		long a=toMake.length();
		int i=0;
	  do{
			if(toMake.charAt(i)=='a')
			{
				make=make+"~";
				i++;
			}
			else if(toMake.charAt(i)=='b')
			{
				make=make+"!";
				i++;
			}
			else if(toMake.charAt(i)=='c')
			{
				make=make+"@";
				i++;
			}
			else if(toMake.charAt(i)=='d')
			{
				make=make+"#";
				i++;
			}
			else if(toMake.charAt(i)=='e')
			{
				make=make+"$";
				i++;
			}
			else if(toMake.charAt(i)=='f')
			{
				make=make+"%";
				i++;
			}
			else if(toMake.charAt(i)=='g')
			{
				make=make+"^";
				i++;
			}
			else if(toMake.charAt(i)=='h')
			{
				make=make+"&";
				i++;
			}
			else if(toMake.charAt(i)=='i')
			{
				make=make+"*";
				i++;
			}
			else if(toMake.charAt(i)=='j')
			{
				make=make+"(";
				i++;
			}
			else if(toMake.charAt(i)=='k')
			{
				make=make+")";
				i++;
			}
			else if(toMake.charAt(i)=='l')
			{
				make=make+"_";
				i++;
			}
			else if(toMake.charAt(i)=='m')
			{
				make=make+"+";
				i++;
			}
			else if(toMake.charAt(i)=='n')
			{
			make=make+"}";
				i++;
			}
			else if(toMake.charAt(i)=='o')
			{
				make=make+"{";
				i++;
			}
			else if(toMake.charAt(i)=='p')
			{
				make=make+"]";
				i++;
			}
			else if(toMake.charAt(i)=='q')
			{
				make=make+":";
				i++;
			}
			else if(toMake.charAt(i)=='r')
			{
				make=make+"?";
				i++;
			}
			else if(toMake.charAt(i)=='s')
			{
				make=make+">";
				i++;
			}
			else if(toMake.charAt(i)=='t')
			{
				make=make+"<";
				i++;
			}
			else if(toMake.charAt(i)=='u')
			{
				make=make+"9";
				i++;
			}
			else if(toMake.charAt(i)=='v')
			{
				make=make+"8";
				i++;
			}
			else if(toMake.charAt(i)=='w')
			{
				make=make+"7";
				i++;
			}
			else if(toMake.charAt(i)=='x')
			{
				make=make+"6";
				i++;
			}
			else if(toMake.charAt(i)=='y')
			{
				make=make+"5";
				i++;
			}
			else if(toMake.charAt(i)=='z')
			{
				make=make+"4";
				i++;
			}
			else if(toMake.charAt(i)==' ')
			{
				make=make+"-";
				i++;
			}
		
		}while(i<a);
		
		return make;
	}
	public void prnt()
	{System.out.print(make);}
	
	
}
//==this code was last modified on 1/2/17 by waqar hussain