package tw.mymis.formbinding.DAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import tw.mymis.formbinding.model.form.UserRegModel;

@Repository   // repository 定義上專門處理資料的 倉儲物件
public class EventUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveUser(UserRegModel user) {
        //進行存檔 Insert into eventdb.user 資料表
        String sql1 = "insert into user(username,email,mobile,passwd) values ('" + user.getUsername() + "','" + user.getEmail() + "',";
        String sql2 = "insert into user(username,email,mobile,passwd) values ( ?,?,?,?)";
        return jdbcTemplate.update(sql2, user.getUsername(), user.getEmail(), user.getMobile(), user.getPasswd());

    }
}
