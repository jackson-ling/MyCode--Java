package homework03;

public class teacher {
    String name;
    int age;
    String post; //职称
    double salary;
    double grade; //工资等级

    // 需要声明无参构造器，子类默认调用父类的无参构造器
    public teacher(){

    }

    public teacher(String name, int age, String post, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public void introduce(){  // 输出老师的信息
        System.out.println("teacher类信息如下");
        System.out.print("姓名：" + name +
                           " 年龄：" + age +
                           " 职称：" + post +
                           " 基本工资：" + salary +
                           " 工资等级：" + grade);
    }

}
