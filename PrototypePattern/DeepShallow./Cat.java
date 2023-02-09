public class Cat implements Clonable {

    private String name;
    private Age age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }
    
    public Cat copy() throws CloneNotSupportedException {
        
        Cat ret = (Cat) this.clone();
        
        // 깊은 복사가 되지 않는 부분에 대해 명시적으로 깊은 복사를 해준다.
        ret.setAge(new Age(this.age.getYear(), this.age.getValue()));
        
        return ret;
    }
}