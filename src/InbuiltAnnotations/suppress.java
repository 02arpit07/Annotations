package InbuiltAnnotations;

import java.util.ArrayList;

public class suppress {
    @SuppressWarnings("unchecked")
    public  static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add("arpit");
        al.add("alisha");
        for(Object obj:al)
            System.out.println(obj);
    }
}
