import java.util.Random;

public class Mutation {
	public Mutation(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		while(true){
		int  n = rand.nextInt(5) + 1;
		
			if(n == 1){
				System.out.println("nothing");
			}
			if(n == 2){
				System.out.println("Mutation 1");
			}
			if(n == 3){
				System.out.println("Mutation 2");
			}
			if(n == 4){
				System.out.println("Mutation 3");
			}
			if(n == 5){
				System.out.println("Mutation 4");
			}
		}
		
	}

}
