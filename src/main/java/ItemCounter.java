public class ItemCounter implements Item{
    public int id;

    public static int leftInStockroom=0;
    public String status;
    public int numberOfShelf;
    public boolean requiresFridge;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumberOfShelf() {
        return numberOfShelf;
    }

    public void setNumberOfShelf(int numberOfShelf) {
        this.numberOfShelf = numberOfShelf;
    }

    public boolean isRequiresFridge() {
        return requiresFridge;
    }

    public void setRequiresFridge(boolean requiresFridge) {
        this.requiresFridge = requiresFridge;
    }


    public int getLeftInStockroom() {
        return leftInStockroom;
    }

    public void setLeftInStockroom(int leftInStockroom) {
        this.leftInStockroom = leftInStockroom;
    }

    public void addToStock() {
        leftInStockroom ++;
        System.out.println(leftInStockroom);
    }

    @Override
    public void prepareForSale() {
        leftInStockroom --;
        System.out.println(leftInStockroom);
    }

    public ItemCounter(int id) {
        this.id = id;
    }
}
