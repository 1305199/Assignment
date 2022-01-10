package Assignment1;

public class ClassBox {
	ClassBox(int height,int width,int depth){
		System.out.println(height*width*depth);
	}
	public static void main(String[] args) {
		ClassBox cb1=new ClassBox(10,20,30);
		ClassBox cb2=new ClassBox(10,20,30);
	}
	
}
