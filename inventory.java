public class inventory {

    private static int sizeOfInventory = 0;

    public synchronized static void addTo() {
        sizeOfInventory++;
    }

    public synchronized static void removeFrom() {
        sizeOfInventory--;
    }

    public int GetSizeOfInventory(){
        return sizeOfInventory;
    }
}
