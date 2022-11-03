package _11_02;

class Calculator_ {
    static final double PI = 3.14;
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class _final {

    public static void main(String[] args) {

        Calculator_ c1 = new Calculator_();
        System.out.println(c1.PI);
        //Calculator.PI = 10;


    }

}