
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 50;
		if (height>90) {
			if(height<200) {
				System.out.println("Thank you for entering your height.");
				System.out.println("You are eligible to enter the ride. Enjoy the ride.");
			} else {
				System.out.println("Sorry, the maximum height for the ride is 200cm");
				System.out.println("Unfortunately you are not eligible to enter the ride");
			}
		} else {
			System.out.println("Sorry, the minimum height for the ride is 90cm");
			System.out.println("Unfortunately you are not eligible to enter the ride");
		}

	}

}
