public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        System.out.println("Nuevo Cliente");
        cliente.setEdad(25);
        cliente.setNombre("Rafael");
        cliente.setTelefono(1124563789);
        cliente.setCredito(10000);

        System.out.println("Edad:" + " " + cliente.getEdad());
        System.out.println("Nombre:" + " " + cliente.getNombre());
        System.out.println("Telefono:" + " " + cliente.getTelefono());
        System.out.println("Credito:" + " " + "$" + cliente.getCredito());

        System.out.println("Nuevo Trabajador");


        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(22);
        trabajador.setNombre("Antonio");
        trabajador.setTelefono(1156784909);
        trabajador.setSalario(80000);

        System.out.println("Edad:" + " " + trabajador.getEdad());
        System.out.println("Nombre:" + " " + trabajador.getNombre());
        System.out.println("Telefono:" + " " + trabajador.getTelefono());
        System.out.println("Salario:" + " " + "$" + trabajador.getSalario());





    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}