package guru.springframework.reactiveexamples;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jt on 8/24/17.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String firstName;
    private String lastName;

    public String sayMyName(){
        return "My Name is " + firstName + " " + lastName + ".";
    }

}
