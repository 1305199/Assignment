package Assignment1;



 class Constructor {
	double salary=10000;
	
	 Constructor (double  bonus) {
		System.out.println(salary+bonus);
	}
 }
 class ConstructorMain{
	

	public static void main(String[] args) {
		Constructor c1=new Constructor(2000);
		Constructor c2=new Constructor(3000);
	}
 }

