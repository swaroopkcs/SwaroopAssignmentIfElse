
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 200;
		int num3 = 150;
		if (num1>num2) {
			if (num1>num3) {
				System.out.println("The largest number among the list is "+num1);
			}else {
				System.out.println("The largest number among the three is "+num3);
			}
		}
			else if(num2>num3) {
				System.out.println("The largest number among the three is "+num2);
			}else {
				System.out.println("The largest number among the three is "+num3);
		}

	}

}
