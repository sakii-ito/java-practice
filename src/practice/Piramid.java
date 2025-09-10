public class Piramid {
    public static void main(String[] args) {
        int n = 5;  // 行数（高さ）

        for (int i = 1; i <= n; i++) {
            // 左側のスペース（右寄せ用）
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // "*" の部分
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();  // 改行
        }
    }
}
