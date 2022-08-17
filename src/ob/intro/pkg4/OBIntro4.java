package ob.intro.pkg4;

public class OBIntro4 {
    
    public static void main(String[] args) {
        cliente Cliente = new cliente();
        trabajador Trabajador = new trabajador();
        
        Cliente.setCredito(100);
        Cliente.setEdad(25);
        Cliente.setNombre("Ramiro");
        Cliente.setTelefono(1144556677);
        
        System.out.println("Cliente");
        System.out.println("Credito: " + Cliente.getCredito());
        System.out.println("Edad: " + Cliente.getEdad());
        System.out.println("Nombre: " + Cliente.getNombre());
        System.out.println("Telefono: " + Cliente.getTelefono());
        System.out.println("<---------------------------------------->");
        
        Trabajador.setNombre("Lucas");
        Trabajador.setEdad(25);
        Trabajador.setSalario(250000);
        Trabajador.setTelefono(1155778899);
        
        System.out.println("Trabajador");
        System.out.println("Nomkbre: " + Trabajador.getNombre());
        System.out.println("Edad: " + Trabajador.getEdad());
        System.out.println("Salario: " + Trabajador.getSalario());
        System.out.println("Telefono: " + Trabajador.getTelefono());
        
        
    }
}

class persona{
    public int edad;
    public String nombre;
    public long telefono;

    public persona() {
    }

    public persona(int edad, String nombre, long telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
}

class cliente extends persona{
    private int credito;

    public cliente() {
    }

    public cliente(int credito) {
        this.credito = credito;
    }

    public cliente(int credito, int edad, String nombre, long telefono) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}

class trabajador extends persona{
    private int salario;

    public trabajador() {
    }

    public trabajador(int salario) {
        this.salario = salario;
    }

    public trabajador(int salario, int edad, String nombre, long telefono) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
}