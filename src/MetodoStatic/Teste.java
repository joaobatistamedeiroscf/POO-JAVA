public class Teste {
    public static void main(String[] args) {
        float[] numeros = {10.5f, 20.3f, 30.2f, 40.1f, 50.0f};
        int A = 10 , B = 30 ; 

        System.out.println("Média: " + Util.calculaMedia(numeros));
        System.out.println("Soma: " + Util.soma(numeros));
        System.out.println("Maior Elemento: " + Util.maior(numeros));
        System.out.println("Menor Elemento: " + Util.menor(numeros));
        System.out.println("Maior  entre: "+ A + " e " + B +" é "+ Util.max(A , B));

    }
    
}
