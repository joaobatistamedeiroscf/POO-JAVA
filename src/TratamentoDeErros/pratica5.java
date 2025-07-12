public class pratica5 {
    public void verificaIdade(int idade){
        try{
            if(idade < 0 || idade > 130){
                throw new IllegalArgumentException("Idade inválida");
            }
            if(idade > 18){
                System.out.println("Maior de idade");
            }else {
                System.out.println("Menor de idade");
            }
        }catch(IllegalArgumentException e ){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {

        pratica5 obj = new pratica5();
        obj.verificaIdade(20);
        obj.verificaIdade(1000);

    }
}
