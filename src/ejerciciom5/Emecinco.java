package ejerciciom5;

public class Emecinco {
	static long factos[] = new long[25];

	static long factorial(int z) {
		long fac = 1;
		for (int i = 1; i <= z; i++)
			fac = fac * i;
		return fac;
	}
	
	static void imprimir(long x[], String nombre) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(nombre + "\t[" + (+i + 1) + "]=" + x[i] + "\t");
			// if(i%5==0)System.out.println("\t");
			System.out.println("");
		}
	}
	//esto es otro cambio para ver si da error
	static long[] rellenarfactorial(long x[]) {
		for (int i = 1; i < x.length + 1; i++)
			x[i - 1] = factorial(i);
		return x;
	}
	//esto es otro cambio para ver si da error
	public static void main(String[] datos) {
		rellenarfactorial(factos);
		imprimir(factos, "factos");
	}
}
