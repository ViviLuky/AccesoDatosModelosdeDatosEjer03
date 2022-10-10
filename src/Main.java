import modelo.Alumno;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Alumno>alumnos;
    private static Scanner scanner= new Scanner(System.in);
    private static java.util.ArrayList<Alumno> ArrayList;

    public static void main(String[] args) throws TransformerConfigurationException, ParserConfigurationException {


        ArrayList<Alumno>alumnoslist =new ArrayList<>();
        Scanner scanner= new Scanner(System.in);

        ProcessBuilder processBuilder=new ProcessBuilder();
        int eleccion=0;

        do{
            eleccion=menu(scanner);
            switch (eleccion){
                case 1: crearAlumno(alumnoslist,scanner);
                    break;
                case 2:guardarAlumno(alumnoslist,scanner);;
                    break;
                case 3: cargarAlumno();
                    break;
                case 4:
                    System.out.println("adios");
                    break;
                default:
                    System.out.println();
            }
        }while (eleccion!=4);
        System.out.println("Error Elige una Opcion");


    }

    private static void cargarAlumno() {
    }





    private static void guardarAlumno(Scanner alumnoslist, Scanner scanner) throws ParserConfigurationException {
        System.out.println("DIME EL NOMBRE DEL FICHERO");
        String nombrefichero= scanner.nextLine();

        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
        DocumentBuilder db=dbf.newDocumentBuilder();
        Document doc = db.newDocument();

        Element raiz =doc.createElement("alumnos");
        doc.appendChild(raiz);
         for(Alumno KK: alumnoslist){
             Element alumno= doc.createElement("alumno");
             Attr attr=doc.createAttribute()
         }
    }








    private static void crearAlumno(java.util.ArrayList<Alumno> scanner, Scanner alumnos) {

    }


    private static int menu(Scanner scanner) {
        int eleccion=0;


do{
        System.out.println("1-Introducir Alumno");

        System.out.println("2-guardar Alumno ");

        System.out.println("3-cargar Alumno");

        System.out.println("4-salir");
        eleccion=scanner.nextInt();
        scanner.nextLine();

    }while (eleccion<1||eleccion>4);
        return eleccion;
    }}


