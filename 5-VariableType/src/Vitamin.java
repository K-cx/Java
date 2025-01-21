public class Vitamin {
    // @kcx_在 Java 语言中，所有的变量在使用前必须【声明】。           2025/1/21 01:51 * Line 2
    // @kcx_【变量声明】基本格式：`type identifier [ = value][, identifier [= value] ...] ;`           2025/1/21 01:52 * Line 3
    // @kcx_注：“[xx]”内的为可选项。这意味着可以只声明一（或多个）个（同类型的）变量（用逗号隔开），还可以在【变量声明】的同时进行赋值完成【变量初始化】（如为类创建实例对象，则此时为实例对象的【实例化（初始化）】。【对象】实则也是【变量】，因为它【可变】。）           2025/1/21 02:17 * Line 4
    // @kcx_“type”为“数据类型”，“identifier”为“变量名（标识符）”。           2025/1/21 02:17 * Line 5
    short a, b, c;         // 声明三个int型整数：a、 b、c
    long d = 3L, e = 4l, f = 5L; // 声明三个整数并赋予初值
    byte z = 22;         // 声明并初始化 z
    String s = "It\'s a String.";  // 声明并初始化字符串 s
    double pi = 3.14159; // 声明了双精度浮点型变量 pi
    char x = 'x';        // 声明变量 x 的值是字符 'x'。
    private short necessaryTypesNum;
    // @kcx_上述均为【成员变量或实例变量（Instance Variables）】：实例变量是在类中声明，但在方法、构造函数或块之外，它们属于类的实例，每个类的实例都有自己的副本，如果不明确初始化，实例变量会被赋予默认值（数值类型为0，boolean类型为false，对象引用类型为null）。           2025/1/21 22:39 * Line 13

    public void howManyTypes() {
        int beConsideredNum = 30;  // @kcx_【局部变量（Local Variables）】：局部变量是在方法、构造函数或块内部声明的变量，它们在声明的方法、构造函数或块执行结束后被销毁，局部变量在声明时需要初始化（赋值），否则会导致编译错误（在使用时未初始化会报编译执行错误）           2025/1/21 04:51 * Line 16
        // ...
        Vitamin.beConsideredNum = beConsideredNum;
    }

    // @kcx_【静态变量或类变量（Class Variables）】：类变量是在类中用 static 关键字声明的变量，它们属于类而不是实例，所有该类的实例共享同一个类变量的值，类变量在类加载时被初始化，而且只初始化一次。           2025/1/21 22:46 * Line 21
    static int beConsideredNum;   // @kcx_注意命名规范：【静态变量或类变量（Class Variables）】应该遵循「骆驼式」又称「驼峰命名」，通常一般由全部的大写字母（大驼峰变式）结合下划线“_”作为字母间的间隔进行命名标识（大写蛇形命名）           2025/1/22 05:15 * Line 22

    public short howManyNecessaryTypes(int difference) {   // @kcx_【参数变量（Parameters）】：参数是方法或构造函数声明中的变量，用于接收调用该方法或构造函数时传递的值，参数变量的作用域只限于方法内部。此处为一个【形式参数变量】。           2025/1/21 22:44 * Line 24
        necessaryTypesNum = (short) (beConsideredNum - difference);
        return necessaryTypesNum;
    }

    public static void main(String[] args) {
        Vitamin 维生素 = new Vitamin();
        System.out.println(Vitamin.beConsideredNum);    // @kcx_输出：0           2025/1/21 23:05 * Line 31
        维生素.howManyTypes(); // @kcx_调用改变【静态变量或类变量（Class Variables）】的方法           2025/1/21 23:12 * Line 32
        System.out.println(Vitamin.beConsideredNum);
        System.out.println("人体所必需的维生素种类有" + 维生素.howManyNecessaryTypes(10) + "多种。");
        int 差值 = 6; // @kcx_创建【局部变量（Local Variables）】           2025/1/21 23:12 * Line 35
        System.out.println("人体所必需的维生素种类为：" + 维生素.howManyNecessaryTypes(差值) + "种。"); // @kcx_将【局部变量（Local Variables）】作为实例对象方法的【实际参数变量（Parameters）】进行传递           2025/1/21 23:15 * Line 36

        int a = 1, b = 2;
        swap(a, b);  // @kcx_调用“swap(...)”方法           2025/1/22 01:19 * Line 39
        System.out.println("a = " + a + ", b = " + b);  // @kcx_输出“a”和“b”，发现值仍不变。说明【基本数据类型】的参数传递，传递的是实际参数的值的副本（至方法的形式参数列表），发生的仅为【值传递】           2025/1/22 01:24 * Line 40

//        int z;  // @kcx_【局部变量（Local Variables）】：在声明时不初始化（初始赋值）不会报错           2025/1/22 01:14 * Line 42
//        System.out.println(z);  // @kcx_【局部变量（Local Variables）】：但在使用时若仍未初始化（初始赋值）则会发生编译执行错误（编译器会报错）           2025/1/22 01:15 * Line 43
        int x = 1;  // 局部变量 a 的声明和初始化
        int y;  // 局部变量 b 的声明
        y = 0;  // 局部变量 b 的初始化
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println(维生素.x);  // @kcx_【成员变量或实例变量（Instance Variables）】：通过“实例对象点实例变量”的方式，可以访问符合访问控制修饰符作用域的变量           2025/1/22 02:53 * Line 50
        维生素.x = 'o';    // @kcx_改变该实例对象的实例变量（私有的成员变量，仅在该类可见。因此可以直接改，否则要通过「setter」方法）           2025/1/22 02:57 * Line 51
        System.out.println(维生素.x);

        // @kcx_【静态变量或类变量（Class Variables）】：访问方式有2种           2025/1/22 03:24 * Line 54
        System.out.println(Vitamin.beConsideredNum);    // @kcx_注：在当前类内访问可以省去类名限定词（含点号）“Vitamin.”           2025/1/22 03:26 * Line 55
        System.out.println(维生素.beConsideredNum);

        Vitamin v = new Vitamin();
        // @kcx_输出「计数器」统计的结果           2025/1/22 06:01 * Line 59
        System.out.println("目前类【Vitamin.java】一共创建了"+Vitamin.getVitaminCreatedCounter()+"个实例对象。");
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    // @kcx_【静态变量或类变量（Class Variables）】的应用：创建一个「计数器」（静态的），用于统计创建了多少次对象           2025/1/22 05:48 * Line 69
    private static int vitaminCreatedCounter;

    public Vitamin() {
        vitaminCreatedCounter++;
    }

    public static int getVitaminCreatedCounter() {
        return vitaminCreatedCounter;
    }
}
