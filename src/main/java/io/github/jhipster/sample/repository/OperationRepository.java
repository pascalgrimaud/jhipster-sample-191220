package io.github.jhipster.sample.repository;

import io.github.jhipster.sample.domain.OperationEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data  repository for the OperationEntity entity.
 */
@Repository
public interface OperationRepository extends JpaRepository<OperationEntity, Long> {

    @Query(value = "select distinct operation from OperationEntity operation left join fetch operation.labels",
        countQuery = "select count(distinct operation) from OperationEntity operation")
    Page<OperationEntity> findAllWithEagerRelationships(Pageable pageable);

    @Query("select distinct operation from OperationEntity operation left join fetch operation.labels")
    List<OperationEntity> findAllWithEagerRelationships();

    @Query("select operation from OperationEntity operation left join fetch operation.labels where operation.id =:id")
    Optional<OperationEntity> findOneWithEagerRelationships(@Param("id") Long id);

}
