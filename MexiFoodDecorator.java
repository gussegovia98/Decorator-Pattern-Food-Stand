import java.util.*;
import java.lang.reflect.*;
public abstract class MexiFoodDecorator extends MexiFood {
    MexiFoodDecorator(){}
    Boolean deleted = false;
    protected MexiFood decoratedFood;

    public MexiFoodDecorator(MexiFood decoratedFood){
        this.decoratedFood = decoratedFood;
    }

    @Override
    String printFood() {
        return decoratedFood.printFood();
    }

    @Override
    Double givePrice() {
        return decoratedFood.givePrice();
    }

    public void changeBool(){}
    /*
    public MexiFood removeDecorator(String decoName){
        MexiFood removeDeco = this;
        if(this.getClass().getName() == decoName) {
            removeDeco = this.remove();
        }
        else {
            ArrayList<MexiFood> classStack = new ArrayList();
            while(removeDeco != removeDeco.remove()) {
                if(removeDeco.getClass().getName() != decoName) {
                    classStack.add(removeDeco);
                }
                removeDeco = removeDeco.remove();
            }
            for(int i = classStack.size()-1;i == 0;i--) {
                try {
                    Class<?> clazz = Class.forName(classStack.get(i));
                    Constructor<?> ctor = clazz.getConstructor(MexiFood.class);
                    Object object = ctor.newInstance(new Object[] { removeDeco });
                    removeDeco = (MexiFood) object;
                }
                catch(Exception e) {
                    System.out.println("Exception:" + e.getMessage());
                }
            }
        }
        return removeDeco;

    }
*/

}