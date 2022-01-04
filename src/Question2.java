
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 12;
		String licenseClass = "G";
		if (age>16) {
			if (licenseClass== "G1") {
				System.out.println("You have a G1 License now. You are eligible to apply for G2");
			} else if (licenseClass == "G2") {
				System.out.println("You have a G2 License now. You are eligible to apply for G");
			} else if (licenseClass=="G"){
				System.out.println("You have a G License Now. Congratulations and Enjoy Driving");
			} else {
				System.out.println("Please enter a valid License class");
			}
		} else {
			System.out.println("You are not eligible for a license now. Please try again in "+(16-age)+" years");
		}
		

	}

}
