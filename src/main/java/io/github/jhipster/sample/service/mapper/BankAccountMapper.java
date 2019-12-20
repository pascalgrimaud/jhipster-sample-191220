package io.github.jhipster.sample.service.mapper;

import io.github.jhipster.sample.domain.*;
import io.github.jhipster.sample.service.dto.BankAccount;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link BankAccountEntity} and its DTO {@link BankAccount}.
 */
@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface BankAccountMapper extends EntityMapper<BankAccount, BankAccountEntity> {

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "user.login", target = "userLogin")
    BankAccount toDto(BankAccountEntity bankAccountEntity);

    @Mapping(source = "userId", target = "user")
    @Mapping(target = "operations", ignore = true)
    @Mapping(target = "removeOperation", ignore = true)
    BankAccountEntity toEntity(BankAccount bankAccount);

    default BankAccountEntity fromId(Long id) {
        if (id == null) {
            return null;
        }
        BankAccountEntity bankAccountEntity = new BankAccountEntity();
        bankAccountEntity.setId(id);
        return bankAccountEntity;
    }
}
