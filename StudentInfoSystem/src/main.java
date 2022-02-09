public class main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(" Hasan Cetin", "MAT", "480" );
        Teacher teacher2 = new Teacher("Hakan Dinc","FZK","650" );
        Teacher teacher3 = new Teacher("Mahmut Hoca", "TRH", "121");

        Course mat = new Course("Matematik","103","MAT");
        mat.addTeacher(teacher1);

        Course fizik = new Course("Fizik","107","FZK");
        fizik.addTeacher(teacher2);

        Course tarih = new Course("Tarih", "105", "TRH");
        tarih.addTeacher(teacher3);



        Student s1 = new Student("Şaban", "123","4",tarih,fizik,tarih);

        Student s2 = new Student("Güdük Necmi", "444", "4", tarih, fizik, tarih);

        s1.addBulkExamNote(50, 60, 70,45,55,65);
        s1.isPass();
        s1.printNote();
        s2.addBulkExamNote(40, 50, 60,100,100,100);
        s2.isPass();
        s2.printNote();


    }
}
