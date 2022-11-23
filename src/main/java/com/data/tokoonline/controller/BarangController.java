package com.data.tokoonline.controller;

import com.data.tokoonline.model.Barang;
import com.data.tokoonline.model.User;
import com.data.tokoonline.repository.BarangRepository;
import com.data.tokoonline.repository.UserRepository;
import com.data.tokoonline.response.ResponseHelper;
import com.data.tokoonline.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/barang")
public class BarangController {

    @Autowired
    private BarangRepository barangRepository;

    @Autowired
    private BarangService barangService;

    @PostMapping
    public Object addBarang(@RequestBody Barang barang)
    {return ResponseHelper.ok(barangService.addBarang(barang)) ;}

    @GetMapping("/{id}")
    public Object getBarangById(@PathVariable("id") Long id)
    {return ResponseHelper.ok(barangService.getBarangById(id)) ;}

    @PutMapping("/{id}")
    public Object editBarangById(@PathVariable("id") Long id, @RequestBody Barang barang) {
        return ResponseHelper.ok(barangService.editBarangById(id, barang.getName(), barang.getPrice(), barang.getCount(), barang.getReting(), barang.getDescription(), barang.isPublish())) ;
    }

    @GetMapping("/all")
    public Object getAllBarang() {return ResponseHelper.ok(barangService.getAllBarang()) ;}

    @DeleteMapping("/{id}")
    public void deleteBarangById(@PathVariable("id") Long id) {barangService.deleteBarangById(id);}
}
