// 抽象クラス Animal を定義
abstract class Animal {
    // 抽象メソッド → 処理内容を持たない
    // サブクラスが必ずオーバーライドしなければならない
    abstract public void cry();
}

// Cat クラス → Animal を継承
class Cat extends Animal {
    // cry() をオーバーライドして「ニャー」と出力
    public void cry() {
        System.out.println("야옹");
    }
}

// Dog クラス → Animal を継承
class Dog extends Animal {
    // cry() をオーバーライドして「ワンワン」と出力
    public void cry() {
        System.out.println("멍멍");
    }
}

// Pig クラス → Animal を継承
class Pig extends Animal {
    public void cry() {
        System.out.println("꿀꿀");
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        // 直接 Cat, Dog, Pig のオブジェクトを生成して cry() を呼ぶ
        Cat c = new Cat();  // → "야옹"

        Dog d = new Dog();  // → "멍멍"

        Pig p = new Pig();  // → "꿀꿀"

        // 多態性の例：Animal 型の配列に各サブクラスを代入
        Animal[] a = new Animal[3];
        a[0] = c;  // Animal a = new Cat();
        a[1] = d;  // Animal a = new Dog();
        a[2] = p;  // Animal a = new Pig();

         // Animal 型で呼んでも、実際の中身のクラスの cry() が実行される
        a[0].cry();  // → "야옹"
        a[1].cry();  // → "멍멍"
        a[2].cry();  // → "꿀꿀"
    }
}