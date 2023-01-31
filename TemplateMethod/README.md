- Template Method
    - 알고리즘의 구조를 메소드에 정의하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의하는 패턴
    - 구현하려는 알고리즘이
        - 일정한 프로세스가 있다 = 여러 단계로 나눌 수 있다.
        - 변경 가능성이 있다
    - 순서
        - 1. 알고리즘을 여러 단계로 나눈다.
          2. 나눠진 알고리즘의 단계를 메소드로 선언한다.
          3. 알고리즘을 수행할 템플릿 메소드를 만든다.
          4. 하위 클래스에서 나눠진 메소드들을 구현한다.

- 예제
    - 신작 게임의 접속을 구현해주세요.
        - requestConnection(String str): String
    - 유저가 게임 접속시 다음을 고려해야 합니다.
        - 보안 과정: 보안 관련 부분을 처리합니다.
            - doSecurity(String string): String
        - 인증 과정: user name과 password가 일치하는지 확인합니다.
            - authentication(String userName): int
        - 접속 과정: 접속자에게 커넥션 정보를 넘겨줍니다.
            - connection(String info): String

- 유지보수 시 하위 클래스 수정하면 템플릿(알고리즘 구조) 변경 없이 알고리즘 재정의 가능