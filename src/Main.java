//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static int add(int a, int b) {
        return a + b;

    }
    protected static Dog dog = new Dog("小狗");
    public static void main(String[] args) {
        int r = add(2, 6);
        System.out.println(r);
        System.out.println(sfRunNiang(2023));
        dog.animalHello();
    }

    public static boolean sfRunNiang (int year) {
        int haha = add(5,9);
        System.out.println(haha);
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}