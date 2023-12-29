package tw.mymis.eventsystem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void getEvent() {
     //   jdbcTemplate.query("select * from event" , rowmapper );
    }

    public int getEventCount(int type) {
        String sql = "select count(*) from event where type=" + type;
        return jdbcTemplate.queryForObject(sql , Integer.class);

    }
}
