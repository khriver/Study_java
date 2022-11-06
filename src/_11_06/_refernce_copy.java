package _11_06;
class A{
    public int id;
    A(int id){
        this.id = id;
    }
}

public class _refernce_copy {
    static void _value(int b){
        b= 2;
    }

    public static void runValue(){
        int a= 1;
        _value(a);
        System.out.println("runValue, " +a);
    }

    static void _Refer1(A b){
        b = new A(2);
    }
    static void _Refer2(A b){
        b.id=2;
    }
    public static void runRefer(){
        A c = new A(1);
        _Refer1(c);
        System.out.println("runRefer1, " + c.id);

        A d = new A(1);
        _Refer2(d);
        System.out.println("runRefer2, " + d.id);
    }
    public static void main(String[] args){
        runValue();
        runRefer();
    }
}
