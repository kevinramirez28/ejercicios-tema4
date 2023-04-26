public class Main {
    public static void main (String[] args) {
        validateNumber();
        whileExample(1);
        doWhileExample(1);
        forExample();
        switchExample("primavera");





    }
// primera pregunta:
    public static void validateNumber() {
        int numerof = 5;
        if (numerof > 0){
            System.out.println("numerof es positivo");
        }  if(numerof < 0){
            System.out.println("numerof es negativo");
        } if (numerof == 0){
            System.out.println("numerof es igual a 0");
        }
    }
    // segunda pregunta:
    public static void whileExample (int numeroWhile ) {
        while (numeroWhile < 3) {
            System.out.println( "el valor de numeroWhile es.." + numeroWhile );
            numeroWhile ++;
        }
    }
    // tercer ejercicio:

    public static void doWhileExample (int numeroWhile) {
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while(numeroWhile < 3);
    }


    public static void forExample() {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
        System.out.println(numeroFor);
        }
    }

    public static void switchExample(String estacion) {
        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "autumn":
                System.out.println("es autumn");

            default:
                System.out.println("esto no es una estacion");


        }


    }
}








    
