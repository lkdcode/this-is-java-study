public class Discount {

   private final int totalPrice = DataBase.getInstance().getBills();
   private final double discountPrice = DataBase.getInstance().getDiscount();
    /*
    10개당 만원 할인적용하는 클레스
     */
    public void discount() {
        int totalPriceFinal = totalPrice;

    }

    public void discountFivePercent() {
        //5프로 추가
        int AfterDiscountPrice = (int) (totalPrice - discountPrice);
    }
}
