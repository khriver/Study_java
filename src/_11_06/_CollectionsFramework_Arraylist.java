package _11_06;

import java.util.ArrayList;

public class _CollectionsFramework_Arraylist {
    public static void main(String[] args){
        ArrayList a1 = new ArrayList(); // ArrayList는 size() , get(i) 함수를 사용 <-> 배열은 .length , [i]로 호출
        ArrayList<String> a2 = new ArrayList<String>();
        a1.add("one");
        a1.add("two");
        a1.add(3);
        a2.add("one");
        a2.add("two");
        a2.add("3");

        for (int i=0; i<a1.size(); i++){
            String val = (String)a1.get(1); //ArrayList는 Object형식으로 데이터 타입을 가지고 있기 때문에 형변환을 해야함
            System.out.println(a1.get(i));
        }
        for (int i=0; i<a2.size(); i++){
            System.out.println(a2.get(i));//ArrayList를 정의할때 string  타입으로 정의 했기때문에 추가적인 형변환 필요 X
        }
    }
}
