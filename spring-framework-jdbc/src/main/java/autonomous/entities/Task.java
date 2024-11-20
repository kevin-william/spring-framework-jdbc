package autonomous.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Objects;

@Table(name = "TASK")
public class Task {

    private @Id long ID;
    private String NOME;
    private String DESCRICAO;

    public Task(long ID, String NOME, String DESCRICAO) {
        this.ID = ID;
        this.NOME = NOME;
        this.DESCRICAO = DESCRICAO;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }

    public void setDESCRICAO(String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return getID() == task.getID() && Objects.equals(getNOME(), task.getNOME()) && Objects.equals(getDESCRICAO(), task.getDESCRICAO());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getNOME());
    }

    @Override
    public String toString() {
        return "ID=" + ID +
                ", NOME='" + NOME + '\'' +
                ", DESCRICAO='" + DESCRICAO + '\'';
    }
}
