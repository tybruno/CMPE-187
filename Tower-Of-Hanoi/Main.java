/**
 * This tests the towers of hanoi class
 *
 */
public class Main {

    public static void main(String[] args) {
        final int DISCS = 3;

        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();

        towerOfHanoi.solve( "X", "Y", "Z", DISCS);

    }

}


