import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main_read
{

    public static void main(String[] args) {


        ObjectMapper mapper = new ObjectMapper();

        try {

            Student[] studentArray =  mapper.readValue(new File("listaStudentow.json"),Student[].class);// odczytanie z pliku json
            List<Student> nowaListaStudentow = Arrays.asList(studentArray);
            System.out.println(nowaListaStudentow.toString());


           List<Student> poFiltrowaniu = nowaListaStudentow.stream().filter(x -> x.getName()
                                                                    .toUpperCase().startsWith("A"))
                                                                    .collect(Collectors.toList());

           System.out.println(poFiltrowaniu.toString());



        } catch (IOException e) {
            e.printStackTrace();
        }



    }


}
