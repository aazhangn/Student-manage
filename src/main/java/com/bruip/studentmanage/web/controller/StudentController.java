package com.bruip.studentmanage.web.controller;

import com.bruip.studentmanage.bean.Student;
import com.bruip.studentmanage.util.Message;
import com.bruip.studentmanage.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
//类说明
@Api(description = "学生控制器")
public class StudentController {

    @GetMapping("/addStu")
    //方法说明
    @ApiOperation(value = "添加学生")

    public Message add(Student student){
        //返回数据应为基本类对象，而非字符串
        Message<String> message = new Message<>();
        Date date = new Date() ;

        message.setTime(date.getTime());
        message.setStatus(200);
        message.setMessage("success");
        message.setData("添加学生成功");

        System.out.println(student);
        return message;
    }

    @GetMapping("/dele")
    //参数说明
    @ApiImplicitParam(name = "stuId",value = "学生姓名",paramType = "query",dataType = "Student")
    public Message deleStu(String stuId){
        //返回Message类时，多个信息需重复编写代码，此处用MessageUtil类代替
        return MessageUtil.success("删除学生成功");
    }

    @GetMapping("/que")
    public Message queStu(String stuName){
        System.out.println(stuName);
        return new Message();
    }
}
