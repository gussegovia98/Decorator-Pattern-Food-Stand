public class BlackBeanDecorator extends MexiFoodDecorator {
    public BlackBeanDecorator(MexiFood decoratedFood){
        super(decoratedFood);
    }

    @Override
    String printFood() {
        return super.printFood() + "black beans, ";
    }

    @Override
    Double givePrice() {
        if(!deleted) {
            return super.givePrice() + 0.2;
        }
        else{
            return super.givePrice();
        }
    }

    @Override
    public void changeBool() {
        deleted = true;
    }
}
