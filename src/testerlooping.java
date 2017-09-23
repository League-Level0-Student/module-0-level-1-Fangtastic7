
public class testerlooping {
	public static void main(String[] args) {
		for(int i= 1; i < 8; i++) {
			if (i == 1) {
				System.out.println(i + " potato" + ",");
			}
			if(i==4) {
				System.out.println(i + ".");
				i=5;
			}
			if(i>1) {
				System.out.println(i + " potatoes" + ",");
			}
			
			if(i==7) {
				System.out.println("more!");
			}
		}
	}
}
