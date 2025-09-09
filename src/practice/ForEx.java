// 다음과 같이 "*"를 사용하여 삼각형 모양에 결과를 가질 수 있도록
// For문을 사용하여 코딩하시오
//*
//**
//***
//****
//*****

public class ForEx {
    // printC メソッド: 文字 c を x 回出力する関数（再帰を使用）
    public void printC(char c, int x) {
        System.out.print(c);    // 文字を1つ出力
        if (x > 1) {            // まだ残り回数があるなら
            printC(c, x-1);     // 自分自身を呼び出して、残りを出力
        }
    }
    public static void main(String[] args) {
        ForEx f = new ForEx();  // ForEx クラスのオブジェクトを作成

        // テスト: '*' を3回出力 → 結果: ***
        f.printC('*', 3);
        System.out.println();    // 改行
        
        // 1 から 9 まで繰り返し
        // j の値によって "*" の数が増えていく
        for(int j = 1; j < 10; j++) {
            f.printC('*', j);        // j 個の "*" を出力
            System.out.println();      // 改行
        }


    }
}