public class inventory {

    private static int sizeOfInventory = 0;

    public synchronized static void addTo() {
        sizeOfInventory++;
        System.out.print("Added. Inventory Size = " + inventory.SizeOfInventory() + "\n");
    }

    public synchronized static void removeFrom() {
        sizeOfInventory--;
        System.out.print("Removed. Inventory Size = " + inventory.SizeOfInventory() + "\n");
    }

    public static int SizeOfInventory(){
        return sizeOfInventory;
    }
}
