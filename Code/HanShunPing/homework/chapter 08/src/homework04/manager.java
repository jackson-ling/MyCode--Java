package homework04;

public class manager extends employee{
    public manager(String name, double salary, int daynum) {
        this.salary = 1000 + salary * daynum * 1.2;
        this.name = name;
        this.daynum = daynum;
    }

    public void printsalary(){
        System.out.println("姓名：" + name + " 工资：" + salary + " 工作天数：" + daynum);
    }

}
