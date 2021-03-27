package net.qadmin.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class Index {
    @RequestMapping("/")
    public String index(Map<String,String> map){
        return "index";
    }

    @RequestMapping("/index.html")
    public String _index(Map<String,String> map){
        return "index";
    }

    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/*.html")
    public String empty(Map<String,String> map){

        map.put("name",request.getServletPath());
        return "empty";
    }
}
