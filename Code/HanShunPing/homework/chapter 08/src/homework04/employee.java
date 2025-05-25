package homework04;

public class employee {
    String name;
    double salary; // 传进来的单日工资，需要打印总工资
    int daynum;

    public employee(){

    }

    public employee(String name, double salary, int daynum) {
        this.name = name;
        this.salary = salary;
        this.daynum = daynum;
    }

    public void printsalary(){
        System.out.println("姓名：" + name + " 工资：" + salary + " 工作天数：" + daynum);
    }


}
