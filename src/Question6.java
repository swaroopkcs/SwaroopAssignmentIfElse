
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double discount = 50;
		String promo1 = "Promo1";
		String promo2 = "Promo2";
		String promo3 = "Promo3";
		String promo = "Promo3";
		double productPrice = 100;
		double finalDiscount;
		double discountedPrice;
		if (promo.equals(promo1)) {
			finalDiscount = discount+5;
			System.out.println("The total discount applied on the products is "+finalDiscount);
			discountedPrice = (productPrice*(100-finalDiscount))/100;
			System.out.println("The final price of the product is "+discountedPrice);
		} else if (promo.equals(promo2)){
			finalDiscount = discount+10;
			System.out.println("The total discount applied on the products is "+finalDiscount);
			discountedPrice = (productPrice*(100-finalDiscount))/100;
			System.out.println("The final price of the product is "+discountedPrice);
		} else if (promo.equals(promo3)) {
			finalDiscount = discount+20;
			System.out.println("The total discount applied on the products is "+finalDiscount);
			discountedPrice = (productPrice*(100-finalDiscount))/100;
			System.out.println("The final price of the product is "+discountedPrice);
		} else {
			System.out.println("Please enter a valid promo code");
		}
		

	}

}
