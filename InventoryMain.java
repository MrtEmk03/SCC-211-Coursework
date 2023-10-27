public class InventoryMain {
    public static void main(String[] args) {
        inventory inv = new inventory();

        int add = 0;
        int remove = 0;
        add = Integer.parseInt(args[0]); // converts string input from command line to int
        remove = Integer.parseInt(args[1]);

        Thread[] arrayOfAddThreads = new Thread[add];
        Thread[] arrayOfRemoveThreads = new Thread[remove];
        // System.out.print(remove); // test to check if correct values assigned.
        for (int i = 0; i < add; i++) {
            add a = new add();
            a.start();
            arrayOfAddThreads[i] = a;
        }
        for (int x = 0; x < remove; x++) {
            remove r = new remove();
            r.start();
            arrayOfRemoveThreads[x] = r;
        }


        for (Thread thread : arrayOfAddThreads) {
            try {
            thread.join(); // waits until death
        } catch (Exception e) {
            System.out.println("error with a join");
        }
        }
        
        for (Thread thread : arrayOfRemoveThreads) {
            try {
            thread.join(); // waits until death
        } catch (Exception e) {
            System.out.println("error with r join");
        }
        }

        System.out.print("Final inventory size = " + inventory.SizeOfInventory() + "\n");
    }
}
