package _11_03;

interface Calculatable{
    public void setOprands(int first, int second, int third);
    public int sum();
    public int avg();
}
class CalculatorDummy implements Calculatable{
    int first, second, third;
    public void setOprands(int _1, int _2, int _3){
        this.first = _1;
        this.second = _2;
        this.third = _3;
    }
    public int sum(){
        return this.first + this.second + this.third;
    }
    public int avg(){
        return (this.first + this.second + this.third)/3;
    }
}
public class _interface {
    public static void main(String[] args){
        CalculatorDummy c1 = new CalculatorDummy();
        c1.setOprands(1,2,3);
        System.out.println(c1.sum());
    }
}
