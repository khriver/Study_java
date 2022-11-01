package _11_01;


class Calculator{
    int left, right;
    int third = 0;

    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right, int third){
        System.out.println("setOprands(int left, int right, int third)");
        this.left = left;
        this.right = right;
        this.third = third;
    }

    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }

}
class Calculator_v2{
    int[] oprands;

    public Calculator_v2(int[] oprands){
        this.oprands = oprands;
    }

    public void sum(){
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total);
    }
}
public class _overloading {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        Calculator_v2 c2 = new Calculator_v2(new int[]{10,20,30});
        c1.setOprands(10, 20);
        c1.sum();
        c1.setOprands(10, 20, 30);
        c1.sum();
        c2.sum();

    }

}