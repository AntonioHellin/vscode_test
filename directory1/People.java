public class People {
    int age;
    int age2;

    public People(int age, int age2) {
        this.age = age;
        this.age2 = age2;
    }

    public void compareAges() {
        if (age == age2) {
            System.out.println("Ages are equal");
        } else {
            System.out.println("Ages are different");
        }
    }

    public static void main(String[] args) {
        People p = new People(30, 40);
        p.compareAges();
    }
}