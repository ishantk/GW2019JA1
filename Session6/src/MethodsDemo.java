
public class MethodsDemo {

	/*
	static void applyPromoCode(int code, double amount){
		
		if(code == 1){
			double discount = amount*(50.0/100.0);
			amount = amount - discount;
			System.out.println(">> Please Pay: \u20b9"+amount);
		}else if(code == 2){
			double discount = amount*(30.0/100.0);
			amount = amount - discount;
			System.out.println(">> Please Pay: \u20b9"+amount);
		}else if(code == 3){
			double discount = amount*(10.0/100.0);
			amount = amount - discount;
			System.out.println(">> Please Pay: \u20b9"+amount);
		}else{
			System.out.println(">> No Discount. Please Pay: \u20b9"+amount);
		}
		
	}
	*/
	
	static double getDiscountAfterPromoCode(int code, double amount){
		
		double discount = 0.0;
		
		if(code == 1){
			discount = amount*(50.0/100.0);
		}else if(code == 2){
			discount = amount*(30.0/100.0);
		}else if(code == 3){
			discount = amount*(10.0/100.0);
		}else{
			discount = 0.0;
		}
		
		return discount;
	}

	public static void main(String[] args) {
		
		// 1: Flat50 | 2: Flat30 | 3: Flat10
		
		double total = 1000;
		//MethodsDemo.applyPromoCode(2, total);
		
		double disc = MethodsDemo.getDiscountAfterPromoCode(5, total);
		System.out.println(">> Please Pay: \u20b9"+(total - disc));
		
	}

}

// Assignment: Optimize the above logic
// 			   1. Check if user is entering correct code to get discounts
//			   2. if amount > 1000 | Flat50 can be applied
// 			   3. if amount > 500 and less than 1000 Flat30 can be applied
//			   4. if amount > 200 and less than 500 Flat10 can be applied
//			   5. we cannot offer discounts for amount less than 200
//			   6. Also tell user what code is better from him/her in case a wrong code is eneterd
