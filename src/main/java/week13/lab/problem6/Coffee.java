package week13.lab.problem6;

public class Coffee {
    private String type;
    private CoffeeSize size;
    // optional
    private String[] toppings;

    public Coffee(CoffeeBuilder builder) {
        this.type = builder.getType();
        this.size = builder.getSize();
        this.toppings = builder.getToppings();
    }

    public String getType() {
        return type;
    }


    public CoffeeSize getSize() {
        return size;
    }

    public String[] getToppings() {
        return toppings;
    }

    public static class EspressoBuilder implements CoffeeBuilder {
        private String type;
        private CoffeeSize size;
        private String[] toppings;


        public EspressoBuilder(CoffeeSize size) {
            this.type = "Espresso";
            this.size = size;
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public CoffeeSize getSize() {
            return this.size;
        }

        @Override
        public String[] getToppings() {
            return this.toppings;
        }

        @Override
        public CoffeeBuilder buildToppings(String[] toppings) {
            this.toppings = toppings;
            return this;
        }
    }

    public static class LatteBuilder implements CoffeeBuilder {
        private String type;
        private CoffeeSize size;
        private String[] toppings;


        public LatteBuilder(CoffeeSize size) {
            this.type = "Latte";
            this.size = size;
        }


        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public CoffeeSize getSize() {
            return this.size;
        }

        @Override
        public String[] getToppings() {
            return this.toppings;
        }

        @Override
        public CoffeeBuilder buildToppings(String[] toppings) {
            this.toppings = toppings;
            return this;
        }
    }

    public static class CapuccinoBuilder implements CoffeeBuilder {
        private String type;
        private CoffeeSize size;
        private String[] toppings;


        public CapuccinoBuilder(CoffeeSize size) {
            this.type = "Capuccino";
            this.size = size;
        }


        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public CoffeeSize getSize() {
            return this.size;
        }

        @Override
        public String[] getToppings() {
            return this.toppings;
        }

        @Override
        public CoffeeBuilder buildToppings(String[] toppings) {
            this.toppings = toppings;
            return this;
        }
    }


}
