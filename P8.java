import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LecturaNumeros extends BufferedReader {

    public LecturaNumeros() {
        super(new InputStreamReader(System.in));
    }

    public LecturaNumeros(Reader r) {
        super(r);
    }

    public int readlnt() throws IOException {
        String line = this.readLine();
        return Integer.parseInt(line);
    }

    public int readlnt(String mensaje) throws IOException {
        System.out.println(mensaje);
        return this.readlnt();
    }

    public Integer readInteger() throws IOException {
        return this.readlnt();
    }

    public double readDouble() throws IOException {
        String line = this.readLine();
        return Double.parseDouble(line);
    }

    public double readDouble(String mensaje) throws IOException {
        System.out.println(mensaje);
        return this.readDouble();
    }

    public static void main(String[] args) {
        LecturaNumeros lectura = new LecturaNumeros();

        try {
            System.out.println("Ingresa 2 números enteros:");
            int entero1 = lectura.readlnt();
            int entero2 = lectura.readlnt();
            System.out.println("Ingresa un número entero como objeto Integer:");
            Integer enteroObj = lectura.readInteger();
            System.out.println("Ingresa un número decimal:");
            double decimal1 = lectura.readDouble();
            System.out.println("Ingresa un número decimal como objeto Double:");
            Double decimalObj = lectura.readDouble();
            
            System.out.println("Números ingresados:");
            System.out.println("Entero 1: " + entero1);
            System.out.println("Entero 2: " + entero2);
            System.out.println("Entero como Integer: " + enteroObj);
            System.out.println("Decimal 1: " + decimal1);
            System.out.println("Decimal como Double: " + decimalObj);
        } catch (IOException e) {
            System.out.println("Error al leer la entrada.");
        }
    }
}
