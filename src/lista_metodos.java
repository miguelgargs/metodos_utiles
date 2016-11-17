

 class Métodos {

	public static void termapitagorica(long num) {
		long a, b, c;
		boolean Hayterma = false;
		for (c = 1; c <= num; c++) {
			for (b = 1; b < c; b++) {
				for (a = 1; a < b; a++) {
					if (a * a + b * b == c * c && a + b + c == num) {
						System.out
								.println("La combinación: A=" + a + " B=" + b + " C=" + c + " es una terma pitagorica");
						Hayterma = true;
					}
				}
			}
		}
		if (!Hayterma) {
			System.out.println("No hay ninguna terma pitagórica tal que A+B+C=" + num);
		}
	}

	public static boolean booleannumeroprimo(long num) {
		if(num==2){
			return true;
		}
		for (int i = 2; i <= (Math.sqrt(num) + 1); i++) {

			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static long inviertenum(long num) {
		long numeroinvertido = 0;
		while (num > 0) {
			numeroinvertido = numeroinvertido * 10 + num % 10;
			num = num / 10;

		}
		return numeroinvertido;
	}

	public static long palindromos(long cifra) {
		long numerodepalindromosprimos = 0;
		long invertido;
		for (long i = (long) (1 * Math.pow(10, cifra - 1)); i < (1 * Math.pow(10, cifra)); i++) {
			invertido = inviertenum(i);
			if (i == invertido && booleannumeroprimo(i)) {
				numerodepalindromosprimos++; // Quitar el if si solo quieres
												// contar palindromos.
			}

		}
		return numerodepalindromosprimos;
	}

	public static long MaximoComunDivisor(long n1, long n2) {
		long temp;
		if (n2 > n1) { // Para que el algoritmo funcione n1>n2
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		while (n1 % n2 != 0) {
			temp = n1 % n2;
			n1 = n2;
			n2 = temp;

		}
		return n2;
	}

	public static long MinimoComunMultiplo(long n1, long n2) {
		long mcm = 0;
		mcm = (n1 * n2) / MaximoComunDivisor(n1, n2);

		return mcm;
	}

	public static boolean DivisibleEntreNum(long n1, long num){
		 if(n1%num==0){
			  return true; 
			 }else{
			  return false;  }

	 }
	public static char Mayusculas(char letra){
		char mayuscula=letra;
		 if(letra>='a' && letra<='z'){
			 mayuscula=(char) ((letra-'a')+'A');
		 }
		
		return mayuscula;
	}
	public static String StringAMayusculas(String frase){
		String FraseEnMayusculas="";
		for (int i=0;i<frase.length();i++){
			FraseEnMayusculas+=Mayusculas(frase.charAt(i));
		}
		return FraseEnMayusculas;
	}
}
