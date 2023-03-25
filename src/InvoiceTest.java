// Autor: Krystyna Tokarska
// Zaimplementuj klasę Invoice reprezentującą fakturę dla sklepu. Klasa przechowuje następujące informacje:
// product_number (typ String), prodcut_description (typ String), quantity(typ int) ipricePerItem(typ double).
// Klasa powinna mieć konstruktor, który umożliwi podanie wszystkich 4 parametrów. Zaimplementuj metody set i get
// dla każdej zmiennej. Dodaj metodę: -Amount, które zwraca iloczyn quantity i pricePerItem. Jeżeli pricePerItem nie
// jest dodatnia,Amountpowinien zwrócić 0. Jeżeli quantity nie jest dodatnie,Amount` powinna zwrócić 0.
// Przetestuj zaimplementowany program.

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice faktura1 = new Invoice("01",
                "Computers for our new workers", 2, 3245.00);

        Invoice faktura2 = new Invoice();
        faktura2.setProduct_number("02");
        faktura2.setProduct_description("Test for negative number in quantity");
        faktura2.setQuantity(-3);
        faktura2.setPricePerItem(394);

        Invoice faktura3 = new Invoice("03",
                "Test fo negative number in pricePerItem", 2, -123);

        System.out.println(faktura1.amount());
        System.out.println(faktura2.amount());
        System.out.println(faktura3.amount());
    }
}
