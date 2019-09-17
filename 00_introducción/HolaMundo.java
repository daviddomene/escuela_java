class HolaMundo{
	public static void main(String[] args){
		System.out.println("Hola mundo");
		
		String nombre = "David";
		
		System.out.println("Hola " + nombre + "!");
		
		byte unByte = 127;
		System.out.println("Byte: " + unByte);
		// comentario una linea
		
		int numero = 123456789;
		System.out.println("Int: " + numero);
		
		
		float decimalFloat = 1.2345678901f;
		System.out.println("float: " + decimalFloat);
		
		double decimalDouble = 1.12345678901234563;
		System.out.println("double: " + decimalDouble);
		
		long entLargo = 1234567890123456789L;
		System.out.println("entLargo: " + entLargo);
		
		char caracter = 65; //'z'
		
		System.out.println("caracter: " + caracter);
		
		
			char [] texto = {'a', 'b', 'c'};
		
		System.out.println("caracter: " + texto[1]);
		
		
		for(int i=0; i < texto.length; i++){
			System.out.println("caracter: " + texto[i]);
			
		}
		
		
		
		

	}
} 