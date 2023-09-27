public class Conditionals {
    public static void main(String[] args) {
        int salary = 500;
        if(salary > 10000){
            salary = salary + 2000; // salary +=2000; shortcut
        }else if (salary > 2000) {
            salary = salary + 1000;
        }else{
            salary +=100;
        }
        System.out.println(salary);
    }
    }