/**
 * Triangle
 *
 * @author Tyler Bruno (tybruno117@gmail.com)
 */
public class Triangle {

    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        /**
         * @param side1 Length of the side1 line
         * @param side2 length of the side2 line
         * @param side3 length of the side3 line
         */
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void getValues() {
        /**
         * Prints the values for side1, side2, side3
         *
         * @return print out the values for side1, side2, side3
         */
        System.out.println("X: " + side1);
        System.out.println("X: " + side2);
        System.out.println("X: " + side3);

    }

    public boolean checkEquilateral() {
        /**
         * checks if the side1, side2 ,side3 lines for a equilateral triangle.
         *
         * Equilateral triangle is defined as a triangle with sides that all have the same length
         *
         * @return true if equilateral trianlge.
         */

        //Check for valid input
        if (checkInput(side1, side2, side3) == false) {
            return false;

        }

        //if side1 implies side2 then side2 implies side3
        if (side1 == side2 && side2 == side3) {
            return true;
        }
        return false;

    }

    public boolean checkIsosceles() {
        /**
         * Checks if the side1, side2, side3 lines form a isoscelese triangle
         *
         * Isosceles triangle is defined as two sides are the same length. The third side is smaller than the two sides
         *
         * @return true if isosceles triangle
         */
        //Check for valid input
        if (checkInput(side1, side2, side3) == false) {
            return false;

        }

        //check if 2 sides are equal
        if (side1 == side2) {
            if (side1 > side3)//check if the third side is less than the other 2 sides
            {
                return true;
            }
        }

        //check if 2 sides are equal
        if (side2 == side3) {
            if (side2 > side3)//check if the third side is less than the other 2 sides
            {
                return true;
            }

        }
        //check if 2 sides are equal
        if (side1 == side3) {
            if (side1 > side2)//check if the third side is less than the other 2 sides
            {
                return true;
            }
        }

        return false;

    }

    public boolean checkScalene() {
        /**
         * Checks if side1, side2, side3 form a scalene triangle
         *
         * Scalene triangle is defined as each side is of different length
         *
         * @return true if scalene triangle
         */

        //Check for valid input
        if (checkInput(side1, side2, side3) == false) {
            return false;

        }


        //Check that all sides are not equal
        if (side1 != side2 && side2 != side3) {
            return true;
        }
        return false;
    }

    public boolean checkInput(int side1, int side2, int side3) {
        /**
         * Check that the side1, side2 , side3 values are valid (greater than 0)
         *
         * #return true if the input is valid.
         */

        //Check invalid input
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return false;
        }

        return true;


    }

}