import javax.swing.JOptionPane;

class Preson{

    private String name;
    private String surname;
    private int age;
    private String sex;

    public Preson(String name, String surname, int age, String sex){

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;

    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
    public void Welcome(String name){
        JOptionPane.showMessageDialog(null, "Hi, my name is " + name);
    }
    public void setAge(int age ){
        System.out.println("Change age");
    }

}
class Employee extends Preson{

    private String workSpace;
    private int salary;
    private int ID;
    private boolean workStatus;

    public Employee(String name, String surname, int age, String sex, int ID, String workSpace, int salary, boolean workStatus){

        super(name, surname, age, sex);
        this.workSpace = workSpace;
        this.salary = salary;
        this.ID = ID;
        this.workStatus = workStatus;

    }

    public String getWorkSpace(){
        return workSpace;
    }

    public int getSalary(){
        return salary;
    }

    public int getID(){
        return ID;
    }

    public boolean getWorkStatus(){
        return workStatus;
    }

    public void workStart(){
        System.out.println("Work Started");
    }

    public void workEnd(){
        System.out.println("Work Ended");
    }

    public void increseSalary(){
        System.out.println("Increse Salary");
    }

}

class Manager extends Employee {

    private int numberOfWorkers;
    private String agency;

    public Manager (String name, String surname, int age, String sex, int ID, String workSpace, int salary, boolean workStatus, int numberOfWorkers, String agency){

        super(name, surname, age, sex, ID, workSpace, salary, workStatus);
        this.numberOfWorkers = numberOfWorkers;
        this.agency = agency;

    }

    public int getNumberOfWorkers(){
        return numberOfWorkers;
    }
    public String getAgency(){
        return agency;
    }
    public void workQuest(){
        System.out.println("Quest is set to preson");
    }
    public void changeAgency(){
        System.out.println("Change Agency");
    }

}

public class Main {
    public static void main(String[] args) {

        int changeAge = 0;
        
        Manager Adam = new Manager("Adam", "Kowalski", changeAge, "Male", 4, "First station", 2300, true, 12, "First Agency");
        Adam.Welcome("Adam");
        int wybor = Integer.parseInt(JOptionPane.showInputDialog("<html>Do you want to change age?<br>Yes (type 1)<br>No (Type 2)</html>"));
        switch (wybor){
            case 1:
                changeAge = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
                System.out.println(Adam.getName());
                System.out.println(Adam.getSurname());
                System.out.println("Age is: " + changeAge);
                System.out.println(Adam.getSex());
                System.out.println(Adam.getWorkSpace());
                System.out.println("Salary is: " + Adam.getSalary());
                System.out.println("ID is: " + Adam.getID());
                System.out.println("Work status is: " + Adam.getWorkStatus());
                System.out.println(Adam.getAgency());
                System.out.println("Number of workers is: " + Adam.getNumberOfWorkers());
                Adam.setAge(23);
                Adam.workStart();
                Adam.workEnd();
                Adam.increseSalary();
                Adam.workQuest();
                Adam.changeAgency();
                break;
                case 2:
                    System.out.println(Adam.getName());
                    System.out.println(Adam.getSurname());
                    System.out.println("Age is not enterd");
                    System.out.println(Adam.getSex());
                    System.out.println(Adam.getWorkSpace());
                    System.out.println("Salary is: " + Adam.getSalary());
                    System.out.println("ID is: " + Adam.getID());
                    System.out.println("Work status is: " + Adam.getWorkStatus());
                    System.out.println(Adam.getAgency());
                    System.out.println("Number of workers is: " + Adam.getNumberOfWorkers());
                    Adam.setAge(23);
                    Adam.workStart();
                    Adam.workEnd();
                    Adam.increseSalary();
                    Adam.workQuest();
                    Adam.changeAgency();
                    break;
            default:
                JOptionPane.showMessageDialog(null, "Please enter a valid option");
                break;
        }


    }
}