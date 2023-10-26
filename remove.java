public class remove extends Thread{
    
    public synchronized void run(){
        inventory.removeFrom();
        System.out.print("Removed. Inventory Size = " & inventory.GetSizeOfInventory());
    }
}
