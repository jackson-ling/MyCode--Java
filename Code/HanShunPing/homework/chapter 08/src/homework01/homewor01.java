package homework01;

/*
题目：定义一个person类（name,age,job），初始化person对象数组，有三个person对象，并
按照age从大到小进行排序（使用冒泡排序）

 */

public class homewor01 {
    public static void main(String[] args) {
        person[] arr = new person[3];
        arr[0] = new person("jack", 26, "1");
        arr[1] = new person("jack", 19, "1");
        arr[2] = new person("jack", 35, "1");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 从大到小排序
                if (arr[j].age < arr[j + 1].age) {
                    // 改变对象指向的堆空间，即完成交换对象的操作
                    person temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class person {
    String name;
    int age;
    String job;

    public person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }



    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}