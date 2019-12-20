package io.github.jhipster.sample.domain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A LabelEntity.
 */
@Entity
@Table(name = "label")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class LabelEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3)
    @Column(name = "label_name", nullable = false)
    private String labelName;

    @ManyToMany(mappedBy = "labels")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @JsonIgnore
    private Set<OperationEntity> operations = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public LabelEntity labelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Set<OperationEntity> getOperations() {
        return operations;
    }

    public LabelEntity operations(Set<OperationEntity> operations) {
        this.operations = operations;
        return this;
    }

    public LabelEntity addOperation(OperationEntity operation) {
        this.operations.add(operation);
        operation.getLabels().add(this);
        return this;
    }

    public LabelEntity removeOperation(OperationEntity operation) {
        this.operations.remove(operation);
        operation.getLabels().remove(this);
        return this;
    }

    public void setOperations(Set<OperationEntity> operations) {
        this.operations = operations;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LabelEntity)) {
            return false;
        }
        return id != null && id.equals(((LabelEntity) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "LabelEntity{" +
            "id=" + getId() +
            ", labelName='" + getLabelName() + "'" +
            "}";
    }
}
