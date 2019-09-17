class EstructurasDeControl{
	public static void main(String[] args){
		/*for(int i = 0; i < args.length; i++){
			System.out.println("Arg "+ i);
			System.out.println("Arg "+ args[i]);
			
		}*/
		int i = 0;
		while(i < args.length){
			System.out.println("Arg "+ i);
			System.out.println("Arg "+ args[i]);
			i++;
		}
		
		/*Bucle infinito
		i = 0;
		for( ; ; ){
			System.out.println("Arg "+ args[i]);
			i++;
		}
		*/
		do{
			System.out.println("Siempre se muestra la primera vez");
		} 
		while(false);
		
		boolean siEjecutar = (5<3) && (20 == 20);
		
		if(siEjecutar)
			System.out.println("Es cierto");
		else
			System.out.println("Es falso");
		
		int valor = 1;
		switch (valor){
			case 0: 
				System.out.println("valor 0");
				break;
			case 1: 
				System.out.println("valor 1");
				break;
			case 2: 
				System.out.println("valor 2");
				break;
			default: 
				System.out.println("valor por defecto");
				break;
		}
		
		
	}
	
}