public class InventoryMain {
    public static void main(String[] args) {
        inventory inv = new inventory();

        int add = 0;
        int remove = 0;
        add = Integer.parseInt(args[0]); // converts string input from command line to int
        remove = Integer.parseInt(args[1]);

        //System.out.print(remove); // test to check if correct values assigned.
        for (int i = 0; i < add; i++) {
            add a = new add();
            a.start();
            try {
                a.join(); // waits until death
            } catch (Exception e) {
                // TODO: handle exception   // is it bad that i put nothing here?????
            }
        }
        for (int x = 0; x < remove; x++) {
            remove r = new remove();
            r.start();
            try {
                r.join();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.print(inv.GetSizeOfInventory());
    }
}
