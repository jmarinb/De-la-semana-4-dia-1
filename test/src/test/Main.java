package test;

import java.util.Scanner;

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
		
		//Arrays
		String [] meses = {"Jan","feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String [] sem = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		//objetivo: mostrar enero, julio,noviembre, diciembre y marzo en la misma linea
		System.out.println(meses[0]+" "+meses[6]+" "+meses[10]+" "+meses[11]+" "+meses[2]+" "
		+sem[0]+" "+sem[4]+" "+sem[1]);
		
		//
		
		boolean x = true;
		boolean az = false;
		System.out.println("\n\n");
		//System.out.println(x==!az);
		//System.out.println("\n\n");
		
		/* if(x==az)
		{
			System.out.println("chana");
		}
		else
		{
			System.out.println("Juana");
		}
		
		System.out.println("\n\n");
		
		
		String opcion= "chana";
		Scanner lector = new Scanner(System.in);// leeer en teclado lo que escribo hasta que le doy enter
		opcion = lector.nextLine();   */
		
		
	/*	switch(opcion)
		{
			case "chana":
				System.out.println("chana!!");
				break;
			case "Juana":
				System.out.println("chana!!");
				break;
			case "Chona":
				System.out.println("chana!!");
				break;
			default :
				System.out.println("ninguno!!");
				break;		
		}*/
		
		
		/*String cadena5 = "hola";
		
		if(cadena5.equals("hola"))
		{
			System.out.println("son iguales!!!");
					
		}
		else 
		{
			
			System.out.println("no son iguales!!!");
		}*/
		
		
		/*int arr[]={12,23,44,56,78};  
		for(int i:arr)
		{           
			System.out.println(i);   
		}*/
		
		
		int contador = 0;
		while(contador<meses.length)
		{
			System.out.println(contador+1 +" :" +meses[contador]);
			contador++;
		}
		

	}

}
