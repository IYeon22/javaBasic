package ClassStart1;

public class ClassStart1 {
    public static void main(String[] args) {
        String studenet1Name = "학생1";
        int Student1Age = 15;
        int Student1Grade = 90;

        String studenet2Name = "학생2";
        int studenet2Age = 16;
        int studenet2Grade = 80;

        System.out.println("이름: " + studenet1Name + "나이: "+ Student1Age + "성적: "+ Student1Grade);
        System.out.println("이름: " + studenet2Name + "나이: "+ studenet2Age + "성적: "+ studenet2Grade);

        //이 코드의 문제는 학생이 늘어날때마다 변수를 추가로 선언해야하고 또 출력하는 코드도 추가해야한다!
    }
}
