package ClassStart1;

public class ClassStart3 {
    public static void main(String[] args) {
        //  설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스터스라고 한다. (studennt1,studennt2)
        Studennt studennt1 = new Studennt();    //1. studennt1 객체 생성(Studennt studennt1) 2. new Student()의 결과로 참조값 변환 3. 최종적으려 studennt1 = 참조값;
        studennt1.name = "학생1";     //클래스를 통해 생성한 객체를 사용하려면 메모리에 존재하는 객체에 접근한다. -> .을 사용해서 (.이라고하면 studennt1 변수가 가지고 있는 참조값을 통해 실제 객체에 접근하게 됨)
        studennt1.age = 15;
        studennt1.grade = 90;

        Studennt studennt2 = new Studennt();
        studennt2.name = "학생2";
        studennt2.age = 16;
        studennt2.grade= 80;

        //근데 요기 출력하는 부분을 보면 학생이 추가할때마다 여기도 그대로 추가해줘야하잖아!-> 배열을 사용해볼까나
        System.out.println("이름: " + studennt1.name + "나이: "+ studennt1.age + "성적: "+ studennt1.grade);
        System.out.println("이름: " + studennt2.name + "나이: "+ studennt2.age + "성적: "+ studennt2.grade);

        //🤔 클래스는 객체를 생성하기 위한 '틀', '설계도'이다. 클래스는 객체가 가져야 할 속성(변수)과 기능(메서드)를 정의한다.
        //  -> 예를 들어 학생이라는 클래스는 속성으로 name,age,grade를 가진다.
        //  -> 붕어빵 틀은 붕어빵이 아니잖아! 실제 먹을 수 있는 팥 붕어빵을 객체 또는 인스턴스라고 한다.

    }

}
