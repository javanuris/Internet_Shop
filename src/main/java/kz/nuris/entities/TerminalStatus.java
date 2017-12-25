package kz.nuris.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by User on 24.12.2017.
 */
@Entity
@Table(name = "terminal_status", schema = "internet_shop")
public class TerminalStatus extends BaseEntity {
    private String name;
    private Set<Terminal> terminals;

    @Column(name = "name" ,nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "terminalStatus" , fetch = FetchType.LAZY )
    public Set<Terminal> getTerminals() {
        return terminals;
    }

    public void setTerminals(Set<Terminal> terminals) {
        this.terminals = terminals;
    }
}

