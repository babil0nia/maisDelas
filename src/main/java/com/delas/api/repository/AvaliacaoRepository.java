package com.delas.api.repository;
import com.delas.api.model.AvaliacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AvaliacaoRepository extends JpaRepository<AvaliacaoModel, Long> {
}
