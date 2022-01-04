
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double percentage = 51.25;
		if (percentage>0) {
			if(percentage<=50) {
				System.out.println("The grade for the student is D");
			} else if (percentage>50){
				if(percentage<=60) {
					System.out.println("The grade for the student is C");
				}else if(percentage>60) {
					if(percentage<=75) {
						System.out.println("The grade for the student is B");
					}else {
						System.out.println(" The grade of the student is A");
					}
				}
			}
		}else {
			System.out.println("Please enter a valid percentage");
		}
		

	}

}
