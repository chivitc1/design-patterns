package patterns.singletons;

/*
 * Thread-safe singleton class
 */
public class MakeCaptain {
	
	private MakeCaptain(){}
	
	//Bill Pugh solution
	private static class SingletonHelper{
		//Nested class is referenced after getCaptain() is called
		private static final MakeCaptain _captain = new MakeCaptain();
	}
	
	public static MakeCaptain getCaptain(){
		return SingletonHelper._captain;
	}
}
