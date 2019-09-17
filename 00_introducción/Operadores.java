class Operadores{
	public static void main(String[] args){
		
		System.out.println( 5 != 5 ? "Pues si" : "Pues no");
		
		/*if(args[0].equals("aa"))
			System.out.println("Quieres dos AA");
		else
			System.out.println("Quieres otra cosa");*/

		System.out.println(args[0].equals("aa") ? "Quieres dos AA" : "Quieres otra cosa");
		
		boolean resultado = (34 / 43) > 1 ? "--" 
											: (i==j) ? "i = j" 
													: "i != j";
		
	}
}