import java.util.ArrayList;
import java.util.Arrays;


public class createPrimeNumberList {
	private ArrayList <Integer> primeNumberList = new ArrayList <>();
	private String exhibition;


	public static void main(String[] args)
	{
		createPrimeNumberList c = new createPrimeNumberList();
		System.out.println(c.prime());
//		System.out.println(c.getExhibition());
	}
	public  ArrayList<Integer> findPrimeNumber()
	{
		
		primeNumberList.add(2);
		primeNumberList.add(3);
		
		int count;
		
		System.out.println("list now is "+ primeNumberList);
	
		for (count =5; count<= 100000; count +=2)
		{
			int index= 0;
			boolean isPrime =true;
			int squaredCount = (int) Math.sqrt(count);
			int divideNumber = count/primeNumberList.get(index);
			int remainder = count% primeNumberList.get(index);
			
			while(isPrime && primeNumberList.get(index)<=squaredCount)
			{
				
				if(remainder==0)
				{
					isPrime=false;
				}
				else
				{
				index= index+1;
//				System.out.println("index now is " + index);
//				System.out.println("prime number now is " + primeNumberList.get(index));
				}

				divideNumber = count/primeNumberList.get(index);
				remainder = count% primeNumberList.get(index);
			
			}
			if(isPrime )
			{
//				System.out.println(count + " is a prime number");
				primeNumberList.add(count);
				
			}

		}
		
		
		return primeNumberList;

	}
	public String prime()
	{
		createPrimeNumberList c = new createPrimeNumberList();
		c.findPrimeNumber();
		ArrayList<Integer> primeList = c.getPrimeNumberList();
		exhibition ="";
		for(int x: primeList)
		{
			exhibition =exhibition+ x+ "\n";
		}
		return exhibition;

	}
	public String getExhibition() {
		return exhibition;
	}
	public void setExhibition(String exhibition) {
		this.exhibition = exhibition;
	}
	public ArrayList<Integer> getPrimeNumberList() {
		return  primeNumberList;
	}
	public void setPrimeNumberList(ArrayList<Integer> primeNumberList) {
		this.primeNumberList = primeNumberList;
	}
}
