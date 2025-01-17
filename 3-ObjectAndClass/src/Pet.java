public class Pet {
    // @kcx_创建私有（访问控制修饰符“private”）的（“Pet”这个类的）成员变量：name           2025/1/17 22:51 * Line 2
    private String name;
    // @kcx_创建公开（访问控制修饰符“public”）的（“Pet”这个类的）方法：getName()           2025/1/17 22:52 * Line 4
    public String getName(){    // @kcx_public-访问控制修饰符：公开的 Sting-返回值类型：字符串 getName()-标识符或方法名(形式参数变量列表为空)           2025/1/17 22:58 * Line 5
        return "名字："+this.name;   // @kcx_返回（这个类的在调用时所创建的自身的）实例对象的“name”属性（也称状态或字段）的值（作为函数的返回结果）           2025/1/17 23:18 * Line 6
    }
    // @kcx_（显式地）创建构造函数（构造方法）           2025/1/18 00:04 * Line 8
    public Pet(){   // @kcx_注意：构造函数（构造方法）必须与类名（此例中为“Pet”）相同，同时符合函数（方法）的书写规范，即在方法名标识符后添加“()”           2025/1/18 00:06 * Line 9
        // @kcx_编译器会在没有显式地为类定义构造时提供一个默认的【空构造】（如此）           2025/1/18 00:07 * Line 10
        System.out.println("输出此语句说明调用了该空构造");
    }
    // @kcx_（显式地）创建构造函数（构造方法），有点方法重载的味道在里面（因为在一个类内，同时存在同名、不同参数列表的情况）           2025/1/18 00:37 * Line 13
    public Pet(String pName){   // @kcx_这是一个携带一个形式参数的构造           2025/1/18 01:21 * Line 14
        this.name=pName;    // @kcx_将形式参数（变量）的值「赋值」给自身（“Pet”类）实例对象的“name”属性，还可以说（有点像【C语言】中的描述方法）将自身（“Pet”类）实例对象的“name”属性「指向」函数（方法）所传递的形式参数（变量）           2025/1/18 01:27 * Line 15
        System.out.println("输出此语句说明调用了该带参构造，同时还可以输出“name”的变量值："+name);
    }
    // @kcx_给出主函数（main）入口           2025/1/18 01:23 * Line 18
    public static void main(String[] args) {
        // @kcx_创建对象           2025/1/18 01:24 * Line 20
        // @kcx_1、【声明】一个对象，包括对象类型以及对象名称。           2025/1/18 01:32 * Line 21
        Pet pet_1 ; // @kcx_仅仅是【声明】，实际啥也没有           2025/1/18 01:40 * Line 22
        // @kcx_2、【实例化】：使用关键字“new”来创建一个对象。           2025/1/18 01:34 * Line 23
        // @kcx_3、【初始化】：使用“new”创建对象时，会调用构造方法初始化对象。           2025/1/18 01:37 * Line 24
        new Pet();  // @kcx_因为类名“Pet”后的“()”内（实际）参数变量列表为空，因此会调用【空构造】，并输出空构造的「Print」语句           2025/1/18 01:42 * Line 25
        pet_1=new Pet("小P");  // @kcx_注意，当我们实例化（以及内部执行初始化）后需要将这个实例对象保存下来，不然后续再找「Ta」就找不到了。那此时就可以将它「赋给」刚刚【声明】的那个“啥也不是”的对象           2025/1/18 01:38 * Line 26
        // @kcx_上述的“1、 ~ 3、”其实可以合成一步，直接一步完成从声明到实例化（含初始化）           2025/1/18 01:50 * Line 27
        Pet pet_2 = new Pet();
        Pet pet_3 = new Pet("小J");  // @kcx_甚至可以完成带参构造           2025/1/18 02:07 * Line 29
        // @kcx_访问实例对象（将某个类（class）声明+实例化（内置初始化），这个过程叫创建对象。实例化某个类而产生的便是对象）的变量和方法           2025/1/18 02:16 * Line 30
//        pet_1.name; // @kcx_「!」需要将它赋给一个声明哦！           2025/1/18 02:25 * Line 31
        String pet_1Name = pet_1.name;  // @kcx_注意属性“name”在“Pet”类中是私有（访问控制修饰符“private”）的，故仅能在该类中进行访问           2025/1/18 02:20 * Line 32
        System.out.println(pet_1Name);
        // @kcx_除去声明，这里可以直接用「Print」输出           2025/1/18 02:26 * Line 34
        System.out.println("宠物3" + pet_3.getName());
    }
}

class PetTest {  // @kcx_一个「.java」源文件中仅能存在一个“public class”           2025/1/18 02:31 * Line 39
    public static void main(String[] args) {    // @kcx_一个「class」类中仅能有一个「main 函数」。注：不代表一个「.java」源文件中只能有一个           2025/1/18 02:36 * Line 40
        Pet pet_1 = new Pet("小B");  // @kcx_同一个方法（函数）内在创建对象时，不能使用（到第一步声明就不可以了）同名的标识符命名。但是不同的方法（函数）以及（扩大范围）不同的类（class）是可以的，同时他们可以存在于一个「.java」源文件内           2025/1/18 02:40 * Line 41
//        System.out.println(pet_1.name); // @kcx_package-private(default)、protected、public 三个访问控制修饰符修饰的是可以的，否则须调用「getter」方法           2025/1/18 02:44 * Line 42
        System.out.println(pet_1.getName());    // @kcx_推荐使用「getter」方式           2025/1/18 02:45 * Line 43
    }
}