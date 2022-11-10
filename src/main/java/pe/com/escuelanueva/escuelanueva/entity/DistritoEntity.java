package pe.com.escuelanueva.escuelanueva.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "DistritoEntity")
@Table(name = "distrito")
public class DistritoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "coddis")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @Column(name = "nomdis")
    private String nombre;
    @Column(name = "estdis")
    private boolean estado;

}
