package test;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, World"); 
		int a= 15;
		int b= 3;
		int resultado = 0;
		
		resultado = a+b;
		System.out.println("Suma:"+resultado); 
		float d = 3.1415456f;
		float c = 10.34434f;
		float resf = 0.0f;
		
		resf =  d+a;
		
		System.out.println("Suma flotante:"+resf); 
		
		String cadena = "Parangaricutirimicuaro";
		System.out.println("//////////////////////////////////////cadena///////////////");
		String cadenaCesar="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		int espacio =3;
		
		System.out.println(cadena);
		for(int x= 0; x<cadena.length(); x++)
		{
			System.out.println(cadena.charAt(x));
			cadena = cadena.replace(cadena.charAt(x), cadenaCesar.charAt(x+espacio));
		}
		
		
		
		
		

	}

}
