package mx.com.gapsi.exam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserEntity {
    private String name;
    private String firstName;
    private String lastName;

    // This class use lombok for generate constructors, setters and getters
}
