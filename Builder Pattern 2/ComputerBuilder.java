public class ComputerBuilder {

    private Computer computer;
    private ComputerBuilder() {
        computer new Computer("default", "default", "default")
    }

    public static ComputerBuilder start() {        
        return new ComputerBuilder();
        // default가 들어가기 때문에 Main에서 반드시 Storage를 지정해줄 필요가 없음
    }

    public static ComputerBuilder startWithCpu(String cpu) {
        ComputerBuilder builder = new ComputerBuilder();
        builder.computer.setCpu(cpu);
        return builder;
    }
    
    public static ComputerBuilder setCpu(String string) {
        computer.setCpu(string);
        return this;
    }   

    public static ComputerBuilder setRam(String string) {
        computer.setRam(string);
        return this;
    }

    public static ComputerBuilder setStorage(String string) {
        computer.setStorage(string);
        return this;
    }
    
    public Computer build() {
        return this.computer;
    }
    
}