public class MainClass {
    public static void main(String[] args) {
        //Hotfix v1.1.2
        System.out.println("The world is better then hell");
    }

    private static void newFeatureMethod() {
        //Feature 3 and conflict with fix
    }

    private static void newFeature4Method() {
        //Feature 4 and conflict with fix on fix
    }
}
