public class Demo {
    public static void main(String[] args) {
        init();
    }
    private static void init() {
        one();
    }

    private static void one() {
        System.out.println("haha ...");
        Student student = new Student();
        System.out.println(student.getName());
    }
}
