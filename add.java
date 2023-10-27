public class add extends Thread {

    public synchronized void run(){
        inventory.addTo();
        System.out.print("Added. Inventory Size = " + inventory.SizeOfInventory() + "\n");
       
    }



}
