package ClassStart1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] order = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        order[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        order[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        order[2] = order3;

        int sum = 0;
        for(int i = 0; i < order.length; i++){
            sum += order[i].price * order[i].quantity;
            System.out.println("상품명: " + order[i].productName + "가격: " + order[i].price + "수량: " + order[i].quantity);
        }
        System.out.println("총 가격 : " + sum);

    }
}
