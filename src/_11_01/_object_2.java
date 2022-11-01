package _11_01;

class cal_v2{
    static int static_v = 3;
    int instance_v = 4;
    static void static_static(){
        System.out.println(static_v);
    }
    static void static_instance(){
        //System.out.println(instance_v);
    }
    void instance_static(){
        System.out.println(static_v);
    }
    void instance_instance(){
        System.out.println(instance_v);
    }

}
public class _object_2 {
        public static void main(String[] args) {
            cal_v2 c = new cal_v2();
            // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
            // 인스턴스 메소드가 정적 변수에 접근 -> 성공
            c.static_static();
            // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
            // 정적 메소드가 인스턴스 변수에 접근 -> 실패
            c.static_instance();
            // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
            // 인스턴스 메소드가 클래스 변수에 접근 -> 성공
            c.instance_static();
            // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
            // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
            c.instance_instance();
            // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
            // 클래스 메소드가 클래스 변수에 접근 -> 성공
            cal_v2.static_static();
            // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
            // 클래스 메소드가 인스턴스 변수에 접근 -> 실패
            cal_v2.static_instance();
            // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
            //C1.instance_static();
            // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
            //C1.instance_instance();
        }


}
