package tw.mymis.formbinding.model.form;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserRegModel {
    private String username;
    private String email;
    private String mobile;

}
