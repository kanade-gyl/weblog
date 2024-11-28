package com.quanxiaoha.weblog.web.model;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


/**
 * @author: Kanade
 * @date: 2024-11-25 20:35
 * @description: TODO
 **/
@Data
@ApiModel(value = "用户实体类")
public class User {
    // 用户名
    @NotNull(message = "用户名不能为空")   //注解确保用户名不为空
    @ApiModelProperty(value = "用户名")
    private String username;
    // 性别
    @NotNull(message = "性别不能为空")    //注解确保性别不为空
    @ApiModelProperty(value = "性别")
    private Integer sex;

    //年龄
    @NotNull(message = "年龄不能为空")
    @Min(value = 18,message = "年龄必须大于或等于18")    //注解确保年龄大于等于18
    @Max(value = 60,message = "年龄必须小于或等于60")    //注解确保年龄小于或等于100
    @ApiModelProperty(value = "年龄")
    private Integer age;

    //邮箱
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")     //注解确保邮箱格式正确
    @ApiModelProperty(value = "邮箱")
    private String email;

    //创建时间
    private LocalDateTime createTime;
    //更新日期
    private LocalDate updateDate;
    //时间
    private LocalTime time;
}
