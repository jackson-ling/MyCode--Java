package homework04;

public class worker extends employee{
    public worker(String name, double salary, int daynum) {
        this.salary = salary * daynum * 1.0;
        this.name = name;
        this.daynum = daynum;
    }

    public void printsalary(){
        System.out.println("姓名：" + name + " 工资：" + salary + " 工作天数：" + daynum);
    }

}
