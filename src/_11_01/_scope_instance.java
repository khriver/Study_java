package _11_01;
class C1{
    int v = 10;

    void m(){
        int v= 20;
        System.out.println(v);
    }
}
class C2{
    int v = 10;

    void m(){
        int v= 20;
        System.out.println(this.v);
    }
}
public class _scope_instance {
    public static void main(String[] args){
        C1 c1 = new C1();
        C2 c2 = new C2();
        c1.m();
        c2.m();
    }
}
