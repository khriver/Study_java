package _11_03;
class A{
    public void func1(){
        System.out.println("func1 = classA");
    }
}
class B extends A{
    public void func1(){
        System.out.println("func1 = classB");
    }
    public void func2(){
        System.out.println("func2 = classB");
    }
}
public class _polymorphism_class {
    public static void main(String[] args){
        A c1 = new A();
        A c2 = new B(); //B의 기능을 A가 구현하는 기능으로 제한하겠다
        B c3 = new B();
        c1.func1();
        c2.func1();
        c3.func1();
        c3.func2();
    }



}
