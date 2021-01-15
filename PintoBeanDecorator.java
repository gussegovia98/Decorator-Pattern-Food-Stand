public class PintoBeanDecorator extends MexiFoodDecorator{
       public PintoBeanDecorator(MexiFood decoratedFood){
        super(decoratedFood);
    }

    @Override
    String printFood() {
        return super.printFood() + "pinto beans, ";
    }

    @Override
    Double givePrice() {
        return super.givePrice() + 0.2;
    }
}
