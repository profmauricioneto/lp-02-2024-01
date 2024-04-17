package classelements;

public class Usuario {
    private final int id;
    private static int idInstance = 0;

    public Usuario() {
        this.id = increment();
    }

    private static int increment() {
        return idInstance++;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Usuario raphael = new Usuario();
        System.out.println(raphael.getId());
        Usuario mauricio = new Usuario();
        System.out.println(mauricio.getId());
        Usuario filipe = new Usuario();
        System.out.println(filipe.getId());
        Usuario davi = new Usuario();
        System.out.println(davi.getId());
    }
}
