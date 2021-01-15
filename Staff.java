import java.util.*;

public class Staff {
    Orders orders = new Orders(); // composite
    Double currOrderPrice;
    Scanner scnr = new Scanner(System.in);
    Staff(){
      //  Menu();
    }
    MexiFood topping;

    public void BaseToppingAdder(int orderNum){
        //ToppingDecorator topping = new ToppingDecorator(orders.getOrder(orderNum));
        System.out.println("What kind of protein would you like, 1 for Chicken($0.2), 2 for Carne Asada($0.4), " +
                "3 for Tofu($0.3), anything else for none.");

        int meatOption=0;
        try {
            meatOption = scnr.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Please put valid input");
            scnr.nextLine();
        }
        //MexiFood a = new ChickenDecorator(new SteakDecorator(orders.getOrder(orderNum)));
        System.out.println("Do you have a Soy Allergy? 1 for yes anything else for no");
        int soyAllergy =0;
        boolean soy=false;
        try {
            soyAllergy = scnr.nextInt();
            if(soyAllergy==1){
                soy=true;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Please put valid input");
            scnr.nextLine();
        }

        switch (meatOption){
            case 1:
                topping = new ChickenDecorator(topping);
                break;
            case 2:
                topping = new SteakDecorator(topping);
                break;
            case 3:
                if(!soy) {
                    topping = new TofuDecorator(topping);
                }
                break;
           default:
                break;
        }

        System.out.println("What kind of Rice would you like, 1 for White Rice($0.1), 2 for Brown Rice($0.1), " +
                "3 for Both($0.2), anything else for none.");

        int riceOption=0;

        try {
            riceOption = scnr.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Please put valid input");
            scnr.nextLine();
        }

        switch (riceOption){
            case 1:
                topping = new WhiteRiceDecorator(topping);
                break;
            case 2:
                topping = new BrownRiceDecorator(topping);
                break;
            case 3:
                topping = new BrownRiceDecorator(topping);
                topping = new WhiteRiceDecorator(topping);
                break;
            default:
                break;
        }

        System.out.println("What kind of Bean would you like, 1 for Black Bean($0.2), 2 for Pinto Beans($0.2), " +
                "3 for Both($0.3), anything else for none.");

        int typeOfBean = 0;

        try {
            typeOfBean = scnr.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Please put valid input");
            scnr.nextLine();
        }


        switch (typeOfBean){
            case 1:
                topping = new BlackBeanDecorator(topping);
                break;
            case 2:
                topping = new PintoBeanDecorator(topping);
                break;
            case 3:
                topping = new PintoBeanDecorator(topping);
                topping = new BlackBeanDecorator(topping);
                break;
            default:
                break;
        }

        System.out.println("These are the possible toppings\n1 for tomato($0.2))\n2 for lettuce($0.1)\n" +
                "3 shredded cheese($0.2)\n" + " for nothing type anything else");

        System.out.println("\nHow many topping do you want?");

        int numOfToppings=0;

        try {
            numOfToppings = scnr.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Please put valid input");
            scnr.nextLine();
        }
        int currTopping=0;
        int topppingOption =0;

        System.out.println("Are you lactose intolerance? 1 for yes anything else for no");

        int lactose =0;
        boolean lactose1=false;
        try {
            lactose = scnr.nextInt();
            if(lactose==1){
                lactose1=true;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Please send a valid input");
            scnr.nextLine();
        }

        int multiple1=0;
        int multiple2=0;
        int multiple3=0;

        while(currTopping<numOfToppings){
            System.out.print("Please pick topping #");
            int tempNum = currTopping+1;
            System.out.println(tempNum);
            try {
                topppingOption = scnr.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Please put valid input");
                scnr.nextLine();
            }
            switch (topppingOption){
                case 1:
                    topping = new TomateDecorator(topping);
                    multiple1++;
                    break;
                case 2:
                    topping = new LettuceDecorator(topping);
                    multiple2++;
                    break;
                case 3:
                    if(lactose1) {
                        topping = new CheeseDecorator(topping);
                        multiple3++;
                    }
                    break;
                default:
                    orderNum = numOfToppings;
                    break;
            }

            currTopping++;
        }


        System.out.println("What kind of sauce would you like? You can have queso($0.1), salsa($0.1) " +
                "or sour cream($0.1) 1, 2, or 3");
        int typeOfSauce=0;

        try {
            typeOfSauce = scnr.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Please put valid input");
            scnr.nextLine();
        }


        switch (typeOfSauce){
            case 1:
                topping = new QuesoDecorator(topping);
                break;
            case 2:
                topping = new SalsaDecorator(topping);
                break;
            case 3:
                topping = new SourCreamDecorator(topping);
                break;
            default:
                break;
        }

        if(multiple1>1){
            topping.Extra ="tomato, ";
        }
        else if(multiple2>1){
            topping.Extra ="lettuce, ";
        }
        else if(multiple3>1){
            topping.Extra ="cheese decorator, ";
        }
    }


    public void Menu(){

        System.out.println("Today's Menu: ");
        System.out.println("We have three basic options Tacos, Burritos, and Bowls(#1,#2,#3) ($7.3) ($7.5) ($7.1)");
        System.out.println("Along with this we also several specials in the menu, these are:");
        System.out.println("#4 Taco Salad, at base $7.80");
        System.out.println("#5 Double-decker Taco, $10");
        System.out.println("#6 Traveler's Pack (Comes w/ 2 individual tacos and 1 burrito)");
        System.out.println("#7 Sampler Pack (Comes w/ 1 burrito, 1 taco, 1 bowl)");
        System.out.println("#8 Party Platter (Comes w/ 3 tacos, 2 burritos, 1 bowl)");

        System.out.println("How many orders are you having today?");
        int numOfOrders=0;

        while(true){
            try {
                numOfOrders = scnr.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Please put valid input");
                scnr.nextLine();
            }
            break;
        }

        int orderNum=0;
        int totalItems=0;

        while (orderNum<numOfOrders){
            int tempNum = orderNum+1;
            System.out.println("For order " + tempNum + " which option would you like");
            int option=0;
            try {
                option = scnr.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Please put valid input");
                scnr.nextLine();
            }
            MexiFactory factory = new MexiFactory();

            switch (option){
                case 1: //regular taco
                    orders.addFood(factory.makeFood(mexiFoodType.TacoM));
                    topping = new BaseDecorator(orders.getOrder(orderNum));
                    BaseToppingAdder(orderNum);
                    orders.SetObjFood(orderNum,topping);
                    orderNum++;
                    break;
                case 2: //regular burrito
                    orders.addFood(factory.makeFood(mexiFoodType.BurritoM));
                    topping = new BaseDecorator(orders.getOrder(orderNum));
                    BaseToppingAdder(orderNum);
                    orders.SetObjFood(orderNum,topping);
                    orderNum++;
                    break;
                case 3: //regular bowl
                    orders.addFood(factory.makeFood(mexiFoodType.BowlM));
                    topping = new BaseDecorator(orders.getOrder(orderNum));
                    BaseToppingAdder(orderNum);
                    orders.SetObjFood(orderNum,topping);
                    orderNum++;
                    break;
                case 4: //Taco salad
                    orders.addFood(factory.makeFood(mexiFoodType.BowlM));
                    topping = new TacoShellDecorator(orders.getOrder(orderNum));
                    BaseToppingAdder(orderNum);
                    orders.SetObjFood(orderNum,topping);
                    orderNum++;
                    break;
                case 5: //double decker
                    System.out.println("How many levels do you want of tacos do you want? 1 is just a regular " +
                            "taco, 2 is a double decker, etc.");
                    int NumOfLevels=0;
                    try {
                        NumOfLevels = scnr.nextInt();
                    }
                    catch (InputMismatchException e){
                        System.out.println("Please put valid input");
                        scnr.nextLine();
                    }
                    DoubleDecker doubleD = new DoubleDecker(NumOfLevels);
                    for(int i=0;i<doubleD.Levels.size();i++){
                        int j=i+1;
                        System.out.println("For level #"+j);
                        topping = new BaseDecorator(doubleD.Levels.get(i));
                        BaseToppingAdder(orderNum);
                        doubleD.Levels.set(i,topping);
                    }
                    orders.addFood(doubleD);
                    orders.SetObjFood(orderNum,doubleD);
                    orderNum++;
                    //really confused on this one chief
                    break;
                case 6: //trav pack
                    groupOption travPack = new groupOption();
                    totalItems=0;
                    travPack.addFood(factory.makeFood(mexiFoodType.TacoM));
                    totalItems++;
                    travPack.addFood(factory.makeFood(mexiFoodType.TacoM));
                    totalItems++;
                    travPack.addFood(factory.makeFood(mexiFoodType.BurritoM));
                    topping = new BaseDecorator(travPack.getOrder(totalItems));
                    BaseToppingAdder(totalItems);
                    travPack.SetObjFood(totalItems,topping);
                    orders.addFood(travPack);
                    orderNum++;
                    break;
                case 7: //samp pack
                    groupOption sampPack = new groupOption();
                    totalItems=0;
                    sampPack.addFood(factory.makeFood(mexiFoodType.BurritoM));
                    topping = new BaseDecorator(sampPack.getOrder(totalItems));
                    BaseToppingAdder(totalItems);
                    sampPack.SetObjFood(totalItems,topping);
                    totalItems++;
                    sampPack.addFood(factory.makeFood(mexiFoodType.TacoM));
                    topping = new BaseDecorator(sampPack.getOrder(totalItems));
                    BaseToppingAdder(totalItems);
                    sampPack.SetObjFood(totalItems,topping);
                    totalItems++;
                    sampPack.addFood(factory.makeFood(mexiFoodType.BowlM));
                    topping = new BaseDecorator(sampPack.getOrder(totalItems));
                    BaseToppingAdder(totalItems);
                    sampPack.SetObjFood(totalItems,topping);
                    orderNum++;
                    orders.addFood(sampPack);
                    break;

                case 8: // Party Platter
                    totalItems=0;
                    groupOption partyPlatter = new groupOption();
                    for(int i=0;i<3;i++){
                        partyPlatter.addFood(factory.makeFood(mexiFoodType.TacoM));
                        topping = new BaseDecorator(partyPlatter.getOrder(totalItems));
                        BaseToppingAdder(totalItems);
                        partyPlatter.SetObjFood(totalItems,topping);
                        totalItems++;
                    }
                    for(int i=0;i<2;i++){
                        partyPlatter.addFood(factory.makeFood(mexiFoodType.BurritoM));
                        topping = new BaseDecorator(partyPlatter.getOrder(totalItems));
                        BaseToppingAdder(totalItems);
                        partyPlatter.SetObjFood(totalItems,topping);
                        totalItems++;
                    }
                    partyPlatter.addFood(factory.makeFood(mexiFoodType.BowlM));
                    topping = new BaseDecorator(partyPlatter.getOrder(totalItems));
                    BaseToppingAdder(totalItems);
                    partyPlatter.SetObjFood(totalItems,topping);
                    orderNum++;
                    orders.addFood(partyPlatter);
                    break;
                default:
                    break;
            }
        }

        System.out.print("Your order was ");
        System.out.print(orders.printFood());
        System.out.print("your total price is " + orders.totalPrice);
    }
}
