

public class Util {

    public static float calculaMedia(float[] vet){
        float soma = 0;
        for(int i = 0 ; i < vet.length ; i++ ){
            soma += vet[i] ; 
        }
        return soma / vet.length;
    }
    
    public static float soma(float[] vet){
        float soma = 0 ; 
        for(int i = 0 ; i < vet.length ; i++){
            soma += vet[i];
        }
        return soma ;
    }

    public static float maior(float vet[]){
        float  maior = 0 ; 
        for(int i = 0 ;i < vet.length ; i++){
            if(vet[i] > maior){
                maior = vet[i]; 
            }
        }
        return maior ; 
    }
    
    public static float menor(float vet[]){
        float  menor  = 999 ; 
        for(int i = 0 ;i < vet.length ; i++){
            if(vet[i] < menor){
                menor = vet[i]; 
            }
        }
        return menor ; 
    }

    public static int max(int A , int B){
        if(A > B){
            return A;
        }else {
            return B ; 
        }
    }




}