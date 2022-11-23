package com.data.tokoonline.service;

import com.data.tokoonline.model.Barang;
import com.data.tokoonline.model.User;

import java.util.List;

public interface BarangService {

    Barang addBarang(Barang barang);
    Object getBarangById(Long id);
    Barang editBarangById(Long id, String name, float price, Integer count, Integer reting, String description, boolean publish);
   Object getAllBarang();
    void deleteBarangById(Long id);
}
