package com.lamp.dao;

import com.lamp.entity.Resource2;
import com.lamp.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/19 0019.
 */
@Repository
public interface UserDao {
    public User findAccount(String name);
    public int findurid(int userid);
    public List<Resource2> findResourceeByUser(int roleid);
    public List<Resource2> findSubByRid(Map data);
}
