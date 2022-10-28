public class SellerBuyer {
    public String buyerName;
    public String sellerName;

    public SellerBuyer (String buyerName, String sellerName) {
        this.buyerName = buyerName;
        this.sellerName = sellerName;
    }

    public void endFirstSeller() {
        System.out.println("");
        System.out.println("Продавец : ");
        System.out.println("Спасибо за покупку!");
    }
    public void endSecondSeller() {
        System.out.println("");
        System.out.println("Продавец : ");
        System.out.println("Оформляю бронь");
    }

    public void endFirstBuyer() {
        System.out.println("");
        System.out.println("Покупатель : ");
        System.out.println("Покупаю");
    }
    public void endSecondBuyer() {
        System.out.println("");
        System.out.println("Покупатель : ");
        System.out.println("Готов забронировать");
    }
    public void endThirdBuyer() {
        System.out.println("");
        System.out.println("Покупатель : ");
        System.out.println("Жаль, до свидания");
    }


}
