package com.tecsup.minishop.repository;

import com.tecsup.minishop.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}