import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MZFecha fecha1 = new MZFecha();
        MZFecha fecha2 = new MZFecha();

        System.out.println("Introduzca el dia");
        fecha1.setDia(sc.nextInt());
        System.out.println("Introduzca el mes");
        fecha1.setMes(sc.nextInt());
        System.out.println("Introduzca el anyo");
        fecha1.setAnyo(sc.nextInt());

        fecha1.imprime();

        System.out.println("Introduzca el dia");
        fecha2.setDia(sc.nextInt());
        System.out.println("Introduzca el mes");
        fecha2.setMes(sc.nextInt());
        System.out.println("Introduzca el anyo");
        fecha2.setAnyo(sc.nextInt());

        System.out.println("La diferencia de dies entre la primera fecha y la segona es " + fecha1.diferenciaDias(fecha2));
    }
}
