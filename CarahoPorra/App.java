public class App {
    static Lista listaa = new Lista();
    public static void main(String[] args) {

        
        try {
            Cliente elemento = new Cliente(10, "Laura", "564356456");
            listaa.addInicio(elemento);
            elemento = new Cliente(1, "Laura", "564356456");
            listaa.addFim(elemento);
            elemento = new Cliente(0, "Laura", "564356456");
            listaa.addInicio(elemento);
            elemento = new Cliente(5, "Laura", "564356456");
            listaa.addFim(elemento);
            elemento = new Cliente(90, "Laura", "564356456");
            listaa.addInicio(elemento);

            listaa.print();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}