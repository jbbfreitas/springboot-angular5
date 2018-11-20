package br.com.abim.springboot.primo;
import java.util.Objects;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Departamento")
public class Departamento {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;
 
    @NotNull
    @Column(name = "nome", nullable = false)
    private String nome;
  
  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Departamento dept = (Departamento) o;
        if (dept.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), dept.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Departamento{" +
            "id=" + getId() +
            ", Nome='" + getNome() + "'" +
            "}";
    }

    
}
