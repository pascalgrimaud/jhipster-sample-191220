package io.github.jhipster.sample.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import io.github.jhipster.sample.web.rest.TestUtil;

public class BankAccountTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(BankAccountEntity.class);
        BankAccountEntity bankAccountEntity1 = new BankAccountEntity();
        bankAccountEntity1.setId(1L);
        BankAccountEntity bankAccountEntity2 = new BankAccountEntity();
        bankAccountEntity2.setId(bankAccountEntity1.getId());
        assertThat(bankAccountEntity1).isEqualTo(bankAccountEntity2);
        bankAccountEntity2.setId(2L);
        assertThat(bankAccountEntity1).isNotEqualTo(bankAccountEntity2);
        bankAccountEntity1.setId(null);
        assertThat(bankAccountEntity1).isNotEqualTo(bankAccountEntity2);
    }
}
