public class MainClass {
    public static void main(String[] args) {
        System.out.println("hello world conflict");
    }

    private static void newFeatureMethod() {
        //Feature 3 and conflict with fix
    }
}
