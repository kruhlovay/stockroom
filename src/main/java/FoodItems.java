import java.security.spec.RSAOtherPrimeInfo;

public class FoodItems extends ItemCounter {

    public int categoryId;
    public FoodItems(int id) {
        super(id);
    }

    public boolean isDrink;
    public boolean isFreshFood;
    public boolean isSnack;
    public boolean isCannedFood;
    public boolean isFrozenFood;

    public boolean isDrink() {
        return isDrink;
    }

    public void setDrink(boolean drink) {
        isDrink = drink;
    }

    public boolean isFreshFood() {
        return isFreshFood;
    }

    public boolean isSnack() {
        return isSnack;
    }

    public boolean isCannedFood() {
        return isCannedFood;
    }

    public boolean isFrozenFood() {
        return isFrozenFood;
    }

    public void setFreshFood(boolean freshFood) {
        isFreshFood = freshFood;
    }

    public void setSnack(boolean snack) {
        isSnack = snack;
    }

    public void setCannedFood(boolean cannedFood) {
        isCannedFood = cannedFood;
    }

    public void setFrozenFood(boolean frozenFood) {
        isFrozenFood = frozenFood;
    }

    public int printCategory(){
                if(isDrink){
                    categoryId = 1;
            System.out.println("The item belongs to drinks");
        }
        else if(isCannedFood){
            categoryId = 2;
            System.out.println("The item belongs to canned food");
        }
        else if(isSnack){
            categoryId = 3;
            System.out.println("The item belongs to snacks");
        }
        else if(isFrozenFood){
            categoryId = 4;
            System.out.println("The item belongs to frozen food");
        }
        else if(isFreshFood){
            categoryId= 5;
            System.out.println("The item belongs to fresh food");
        }
        else{
            System.out.println("Category is not defined");
        }
        return categoryId;
    }

    public void shelfLife(){
        if(categoryId == 1){
            System.out.println("Shelf life of this good is 1 year");
        }
       else if(categoryId ==2){
            System.out.printf("Shelf life of this good is 1 year");
        }
       else if(categoryId ==3){
            System.out.println("Shelf life of this good is 5 months");
        }
       else if(categoryId ==4){
            System.out.println("Shelf life of this good is 6 months");
        }
       else if(categoryId ==5){
            System.out.println("Shelf life of this good is 3 days");
        }
        else{
            System.out.println("Not defined");
        }
    }

public boolean isVacuumRequired(){
        boolean vacuum = false;
        switch (categoryId){
            case 1:
                System.out.println("Vacuum is not required");
                vacuum = false;
                break;
            case 2:
                System.out.println("Vacuum is not required");
                vacuum = false;
                break;
            case 3:
                System.out.println("Vacuum is preferable");
                vacuum = true;
                break;
            case 4:
                System.out.println("Vacuum is not required");
                vacuum = false;
                break;
            case 5:
                System.out.println("Vacuum is preferable");
                vacuum = true;
                break;
        }
        return vacuum;
}


}
