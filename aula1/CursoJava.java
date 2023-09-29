public class CursoJava{

public static void main(String[] args ){
	System.out.println("Primeira soma  : "+soma(5,10));
	System.out.println("Somando mais  : "+soma2(1,6,9,66,5,10));
	
}

public static int soma(int n1, int n2){

	int res = n1+n2;
	return res;

}

public static int soma2(int... numeros){
	int res=0;
	for(int n:numeros){
		res+=n;
	}
	return res;
}

}
