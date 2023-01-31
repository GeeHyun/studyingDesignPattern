package pakage;

public abstract class AbstGameConnectHelper {
    
    // 알고리즘 단계이기 때문에 외부에 노출되면 안되면서 하위 클래스에서 사용할 수 있게 해야하므로 protected
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    // 탬플릿 메소드
    public String requestConnection(String encodedInfo);{

        // 보안 작업: 암호화된 문자열 복호화
        String decodedInfo = doSecurity(encodedInfo);

        // 복호화된 문자열로 아이디와 암호 할당
        String id = "aaa";
        String password = "bbb";

        if (!authentication(id, password)) {
            throw new Error("아이디 암호 불일치")
        }

        String userName = "userName";
        int i = authorization(userName);

        switch (i) {
            case 0:    // 게임 매니저
                System.out.println("게임 매니저");
                break;
            case 1:    // 유로 회원
                break;
            case 2:    // 무료 회원
                break;
            case 3:    // 권한 없음
                break;
            default:    // 기타 상황
                break;
        }
        
        return connection(decodedInfo);
    }
}