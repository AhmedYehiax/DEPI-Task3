public class Main {
    public static void main(String[] args) {
        PC pc = new PC.PCBuilder()
        .setCpu("Intel Core i7-12700K")
        .setGpu("NVIDIA GeForce RTX 3080")
        .setRam(32)
        .setStorage("1TB SSD")
        .setPowerSupply("850W")
        .build();
        System.out.println(pc);
    }
}
