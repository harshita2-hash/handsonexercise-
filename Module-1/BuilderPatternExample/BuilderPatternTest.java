public class BuilderPatternTest {

    public static void main(String[] args) {

        // Gaming Computer
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM(32)
                .setStorage(1000)
                .setGraphicsCard("NVIDIA RTX 4090")
                .setOperatingSystem("Windows 11")
                .build();

        // Office Computer
        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM(16)
                .setStorage(512)
                .setOperatingSystem("Windows 10")
                .build();

        // Student Computer
        Computer studentPC = new Computer.Builder()
                .setCPU("AMD Ryzen 5")
                .setRAM(8)
                .setStorage(256)
                .setOperatingSystem("Ubuntu Linux")
                .build();

        gamingPC.display();
        officePC.display();
        studentPC.display();
    }
}