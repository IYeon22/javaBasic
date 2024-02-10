package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigdata = new BigData();
        System.out.println("bigdata.count" + bigdata.count);    //0
        System.out.println("bigdata.data" + bigdata.data);      //null

        System.out.println("bigData.data.value = " + bigdata.data.value);   //NullPointException
    }
}
