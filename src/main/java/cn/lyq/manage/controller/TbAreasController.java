package cn.lyq.manage.controller;

import cn.lyq.manage.service.TbAreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName TbAreasController
 * @Date 2020/11/15 0015 11:22
 **/
@Controller
@RequestMapping("/tbAreas")
public class TbAreasController {

    @Autowired
    TbAreasService tbAreasService;

    @RequestMapping("/count")
    @ResponseBody
    public Integer queryTotalByTbAreasAll(){

       return tbAreasService.queryTotalByTbAreasAll();
    }
}
