public void Main {

    public static void main(String[] args) {

    ComputerFactory facory = new ComputerFactory(new LgGramBlueprint());
    
    factory.setBludeprint(new LgGramBlueprint());
    
    factory.make();
    Computer computer = factory.getComputer();
    
    System.out.pringln(computer.toString());
    }
    
}