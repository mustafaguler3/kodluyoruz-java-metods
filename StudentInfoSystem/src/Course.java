public class Course {
    Teacher teacher;
    String name, code, prefix ;
    int note;
    int sozluNote;

    Course(String name, String code, String prefix ){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int sozluNote = 0;
    }


    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;

        }
        else{
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor ! ");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }
}
