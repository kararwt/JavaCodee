package random;/*
 * k0r02ds
 * created on 21/01/21
 */


public class FinalizeWorld {
    static FinalizeWorld world1;

    public static void main(String[] args) throws InterruptedException {
        FinalizeWorld world2 = new FinalizeWorld();
        System.out.println(world2.hashCode());
        world2 = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(world1.hashCode());
        world1 = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println("End of main method");
    }

    public void finalize() {
        System.out.println("Finalize method called");
    }
}
