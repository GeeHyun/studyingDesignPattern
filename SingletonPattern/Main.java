public class Main {
    public static void main(String[] args) {
        // 불가능
        // SystemSpeaker speaker = new SystemSpeaker();

        // speaker1과 speaker2는 동일한 객체
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        speaker1.setVolume(11);
        
        // 동일한 인스턴스(같은 주소값)이기 때문에 둘 다 11 출력
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());        
    }
}