package com.lamp.test;

import com.lamp.entity.Resource2;
import com.lamp.entity.User;
import com.lamp.service.UserService;
import com.lamp.utils.Des;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/19 0019.
 */
@Controller
public class UserController {
    @Resource
    private UserService us;
    @RequestMapping("login.do")
    @ResponseBody
    public String login(String name,String password,HttpSession session) {
        System.out.println(password+"  "+name);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(name, password);
        try {
            subject.login(token);

        } catch (Exception e) {
            return "-1";
        }
        User user=us.findAccount(name);
        System.out.println(user.getName()+" "+user.getId());
        session.setAttribute("user",user);
        return "1";
    }
    @RequestMapping(value = "findResourceeByUser.do")
    @ResponseBody
    public List<Resource2> findResourceeByUser(int userid,HttpSession session){
            int roleid=us.findurid(userid);
            session.setAttribute("roleid",roleid);
        List<Resource2> list=us.findResourceeByUser(roleid);
        for (Resource2 res: list
             ) {
            System.out.println(res.getId());
        }
            return us.findResourceeByUser(roleid);
    }
    @RequestMapping(value = "findSubByRid.do")
    @ResponseBody
    public List<Resource2> findSubByRid(int rid,HttpSession session){
        int roleid=(int)session.getAttribute("roleid");
        System.out.println(roleid+" "+rid);
        Map data=new HashMap();
        data.put("rid",rid);
        data.put("roleid",roleid);
        List<Resource2> list=us.findSubByRid(data);
        for (Resource2 resq: list
                ) {
            System.out.println(resq.getId()+"      "+resq.getTask()+" "+resq.getRid());
        }
        return us.findSubByRid(data);
    }
}
