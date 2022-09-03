public class variable {

    static int a = 10;// static variable
    int b = 20;// instance variable

    public static void main(String[] args) {
        int c = 30;//local variable
        variable reference = new variable();
        System.out.println(variable.a);
        System.out.println(reference.b);
        System.out.println(c);
    }
}
