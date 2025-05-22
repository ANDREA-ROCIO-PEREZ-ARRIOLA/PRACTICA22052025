public class Operacion {

public int Sumar(int a, int b) {
if(a<0 || b<0){
    System.out.println("ERROR: No se puede sumar numeros negativos");
    return -1;
}
    return a + b;
}

public double Sumar(double a, double b) {
    return a + b;
}

public int Sumar(int a, int b, int c) {
    return a + b + c;
}

public long Sumar(long a, int b) {
    return a + b;
}

public void sumar(){
    System.out.println("No se puede sumar sin argumentos");
}


}