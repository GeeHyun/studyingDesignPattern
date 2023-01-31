import pakage.DefaultGameConnectHelper;

public class Main {

    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();

        // protected를 제외한 requestConnection만 접근 가능
        helper.requestConnection("아이디 암호 등 접속 정보");
    }
    
}