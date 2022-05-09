package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {
		
		Integer nsaltos= 0, pos= 0, dist;
		for(int i= 0; i< a.length; i++){
		    dist= a[i] - a[pos];

		    //Verifica si la distancia es mayor a 50
		    if(dist> 50 ) {
			if(i== pos+1) //En caso el siguiente esta a mas de 50
			    return - 1;
			//Coloca la nueva posicion y aumenta el numero de saltos
			pos= i-1;
			i--;
			nsaltos++;
		    }            
		}
		//Aumento el salto final
		return nsaltos + 1;
	}
}
