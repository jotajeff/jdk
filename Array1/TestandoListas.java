import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;

public class TestandoListas{

	public static void main(String[]args){
	String aula1 = "aprendendo Python";
	String aula2 = "curso de Servidores";
	String aula3 = "iniciando em MVC";
	String aula4 = "Programação Orientada a Objeto";
	
	ArrayList<String> aulas = new ArrayList<>();
	aulas.add(aula1);
	aulas.add(aula2);
	aulas.add(aula3);
	aulas.add(aula4);
	
	System.out.println(aulas);
	System.out.println("--------------------");
	

	aulas.remove(0);
	System.out.println(aulas);
	System.out.println("--------------------");

	
	for (String aula : aulas ){
	System.out.println("aula : "+ aula);
	}
	System.out.println("--------------------");
	
	String primeiraAula = aulas.get(0);
	
	System.out.println("A primeira aula é : " + primeiraAula);
	
	System.out.println("--------------------");
	
	for (int i = 0 ; i < aulas.size();i++){
		System.out.println(" listando ..."+aulas.get(i));
	}
	
	aulas.forEach(aula ->{
		System.out.println("------------------");
		System.out.println("Aula : " + aula);
	});
	
	aulas.add("Aumentando nosso conhecimento");
	
	Collections.sort(aulas);
	System.out.println(aulas);
	
	/*for (int i = 0 ; i < aulas.size();i++){
		System.out.println(" ordenando  ..."+aulas.get(i));
	}*/
	
	
	}

}
