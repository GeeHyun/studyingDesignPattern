public class Main {
    public static void main(String[] args) {
        
        // 실수 가능성 있음, document를 하나하나 참고해야됨
        // Computer computer = new Computer(cpu, ram, storage);
        
        Computer computer = ComputerBuilder
            // .startWithCpu("i7");
            .start()
            .setCpu("i7")
            .setRam("8g")
            // .setStorage("256g ssd")
            .build();
    }
}