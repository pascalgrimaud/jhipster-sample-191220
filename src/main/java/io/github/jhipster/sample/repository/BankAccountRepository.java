package io.github.jhipster.sample.repository;

import io.github.jhipster.sample.domain.BankAccountEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data  repository for the BankAccountEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Long>, JpaSpecificationExecutor<BankAccountEntity> {

    @Query("select bankAccount from BankAccountEntity bankAccount where bankAccount.user.login = ?#{principal.username}")
    List<BankAccountEntity> findByUserIsCurrentUser();

}
