//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cat {
    public String name = "Momok";
    public String various = "Anggora";
    public int age = 3;

    public void getName() {
        System.out.println("My name cat " + name);
    }

    public void getVarious() {
        System.out.println("my various cat " + various);
    }
    public void getAge() {
        System.out.println("my age cat " + age);
    }

    public static void main (String[] args) {
        Cat cat = new Cat();
        cat.getName();
        cat.getVarious();
        cat.getAge();

    }
}