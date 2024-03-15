package com.enigma.kingcaffe_java.service;

import com.enigma.kingcaffe_java.entity.MenuPrice;

public interface MenuPriceService {
    MenuPrice create(MenuPrice menuPrice);

    MenuPrice createOrUpdate(MenuPrice menuPrice);

    void delete(String id);

    MenuPrice getById(String id);

}
