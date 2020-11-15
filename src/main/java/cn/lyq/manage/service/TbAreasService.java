package cn.lyq.manage.service;

import cn.lyq.manage.mapper.TbAreasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TbAreasService
 * @Date 2020/11/15 0015 11:17
 **/
@Service
public class TbAreasService {

    @Autowired
    TbAreasMapper tbAreasMapper;

    public Integer queryTotalByTbAreasAll(){

       return tbAreasMapper.queryTotalByTbAreasAll();
    }
}
