package com.seeyoo.zm.mapper;

import com.seeyoo.zm.util.MyMapper;
import com.seeyoo.zm.model.UserRole;

import java.util.List;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}