public class Diamond {
    public static void main(String[] args) {
        int n = 5;  // 高さ（半分）

        //　上半分
        for(int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //　下半分
        for(int i = n -1; i >= 1; i--) {
            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i -1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
