package com.lamp.service;

import com.lamp.dao.UserDao;
import com.lamp.entity.Resource2;
import com.lamp.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/19 0019.
 */
@Service
public class UserService {
    @Resource
    private UserDao ud;
    public User findAccount(String name){
        return ud.findAccount(name);
    }
    public int findurid(int userid){
        return ud.findurid(userid);
    }
    public List<Resource2> findResourceeByUser(int roleid){
        return ud.findResourceeByUser(roleid);
    }
    public List<Resource2> findSubByRid(Map data){
        return ud.findSubByRid(data);
    }
}
