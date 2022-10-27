public class Main {
    public static void main(String[] args) {
        // Storage
        Storage laptop = new Storage("apple", 101, 2999, 5);

        Storage phone = new Storage("samsung", 102, 999, 0);

        Storage charge = new Storage("X15", 103, 199, 10);

        System.out.println("-- На складе : ");

        System.out.println("Позиция 1 : " + "ноутбук " + laptop.name + ", " + "стоимость " +
                laptop.cost + " $" + ", " + "количество : " + laptop.sum + " шт");

        System.out.println("Позиция 2 : " + "смартфон " + phone.name + ", " + "стоимость " +
                phone.cost + " $" + ", " + "количество : " + phone.sum + " шт");

        System.out.println("Позиция 3 : " + "зарядное устройство " + charge.name + ", " + "стоимость " +
                charge.cost + " $" + ", " + "количество : " + charge.sum + " шт");

        // Shop
        Shop shelfOne = new Shop(2);

        Shop shelfTwo = new Shop(0);

        Shop shelfThree = new Shop(0);

        System.out.println("");
        System.out.println("-- В магазине : ");

        System.out.println("Позиция 1 : " + "ноутбук " + laptop.name + ", " + "стоимость " +
                laptop.cost + " $" + ", количество : " + shelfOne.available + " шт");

        System.out.println("Позиция 2 : " + "смартфон " + phone.name + ", " + "стоимость " +
                phone.cost + " $" + ", количество : " + shelfTwo.available + " шт");

        System.out.println("Позиция 3 : " + "зарядное устройство " + charge.name + ", " + "стоимость " +
                charge.cost + " $" + ", количество : " + shelfThree.available + " шт");

        //Buyer and Seller
        SellerBuyer sellerBuyer = new SellerBuyer("Покупатель", "Продавец");

        // -----------------
        String want = charge.name;
        // -----------------


        System.out.println("");

        //Selling
        System.out.println(sellerBuyer.buyerName + " : ");
        System.out.println("Хочу приобрести ноутбук " + want);
        System.out.println("");

        System.out.println(sellerBuyer.sellerName + " : ");
        if (want == laptop.name) {
            if (shelfOne.available > 0) {
                System.out.println("Конечно, с вас " + laptop.cost + "$");
            }
            else if (laptop.sum > 0) {
                System.out.println("Необходимо подаждать доставку со склада, хотите забронировать?");
            }
            else System.out.println("К сожалению товара на складе нет");

        }
        else if (want == phone.name) {
            if (shelfTwo.available > 0) {
                System.out.println("Конечно, с вас " + phone.cost + "$");
            }
            else if (phone.sum > 0) {
                System.out.println("Необходимо подаждать доставку со склада, хотите забронировать?");
            }
            else System.out.println("К сожалению товара на складе нет");
        }
        else if (want == charge.name) {
            if (shelfThree.available > 0) {
                System.out.println("Конечно, с вас " + charge.cost + "$");
            }
            else if (charge.sum > 0) {
                System.out.println("Необходимо подаждать доставку со склада, хотите забронировать?");
            }
            else System.out.println("К сожалению товара на складе нет");
        }



    }
}