
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> sums = new ArrayList<>();
        for (int r = 0; r < this.square.length; r++) {
            int sum = 0;
            for (int c = 0; c < this.square[r].length; c++) {
                sum += this.square[r][c];
            }
            sums.add(sum);
        }
        return sums;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> sums = new ArrayList<>();
        for (int c = 0; c < this.square[0].length; c++) {
            int sum = 0;
            for (int r = 0; r < this.square.length; r++) {
                sum += this.square[r][c];
            }
            sums.add(sum);
        }
        return sums;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> diagSums = new ArrayList<>();
        //length 3: [0,0], [1,1], [2,2] && [0,2], [1,1], [2,0]
        //length 2: [0,1], [1,0] && [0,0], [1,1]
        //get left first? or can do both at the same time?
        int sumLeft = 0;
        int sumRight = 0;
        for (int c = 0; c < this.getHeight(); c++) {
            sumLeft += this.square[c][c];
        }
        int tempR = 0;
        for (int c = this.getHeight() - 1; c >= 0; c--) {
            sumRight += this.square[tempR][c];
            tempR++;
        }
        diagSums.add(sumLeft);
        diagSums.add(sumRight);
        return diagSums;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            System.out.println("Failed size check");
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            int first = sums.get(i - 1);
            int second = sums.get(i);
            if (first != second) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
