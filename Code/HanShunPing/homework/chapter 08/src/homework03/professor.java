package homework03;

public class professor extends teacher {
    public professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public void introduce(){  // 输出老师的信息
        System.out.println("professor类信息如下");
        super.introduce();
    }



}
