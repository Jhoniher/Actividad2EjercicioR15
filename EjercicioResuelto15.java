import java.util.Scanner;
public class EjercicioResuelto15 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double pesoA, pesoB, pesoC, pesoD;
        System.out.println("Ingrese peso de la esfera A: ");
        pesoA=entrada.nextDouble();
        System.out.println("Ingrese peso de la esfera B: ");
        pesoB=entrada.nextDouble();
        System.out.println("Ingrese peso de la esfera C: ");
        pesoC=entrada.nextDouble();
        System.out.println("Ingrese peso de la esfera D: ");
        pesoD=entrada.nextDouble();
        if (pesoA==pesoB && pesoA==pesoC) {
            if (pesoD>pesoA) {
                System.out.println("La esfera D es la diferente y tiene un mayor peso que las demás");
            } else{
                System.out.println("La esfera D es la diferente y tiene un menor peso que las demás");
            }
        } else if(pesoA==pesoB && pesoA==pesoD) {
            if(pesoC>pesoA) {
                System.out.println("La esfera C es la diferente y tiene un mayor peso que las demás");
            } else{
                System.out.println("La esfera C es la diferente y tiene un menor peso que las demás");
            }
        } else if(pesoA==pesoC && pesoA==pesoD) {
            if (pesoB>pesoA) {
                System.out.println("La esfera B es la diferente y tiene un mayor peso que las demás");
            } else{
                System.out.println("La esfera B es la diferente y tiene un menor peso que las demás");
            }
        } else if (pesoB==pesoC && pesoB==pesoD) {
            if(pesoA>pesoB) {
                System.out.println("La esfera A es la diferente y tiene un mayor peso que las demás");
            } else{
                System.out.println("La esfera A es la diferente y tiene un menor peso que las demás");
            }
        }

    }
}

