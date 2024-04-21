package basics2.POJOAndRecordBasics;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S23123" + i,
                    switch (i) {
                        case 0 -> "John";
                        case 1 -> "Jane";
                        case 2 -> "Bob";
                        case 3 -> "Mary";
                        case 4 -> "Peter";
                        default -> "Anonymous";
                    },
                    "04/11/1985",
                    "JavaMasterClass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("432432", "Ann", "04/11/1986", "JavaMC");
        LPAStudent recordStudent = new LPAStudent("432432", "Bill", "04/11/1986", "JavaMC");

        System.out.println(pojoStudent); //Student{id='432432', name='Ann', dateOfBirth='04/11/1986', classList='JavaMC'}
        System.out.println(recordStudent); //LPAStudent[id=432432, name=Ann, dateOfBirth=04/11/1986, classList=JavaMC]


        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //recordStudent.classList(recordStudent.classList() + ", Java OCP Exam 829"); // No work because record built to be immutable
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
