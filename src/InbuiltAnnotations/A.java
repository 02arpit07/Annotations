package InbuiltAnnotations;

public class A {
       public static void main(String[] args)
       {
           Alisha obj=new Alisha();
           obj.showMyData();
       }
}
class Arpit {
    public void showMyData()
    {
        System.out.println("In Arpit");
    }
}

class Alisha extends Arpit{
    @Override
    public void showMyData()
    {
        System.out.println("In Alisha");
    }
}
