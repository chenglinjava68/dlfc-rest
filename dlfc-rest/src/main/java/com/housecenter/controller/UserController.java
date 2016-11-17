package com.housecenter.controller;

import com.google.gson.Gson;
import com.housecenter.entity.DlfcUser;
import com.housecenter.service.DlfcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private Gson gson = new Gson();

    @Autowired
    private DlfcUserService dlfcUserService;

    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(DlfcUser user) {

        return user.toString();
    }

    @ResponseBody
    @RequestMapping(value = "/delete/{uid}", method = RequestMethod.DELETE)
    public String deleteByPrimaryKey(@PathVariable("uid") String uid) {

        return uid;
    }

    @ResponseBody
    @RequestMapping(value = "/update/{uid}", method = RequestMethod.PUT)
    public String updateAllByPrimaryKey(@PathVariable("uid") String id, DlfcUser user) {

        return user.toString();
    }

    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public String selectList(String uid) {

        // 转出去
//        String json = gson.toJson(userServiceImpl.selectList());
        // 转进来
//        ArrayList<DlfcUser> fromJson = gson.fromJson(json, new ArrayList<DlfcUser>().getClass());

//        return gson.toJson(userServiceImpl.selectList());
        return uid;
    }

//    @RequestMapping
//    @ResponseBody
//    public DlfcResult getUserResult(String id) {
//
//        DlfcUser dlfcUser = dlfcUserService.selectDlfcUserById(id);
//        if (dlfcUser != null) {
//            return DlfcResult.ok(dlfcUser);
//        } else {
//            return DlfcResult.build(-1, "无数据");
//        }
//
//    }
//
//    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
//    @ResponseBody
//    public DlfcResult putUser(@PathVariable("id") String id) {
//
//        if (id == null) {
//            return DlfcResult.build(-2, "未接受到参数");
//        } else {
//            return DlfcResult.ok();
//        }
//
//    }
//
//    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
//    @ResponseBody
//    public DlfcResult deleteUser(String id) {
//
//        if (id == null) {
//            return DlfcResult.build(-2, "未接受到参数");
//        } else {
//            return DlfcResult.ok();
//        }
//
//    }
}
