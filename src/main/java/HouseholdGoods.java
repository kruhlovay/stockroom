import java.util.Scanner;

public class HouseholdGoods extends ItemCounter{

    public HouseholdGoods(int id) {
        super(id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void packageSize(int height, int length, int width){
        String size;
       int volume = height * length * width;
       if(volume < 1000){
           size = "small";
       }
       else if (volume >=1000 && volume <3000){
           size = "medium";
       }
       else {
           size = "large";
       }
        System.out.println("The package required is "+size + ".");

    }

    public void packageType(){
        Scanner s = new Scanner(System.in);
        System.out.println("Choose the type of packing required : 1 - metal, 2 - plastic, 3 - wooden, 4 - textile, 5 - film, 6 - carton, 7 - paper bag ");
        int x = s.nextInt();
       switch (x){
           case 1:
               System.out.println("Metal package is chosen");
               break;
           case 2:
               System.out.println("Plastic package is chosen");
               break;

           case 3:
               System.out.println("Wooden package is chosen");
               break;

           case 4:
               System.out.println("Textile package is chosen");
               break;

           case 5:
               System.out.println("Film package is chosen");
               break;
           case 6:
               System.out.println("Carton package is chosen");
               break;
           case 7:
               System.out.println("Paper package is chosen");
               break;

       }

    }
 public void weight(){
        String weight;
     Scanner s = new Scanner(System.in);
     System.out.println("Please insert the weight of good");
     int x = s.nextInt();
     if(x<10){
         weight = "Low weight";
         System.out.println("The item has " + weight + ".");
     }
     else if(x>=10&&x<20){
         weight= "Medium weight";
         System.out.println("The item has " + weight + ".");
     }
     else {
         weight = "Large weight";
         System.out.println("The item has " + weight + ".");
     }
 }

 public void transportationType(){
        Boolean isFragile;
     Scanner s = new Scanner(System.in);
     System.out.println("Please enter 1 if the item is fragile and 2 if the item is not fragile");
     int x = s.nextInt();
     if(x==1){
         isFragile = true;
         System.out.println("Is item fragile: " + isFragile);
     }
     else if(x==2){
         isFragile = false;
         System.out.println("The item is fragile: "+ isFragile);

     }
     else {
         System.out.println("Not identified");
     }
 }

}
