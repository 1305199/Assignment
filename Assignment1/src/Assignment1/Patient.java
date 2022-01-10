package Assignment1;

public class Patient {
	String patient_name;
	double height;
	double width;
	
	double computeBMI(double weight,double height) {
		return weight/(height*height);
	}
public static void main(String[] args) {
	Patient p=new Patient();
System.out.println(p.patient_name="nikita");
	System.out.println("BMI ="+p.computeBMI(72,5));
}
}
