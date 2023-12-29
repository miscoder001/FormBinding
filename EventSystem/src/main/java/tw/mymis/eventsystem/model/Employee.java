package tw.mymis.eventsystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    private int empid;
    private String name;
    private String emil;
    private String jobTitle;
    private String mobile;

    private String lineID;

}
