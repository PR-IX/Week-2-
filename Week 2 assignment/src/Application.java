
public class Application {

	public static void main(String[] args) {
		
		boolean isHotOutside = true ;
	    boolean isWeekDay = false ;
		boolean hasMoneyInPocket = true ;
		int costOfMilk = 3 ;
		double moneyInWallet = 15.50 ;
		int thirstLevel = 7 ;
		
		System.out.println(isHotOutside);
		System.out.println(isWeekDay);
	    System.out.println(hasMoneyInPocket);
	    System.out.println(costOfMilk);
	    System.out.println(moneyInWallet);
	    System.out.println(thirstLevel);

		if (isHotOutside == true && hasMoneyInPocket == true) {
			System.out.println("I should buy icecream");
		}else {
			System.out.println("I will not buy icecream");
		}
		
		if (isHotOutside == true && isWeekDay == false)	{	
	        System.out.println("I will go swimming");
		}else {
			System.out.println("I will not go swimming");
		}
	 
		if (isHotOutside == true && hasMoneyInPocket == true && isWeekDay == false)	 {
			System.out.println("It is a good day");
		}else {
			System.out.println("It is not a good day");
		}
		
		if (isHotOutside == true && thirstLevel >= 3 && moneyInWallet >= 6) {
			System.out.println("I will buy milk");
		}else {
			System.out.println("I will not buy milk");
		}
	}
}
	    

	
	

	
 
