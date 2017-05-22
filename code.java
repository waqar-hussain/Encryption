public class code
{
	public static void main(String args[])
	{
		String send;
		decode de=new decode();
		encode en=new encode();
		
		send=de.getMessage();
		String encodedMessage=en.encodeMessage(send);
		System.out.print(encodedMessage+"\n");
		de.Decode(encodedMessage);
		//de.all(send);
	
	
	}
}

