package _11_06;
import java.util.*;
import java.util.HashSet;
import java.util.Iterator;

public class _CollectionsFramework_Set {
    public static void main(String[] args){
        Collection<Integer> A = new HashSet<Integer>();
        //HashSet대신 콜렉션 사용 가능
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(2);

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(2);
        B.add(3);
        B.add(4);

        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);

        System.out.println(A.containsAll(B));
        System.out.println(A.containsAll(C));

        //A.addAll(B); // 결과 : {1,2,3,4} -> 합집합
        //A.retainAll(B); // 결과 : {2,3} -> 교집합
        A.removeAll(B); // 결과 : {1} -> 차집합


        Iterator hi = A.iterator(); //내부의 변수들을 효율적으로 사용하기 위한 호출함수
        System.out.println("\nhashset");
        while(hi.hasNext()){ // .hasNext : 반복할 데이터 있으면 True / 없으면 False || .next : true일 때 리턴할 데이터
            System.out.println(hi.next());
        }

    }
}
