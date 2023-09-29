public class My_Calculation extends Calculation {

   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("A multiplicação entre os valores é :"+z);
   }
	
   public static void main(String args[]) {
      int a = 100, b = 60;

      My_Calculation demo = new My_Calculation();
      
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
   }
}
