
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double goalPerAchieved = 89.75;
		if (goalPerAchieved>50) {
			if(goalPerAchieved<70) {
			System.out.println("You will be receiving a commission of 5%");
			} else if(goalPerAchieved>70) {
				System.out.println("You will be recieving a commission of 10%");
			}
				
		} else {
			System.out.println("You will be receiving a commission of 1%");
		}

	}

}
