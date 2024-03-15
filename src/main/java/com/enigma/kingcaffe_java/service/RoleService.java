package com.enigma.kingcaffe_java.service;

import com.enigma.kingcaffe_java.entity.Role;

public interface RoleService {
    Role getOrSave(Role role);
}

