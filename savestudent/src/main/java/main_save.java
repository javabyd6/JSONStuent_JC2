import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main_save
{

    public static void main(String[] args) {


        ObjectMapper mapper = new ObjectMapper();

        List<Student> listaStudentow = new ArrayList<>();

        listaStudentow.add(new Student("grazyna","nowak",5));
        listaStudentow.add(new Student("jan","kowalski",2));
        listaStudentow.add(new Student("adam","jakis",22));
        listaStudentow.add(new Student("edward","mlody",13));
        listaStudentow.add(new Student("hania","gluga",7));
        listaStudentow.add(new Student("Agnieszka","jakasTam",45));

        File studenntListfile = new File("listaStudentow.json");

        try
        {
            mapper.writeValue(studenntListfile,listaStudentow);
            System.out.println("Zapisano");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }


}
