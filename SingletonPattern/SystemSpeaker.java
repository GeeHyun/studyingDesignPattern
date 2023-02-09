public class SystemSpeaker {

    // 외부에서 접근 불가능하고 모든 객체에서 공유되는 변수
    static private SytemSpeaker instance;
    private int volume;

    // 외부에서 생성함수를 호출할 수 없게 함
    private SystemSpeaker() {
        volume = 5;
    }


    // 객체 생성 없이 접근 가능한 함수
    public static SystemSpeaker getInstance() {
        if (instance == null) {
            // 시스템 스피커
            instance = new SystemSpeaker();
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}