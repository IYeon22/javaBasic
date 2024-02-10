package ref;

public class ProductOrderMain2 {
    static  int sum = 0;    //모든 인스턴스에서 공유되는 거니까 클래스레벨에서 선언 그리고 아래 totalAmount도  static으로 선언했으니 해당 메서드에서 사용하는 변수도 static으로 선언되어야 한다.
    public static void main(String[] args) {
        ProductOrder productOrder1 = createOrder("두부",2000,2);
        ProductOrder productOrder2= createOrder("김치",5000,1);
        ProductOrder productOrder3= createOrder("콜라",1500,2);

        printOrders(productOrder1);
        printOrders(productOrder2);
        printOrders(productOrder3);

        totalAmount(productOrder1,productOrder2,productOrder3);
    }

    //상품 주문 정보들을 생성하고 저장
    static ProductOrder createOrder(String productName,int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }
    //상품 주문 정보 출력
    static  void printOrders(ProductOrder productOrder1){
        System.out.println("상품명: " + productOrder1.productName + "가격: " + productOrder1.price + "수량: " + productOrder1.quantity);
    }

    //총 결제 금액 계산
    static void totalAmount(ProductOrder... orders){    //가변인자를 활용한 메서드 선언 -> 메서드가 동적으로 개수가 변할 수 있는 매개변수들을 받을 수 있게 해줌 -> 이 경우 여러 개의 ProductOrder를 인자로 받을 수 있다
        for (ProductOrder order : orders){
            sum+= order.price * order.quantity;
        }
        System.out.println("총 금액은: " + sum);
    }

    //이렇게 하고 위에서 하나씩 받을 수도 있움
//    static void totalAmount(ProductOrder productOrder) {
//        int sum = productOrder.price * productOrder.quantity;
//        System.out.println("총 금액은: " + sum);
//    }
//
//    totalAmount(productOrder1);
//    totalAmount(productOrder2);
//    totalAmount(productOrder3);



}
