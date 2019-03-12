package com.seeyoo.zm.mapper;

import com.seeyoo.zm.model.Role;
import com.seeyoo.zm.util.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}