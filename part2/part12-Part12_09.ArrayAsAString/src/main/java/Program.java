public class Program {

    public static void main(String[] args) {
        // Test your method here
    }
    
    public static String arrayAsString(int[][] array) {
        StringBuilder stringArray = new StringBuilder();
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                stringArray.append(array[r][c]);
            }
            stringArray.append("\n");
        }
        return stringArray.toString();
    }

}
