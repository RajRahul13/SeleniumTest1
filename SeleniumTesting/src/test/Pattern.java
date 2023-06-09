package test;

public class Pattern {
	public static void main(String[] args) {
//		patternstar();
//		starpattern2();
//		starpatternwithalphabet();
//		starpatternwithalphabet2();
		revtrianglepattern();
	}
	public static void patternstar() {
		/* Logic
		 1st pattern  2nd pattern  3rd pattern	4th Pattern	 5th pattern	6th pattern  
			 * 		  	*******		*				^^^^^^		^^^^^^*		^^^^^^*       replace ^ with "" and @ with *
			 * 			******* 	**				^^^^^		^^^^^**		^^^^^**@ 
			 *			******* 	***				^^^^		^^^^***		^^^^***@@
			 * 			*******		****			^^^			^^^****		^^^****@@@
			 * 			*******		*****		    ^^			^^*****		^^*****@@@@
			 * 			*******		******		    ^			^******		^******@@@@@
		 */
		for(int i=3;i>=0;i--) {
				
			for(int j=i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=i;k<4;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void starpattern2() {
		for (int i=0;i<=5;i++) {
			
			for(int j=i;j<=5;j++){
				System.out.print(" ");
				//System.out.print("!");
			}
			for(int j=i;j>=0;j--){
				//System.out.print("^");
				System.out.print("*");
			}
			for(int j=i-1;j>=0;j--){
				//System.out.print("^");
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void starpatternwithalphabet() {
		int alphabet=65; //ascii value of a
		int k=0;
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=0;j--) {
				System.out.print((char)(alphabet+k)+" ");
				k++;
			}
		System.out.println();	
		}
			
	}
	public static void starpatternwithalphabet2() {
		for (int i = 0; i <= 8; i++){  
			int alphabet = 65;   
//			for (int j = 8; j > i; j--){  
//			System.out.print(" ");  
//			}  
			for(int j=i;j<8;j++) {
			System.out.print(" ");
			}
			for (int k = 0; k <= i; k++){  
			System.out.print((char) (alphabet + k) + " ");  
			}  
		System.out.println();  
		}
	
	}
	public static void revtrianglepattern() {
		for(int i=0;i<6;i++) {
			for(int k=i-1;k>=0;k--) {
				System.out.print(" ");
			}
			for(int j=i;j<6;j++) {
				System.out.print("* ");
			}
		System.out.println();	
		}
	} 	
}	