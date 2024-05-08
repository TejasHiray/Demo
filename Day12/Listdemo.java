package Day12;

import java.util.ArrayList;
import java.util.List;

public class Listdemo{

    public static List<StudentDTO>getListString() {
        List<StudentDTO> studentDTOList = new ArrayList<>();
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId("A");
        studentDTO.setName("name1");
        studentDTO.setAddress("address1");
        studentDTO.setFees("fees1");


        studentDTOList.add(studentDTO);


        return studentDTOList;
    }

    public static List<TeacherDTO> getListString1(){
        List<TeacherDTO> teacherDTOList = new ArrayList<>();


        TeacherDTO teacherDTO = new TeacherDTO();



//       teacherDTO=new TeacherDTO();
        teacherDTO.setId("B");
        teacherDTO.setName("name2");
        teacherDTO.setAddress("address2");
        teacherDTO.setFees("fees2");


        teacherDTOList.add(teacherDTO);

        return teacherDTOList;


    }
}
