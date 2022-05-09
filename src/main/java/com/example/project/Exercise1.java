package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {
		String text= "" + a;
		int digito, num= 0,k;
		boolean hayDos= false;
		for (int i=0; i< text.length(); i++){
		    digito= Integer.parseInt(text.substring(i, i+1));
		    k= text.length() -1 - i;
		    num+= digito*(Math.pow(2, k+1)-1);

		    //Verificador de los digitos
		    if (digito> 2 || (hayDos== true && digito> 0))
			return "El numero proporcionado no esta en base Gabriel.";

		    //Verifica que el dos solo este en el digito menos significativo
		    if(digito==2)
			hayDos=true;
		}
			return num + "";
	}
}
