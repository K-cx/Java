public class Fruit {

    private String name;
    // @kcx_给出成员变量后，按下「Command + N」生成构造（空&含参）、Getter 和 Setter 等           2025/1/19 03:12 * Line 4

    public Fruit() {
    }

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;    // @kcx_效果和`this.name`是一样的，因为“private”访问控制范围在同一个“class”内是可用的           2025/1/19 03:15 * Line 14
    }

    // @kcx_「Setter」方法可用于创建完实例对象后，对该实例对象的目标属性进行修改（同时可实现空构造+赋属性的模式，而非常以带参构造创建实例对象）           2025/1/19 03:21 * Line 17
    public void setName(String name) {
        this.name = name;
    }

    // @kcx_「toString()」方法会在「直接输出」创建的实例对象时，进行呈现           2025/1/19 03:28 * Line 22
    @Override   // @kcx_“@Override”（覆盖重写）指子类「重新定义」了继承自父类的方法           2025/1/19 03:28 * Line 23
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }

}
