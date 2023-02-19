package com.example.backsecond.dao;

import com.example.backsecond.vo.TnUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface LoginDao {
    TnUser getTnUser(String usrId);

}
