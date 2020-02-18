
public class Animal {
	
	
	public void alpha() {
		
		System.out.println("Animal Sound");
	}
	
	

	public static void main(String[] args) {
		/* Upcasting
		  Animal a = new Dog(); 
		  a.sound();
		 */
		
		Animal a = new Dog();
		
		Dog d = (Dog)a;
		
		d.alpha();
		d.beta();
		
		

	}
	
	

}
