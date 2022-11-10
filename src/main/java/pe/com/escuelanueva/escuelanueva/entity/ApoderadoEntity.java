package pe.com.escuelanueva.escuelanueva.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "ApoderadoEntity")
@Table(name = "apoderado")
public class ApoderadoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codapo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @Column(name = "nomapo")
    private String nombre;
    @Column(name = "apepapo")
    private String apellidopaterno;
    @Column(name = "apemapo")
    private String apellidomaterno;
    @Column(name = "dniapo")
    private String dni;
    @Column(name = "dirapo")
    private String direccion;
    @Column(name = "telapo")
    private String telefono;
    @Column(name = "celapo")
    private String celular;
    @Column(name = "corapo")
    private String correo;
    @Column(name = "sexapo")
    private String sexo;
    @Column(name = "estapo")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "coddis", nullable = false)
    private DistritoEntity distrito;
    
    @ManyToOne
    @JoinColumn(name = "codpar", nullable = false)
    private ParentescoEntity parentesco;

}
