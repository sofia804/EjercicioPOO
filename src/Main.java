public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Genérico", 5);
        animal1.hacerSonido();

        Perro perro1 = new Perro("Max", 3, "Labrador");
        perro1.hacerSonido();
        System.out.println("Nombre: " + perro1.getNombre() + ", Edad: " + perro1.getEdad() + ", Raza: " + perro1.getRaza());
    }
}