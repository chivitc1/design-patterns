package patterns.singletons;

public class SingletonMain {

	public static void main(String[] args){
		System. out.println("Trying to make a captain for our team");
		MakeCaptain c1 = MakeCaptain.getCaptain();
		
		System. out.println("Trying to make another captain for our team");
		 MakeCaptain c2 = MakeCaptain.getCaptain();
		 
		 if(c1 == c2){
			 System. out.println("c1 and c2 are same instance");
		 }
	}
}
