public class pratica7 {
    public void processar(){
        try
        {
            System.out.println("Criando um erro para cair no catch");
            throw new Exception();


        }catch(Exception e)
        {
            System.out.println("Erro capturado");
        }
    }
    public static void main(String[] args) {

        pratica7 obj = new pratica7();
        obj.processar();
      
    
    }
}