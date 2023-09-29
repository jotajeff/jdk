import java.util.Scanner;


public class Teclado{

	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	int n1=0, n2=0, n3 = 0 , soma = 0;
	final int MEDIA = 60;
	String aluno="", res = "";
	
	System.out.println("Digite nome aluno ");
	aluno = scan.nextLine();
	
	System.out.println("Digite primeira nota ");
	n1 = scan.nextInt();
	
	System.out.println("Digite segunda nota ");
	n2 = scan.nextInt();
	
	System.out.println("Digite terceira nota ");
	n3 = scan.nextInt();
	
	soma = n1+n2+n3;
	
		
	if(soma >= MEDIA){
		res= "Aprovado";
	} else if (soma >= 40) {
		res = "Recuperação";
	} else {
		res = "reprovado";
	}
		
	System.out.printf("Aluno %s : situação %s ",aluno,res);
	
	}
}
