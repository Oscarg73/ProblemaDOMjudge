package JUnit;
import java.util.Scanner;

public class testmain {

	static Scanner sc = new Scanner(System.in);
	
	public static void main() {
		
		int xocoinfanteria = 0, xocoartilleria = 0, xocoaviacio = 0, natainfanteria = 0, nataartilleria = 0, nataaviacio = 0, ordre = 0;
		
		joc(xocoinfanteria, xocoartilleria, xocoaviacio, natainfanteria, nataartilleria, nataaviacio, ordre);
		
	}
	
	public static boolean joc(int xocoinfanteria, int xocoartilleria, int xocoaviacio, int natainfanteria, int nataartilleria, int nataaviacio, int ordre) {
		
		boolean victoria = false;
		
		Scanner sc = new Scanner(System.in);
		
		int xocolata, nata;
		
		xocolata = xocoartilleria + xocoartilleria + xocoaviacio;	
		
		nata = natainfanteria + nataartilleria + nataaviacio;
		
		
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
			victoria = true;
		}
		
		return victoria;
	}
}


