package _11_01;
class Cal_v2{
    int l, r;

    public Cal_v2(int left, int right){ // 생성자(constructor)!! class명 과같음
        this.l = left;
        this.r = right;
    }

    public int sum(){
        return this.l+this.r;
    }
    public int avg(){
        return sum()/2;
    }
}
class Sub_cal extends Cal_v2{ // 상속
    public Sub_cal(int l, int r){
        super(l,r); //매개변수 설정 즉 Sub_cal의 상위 클래스인 Cal_v2의 생성자 호출
    }

    public int sub(){
        return this.l-this.r;
    }
}

public class _Inherit {
    public static void main(String[] args){
        Sub_cal sc1 = new Sub_cal(2,3);
        System.out.println(sc1.sum());
        System.out.println(sc1.sub());
    }
}
