// Autor: Krystyna Tokarska
// Zaimplementuj klasę Invoice reprezentującą fakturę dla sklepu. Klasa przechowuje następujące informacje:
// product_number (typ String), prodcut_description (typ String), quantity(typ int) ipricePerItem(typ double).
// Klasa powinna mieć konstruktor, który umożliwi podanie wszystkich 4 parametrów. Zaimplementuj metody set i get
// dla każdej zmiennej. Dodaj metodę: -Amount, które zwraca iloczyn quantity i pricePerItem. Jeżeli pricePerItem nie
// jest dodatnia,Amountpowinien zwrócić 0. Jeżeli quantity nie jest dodatnie,Amount` powinna zwrócić 0.
// Przetestuj zaimplementowany program.

public class Invoice {

    private String product_number;
    private String product_description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String product_number, String product_description, int quantity, double pricePerItem) {
        this.product_number = product_number;
        this.product_description = product_description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public Invoice() {
    }

    public double amount() {
        double amount = this.quantity * this.pricePerItem;
        if (quantity < 0 || pricePerItem < 0) {
            return 0;
        } else {
            return amount;
        }
    }

    public String getProduct_number() {
        return product_number;
    }

    public void setProduct_number(String product_number) {
        this.product_number = product_number;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}
