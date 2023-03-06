package com.example.backsecond.vo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("TbUser")
public class TbUser {
    private String usrId;
    private String usrPw;
    private String usrNick;
}
