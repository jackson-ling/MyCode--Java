package homework03;

public class lecturer extends teacher{
    public lecturer(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public void introduce(){  // 输出老师的信息
        System.out.println("lecture类信息如下");
        super.introduce();
    }

}
