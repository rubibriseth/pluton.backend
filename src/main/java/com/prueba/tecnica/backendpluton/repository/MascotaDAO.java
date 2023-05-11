package com.prueba.tecnica.backendpluton.repository;

import com.prueba.tecnica.backendpluton.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MascotaDAO extends JpaRepository<Mascota, Integer> {

    @Query(value="select * from mascota m where m.ind_eliminado_mas = 0", nativeQuery=true)
    List<Mascota> getListaMascotaByIndEliminado();
}
