package _11_06;

enum Fruit{ //관련 값 저장, 변경되지 않음, 열거형은 클래스형태이기 떄문에 생성자, 필드, 메소드를 가질 수 있음
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    String color;
    Fruit(String color){
        System.out.println("Call Constructor " + this);
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}

enum Company{
    GOOGLE,APPLE,ORACLE;
}
public class _enum {
    public static void main(String[] args){
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+"kacl, " + Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(57+"kacl, " + Fruit.PEACH.getColor());
            default:
                System.out.println("NOT it the case");
        }
    }
}
