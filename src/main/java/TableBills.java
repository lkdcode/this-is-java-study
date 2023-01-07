public class TableBills {
    private String menu;
    private  int price;
    private int quantity;


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
}
