import java.util.Scanner;

/**@author �scar G�mez Fern�ndez - oscaramelo_22@hotmail.com
 * @version 1.0 - Versi� inicial.
 * @since 1.0 - Versi� inicial.
 */

public class main {
	
	/** 
	 * El meu problema per al DOMjudge consisteix en un simulador de guerra per torns.
	 * <p>
	 * L'usuari primer introduir� les unitats del ex�rcit de la xocolata, despr�s les 
	 * del ex�rcit de la nata, i per �ltim, quin ex�rcit atacar� primer en cada torn.
	 * <p>
	 * L'ex�rcit que abans es quedi sense tropes, perdr�.
	 * <p>
	 * Com es pot veure, el meu programa s'executa en una mateixa classe i m�tode.
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int xocolata, nata, xocoinfanteria, xocoartilleria, xocoaviacio, natainfanteria, nataartilleria, nataaviacio, ordre;
	
		xocoinfanteria = sc.nextInt();
		
		xocoartilleria = sc.nextInt();
		
		xocoaviacio = sc.nextInt();
		
		xocolata = xocoartilleria + xocoartilleria + xocoaviacio;	
		
		System.out.println();
		
		natainfanteria = sc.nextInt();
		
		nataartilleria = sc.nextInt();
		
		nataaviacio = sc.nextInt();
		
		nata = natainfanteria + nataartilleria + nataaviacio;
		
		System.out.println();
		
		ordre = sc.nextInt();
		
		do {
			
			if(ordre == 1) {
				
				natainfanteria = natainfanteria - xocoaviacio;
				nataartilleria = nataartilleria - xocoinfanteria;
				nataaviacio = nataaviacio - xocoartilleria;
				
				xocoinfanteria = xocoinfanteria - nataaviacio;
				xocoartilleria = xocoartilleria - natainfanteria;
				xocoaviacio = xocoaviacio - nataartilleria;
			}
			
			else {				
				xocoinfanteria = xocoinfanteria - nataaviacio;
				xocoartilleria = xocoartilleria - natainfanteria;
				xocoaviacio = xocoaviacio - nataartilleria;
				

				natainfanteria = natainfanteria - xocoaviacio;
				nataartilleria = nataartilleria - xocoinfanteria;
				nataaviacio = nataaviacio - xocoartilleria;				
			}
			
			xocolata = xocoinfanteria + xocoartilleria + xocoaviacio;
			nata = natainfanteria + nataartilleria + nataaviacio;
			
		}while(xocolata > 0 && nata > 0);
		
		
		if(xocolata <= 0 ) {
			System.out.println("\nLa nata guanya!");
		}
		
		else if(nata <= 0) {
			System.out.println("\nLa xocolata guanya!");
		}

	}
}
