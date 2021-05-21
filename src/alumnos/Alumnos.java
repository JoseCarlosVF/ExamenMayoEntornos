package alumnos;
import alumno.Alumno;
import java.util.Scanner;

/**
 *
 * @author José Carlos Vázquez Fuentesal
 * @version v1.0
 * @see alumno.Alumno
 */
public class Alumnos {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    Alumno[] IstAlumnos = new Alumno[5];
    
    

    String nombreIntroducido;
    double notaIntroducida;

        IntroduceNotas(IstAlumnos, entrada);
    
    
  
    double  sumaDeMedias = 0;
  
        MuesntraResultados(IstAlumnos, sumaDeMedias);
  
  }

    private static void MuesntraResultados(Alumno[] IstAlumnos, double sumaDeMedias) {
        System.out.println("Los datos introducidos son los siguientes:");
        
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + IstAlumnos[i].getNombre());
            System.out.println("Nota media: " + IstAlumnos[i].getNotaMedia());
            System.out.println("----------------------------");
            sumaDeMedias += IstAlumnos[i].getNotaMedia();
        }
        System.out.println("La media global de la clase es " + sumaDeMedias / 5);
    }

    private static void IntroduceNotas(Alumno[] IstAlumnos, Scanner entrada) throws NumberFormatException {
        String nombreIntroducido;
        double notaIntroducida;
        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
        for (int i = 0; i < 5; i++) {
            
            IstAlumnos[i] = new Alumno();
            System.out.println("Alumno " + i);
            System.out.print("Nombre: ");
            nombreIntroducido = entrada.nextLine();
            //(IstAlumnos[i]).nombre = nombreIntroducido;
            System.out.print("Nota media: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
            //alum[i].notaMedia = notaIntroducida;
            
            IstAlumnos[i].AsignarNota(nombreIntroducido, notaIntroducida, 10);
            
        }
    }
}

