package com.example.backsecond.dao;

import com.example.backsecond.vo.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface LoginDao {
    TbUser getTbUser(String usrId);

}
