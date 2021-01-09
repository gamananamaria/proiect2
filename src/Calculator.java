public class Calculator {

    public static void main(String[] args) {
        for (int i=1;i<=10; i=i+1) {
            System.out.println("add=" + add(i, i));
            System.out.println("diff=" + diff(i, i));
        }
    }

    // adunare
    private static int add(int a, int b) {
        return a+b;
    }

    // scadere
    private static int diff(int a, int b) {
        return a-b;
    }

}
