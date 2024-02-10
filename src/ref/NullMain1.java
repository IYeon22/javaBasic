package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);    //난 참조할게 없어
        data = new Data();      //참조했으니까
        System.out.println("2. data = " + data); //참조값이 나옴
        data = null;    // data = new Data(); 얘는 null이 됐으니 쓸 수가 없음 -> 아무도 참조하지 않는 인스턴스가 있으면 가비지 컬렉션이 자동으로 메모리에서 제거해준다.
        System.out.println("3. data = " + data);
    }
}
