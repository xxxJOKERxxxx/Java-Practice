package graphsa_and_trees;

// ========== ЧАСТЬ 1: Создаём узел дерева ==========
// Узел — это одна "клеточка" дерева (папка или файл)
class TreeNode {

    // Что хранит узел:
    // 1. название (имя папки или файла)
    String name;

    // 2. ссылки на "детей" (то, что внутри папки)
    // У папки может быть много детей. У файла — ноль.
    TreeNode[] children;

    // Сколько детей у этого узла прямо сейчас
    int childrenCount;

    // Конструктор — вызывается, когда создаём новый узел
    TreeNode(String name, int maxChildren) {
        // Запоминаем имя
        this.name = name;

        // Создаём массив для детей (максимум maxChildren штук)
        // Например, папка может содержать до 10 вложенных элементов
        this.children = new TreeNode[maxChildren];

        // Пока детей нет
        this.childrenCount = 0;
    }

    // Метод для добавления ребёнка (вложенного элемента)
    void addChild(TreeNode child) {
        // Кладём нового ребёнка в конец массива детей
        children[childrenCount] = child;
        // Увеличиваем счётчик детей на 1
        childrenCount++;
    }
}

// ========== ЧАСТЬ 2: Поиск глубины (рекурсия) ==========
public class Trees {

    // Метод для поиска узла по имени и подсчёта глубины
    // depthFromRoot — это "сколько уже прошли папок"
    static int findDepth(TreeNode node, String targetName, int depthFromRoot) {

        // ОТЛАДКА: выводим, куда зашли (для понимания)
        System.out.println("Смотрю: " + node.name + " на глубине " + depthFromRoot);

        // БАЗОВЫЙ СЛУЧАЙ 1: если нашли нужный элемент
        if (node.name.equals(targetName)) {
            System.out.println("  -> НАШЁЛ " + targetName + "!");
            return depthFromRoot;  // возвращаем текущую глубину
        }

        // БАЗОВЫЙ СЛУЧАЙ 2: если нет детей — выходим (файл без вложений)
        if (node.childrenCount == 0) {
            System.out.println("  -> у " + node.name + " нет детей, идём назад");
            return -1;  // -1 означает "не нашли"
        }

        // РЕКУРСИВНЫЙ СЛУЧАЙ: проверяем всех детей
        // Проходим по каждому ребёнку
        for (int i = 0; i < node.childrenCount; i++) {
            // Забираем ребёнка из массива
            TreeNode child = node.children[i];

            // Вызываем САМИ СЕБЯ для проверки этого ребёнка
            // Глубину увеличиваем на 1 (спустились на уровень ниже)
            int result = findDepth(child, targetName, depthFromRoot + 1);

            // Если result != -1, значит, мы нашли (результат вернулся)
            if (result != -1) {
                return result;  // передаём результат наверх
            }
        }

        // Ни в одном из детей не нашли
        return -1;
    }

    // ========== ЧАСТЬ 3: Создаём дерево (папки на компьютере) ==========
    public static void main(String[] args) {

        // УРОВЕНЬ 0 (КОРЕНЬ): Диск C:
        TreeNode root = new TreeNode("C:", 3);

        // УРОВЕНЬ 1: Папки внутри C:
        TreeNode documents = new TreeNode("Мои документы", 3);
        TreeNode photos = new TreeNode("Фото", 2);
        TreeNode downloads = new TreeNode("Загрузки", 1);

        // Привязываем их к корню
        root.addChild(documents);
        root.addChild(photos);
        root.addChild(downloads);

        // УРОВЕНЬ 2: Внутри "Мои документы"
        TreeNode work = new TreeNode("Работа", 1);
        TreeNode personal = new TreeNode("Личное", 1);
        documents.addChild(work);
        documents.addChild(personal);

        // УРОВЕНЬ 3: Внутри "Работа"
        TreeNode report = new TreeNode("отчёт.txt", 0);  // файл, нет детей
        work.addChild(report);

        // УРОВЕНЬ 2: Внутри "Фото"
        TreeNode vacation = new TreeNode("Отпуск", 1);
        TreeNode family = new TreeNode("Семья", 1);
        photos.addChild(vacation);
        photos.addChild(family);

        // УРОВЕНЬ 3: Внутри "Отпуск"
        TreeNode beach = new TreeNode("пляж.jpg", 0);  // файл
        vacation.addChild(beach);

        // ========== ЧАСТЬ 4: Ищем файл и его глубину ==========
        System.out.println("=== Поиск файла 'пляж.jpg' ===\n");
        int depth = findDepth(root, "пляж.jpg", 0);

        System.out.println("\n=== РЕЗУЛЬТАТ ===");
        if (depth != -1) {
            System.out.println("Файл 'пляж.jpg' найден на глубине: " + depth);
            // Глубина 3 означает: C: → Фото → Отпуск → пляж.jpg
        } else {
            System.out.println("Файл не найден");
        }
    }
}
