package io.github.jhipster.sample.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import io.github.jhipster.sample.web.rest.TestUtil;

public class OperationTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(OperationEntity.class);
        OperationEntity operationEntity1 = new OperationEntity();
        operationEntity1.setId(1L);
        OperationEntity operationEntity2 = new OperationEntity();
        operationEntity2.setId(operationEntity1.getId());
        assertThat(operationEntity1).isEqualTo(operationEntity2);
        operationEntity2.setId(2L);
        assertThat(operationEntity1).isNotEqualTo(operationEntity2);
        operationEntity1.setId(null);
        assertThat(operationEntity1).isNotEqualTo(operationEntity2);
    }
}
