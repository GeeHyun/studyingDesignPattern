public class LgGramBlueprint extends BluePrint {

    private Computer computer;

    public LgGramBlueprint() {
        computer = new Computer("default","default","default"); 
    }
    
    @Override
    public void setCpu() {
        // 각각 set에 복잡한 알고리즘 있다고 가정
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("8g");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256 ssd");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}