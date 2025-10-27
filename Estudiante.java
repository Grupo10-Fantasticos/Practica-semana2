import java.util.Scanner;

public class Estudiante {
     private String nombre;
    private int edad;
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getCarrera() { return carrera; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public void mostrarDatos() {
        System.out.println("\n=== Datos del Estudiante ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }
}

public class EstudianteInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Carrera: ");
        String carrera = sc.nextLine();

        Estudiante est = new Estudiante(nombre, edad, carrera);
        est.mostrarDatos();

        sc.close();
    }
}

