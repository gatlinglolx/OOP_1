import java.util.ArrayList;
import java.util.List;

public class familyTree {

    static class Person {
        private String name;
        private List<Person> children;

        public Person(String name) {
            this.name = name;
            this.children = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addChild(Person child) {
            children.add(child);
        }

        public List<Person> getChildren() {
            return children;
        }
    }

    static class FamilyTree {
        private Person root;

        public FamilyTree(Person root) {
            this.root = root;
        }

        public Person getRoot() {
            return root;
        }
    }

    public class GenealogyApp {
        public static void main(String[] args) {
            // Создаем объекты для тестирования
            Person grandparent = new Person("Grandparent");
            Person parent1 = new Person("Parent 1");
            Person parent2 = new Person("Parent 2");
            Person child1 = new Person("Child 1");
            Person child2 = new Person("Child 2");

            // Строим генеалогическое древо
            FamilyTree familyTree = new FamilyTree(grandparent);
            grandparent.addChild(parent1);
            grandparent.addChild(parent2);
            parent1.addChild(child1);
            parent2.addChild(child2);

            // Проводим исследование: получаем всех детей выбранного человека
            Person selectedPerson = parent1; // Выбранный человек
            List<Person> children = selectedPerson.getChildren();
            System.out.println("Дети выбранного человека (" + selectedPerson.getName() + "):");
            for (Person child : children) {
                System.out.println(child.getName());
            }
        }
    }
}