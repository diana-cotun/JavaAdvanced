package InnerClass;

public class Car {
    private String brend;
    private String type;

    private Engine engine;

    public Car(String brend, String type) {
        this.brend = brend;
        this.type = type;
        this.engine = new Engine();
        engine.setEngineType();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine +
                '}';
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    class Engine {
        private String engineType;

        public void setEngineType() {
            if ("economy".equals(type)) {
                engineType = "disel";
            } else  if ("luxury".equals(type)) {
                engineType = "electric";
            } else {
                engineType = "petrol";
            }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
    }
}
