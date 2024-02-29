class F 
{
	public static void main(String[] args) 
	{
		int firstNum = 0;
		int secondNum = 1;
		int thirdNum = 30;

		int min = ((firstNum < secondNum) ? ((firstNum < thirdNum) ? firstNum : thirdNum) : ((secondNum < thirdNum) ? secondNum : thirdNum)); 

		System.out.println("Minimum b/w " + firstNum + " and " + secondNum + " and " + thirdNum + " is " + min);
	}
}

