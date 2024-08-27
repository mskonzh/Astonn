// Класс "Парк" с внутренним классом "Аттракцион"
class Park {
    private String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    // Внутренний класс для аттракционов
    public class Attraction {
        private String attractionName;
        private String workingHours;
        private double cost;

        public Attraction(String attractionName, String workingHours, double cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printAttractionInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Часы работы: " + workingHours);
            System.out.println("Стоимость: " + cost);
        }
    }

    // Метод для создания аттракциона
    public Attraction createAttraction(String name, String hours, double cost) {
        return new Attraction(name, hours, cost);
    }
}
