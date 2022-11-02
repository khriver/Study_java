package _11_02;

abstract class Calculator{
    int l,r;
    public Calculator(int l , int r){
        this.l = l;
        this.r = r;
    }
    public abstract int sum();
    public abstract void avg();
    public void run(){
        System.out.println(sum());
        avg();
    }
}
class C1 extends Calculator{
    public C1(int a, int b){
        super(a,b);
    }
    public int sum(){
        return this.l+this.r;
    }
    public void avg(){
        System.out.println((this.l+this.r)/2);
    }
}
public class _abstract {
    public static void main(String[] args){
        C1 c1 = new C1(3,4);
        c1.run();
    }

}
