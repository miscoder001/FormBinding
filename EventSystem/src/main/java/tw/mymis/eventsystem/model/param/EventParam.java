package tw.mymis.eventsystem.model.param;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EventParam {
    private int type;   // 類型:  1 火災  2 地震災損  3 工安意外  4 異常人員進出 5 貨物失竊  .....
    private String subject; // 主旨
    private String description;  // 說明
}
