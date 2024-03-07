import java.util.ArrayList;
import java.util.Scanner;

public class determinePrimeNumber {
	private ArrayList<Integer> primeArray = new ArrayList<>();
	private ArrayList<Integer> factors = new ArrayList<>();
	private long phoneNumber;
	private long newPhoneNumber;
	private int factor;
	String primeFactors ="";
	private boolean isPrime = true;

	public static void main(String[] args) {
		determinePrimeNumber x = new determinePrimeNumber();
//		ArrayList<Integer> primeArray = new ArrayList<>();
//		ArrayList<Integer> factors = new ArrayList<>();
		Scanner scan= new Scanner(System.in);
		int factor;
		String primeFactors ="";
		boolean isPrime = true;
		Scanner scanFile = TextFileIO.createTextRead("primeNumberList.txt");
		System.out.println("please enter a 10-digit phone number.");
		long phoneNumber = scan.nextLong();
		x.checkIfPrime(phoneNumber);

	}
	public void checkIfPrime(long phoneNumber)
	{
		Scanner scan= new Scanner(System.in);

		newPhoneNumber = phoneNumber;

		Scanner scanFile = TextFileIO.createTextRead("primeNumberList.txt");
		while (scanFile.hasNextInt())
		{
			primeArray.add(scanFile.nextInt());
		}
		for(int index = 0; index<=primeArray.size(); index++)
		{
			for (int prime : primeArray)
			{	
				if(prime<=Math.sqrt(phoneNumber))
				{
					if(phoneNumber% prime ==0)
					{
						factor = prime; 
						phoneNumber=phoneNumber/prime;
						factors.add(factor);
						isPrime = false;
					}
				}	
			}
		}
		for(int f: factors)
		{
			primeFactors = primeFactors + f+", ";
		}
		factors.add((int) phoneNumber);
		
		primeFactors = primeFactors +phoneNumber +".";

		if(isPrime==false)
		{
			System.out.println(newPhoneNumber +" is not a prime number.");
			System.out.println("factors are "+ primeFactors);
		}
		else if(isPrime == true)
		{
			System.out.println(newPhoneNumber +" is a prime number.");
		}
	}
	
	public ArrayList<Integer> getPrimeArray() {
		return primeArray;
	}
	public void setPrimeArray(ArrayList<Integer> primeArray) {
		this.primeArray = primeArray;
	}
	public ArrayList<Integer> getFactors() {
		return factors;
	}
	public void setFactors(ArrayList<Integer> factors) {
		this.factors = factors;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public long getNewPhoneNumber() {
		return newPhoneNumber;
	}
	public void setNewPhoneNumber(long newPhoneNumber) {
		this.newPhoneNumber = newPhoneNumber;
	}
	public int getFactor() {
		return factor;
	}
	public void setFactor(int factor) {
		this.factor = factor;
	}
	public String getPrimeFactors() {
		return primeFactors;
	}
	public void setPrimeFactors(String primeFactors) {
		this.primeFactors = primeFactors;
	}
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	

}
