package optional;

import com.example.java8.data.Student;
import com.example.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
        Student student = StudentDataBase.studentSupplier.get();

        if(student !=null){
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()){
            return studentOptional.map(Student::getName);
        }

        return Optional.empty();
    }

    public static void main(String[] args) {

        String name = getStudentName();
        System.out.println("length of name :" + name.length());
        Optional<String> stringOptional = getStudentNameOptional();
        System.out.println("length of name :" + name.length());
        if(stringOptional.isPresent()){
            System.out.println("optional string : " +stringOptional.get().length());
        }

    }
}
