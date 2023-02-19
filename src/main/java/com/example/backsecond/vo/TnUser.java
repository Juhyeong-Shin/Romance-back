package com.example.backsecond.vo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("TnUser")
public class TnUser {
    private String usrId;
    private String usrPw;
    private String usrNick;
}
