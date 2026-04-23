package graphsa_and_trees;

// Узел дерева (человек)
class PersonTree {
    String name;
    PersonTree parent;  // ссылка на родителя

    PersonTree(String name, PersonTree parent) {
        this.name = name;
        this.parent = parent;
    }
}

public class FamilyTree {
    public static void main(String[] args) {
        // Строим древо: Я → Папа → Дедушка
        PersonTree grandpa = new PersonTree("Дедушка", null);
        PersonTree dad = new PersonTree("Папа", grandpa);
        PersonTree me = new PersonTree("Я", dad);

        // Ищу дедушку
        PersonTree current = me;
        int level = 0;
        while (current.parent != null) {  // пока есть родитель
            current = current.parent;
            level++;
        }

        System.out.println("Мой " + (level == 2 ? "дедушка" : "предок") + ": " + current.name);
    }
}
