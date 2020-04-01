package cn.com.cqucc;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("测试Git!");
    }

    public void test() {
        int i = 0;
        System.out.println(i + 10);
    }

    public void testGit() {
        int i = 10;
        System.out.println(i + 10);
    }

    public void testGitUpdate() {
        int i = 100;
        System.out.println(i + 100);
    }

    //更新代码
    public void printNum() {
        System.out.println(520);
    }

    //在dev分支中创建的方法
    public void devTest() {
        System.out.println("dev");
    }

    /**
     * 在dev02分支中创建 dev02Test方法
     */
    public void dev02Test() {
        System.out.println("dev02");
    }
}
