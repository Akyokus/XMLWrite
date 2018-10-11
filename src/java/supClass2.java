
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehme
 */
@ManagedBean
@RequestScoped
public class supClass2 {
    public static int kayitNo=0;
    public String name;
    public String surname;
    public String password;
    public String bolumAdi;
    public String age;
    public String url;
    



    /**
     * @return the kayitNo
     */
    public int getKayitNo() {
        return kayitNo;
    }

    /**
     * @param kayitNo the kayitNo to set
     */
    public void setKayitNo(int kayitNo) {
        this.kayitNo = kayitNo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the bolumAdi
     */
    public String getBolumAdi() {
        return bolumAdi;
    }

    /**
     * @param bolumAdi the bolumAdi to set
     */
    public void setBolumAdi(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String write(){
        writeXML yaz=new writeXML();
        kayitNo=kayitNo+1;
        boolean sonuc=yaz.writeXML2(kayitNo,name, surname, bolumAdi, age, password,url);
        if(sonuc==true){
            return "basarili?faces-redirect=true";
        }else{
            return "basarisiz?faces-redirect=false";
        }
        
        
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    
    
    
}
