package _11_01;
class Cal_v3 {
    int left, right;
    public Cal_v3(int left, int right){
        this.left = left;
        this.right =right;
    }

    public int sum() {
        System.out.println(this.left + this.right);
        return (this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
class ext_cal_v1 extends Cal_v3{
    public ext_cal_v1(int left, int right){
        super(left,right);
    }
    public int sum(){ //overriding -> 부모의 메소드를 변경함
        return this.left * this.right;
    }

}


public class _overriding {
    public static void main(String[] args){
        Cal_v3 c1 = new Cal_v3(20,10);
        ext_cal_v1 c2 = new ext_cal_v1(20,10);
        System.out.println(c1.sum());
        System.out.println(c2.sum());

    }
}
