package ClassStart1;
public class ClassStart4 {
    public static void main(String[] args) {
        Studennt studennt1 = new Studennt();
        studennt1.name = "학생1";
        studennt1.age = 15;
        studennt1.grade = 90;

        Studennt studennt2 = new Studennt();
        studennt2.name = "학생2";
        studennt2.age = 16;
        studennt2.grade= 80;

        Studennt[] students = new Studennt[2];      //Studennt 변수를 2개 보관되는 사이즈 2인 배열 생성
        students[0] = studennt1;    //Studennt 배열 각각의 항목도 Studennt 타입의 변수일 뿐이다.
        students[1] = studennt2;    // students[1] = 참조값; -> 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다! (studennt1,studennt2에는 참조값이 보관되어 있으니까)
        //⭐변수에는 인스턴스 자체가 들어있는 것이 아니다! 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐이다! 따라서 대입(=)시 인스턴스가 복사되는 것이 아니라 참조값만 복사된다

        System.out.println("이름: " + students[0].name + "나이: "+ students[0].age + "성적: "+ students[0].grade);
        System.out.println("이름: " + students[1].name + "나이: "+ students[1].age + "성적: "+ students[1].grade);
    }
}
