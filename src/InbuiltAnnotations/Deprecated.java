package InbuiltAnnotations;

public class Deprecated {
    public void m()
    {
        System.out.println("hello m");
    }
    @java.lang.Deprecated
    public void n()
    {
        System.out.println("hello n");
    }
    public static void main(String[] args)
    {
        Deprecated d=new Deprecated();
        d.n();
    }
}
