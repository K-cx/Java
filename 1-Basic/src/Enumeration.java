// @kcx_创建【StarbucksDrink】类           2025/1/17 00:47 * Line 1
class StarbucksDrink{
    // @kcx_创建【DrinkSize】枚举。注“{}”内直接列举枚举值即可           2025/1/17 00:45 * Line 3
    enum DrinkSize{TALL,GRANDE,VENTI}   // @kcx_类比「类的创建」，此时便生成了【DrinkSize】这种（枚举）基本类型           2025/1/17 00:55 * Line 4
    // @kcx_使用该【DrinkSize】（枚举）基本类型创建成员变量（非静态变量）并取变量名（标识）为“size”           2025/1/17 01:01 * Line 5
    DrinkSize size;
    // @kcx_创建一个名为“printSizeInfo()”的方法来打印【StarbucksDrink】的尺寸信息           2025/1/17 01:24 * Line 7
    public void printSizeInfo() {
        System.out.println("这杯星巴克饮品的大小（TALL-中杯,GRANDE-大杯,VENTI-特大杯）是："+size);
    }
}

public class Enumeration {  // @kcx_一个“.java”文件只能存在一个“public”修饰的“class”（类）           2025/1/17 01:27 * Line 13
    public static void main(String[] args) {    // @kcx_“main(...)”会作为程序的入口进行执行，故也只能有一个，而且必须在“public”修饰的“class”（类）中           2025/1/17 01:26 * Line 14
        // @kcx_通过“new”关键字进行【StarbucksDrink】类的对象的创建（实例化），并取变量名（标识）为“drink”           2025/1/17 01:13 * Line 15
        StarbucksDrink drink = new StarbucksDrink();
        // @kcx_将该对象（实例）的“size”属性设置为（指向）【StarbucksDrink】类的【DrinkSize】枚举中的某个值（如“GRANDE”）           2025/1/17 01:14 * Line 17
        drink.size = StarbucksDrink.DrinkSize.GRANDE;
        // @kcx_调用该对象（即【StarbucksDrink】类的实例对象“drink”）的“printSizeInfo()”方法来打印尺寸信息           2025/1/17 01:22 * Line 19
        drink.printSizeInfo();
    }
}
