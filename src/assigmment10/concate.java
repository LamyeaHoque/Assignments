package assigmment10;

public class concate {

	public static void main(String[] args) {
		String name="Lamyea Hoque.";
		
		String sentance= "My name is ";
		System.out.println("String 1: " + name);
        
		System.out.println("String 2: " + sentance);

		String marge= sentance.concat(name);
		
		System.out.println(" The concatenated sting: " + marge);
	}

}
