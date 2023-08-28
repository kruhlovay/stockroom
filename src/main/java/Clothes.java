public class Clothes extends ItemCounter{
    public int size;
    public String type;
    public boolean isAdult;
    public String color;

    public Clothes(int id) {
        super(id);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void isChild(){
        if(isAdult){
            System.out.println("The item belongs to kid's clothes");
        }
        else {
            System.out.println("The item belongs to adult clothes");
        }
    }

    public void sizeSection(){
        if(size <= 46){
            System.out.println("Item belongs to small size section");
        }
        else if(size >46 && size <=52){
            System.out.println("Item belongs to normal size section");
        }
        else {
            System.out.println("Item belongs to plus size section");
        }
    }

}
