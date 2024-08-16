package controller;

public class Ex6 {
    public Ex6(){
        super();
    }
    public double frecserie(int n){
        //Ponto de parada: Se n for igual a 1, seria 1/1 que resulta em 1.
        if( n == 1 ){
            return 1;
        }else{
            //se não for igual a 1, eu chamo a função recursiva do fatorial no denominador + a função recursiva da série diminindo n.
            return (1/frecfat(n)) + frecserie(n - 1);
        }
    }
    public double frecfat(int n){
        //Ponto de parada: Fatorial de 0 e 1 é igual a 1.
        if( n == 0 || n == 1){
            return 1;
        }else{
            //Aqui chamo a recursiva do fatorial multiplicando n pelo seu antecessor (n-1) até chegar a 1.
            return n * frecfat(n-1 );
        }
    }
}
