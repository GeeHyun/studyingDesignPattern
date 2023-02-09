public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Cat navi = new Cat();
        navi.setName("navi");
        navi.setAge(new Age(2019, 3));

        Cat yo = navi;    // navi의 주소값을 yo가 그대로 복사해서 가져감 (얕은 복사)
        yo.setName("yo");

        // navi의 주소값이 아니라, navi가 가지고 있는 값들을 복사 (깊은 복사)
        Cat yumi = navi.copy()
        yumi.setName("yumi");
        yumi.getAge().setYear(2010);
        yumi.getAge().setValue(12);

        System.out.println(navi.getName());    // yo
        System.out.println(yo.getName());    // yo
        System.out.println(yumi.getName());    // yumi

        // 이름과 달리 깊은 복사가 이루어지지 않음
        // 
        System.out.println(navi.getAge().getYear());    // 명시적 표현 전: 2010, 후: 2019
        System.out.println(yumi.getAge().getYear());    // 2010
    }
}