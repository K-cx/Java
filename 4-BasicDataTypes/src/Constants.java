public class Constants {

    // @kcx_【常量】若存在于「类体」中（方法之外），同时「main 函数」需要「直接」调用，则需要设为【静态（Static）】的；【变量】【方法】等同理，都需要被“static”这个【关键字】修饰           2025/1/20 03:53 * Line 3
    static final float PI = 3.14159265358979323846F;    // @kcx_“final”和“static”两个【关键字】的书写顺序前后无关，但数据类型（此例为”float“）需要紧贴标识符（变量名）           2025/1/20 04:29 * Line 4

    public static void main(String[] args) {
        // @kcx_输出【静态】【常量】“PI”           2025/1/20 03:58 * Line 7
        System.out.println(PI);

        // @kcx_尝试【改变常量】           2025/1/20 04:47 * Line 10
        final byte b = 0176;  // @kcx_理论上，【常量】建议使用“大写”进行「标识命名」，而非小写，但是小写不会使程序有问题；“大写”来「标识命名」【常量】会更好区分           2025/1/20 05:22 * Line 11
        System.out.println(b + 1);    // @kcx_「✓」在输出时进行改变           2025/1/20 04:53 * Line 12
//        b = 127; // @kcx_「✕」直接赋新值           2025/1/20 04:57 * Line 13
        byte by = b + 1;    // @kcx_「✓」重新赋给一个新的变量（或常量）           2025/1/20 05:04 * Line 14
        System.out.println("“b”的值：" + b + "，“by”的值：" + (by + 1)); // @kcx_将他们（“b”和“by”）输出           2025/1/20 05:24 * Line 15

        // @kcx_【字符串】——“字符序列”，可以理解为一个特殊的【常量】，同样具有「不可变性」           2025/1/20 05:40 * Line 17
        String helloWorld = "Hello World！";
        // @kcx_正常输出           2025/1/20 05:41 * Line 19
        System.out.println(helloWorld);
        // @kcx_尝试【改变字符串】           2025/1/20 05:42 * Line 21
        helloWorld = "try to change";   // @kcx_没有报错？           2025/1/20 05:42 * Line 22
        System.out.println(helloWorld); // @kcx_看似改变了，实则是原来的「字符串引用」“helloWorld”所指向的对象（新的字符串“try to change”也自动生成了一个对象）已经发生了改变           2025/1/20 05:45 * Line 23
        // @kcx_这个过程等同于如下：           2025/1/20 05:48 * Line 24
        Fruit banana = new Fruit();
        banana.setName("Banana");
        System.out.println("【Fruit.java】类的实例对象" + banana.getName() + "的「toString()」方法调用输出结果为：" + banana.toString());
        banana = new Fruit("Grape");    // @kcx_【Fruit】类型的实例对象“banana”（作为「引用」对象）指向了一个新的【Fruit】同类型的实例对象           2025/1/20 05:53 * Line 28
        System.out.println(banana);

        // @kcx_补充：【字符串】（字符「Char」也可以）中包含【Unicode 字符】（【转义字符】序列）           2025/1/20 05:55 * Line 31
        System.out.println("在【字符串】中包含【Unicode 字符】（【转义字符】序列）可以使得用一个「Print」语句来实现一个【字符串】的换行\n输出，同时还可以主动添加空格\s或者添入反斜杠\\等其它16进制 Unicode 字符 (如 \u0001)。\n只要你知道对应的「Unicode 编码」便可以实现在【字符串】的输出中进行转义字符的连带输出。");
    }
}
