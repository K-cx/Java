import java.util.Arrays;

public class ReferenceTypesTest {
    public static void main(String[] args) {
        // @kcx_（【声明】+【实例化】）创建类【Fruit.java】的实例对象“banana”           2025/1/20 02:42 * Line 5
        Fruit banana = new Fruit();
        // @kcx_直接输出“banana”对象，查看（类的）实例对象的【默认值】           2025/1/20 02:43 * Line 7
        System.out.println(banana); // @kcx_对比输出有无「toString()」方法；同时这里会发现「String（字符串）」类型的【默认值】也是“null”           2025/1/20 02:46 * Line 8

        // @kcx_【声明】数组的类型：“int”表示是数组是“整型”这个类型的，“[]”表示是个“数组”           2025/1/20 02:47 * Line 10
        int[] someNumbers;  // @kcx_驼峰式命名（又称骆驼式命名法，Camel-Case）：两个及以上单词第一个单词正常首字母小写，第二个及以后的单词首字母要大写           2025/1/20 02:58 * Line 11
        // @kcx_直接输出“someNumbers”这个“int”型的数组，查看数组的【默认值】           2025/1/20 03:02 * Line 12
//        System.out.println(someNumbers);    // @kcx_会报错：“可能尚未初始化变量someNumbers”           2025/1/20 03:03 * Line 13
        // @kcx_【初始化】（类比对象【实例化】）“someNumbers”数组：使用“new”关键字创建数组时，需要在“[]”内给这个数组的「长度属性」进行赋值，表示能存放多少个。           2025/1/20 03:07 * Line 14
        someNumbers = new int[3]; // @kcx_表示：新建了一个“长度属性为3”的“int（整型）”的数组并赋值给“someNumbers”这个已经【声明】的数组           2025/1/20 03:18 * Line 15
        // @kcx_直接输出“someNumbers”数组，查看数组实例（对象）的【默认值】           2025/1/20 03:18 * Line 16
        System.out.println(someNumbers);    // @kcx_是和没有「覆盖重写（Override）」其「toString()」方法的（类的）实例对象是一致的           2025/1/20 03:23 * Line 17
        System.out.println(Arrays.toString(someNumbers));   // @kcx_调用【包装类】「Arrays（数组）」的「toString()」方法可以实现同「覆盖重写（Override）」其「toString()」方法的（类的）实例对象的输出效果           2025/1/20 03:27 * Line 18

        // @kcx_创建【Fruit.java】类型的「对象数组」           2025/1/20 03:29 * Line 20
        Fruit[] someFruits = new Fruit[3];  // @kcx_将数组的【声明】和【初始化】放在一起写           2025/1/20 03:32 * Line 21
        // @kcx_直接输出“someFruits”数组，查看「对象数组」的【默认值】           2025/1/20 03:33 * Line 22
        System.out.println("【Fruit.java】类型的「对象数组」的【默认值】是：" + someNumbers);    // @kcx_因为同为一个空数组，所以其空间地址是一致的           2025/1/20 03:35 * Line 23
        System.out.println(Arrays.toString(someFruits));    // @kcx_效仿“整型数组”调用【包装类】的方式输出           2025/1/20 03:37 * Line 24

    }
}
