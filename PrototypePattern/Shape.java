public class Shape implements Clonable {

    // id 값으로 Shape 컨트롤 가능
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // clone: Object 클래스에 이미 정의되어 있는 메서드로, Clonale이 존재해야 사용 가능
    
}