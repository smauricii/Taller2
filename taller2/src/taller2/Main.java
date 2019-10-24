package taller2;

public class Main {

	private static String a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("STAND ALONE\t \n");
		interfazStandAlone b= new interfazStandAlone (" ");
		
		b.Boton();
		b.Dialogos();
		
		System.out.println(interfazStandAlone.a);
		
		
		System.out.println("WEB\t \n");
		InterfazWeb d= new InterfazWeb (" ");
		
		d.Boton();
		d.Dialogos();
		
		System.out.println(InterfazWeb.a);

	}

	public static String getA() {
		return a;
	}

	public static void setA(String a) {
		Main.a = a;
	}


}
