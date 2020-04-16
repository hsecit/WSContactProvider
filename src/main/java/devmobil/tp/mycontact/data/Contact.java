/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devmobil.tp.mycontact.data;

/**
 *
 * @author Administrator
 */
public class Contact {
    int idcontact;
    String nomcontact;
    String tel;

    public Contact() {
    }

    public Contact(int idcontact, String nomcontact, String tel) {
        this.idcontact = idcontact;
        this.nomcontact = nomcontact;
        this.tel = tel;
    }

    public int getIdcontact() {
        return idcontact;
    }

    public String getNomcontact() {
        return nomcontact;
    }

    public String getTel() {
        return tel;
    }

    public void setIdcontact(int idcontact) {
        this.idcontact = idcontact;
    }

    public void setNomcontact(String nomcontact) {
        this.nomcontact = nomcontact;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}
