public class Demo {
   
    void show() {
        System.out.println("No argument method");
    }
    void show(int a) {
        System.out.println("Number = " + a);
    }
}

class Child extends Demo {
    void show() {
        System.out.println("Overridden method in Child class");
    }
}

class Main
{
    public static void main(String args[])
    {
        Child obj = new Child();
        obj.show();
        obj.show(10);
    }
} 
