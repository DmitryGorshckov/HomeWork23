import ru.gorshckov.basket.BasketImple;
import ru.gorshckov.basket.Product;

public class Main {

    public static void main(String[] args) {
        BasketImple basketImple = new BasketImple();
        Product meat = new Product("meat");
        Product milk = new Product("milk");
        Product bread = new Product("bread");

        basketImple.addProduct(meat);  //добавление товара
        basketImple.addProduct(milk);
        basketImple.addProduct(bread);

        basketImple.getProducts(); // получение списка товара
        System.out.println("=========");

        basketImple.addQuantity(milk,2); //добавление количества

       //basketImple.clear(); // очищение корзины

        basketImple.addQuantity(milk,2);
        basketImple.getProducts();
        System.out.println("======");

        basketImple.updateProductQuantity(milk,3); // обновление товара в корзине

        basketImple.getProducts();
        basketImple.getProductQuantity(milk); // получение количества товара по имени



    }
}
