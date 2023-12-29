package tw.mymis.eventsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import tw.mymis.eventsystem.model.param.EventParam;
import tw.mymis.eventsystem.service.EventService;

@Controller
public class EventController {

    @Autowired
    EventService eventService;
    // http://www.abc.com.tw:8540/event/count?cate=1  ( 參數 : 1 2 3 4 5 )
    @GetMapping("/event/count")
    public String eventCount(@RequestParam("cate") int type, Model m) {
        int count = eventService.getEventCount(type);
        m.addAttribute("cnt", count);
        return "/event/event_count";
    }


    @PostMapping("/event/new")
    public String eventNew(@RequestBody EventParam eventParam, Model m) {
        System.out.println("接收表單 type = " + eventParam.getType());
        System.out.println("接收表單 subject = " + eventParam.getSubject());
        return "/event/event_count";
    }
}
