package _11_04;

class O {} // == class O extends Object{}

class calculator{
    int left, right;
    public calculator(int l, int r){
        this.left = l;
        this.right = r;
    }
    public void sum(){
        System.out.println(this.left + this.right);
    }
    public String toString(){ //toString 객체를 문자화해 표출하는것, class에서 정의내릴필요없음
        return "left :" + this.left + "right :" + this.right;
    }
}
class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    public boolean equals(Object obj) { //객체 간의 동일성을 비교할때 사용
        Student _obj = (Student)obj;
        return name == _obj.name;
    }
}
public class _object {
    public static void main(String[] args){
        calculator c1 = new calculator(4,6);
        c1.sum();
        c1.toString();
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
