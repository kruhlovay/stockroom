public class Shoes extends ItemCounter{
    public Shoes(int id) {
        super(id);
    }
    int size;
    String type;
    String season;
    String colour;
    String gender;

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String getSeason() {
        return season;
    }

    public String getColour() {
        return colour;
    }

    public String getGender() {
        return gender;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void generateDescription(){
        System.out.println("Your shoes are "+type);
        System.out.println("Your size is "+size);
        System.out.println("The season of shoes is "+season);
        System.out.println("The shoes are for" + gender);
    }
}
