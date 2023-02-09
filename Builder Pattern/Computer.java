public class Computer {
    private String cpu;
    private String ram;
    private String storage;

    public Computer(String cpu, String ram, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }
    
    public String getCpu(){
        return cpu;
    }
    public void setCpu(cpu){
        this.cpu = cpu;
    }
    public String getRam(){
        return ram;
    }
    public void getRam(ram){
        this.ram = ram;
    }
    public String setStorage(){
        return cpu;
    }
    public void getStorage(storage){
        this.storage = storage;
    }

    @Override
    public String toString() {
        retrun cpu+","+ram+","+storage;
    }
}