
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        //[0,1] next dest would be [-1,2]. instead it will be [2,2] 
        //[2,2] next dest would be [1,3]. instead will be [1,0]
        //[0,2] next dest would be [-1,3]. instead it will be [2,0]
        int currVal = 1;
        int currX = Math.floorDiv(square.getWidth(), 2);
        int currY = 0;
        //first place value 1 in first row, center column
        square.placeValue(currX, currY, currVal);
        currVal++;
        //as long as we have a non-magical square, keep filling
        //could have probably used different break condition
        //since we know it will fill the entire square; hence once currVal == x * y, we can stop
        while (true) {
            //calculate next destination: currRow - 1, currCol + 1
            int nextX = currX + 1;
            int nextY = currY - 1;
            //if next destination is 'out of bounds' have to wrap back round
            //if row goes too 'high'/neg, add height to currRow
            if (nextY < 0) {
                nextY += square.getHeight();
            }
            //if col goes too far/OoB, subtract width from currCol
            if (nextX == square.getWidth()) {
                nextX -= square.getWidth();
            }
            //if readValue() does not return 0, we know its filled
            if (square.readValue(nextX, nextY) != 0) {
                nextX = currX;
                nextY = currY + 1;
            }
            square.placeValue(nextX, nextY, currVal);
            System.out.println("Value placed: " + currVal + " at [" + nextX + "," + nextY + "]");
            System.out.println(square.toString());
            //System.out.println("Row sum: " + square.sumsOfRows().toString());
            //System.out.println("Col sum: " + square.sumsOfColumns().toString());
            //System.out.println("Diag sum: " + square.sumsOfDiagonals().toString());
            //System.out.println("Same sums?" + square.sumsAreSame());
            if (square.sumsAreSame()) {
                break;
            }
            currVal++;
            currX = nextX;
            currY = nextY;
        }
        return square; 
    }

}
