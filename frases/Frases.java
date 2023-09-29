public class Frases{

	public static void main(String[]args){
	
	// listas
	String[] wordListOne = {"unicornio", "cavalo" ,"gavião" ,"lontra","hipopotamo", "alazão","tigre","dinossauro", "manute", "girafa", "macaco", "minhoca" , "baleia" , "touro"};
	
	String[] wordListTwo = {"azul", "florescente", "rosa" ,"verde","vesgo","perneta","híbrido","turquesa", "dourado", " dorminhoco"};
	
	String[] wordListTree = {"legalzinho", "confuso","desorientado","camarada" , "esquisito", "embriagado","ranzinza", "brincalhão","pirado", "acanhado", "feliz"};
	
	// tamanha das listas
	int oneLength = wordListOne.length;
	
	int twoLength = wordListTwo.length;
	
	int treeLength = wordListTree.length;
	
	// número aleatório para cada lista
	
	int rand1 = (int)(Math.random() * oneLength);
	
	int rand2 = (int)(Math.random() * twoLength);
	
	int rand3 = (int)(Math.random() * treeLength);
	
	// construir a frase 
	
	String Phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + "  " + wordListTree[rand3];
	
	System.out.println(" frase do dia : " + Phrase);
	
	System.out.println(" primeira lista tem : " + oneLength + " itens");
	System.out.println(" segunda lista tem : " + twoLength + " itens");
	System.out.println(" terceira lista tem : " + treeLength + " itens");
	
	}
}
