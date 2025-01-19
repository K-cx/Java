public class TypeConversation {
    public static void main(String[] args) {
        // @kcx_【自动类型转换】：必须满足转换前的数据类型的位数要低于转换后的数据类型，记为「要大时，小自动转大」           2025/1/20 06:35 * Line 3
        char c1 = 'a';  //定义一个char类型
        int i1 = c1;    //char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于" + i1);
        char c2 = 'A';  //定义一个char类型
        int i2 = c2 + 1;    //char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于" + i2);
        // @kcx_「解析」：c1 的值为字符 a ,查 ASCII 码表可知对应的 int 类型值为 97， A 对应值为 65，所以 i2=65+1=66。           2025/1/20 06:43 * Line 10

        // @kcx_【强制类型转换】：条件是转换的数据类型必须是兼容的，可记为「强制大类变小类」           2025/1/20 06:45 * Line 12
        int i3 = 127;
        byte b = (byte) (i3 + 1); //强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于" + (b + 1));    // @kcx_超过【Byte（字节）】的范围（-128~127）则会循环           2025/1/20 06:53 * Line 15
        // @kcx_一个字节（Byte）等于 8 个比特位（bit），即8位二进制数（即计算机中的0或1）           2025/1/20 07:01 * Line 16
        // @kcx_两个字节（Byte）构成一个字符（Char）           2025/1/20 07:04 * Line 17

        // @kcx_【隐含强制类型转换】： 整数的默认类型是 int、小数默认是 double 类型浮点型，在定义 float 类型时必须在数字后面跟上 F 或者 f           2025/1/20 07:04 * Line 19
        byte n1 = 1;
        short n2 = 1;
        int n3 = 1;
        int nx = n1 + n2;   // @kcx_这是不会报错的，可以正常输出           2025/1/20 07:08 * Line 23
        long n4 = 1L;
        int ny = (int) (nx + n4);    // @kcx_【隐含强制类型转换】弱于【强制类型转换】           2025/1/20 07:10 * Line 25
        float n5 = 1f;
        double n6 = 1D;
        double nz = n5 + n6;    // @kcx_类型若换成“float”就不行           2025/1/20 07:11 * Line 28
    }
}
