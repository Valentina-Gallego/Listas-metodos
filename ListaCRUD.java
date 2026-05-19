import java.util.ArrayList;
import java.util.Scanner;

public class ListaCRUD {

    static ArrayList<Integer> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {

            mostrarMenu();

            opcion = sc.nextInt();

            switch(opcion){

                case 1:
                    agregar();
                    break;

                case 2:
                    mostrar();
                    break;

                case 3:
                    buscar();
                    break;

                case 4:
                    modificar();
                    break;

                case 5:
                    eliminar();
                    break;

                case 6:
                    contar();
                    break;

                case 7:
                    sumar();
                    break;

                case 8:
                    mayor();
                    break;

                case 9:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");

            }

        }while(opcion!=9);

    }

    //MENU
    public static void mostrarMenu(){

        System.out.println("\n===== MENU =====");

        System.out.println("1. Agregar");

        System.out.println("2. Mostrar");

        System.out.println("3. Buscar");

        System.out.println("4. Modificar");

        System.out.println("5. Eliminar");

        System.out.println("6. Contar elementos");

        System.out.println("7. Sumar elementos");

        System.out.println("8. Mayor");

        System.out.println("9. Salir");

        System.out.print("Seleccione: ");

    }

    //CREATE
    public static void agregar(){

        System.out.print("Ingrese dato: ");

        int dato = sc.nextInt();

        lista.add(dato);

        System.out.println("Dato agregado.");

    }

    //READ
    public static void mostrar(){

        if(lista.isEmpty()){

            System.out.println("Lista vacía.");

            return;
        }

        System.out.println("Lista:");

        for(int num : lista){

            System.out.println(num);
        }

    }

    //SEARCH
    public static void buscar(){

        System.out.print("Dato a buscar: ");

        int dato = sc.nextInt();

        if(lista.contains(dato)){

            System.out.println("Dato encontrado.");

        }else{

            System.out.println("Dato NO encontrado.");
        }

    }

    //UPDATE
    public static void modificar(){

        System.out.print("Posición a modificar: ");

        int pos = sc.nextInt();

        if(pos>=0 && pos<lista.size()){

            System.out.print("Nuevo valor: ");

            int nuevo = sc.nextInt();

            lista.set(pos,nuevo);

            System.out.println("Dato modificado.");

        }else{

            System.out.println("Posición inválida.");
        }

    }

    //DELETE
    public static void eliminar(){

        System.out.print("Posición a eliminar: ");

        int pos = sc.nextInt();

        if(pos>=0 && pos<lista.size()){

            lista.remove(pos);

            System.out.println("Dato eliminado.");

        }else{

            System.out.println("Posición inválida.");
        }

    }

    //CONTAR
    public static void contar(){

        System.out.println("Cantidad elementos: " + lista.size());

    }

    //SUMAR
    public static void sumar(){

        int suma=0;

        for(int num:lista){

            suma += num;
        }

        System.out.println("Suma = "+suma);

    }

    //MAYOR
    public static void mayor(){

        if(lista.isEmpty()){

            System.out.println("Lista vacía.");

            return;
        }

        int mayor = lista.get(0);

        for(int num:lista){

            if(num>mayor){

                mayor=num;
            }
        }

        System.out.println("Mayor = "+mayor);

    }

}
