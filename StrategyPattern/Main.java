public class Main {
    public static void main(String[] args) {
        Ainterface ainterface = new AinterfaceImpl();

        // funcA를 사용할 수 있는 통로의 역할
        ainterface.funcA();

        AObj aObj = new AObj();
        aObj.funcAA();

        // strategy pattern
        GameCharacter character = new GameCharacter();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();
    }
}