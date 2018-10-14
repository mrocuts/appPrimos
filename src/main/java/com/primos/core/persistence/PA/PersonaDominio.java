package com.primos.core.persistence.PA;
// Generated 14/10/2018 08:08:00 AM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PersonaDominio generated by hbm2java
 */
@Entity
@Table(name="persona_dominio"
)
public class PersonaDominio  implements java.io.Serializable {


     private PersonaDominioId id;

    public PersonaDominio() {
    }

    public PersonaDominio(PersonaDominioId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="iddominio", column=@Column(name="iddominio", nullable=false) ), 
        @AttributeOverride(name="idpersona", column=@Column(name="idpersona", nullable=false) ) } )
    public PersonaDominioId getId() {
        return this.id;
    }
    
    public void setId(PersonaDominioId id) {
        this.id = id;
    }




}


