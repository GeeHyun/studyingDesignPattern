public class AObj {

    Ainterface ainterface;

    public AObj() {
        ainterface = new AinterfaceImpl();
    }
    
    public void funcAA() {

        // System.out.println("AAA");

        // 델리게이트: 어떤 기능을 구현할 때 그 책임을 다른 객체에 떠넘김 (다른 객체의 기능을 사용)
        ainterface.funcA();
    
    }
}