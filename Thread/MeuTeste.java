public class MeuTeste {
    public static void main(String args[]){

        try {
            MinhaThread t1,t2,t3;

            t1 = new MinhaThread(1, 10, 500);
            t2 = new MinhaThread(2,10,800);
            t3 = new MinhaThread(3, 10, 1000);

            t1.start();
            t2.start();
            t3.start();

            t1.join();
            t2.join();
            t3.join();

            System.out.println(".... Execução concluída.");
        }
        catch(Exception ex){
            System.out.println(" -Houston, we have a problem");
        }

    }
    
}
        
