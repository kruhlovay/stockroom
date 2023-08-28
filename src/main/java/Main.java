public class Main {
    public static void main(String[] args) {

        HouseholdGoods mop = new HouseholdGoods(1);
        mop.addToStock();
        mop.setStatus("In Stock");
        mop.setNumberOfShelf(3);
        mop.setLeftInStockroom(mop.leftInStockroom);
        mop.setRequiresFridge(false);
        mop.packageSize(10, 12, 24);
        mop.transportationType();
        mop.weight();
        mop.getNumberOfShelf();
        System.out.println(mop.getStatus());
        System.out.println(mop.leftInStockroom);

        HouseholdGoods lamp = new HouseholdGoods(2);
        lamp.addToStock();
        lamp.setStatus("In Stock");
        lamp.setNumberOfShelf(16);
        lamp.setLeftInStockroom(mop.leftInStockroom);
        lamp.setRequiresFridge(false);
        lamp.packageSize(3, 1, 4);
        lamp.transportationType();
        lamp.weight();
        lamp.getNumberOfShelf();
        System.out.println(lamp.getStatus());
        System.out.println(lamp.leftInStockroom);

        HouseholdGoods scissors = new HouseholdGoods(3);
        scissors.addToStock();
        scissors.setStatus("In Stock");
        scissors.setNumberOfShelf(2);
        scissors.setLeftInStockroom(mop.leftInStockroom);
        scissors.setRequiresFridge(false);
        scissors.packageSize(3, 1, 4);
        scissors.transportationType();
        scissors.weight();
        scissors.getNumberOfShelf();
        scissors.setRequiresFridge(false);
        System.out.println(scissors.isRequiresFridge());
        System.out.println(scissors.getStatus());
        System.out.println(scissors.leftInStockroom);

        FoodItems chips = new FoodItems(4);
        chips.addToStock();
        chips.setSnack(true);
        chips.setDrink(false);
        chips.setCannedFood(false);
        chips.setFreshFood(false);
        chips.setFrozenFood(false);
        chips.printCategory();
        chips.shelfLife();
        chips.isVacuumRequired();
        chips.setNumberOfShelf(5);
        chips.setStatus("In Stock");
        chips.setRequiresFridge(false);
        System.out.println(chips.getLeftInStockroom());

        FoodItems cola = new FoodItems(5);
        cola.addToStock();
        cola.setSnack(false);
        cola.setDrink(true);
        cola.setCannedFood(false);
        cola.setFreshFood(false);
        cola.setFrozenFood(false);
        cola.printCategory();
        cola.shelfLife();
        cola.isVacuumRequired();
        cola.setNumberOfShelf(5);
        cola.setStatus("In Stock");
        cola.setRequiresFridge(false);
        System.out.println(cola.getLeftInStockroom());

        FoodItems cucumber = new FoodItems(11);
        cucumber.addToStock();
        cucumber.setSnack(false);
        cucumber.setDrink(false);
        cucumber.setCannedFood(false);
        cucumber.setFreshFood(true);
        cucumber.setFrozenFood(false);
        cucumber.printCategory();
        cucumber.shelfLife();
        cucumber.isVacuumRequired();
        cucumber.setNumberOfShelf(42);
        cucumber.setStatus("In Stock");
        cucumber.setRequiresFridge(false);
        System.out.println(cucumber.getLeftInStockroom());

        FoodItems frozenCabbage = new FoodItems(6);
        frozenCabbage.addToStock();
        frozenCabbage.setSnack(false);
        frozenCabbage.setDrink(false);
        frozenCabbage.setCannedFood(false);
        frozenCabbage.setFrozenFood(true);
        frozenCabbage.setFreshFood(false);
        frozenCabbage.printCategory();
        frozenCabbage.shelfLife();
        frozenCabbage.isVacuumRequired();
        frozenCabbage.setNumberOfShelf(26);
        frozenCabbage.setStatus("In Stock");
        frozenCabbage.setRequiresFridge(true);
        System.out.println(frozenCabbage.getLeftInStockroom());

        Clothes dress = new Clothes(7);
        dress.addToStock();
        dress.setAdult(true);
        dress.setSize(46);
        dress.setColor("Green");
        dress.setType("Dress");
        System.out.println("The item added is "+ dress.getType() + ", " + "has "+dress.getColor()+ " colour");
        dress.isChild();
        dress.sizeSection();
        dress.setNumberOfShelf(17);
        dress.setStatus("In Stock");
        System.out.println("The status if an item is: " + dress.getStatus());
        System.out.println(dress.getLeftInStockroom());


        Clothes pants = new Clothes(8);
        pants.addToStock();
        pants.setAdult(true);
        pants.setSize(48);
        pants.setColor("Black");
        pants.setType("Pants");
        System.out.println("The item added is "+ pants.getType() + ", " + "has "+pants.getColor()+ " colour");
        pants.isChild();
        pants.sizeSection();
        pants.setNumberOfShelf(18);
        pants.setStatus("In Stock");
        System.out.println("The status if an item is: " + pants.getStatus());
        System.out.println(pants.getLeftInStockroom());


        Clothes skirt = new Clothes(9);
        skirt.addToStock();
        skirt.setAdult(false);
        skirt.setSize(38);
        skirt.setColor("Yellow");
        skirt.setType("Skirt");
        System.out.println("The item added is "+ skirt.getType() + ", " + "has "+skirt.getColor()+ " colour");
        skirt.isChild();
        skirt.sizeSection();
        skirt.setNumberOfShelf(9);
        skirt.setStatus("In Stock");
        System.out.println("The status if an item is: " + skirt.getStatus());
        System.out.println(skirt.getLeftInStockroom());

        Clothes tights = new Clothes(10);
        tights.addToStock();
        tights.setAdult(false);
        tights.setSize(32);
        tights.setColor("Red");
        tights.setType("Tights");
        System.out.println("The item added is "+ tights.getType() + ", " + "has "+tights.getColor()+ " colour");
        tights.isChild();
        tights.sizeSection();
        tights.setNumberOfShelf(11);
        tights.setStatus("In Stock");
        System.out.println("The status if an item is: " + tights.getStatus());
        System.out.println(tights.getLeftInStockroom());


        Shoes sandals = new Shoes(12);
        sandals.addToStock();
        sandals.setColour("green");
        sandals.setGender("girls");
        sandals.setSeason("summer");
        sandals.setSize(32);
        sandals.setType("summer shoes");
        sandals.generateDescription();
        sandals.setNumberOfShelf(21);
        sandals.setStatus("In Stock");
        sandals.getStatus();
        System.out.println(sandals.getLeftInStockroom());


        Shoes boots = new Shoes(13);
        boots.addToStock();
        boots.setColour("black");
        boots.setGender("men");
        boots.setSeason("spring");
        boots.setSize(44);
        boots.setType("boots");
        boots.generateDescription();
        boots.setNumberOfShelf(22);
        boots.setStatus("In Stock");
        System.out.println(boots.getStatus());
        System.out.println(boots.getLeftInStockroom());


        Shoes heeledShoes = new Shoes(14);
        boots.addToStock();
        boots.setColour("white");
        boots.setGender("women");
        boots.setSeason("summer");
        boots.setSize(38);
        boots.setType("shoes");
        boots.generateDescription();
        boots.setNumberOfShelf(31);
        boots.setStatus("In Stock");
        System.out.println(boots.getStatus());
        System.out.println(boots.getLeftInStockroom());


        Shoes winterBoots = new Shoes(15);
        winterBoots.addToStock();
        winterBoots.setColour("brown");
        winterBoots.setGender("men");
        winterBoots.setSeason("winter");
        winterBoots.setSize(42);
        winterBoots.setType("boots");
        winterBoots.generateDescription();
        winterBoots.setNumberOfShelf(33);
        winterBoots.setStatus("In Stock");
        System.out.println(winterBoots.getStatus());
        System.out.println(winterBoots.getLeftInStockroom());

        Shoes flipFlops = new Shoes(16);
        flipFlops.addToStock();
        flipFlops.setColour("yellow");
        flipFlops.setGender("women");
        flipFlops.setSeason("summer");
        flipFlops.setSize(40);
        flipFlops.setType("summer shoes");
        flipFlops.generateDescription();
        flipFlops.setNumberOfShelf(17);
        flipFlops.setStatus("In Stock");
        System.out.println(flipFlops.getStatus());
        System.out.println(flipFlops.getLeftInStockroom());

        Shoes sneakers = new Shoes(17);
        sneakers.addToStock();
        sneakers.setColour("black");
        sneakers.setGender("boys");
        sneakers.setSeason("all");
        sneakers.setSize(34);
        sneakers.setType("sport shoes");
        sneakers.generateDescription();
        sneakers.setNumberOfShelf(18);
        sneakers.setStatus("In Stock");
        System.out.println(sneakers.getStatus());
        System.out.println(sneakers.getLeftInStockroom());





    }
}