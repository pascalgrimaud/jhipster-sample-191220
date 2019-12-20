package io.github.jhipster.sample.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import io.github.jhipster.sample.web.rest.TestUtil;

public class LabelTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(LabelEntity.class);
        LabelEntity labelEntity1 = new LabelEntity();
        labelEntity1.setId(1L);
        LabelEntity labelEntity2 = new LabelEntity();
        labelEntity2.setId(labelEntity1.getId());
        assertThat(labelEntity1).isEqualTo(labelEntity2);
        labelEntity2.setId(2L);
        assertThat(labelEntity1).isNotEqualTo(labelEntity2);
        labelEntity1.setId(null);
        assertThat(labelEntity1).isNotEqualTo(labelEntity2);
    }
}
