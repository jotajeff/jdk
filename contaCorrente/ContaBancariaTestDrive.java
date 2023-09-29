public class ContaBancariaTestDrive{
	
	public static void main(String[]args){
	ContaBancaria c1 = new ContaBancaria(1950,742.59);
	
	c1.depositar(1200);      
	c1.sacar(200.70);
        System.out.println("Salto atual   : "+ c1.getSaldo());
	
	}

}
