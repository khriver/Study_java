package _11_01;
class Cal{
    int l, r;

    public Cal(int left, int right){ // 생성자(constructor)!! class명 과같음
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

public class _constructor {
    public static void main(String[] args){
        Cal C1 = new Cal(2,3);
        C1.sum();
    }
}
