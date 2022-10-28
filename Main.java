public class Main {
    public static void main(String[] args) {
        // Storage
        Storage laptop = new Storage("ноутбук apple", 101, 2999, 5);

        Storage phone = new Storage("телефон samsung", 102, 999, 0);

        Storage charge = new Storage("зарядное устройство X15", 103, 199, 10);

        System.out.println("-- На складе : ");

        System.out.println("Позиция 1 : "+ laptop.name + ", " + "стоимость " +
                laptop.cost + " $" + ", " + "количество : " + laptop.sum + " шт");

        System.out.println("Позиция 2 : " + phone.name + ", " + "стоимость " +
                phone.cost + " $" + ", " + "количество : " + phone.sum + " шт");

        System.out.println("Позиция 3 : " + charge.name + ", " + "стоимость " +
                charge.cost + " $" + ", " + "количество : " + charge.sum + " шт");

        // Shop
        Shop shelfOne = new Shop(2);

        Shop shelfTwo = new Shop(0);

        Shop shelfThree = new Shop(0);

        System.out.println("");
        System.out.println("-- В магазине : ");

        System.out.println("Позиция 1 : " + laptop.name + ", " + "стоимость " +
                laptop.cost + " $" + ", количество : " + shelfOne.available + " шт");

        System.out.println("Позиция 2 : " + phone.name + ", " + "стоимость " +
                phone.cost + " $" + ", количество : " + shelfTwo.available + " шт");

        System.out.println("Позиция 3 : " + charge.name + ", " + "стоимость " +
                charge.cost + " $" + ", количество : " + shelfThree.available + " шт");

        //Buyer and Seller
        SellerBuyer sellerBuyer = new SellerBuyer("Покупатель", "Продавец");


        // -----------------
        String want = charge.name;
        // -----------------


        System.out.println("");

        //Selling
        System.out.println(sellerBuyer.buyerName + " : ");
        System.out.println("Хочу приобрести " + want);
        System.out.println("");

        System.out.println(sellerBuyer.sellerName + " : ");

        if ((want == laptop.name) || (want == phone.name) || (want == charge.name)) {
            if ((want == laptop.name) && (shelfOne.available > 0)) {
                System.out.println("Конечно, с вас " + laptop.cost + "$");
                sellerBuyer.endFirstBuyer();
                sellerBuyer.endFirstSeller();
            }
            else if ((want == phone.name) && (shelfTwo.available > 0)) {
                System.out.println("Конечно, с вас " + phone.cost + "$");
                sellerBuyer.endFirstBuyer();
                sellerBuyer.endFirstSeller();
            }
            else if ((want == charge.name) && (shelfThree.available > 0)) {
                System.out.println("Конечно, с вас " + charge.cost + "$");
                sellerBuyer.endFirstBuyer();
                sellerBuyer.endFirstSeller();
            }
            else if ((want == laptop.name) && (laptop.sum > 0)) {
                System.out.println("Необходимо подаждать доставку со склада, хотите забронировать?");
                sellerBuyer.endSecondBuyer();
                sellerBuyer.endSecondSeller();
            }
            else if ((want == phone.name) && (phone.sum > 0)) {
                System.out.println("Необходимо подаждать доставку со склада, хотите забронировать?");
                sellerBuyer.endSecondBuyer();
                sellerBuyer.endSecondSeller();
            }
            else if ((want == charge.name) && (charge.sum > 0)) {
                System.out.println("Необходимо подаждать доставку со склада, хотите забронировать?");
                sellerBuyer.endSecondBuyer();
                sellerBuyer.endSecondSeller();
            }
            else {
                System.out.println("К сожалению товара на складе нет");
                sellerBuyer.endThirdBuyer();
            }
        }


        }
    }
