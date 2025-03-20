public class Main{
    public static void main(String[] args){
        System.out.println(Data.MAX);
        Data d = new Data(7, 5);
        d.repopulate();
        System.out.println(d);

        int[][] grid = {{10, 50, 40}, {20,40,20}, {30,50,30}};
        d = new Data(grid);

        int[][] grid2 = { {10,540,440,440},{220, 450,440,190}};
        d = new Data(grid2);
        System.out.println(d.countIncreasingCols());
    }
}