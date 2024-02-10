package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigdata = new BigData();
        //Data 인스턴스를 만들고 BigData.data멤버 변수에 참조값을 할당하면 NullPointException을 해결할 수 있다.
        bigdata.data = new Data();
        System.out.println("bigdata.count" + bigdata.count);    //0
        System.out.println("bigdata.data" + bigdata.data);      //null

        System.out.println("bigData.data.value = " + bigdata.data.value);   //NullPointException
    }
}
