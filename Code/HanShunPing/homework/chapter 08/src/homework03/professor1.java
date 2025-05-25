package homework03;

public class professor1 extends teacher{
    public professor1(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public void introduce(){  // 输出老师的信息
        System.out.println("professor1 类信息如下");
        super.introduce();
    }

}
