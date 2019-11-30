package cn.lyq.manage.controller;

import cn.lyq.manage.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Person
 * @Date 2019/11/28 0028 19:11
 **/
@Controller
@RequestMapping("/person")
public class PersonController {

    @RequestMapping("/html")
    public String getHtml(Map<String,Person> map){
       map.put("a",new Person("张三","20","男"));
       map.put("b",new Person("李四","21","男"));
       map.put("c",new Person("王五","22","女"));
       map.put("d",new Person("王五","25","女"));
       map.put("d",new Person("李留","25","女"));
        System.out.println(new Person("赵六","22","男"));
        return "person";
    }
}
