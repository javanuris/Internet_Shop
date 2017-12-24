package kz.nuris.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 24.12.2017.
 */
@Entity
@Table(name = "terminals", schema = "internet_shop")
public class Terminal extends BaseEntity{
    private Order order;
    private Integer cash;
    private Date comeDate;
    private TerminalStatus terminalStatus;

    @ManyToOne
    @JoinColumn(name = "id_order")
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Column(name = "cash")
    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    @ManyToOne
    @JoinColumn(name = "come_date")
    public Date getComeDate() {
        return comeDate;
    }

    public void setComeDate(Date comeDate) {
        this.comeDate = comeDate;
    }
    @ManyToOne
    @JoinColumn(name = "id_status")
    public TerminalStatus getTerminalStatus() {
        return terminalStatus;
    }

    public void setTerminalStatus(TerminalStatus terminalStatus) {
        this.terminalStatus = terminalStatus;
    }
}
