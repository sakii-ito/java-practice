public class ReversePyramid {
    public static void main(String[] args) {
        int n =5;   // 行数

        for(int i = n; i >= 1; i--) {
            //　左側のスペース
            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // 星の部分
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            //　改行
            System.out.println();
        }
    }
}
