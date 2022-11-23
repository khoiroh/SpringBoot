package com.data.tokoonline.repository;

import com.data.tokoonline.model.Barang;
import com.data.tokoonline.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarangRepository extends JpaRepository<Barang, Long> {
}
