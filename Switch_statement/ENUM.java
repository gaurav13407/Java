public class ENUM {
    public enum Day{
        Monday,Tuesday,wednesday,Thrusaday,Friday,Saturday,Sunday
    }
    public enum CoffeSize{
        small,medium,large,venti
    }
    public static void main(String[] args) {
        CoffeSize size=CoffeSize.large;
        double price;
        switch(size){
            case small:
            price=2.50;
            break;
            case medium:
            price=3.50;
            break;
            case large:
            price=5.59;
            break;
            case venti:
            price=6.45;
            break;
            default :
            price=42.87;
            break;
        }
        System.out.println("The price is:"+price);
        System.out.printf("The Price is:$%.2f%n",price);
    }    
}
