import java.util.Scanner;

public class AreaDoTriangulo {

	public static void main(String[] args) {
		
		int A,B,C;
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Coloque o valor do tri�ngulo!!!");
		
		System.out.print("Valor do lado 1: ");
		A = leitor.nextInt();
		
		System.out.print("Valor do lado 2: ");
		B = leitor.nextInt();
		
		
		System.out.print("Valor do lado 3: ");
		C = leitor.nextInt();
		
		//Exibir se � um tri�nguloe se sor
	
		if (A+B < C || B+C<A || C+A<B) { System.out.println("Isso n�o � um tri�ngulo ");
		
		} else if(A == B && B == C && C == A) { System.out.println("Esse � um tri�ngulo EQUIL�TERO");
			
		}else if(A != B && B != C && C != A) { System.out.println("Esse � um tri�ngulo ESCALENO");
			
		}else {  
			
			System.out.println("Esse � um tri�ngulo IS�SCLES");
			
			
			
			
			
			
		}

				
				
				
				
				
				
				
				
			}

}


