
public class ClassExtensionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor x = new Surgeon();
//		Surgeon surgeon = new Surgeon();
//		HeartSurgeon heartsurgeon = new HeartSurgeon();
		
		x.prescribe();
		x.diagnose();
//		x.cut();
		
//		if(doctor instanceof Doctor) {
//			System.out.println("Its doctor object");
//		}
//		else {
//			System.out.println("not doctors object");
//		}
//		
//		System.out.println("--------------");
//		
//		if(doctor instanceof Surgeon) {
//			System.out.println("Its Surgeon object");
//		}
//		else {
//			System.out.println("not Surgeon object");
//		}
//		
//		System.out.println("--------------");
//		
//		if(surgeon instanceof Doctor) {
//			System.out.println("Its Surgeon object");
//		}
//		else {
//			System.out.println("not Surgeon object");
//		}
//		
//		System.out.println("--------------");
//		
//		if(surgeon instanceof HeartSurgeon) {
//			System.out.println("Its heartSurgeon object");
//		}
//		else {
//			System.out.println("not heartSurgeon object");
//		}
//		
//		System.out.println("--------------");
//		
//		if(heartsurgeon instanceof Surgeon) {
//			System.out.println("Its heartSurgeon object");
//		}
//		else {
//			System.out.println("not heartSurgeon object");
//		}
	}

}

class Doctor{
	void diagnose() { //1.exclusive to Doctor
		System.out.println("Doctor: is diagnosing...ENT checkup....");
	}
	void prescribe() {
		System.out.println("Doctor: is prescribing...RGB pills....");
	}
	void charge() {
		System.out.println("Doctor: is charging...300/- ...");
	}
}

class Surgeon extends Doctor{
	void diagnose() {
		System.out.println("Surgeon: is diagnosing...CT Scan/MRI Scan....");

	}
	void prescribe() {
		System.out.println("Surgeon: is prescribing...expensive pills....");
	}
	void charge() {
		System.out.println("Surgeon: is charging...1000/- ...");
	}
	void cut() {
		System.out.println("Surgeon: is cutting......");
	}
	void stitch() {
		System.out.println("Surgeon: is stitching......");
	}
}

class HeartSurgeon extends Surgeon{
	void diagnose() {
		System.out.println("HeartSurgeon: is diagnosing...ECG Report....");

	}
	void prescribe() {
		System.out.println("HeartSurgeon: is prescribing...expensive pills....plus yoga..plus exercises");
	}
	void charge() {
		System.out.println("HeartSurgeon: is charging...3000/- ...");
	}
}
