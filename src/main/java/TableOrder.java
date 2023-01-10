public class TableOrder {
    private String menu; // 후라이드
    private  int price; // 18000
    private int quantity; // 1 ,2



    public void  order(String menu, int price, int quantity) {
        this.menu = menu;
        this.price = price;
        this.quantity = quantity;
    }
    /**
     * @parm 총 얼마 먹었는지 계산해주는 메소드
     */
    public int getTotal() {
        return price * quantity;
    }

    /*
    * 할인을 해준후 가격을 측정하는 메소드
     */


    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
