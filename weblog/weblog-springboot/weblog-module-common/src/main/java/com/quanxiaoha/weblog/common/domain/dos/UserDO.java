package com.quanxiaoha.weblog.common.domain.dos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author : Kanade
 * @date: 2024-11-25 21:43
 * @description: TODO
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("t_user")
public class UserDO {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String username;

    private String password;

    private Date createTime;

    private Date updateTime;

    private Boolean isDeleted;
}
