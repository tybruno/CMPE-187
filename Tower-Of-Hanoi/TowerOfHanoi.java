public class TowerOfHanoi {

    public static void solve(String pole1, String pole2, String pole3, int numberOfDisks) {
        /**
         * Solves the towers of Hanoi.
         *
         * @param pole1 first pole
         * @param pole2 second pole
         * @param pole3 third pole
         * @param numberOfDisks number of disks that will be sovled.
         */

        if(numberOfDisks > 1)
        {
            solve(pole1, pole3, pole2, --numberOfDisks);
            print("Disc: " +numberOfDisks + " From "+ pole1 + " to " + pole3);
            solve(pole2,pole1,pole3, --numberOfDisks);
        }
        else // end condition if number of disks is less than or equal to one numberOfDisks <= 1
        {
            print("Disc:" +numberOfDisks + " From "+ pole1 + " to " + pole3);
        }
    }

    public static void print(Object message) {
        /**
         * reduces the amount of typing to print a message
         *
         * @param message that will be printed to screen.
         */
        System.out.println(message);
    }


}
