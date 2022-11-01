package _11_01;
class Calculatator{
    int l, r;

    public void setParam(int l, int r){
        this.l = l;
        this.r = r;
    }
    public int sum(){
        return this.l+this.r;
    }
    public int avg(){
        return sum()/2;
    }
}
public class _object {
    public static void main(String[] args){
        Calculatator c1 = new Calculatator();
        c1.setParam(10,20);
        System.out.println(c1.sum());
        System.out.println(c1.avg());
    }
}
