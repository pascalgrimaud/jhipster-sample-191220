package io.github.jhipster.sample.repository;

import io.github.jhipster.sample.domain.LabelEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the LabelEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LabelRepository extends JpaRepository<LabelEntity, Long> {

}
