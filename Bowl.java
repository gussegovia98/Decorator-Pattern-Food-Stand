public class Bowl extends MexiFood {
    @Override
    public String printFood() {
        price=7.10;
        return "\nA bowl with ";
    }

    @Override
    Double givePrice() {
        return price;
    }
}