package homework04;

public class homework04 {
    public static void main(String[] args) {

        manager manager = new manager("manager",100,5);
        manager.printsalary();

        worker worker = new worker("worker",100,5);
        worker.printsalary();
    }
}
