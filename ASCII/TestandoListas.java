import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;

public class TestandoListas{

	public static void main(String[]args){
	String aula1 = "Aprendendo Python";
	String aula2 = "Curso de Servidores";
	String aula3 = "Iniciando em MVC";
	String aula4 = "Programação Orientada a Objeto";
	
	ArrayList<String> aulas = new ArrayList<>();
	aulas.add(aula1);
	aulas.add(aula2);
	aulas.add(aula3);
	aulas.add(aula4);
	
	System.out.println(aulas);
	System.out.println("--------------------");
		
	/*
	String primeiraAula = aulas.get(0);
	
	System.out.println("A primeira aula é : " + primeiraAula);
	*/
	
	aulas.add("Aumentando nosso conhecimento");
	aulas.add("Estrutura de dados");
	aulas.add("Linguagens de Programação");
	
	Collections.sort(aulas);
	
		for (int i = 0 ; i < aulas.size();i++){
			System.out.println(" Ordenando  ... "+aulas.get(i));
		}
	
	
	}

}
