package app.Komputer;

public class App {
    public static abstract class Device {
        protected boolean state;
        protected String producedBy;

        public Device(String producedBy) {
            if (producedBy == null) {
                this.producedBy = "Not define";
            } else {
                this.producedBy = producedBy;
            }
        }

        public String toString() {
            return "State: " + state + ". Produced by " + producedBy;
        }
    }

    public static class Memory extends Device {
        protected int size;
        protected int type;

        public Memory(String producedBy, int size, int type) {
            super(producedBy);

            this.size = size;
            this.type = type;
        }

        public String toString() {
            return super.toString() + ". Size: " + size + ". Type: " + type;
        }

        public int getSize() {
            return size;
        }

        public int getType() {
            return type;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public void setType(int type) {
            this.type = type;
        }
    }

    public static class RAM extends Memory {
        public RAM(String producedBy, int size, int type) {
            super(producedBy, size, type);
        }
    }

    public static class HDD extends Memory {
        public HDD(String producedBy, int size, int type) {
            super(producedBy, size, type);
        }

    }

    public static class SystemBlock extends Device {
        public SystemBlock(String producedBy) {
            super(producedBy);
        }

        public String toString() {
            return super.toString() + ". Hdd" + hdd + ". Ram" + ram;
        }

        private HDD hdd;
        private RAM ram;

        public RAM getRam() {
            return ram;
        }

        public void setRam(RAM ram) {
            this.ram = ram;
        }

        public HDD getHdd() {
            return hdd;
        }

        public void setHdd(HDD Disc) {
            hdd = Disc;
        }
    }


    public static class InputDevice extends Device {
        public InputDevice(String producedBy, String name, String type) {
            super(producedBy);
            this.name = name;
            this.type = type;
        }

        public String toString() {
            return super.toString() + ". Name" + name + ".Type" + type;
        }

        protected String name;
        protected String type;

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Mousse extends InputDevice {
        public Mousse(String producedBy, String name, String type) {
            super(producedBy, name, type);
        }
    }

    public static class Keyboard extends InputDevice {
        public Keyboard(String producedBy, String name, String type) {
            super(producedBy, name, type);
        }
    }

    public static class Monitor extends Device {
        private int size;
        private String typeOfMatrix;

        public Monitor(String producedBy, int size, String typeOfMatrix) {
            super(producedBy);
            this.size = size;
            this.typeOfMatrix = typeOfMatrix;
            this.producedBy = producedBy;
            this.state = false;
        }
        public String toString(){
            return super.toString() +". TypeOFMatrix"+typeOfMatrix;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getTypeOfMatrix() {
            return typeOfMatrix;
        }

        public void setTypeOfMatrix(String typeOfMatrix) {
            this.typeOfMatrix = typeOfMatrix;
        }
    }

    public static class Computer extends Device {
        public Computer(String producedBy) {
            super(producedBy);
        }

        private Monitor monitor;
        protected Mousse mousse;
        protected Keyboard keyboard;
        protected SystemBlock systemBlock;

        public Keyboard getKeyboard() {
            return keyboard;
        }

        public Monitor getMonitor() {
            return monitor;
        }

        public void setMonitor(Monitor monitor) {
            this.monitor = monitor;
        }

        public Mousse getMousse() {
            return mousse;
        }

        public void setMousse(Mousse mousse) {
            this.mousse = mousse;
        }

        public void setKeyboard(Keyboard keyboard) {
            this.keyboard = keyboard;
        }

        public SystemBlock getSystemBlock() {
            return systemBlock;
        }

        public void setSystemBlock(SystemBlock systemBlock) {
            this.systemBlock = systemBlock;
        }

        @Override
        public String toString() {
            String result = "";

            if (monitor != null) {
                result = result + "monitor";
            }

            if (systemBlock != null) {
                result = result + "systemblock";
            }

            if (keyboard != null) {
                result = result + "keyboard";
            }

            if (mousse != null) {
                result = result + "mouse";
            }

            return result;
        }

    }

    public static void main(String[] args) {
        BlackMonster monster = new BlackMonster();
        
        System.out.print(monster);
        
//        Computer computer = new Computer("string");
//
//        Monitor monitor = new Monitor("vova", 78, "rout");
//
//        SystemBlock systemBlock = new SystemBlock("vova");
//        computer.setSystemBlock(systemBlock);
//        computer.setMonitor(monitor);
//
//        print(computer);
//        Memory memory = new Memory("vova", 12, 12);
//        print(memory);
    }

    public static void print(Device object) {
        System.out.println(object.toString());
    }
}
