package src.practice;
public class 성적평균구하기 {
    public static void main(String[] args) {
        MyPerson m1 = new MyPerson("김길동", 20, 90, 80, 70);
        m1.성적평균구하기();
        m1.성적표출력();

        MyPerson m2 = new MyPerson("박길동", 20, 100, 100, 90);
        m2.성적평균구하기();
        m2.성적표출력();

        MyPerson m3 = new MyPerson("홍길동", 22, 90, 80, 90);
        m3.성적평균구하기();
        m3.성적표출력();
    }
}