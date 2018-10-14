package com.primos.core.persistence.PA;
// Generated 14/10/2018 08:08:00 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario"
)
public class Usuario  implements java.io.Serializable {


     private long idusuario;
     private boolean bitactivo;
     private long idpersona;
     private int intnumintentos;
     private String strpassword;
     private String strusuario;

    public Usuario() {
    }

    public Usuario(long idusuario, boolean bitactivo, long idpersona, int intnumintentos, String strpassword, String strusuario) {
       this.idusuario = idusuario;
       this.bitactivo = bitactivo;
       this.idpersona = idpersona;
       this.intnumintentos = intnumintentos;
       this.strpassword = strpassword;
       this.strusuario = strusuario;
    }
   
     @Id 

    
    @Column(name="idusuario", nullable=false)
    public long getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    
    @Column(name="bitactivo", nullable=false)
    public boolean isBitactivo() {
        return this.bitactivo;
    }
    
    public void setBitactivo(boolean bitactivo) {
        this.bitactivo = bitactivo;
    }

    
    @Column(name="idpersona", nullable=false)
    public long getIdpersona() {
        return this.idpersona;
    }
    
    public void setIdpersona(long idpersona) {
        this.idpersona = idpersona;
    }

    
    @Column(name="intnumintentos", nullable=false)
    public int getIntnumintentos() {
        return this.intnumintentos;
    }
    
    public void setIntnumintentos(int intnumintentos) {
        this.intnumintentos = intnumintentos;
    }

    
    @Column(name="strpassword", nullable=false, length=50)
    public String getStrpassword() {
        return this.strpassword;
    }
    
    public void setStrpassword(String strpassword) {
        this.strpassword = strpassword;
    }

    
    @Column(name="strusuario", nullable=false, length=30)
    public String getStrusuario() {
        return this.strusuario;
    }
    
    public void setStrusuario(String strusuario) {
        this.strusuario = strusuario;
    }




}


