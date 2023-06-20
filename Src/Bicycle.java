public class Bicycle {
    private String model;
    private int mawWeight;

    public Bicycle(String model, int mawWeight) {
        this.model = model;
        this.mawWeight = mawWeight;
    }

    public void start() {
        System.out.println("Поїхали!");
    }

    public class HandleBar {

        private String model;

        public void right() {
            System.out.println("Кермо вправо!");
        }

        public void left() {

            System.out.println("Кермо вліво!");
        }

        public void stop(){
            System.out.printf("Мотоцикл %s зупинився ", Bicycle.this.model);
            System.out.println();
            System.out.printf("Мотоцикл %s зупинився ", HandleBar.this.model);
        }
    }
}
