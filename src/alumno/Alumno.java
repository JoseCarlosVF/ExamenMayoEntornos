package alumno;

/**
 *
 * @author José carlos Vázquez Fuentesal
 * @version v1.0
 */
public class Alumno {

    /**
     * @return devuelve el nombre de la instancia
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre método que puede cambiar el nombre de la instancia
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return nos muestra la nota media
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     * @param notaMedia variamos la nota media de un alumno
     */
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
  private String nombre;
  private double notaMedia = 0.0;
  
    /**
     *
     * @param nombreAlumno debemos introducir el nombre del alumno
     * @param notaAsignada es la nota que le queremos asignar al alumno
     * @param escala es una parametro de tipo entero qyue hemos introducido anteriormente
     */
    public void AsignarNota(String nombreAlumno, double notaAsignada, int escala) {
        setNombre(nombreAlumno);
        setNotaMedia(notaAsignada);
  }
}
