public class PC {

    private final String cpu;
    private final String gpu;
    private final int ram;
    private final String storage;
    private final String powerSupply;

    public PC(String cpu, String gpu, int ram, String storage, String powerSupply) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
        this.powerSupply = powerSupply;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public int getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    @Override
    public String toString() {
        return "PC{" +
                "cpu:'" + cpu + '\'' +
                ", gpu:'" + gpu + '\'' +
                ", ram:" + ram +
                ", storage:'" + storage + '\'' +
                ", powerSupply:'" + powerSupply + '\'' +
                '}';
    }

    public static class PCBuilder {

        private String cpu;
        private String gpu;
        private int ram;
        private String storage;
        private String powerSupply;

        public PCBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public PCBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public PCBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public PCBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public PCBuilder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public PC build() {
            return new PC(cpu, gpu, ram, storage, powerSupply);
        }
    }
}
