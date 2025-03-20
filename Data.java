public class Data{
    public static final int MAX = (int) (Math.random() * Integer.MAX_VALUE);
    private int[][] grid;
    public Data(int[][] arr){
        grid = arr;
    }
    public Data(int rows, int columns){
        grid = new int[rows][columns];
    }
    public String toString(){
        String s = "";
        for (int[] row : grid){
            for (int col: row){
                s+= col + " ";
            }
            s+= "\n";
        }
        return s;
    }
    public void repopulate(){
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                int num = (int) (Math.random() * MAX) + 1;
                while (num % 10 == 0|| num % 100 != 0){
                    num = (int) (Math.random() * MAX) + 1;
                }
                grid[i][j] = num;
            }
        }
    }
    public int countIncreasingCols(){
        int count = 0;
        for (int col = 0; col < grid[0].length; col++){
            int increasing = 1;
            for (int row = 1; row < grid.length; row++){
                if (grid[row][col] >= grid[row-1][col]) increasing++;
                if (increasing == grid.length) count++;
            }
        }
        return count;
    }
}