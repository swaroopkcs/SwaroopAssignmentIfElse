
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double discount = 50;
		String promo1 = "Promo1";
		String promo2 = "Promo2";
		String promo3 = "Promo3";
		String promo = "Promo1";
		if (promo==promo1) {
			System.out.println("The total discount applied on the products is "+(discount+5));
		} else if (promo==promo2){
			System.out.println("The total discount applied on the product is "+(discount+10));
		} else if (promo ==promo3) {
			System.out.println("The total discount applied on the product is "+(discount+15));
		} else {
			System.out.println("Please enter a valid promo code");
		}
		

	}

}
