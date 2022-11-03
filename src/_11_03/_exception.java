package _11_03;
class A_{
    private int[] arr = new int[3];
    public A_(){
        arr[0] = 0;
        arr[1] = 2;
        arr[2] = 4;
    }
    public void devision (int a, int b){
        try {
            System.out.println(arr[a] / arr[b]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch(ArithmeticException e){
            System.out.println(e);
        } finally {
            System.out.println("Fin");
        }
    }

}

public class _exception {
    public static void main(String[] args){
        A_ a1 = new A_();
        a1.devision(2,0);

    }
}
