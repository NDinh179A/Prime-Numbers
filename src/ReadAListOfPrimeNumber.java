import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAListOfPrimeNumber extends createPrimeNumberList {
	public void readPrimeFile(Scanner scanFile) 
	{

	}
	public void printPrimeFile(PrintWriter textStream)
	{
		textStream.println(prime());
	}
	public static void main (String [] args)
	{
		PrintWriter outStream = TextFileIO.createTextWrite("primeNumberList.txt");
		 ReadAListOfPrimeNumber print = new ReadAListOfPrimeNumber();
		 print.printPrimeFile(outStream);
		 outStream.close();
	}
	
	

}
