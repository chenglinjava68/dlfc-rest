package com.housecenter.controller;

import com.google.gson.Gson;
import com.housecenter.common.request.DlfcCommonRequest;
import com.housecenter.common.response.DlfcCommonResponse;
import com.housecenter.entity.DlfcCommonEntity;
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
    public String insert(String jsonData) throws Exception {

        DlfcUser user = DlfcCommonRequest.getInstance().build(jsonData, DlfcUser.class);

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
//        DlfcUser dlfcUser = dlfcUserService.selectDlfcUserById(uid);
        DlfcUser dlfcUser = new DlfcUser();
        dlfcUser.setUaccount("maosiyu");
        dlfcUser.setId("11111");
        dlfcUser.setUcellphone("13138383838");
        dlfcUser.setUname("yantuhao");
        return DlfcCommonResponse.getInstance().build(dlfcUser);
    }
}
