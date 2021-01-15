public class Burrito extends MexiFood {
    @Override
    public String printFood() {
        price=7.50;
        return "\nA burrito with ";
    }

    @Override
    Double givePrice() {
        return price;
    }
}