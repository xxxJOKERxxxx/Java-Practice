package graphsa_and_trees;

// Упрощённый граф (карта метро)
class Metro {
    // Массив: какие станции соединены
    static String[][] connections = {
            {"Тверская", "Пушкинская"},  // 1 линия
            {"Тверская", "Чеховская"},   // 2 линия
            {"Пушкинская", "Спортивная"} // 3 линия
    };

    public static void main(String[] args) {
        String start = "Тверская";
        String end = "Спортивная";

        // Проверяем все связи
        boolean found = false;
        for (int i = 0; i < connections.length; i++) {
            if (connections[i][0].equals(start) && connections[i][1].equals(end)) {
                found = true;
                break;
            }
            // Проверяем обратный путь (линия двусторонняя)
            if (connections[i][1].equals(start) && connections[i][0].equals(end)) {
                found = true;
                break;
            }
        }

        System.out.println("Путь от " + start + " до " + end + " существует? " + found);
    }
}
