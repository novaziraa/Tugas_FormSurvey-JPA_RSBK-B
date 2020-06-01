/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survey;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS-A456U
 */
@Entity
@Table(name = "siswa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Siswa.findAll", query = "SELECT s FROM Siswa s")
    , @NamedQuery(name = "Siswa.findById", query = "SELECT s FROM Siswa s WHERE s.id = :id")
    , @NamedQuery(name = "Siswa.findByNamaDepan", query = "SELECT s FROM Siswa s WHERE s.namaDepan = :namaDepan")
    , @NamedQuery(name = "Siswa.findByNamaBelakang", query = "SELECT s FROM Siswa s WHERE s.namaBelakang = :namaBelakang")
    , @NamedQuery(name = "Siswa.findByJenisKelamin", query = "SELECT s FROM Siswa s WHERE s.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "Siswa.findByKelas", query = "SELECT s FROM Siswa s WHERE s.kelas = :kelas")
    , @NamedQuery(name = "Siswa.findByNamaSekolah", query = "SELECT s FROM Siswa s WHERE s.namaSekolah = :namaSekolah")
    , @NamedQuery(name = "Siswa.findByAlamat", query = "SELECT s FROM Siswa s WHERE s.alamat = :alamat")
    , @NamedQuery(name = "Siswa.findByTelp", query = "SELECT s FROM Siswa s WHERE s.telp = :telp")
    , @NamedQuery(name = "Siswa.findByEmail", query = "SELECT s FROM Siswa s WHERE s.email = :email")
    , @NamedQuery(name = "Siswa.findByQuest1", query = "SELECT s FROM Siswa s WHERE s.quest1 = :quest1")
    , @NamedQuery(name = "Siswa.findByQuest2", query = "SELECT s FROM Siswa s WHERE s.quest2 = :quest2")
    , @NamedQuery(name = "Siswa.findByQuest3", query = "SELECT s FROM Siswa s WHERE s.quest3 = :quest3")
    , @NamedQuery(name = "Siswa.findByQuest4", query = "SELECT s FROM Siswa s WHERE s.quest4 = :quest4")})
public class Siswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "nama_depan")
    private String namaDepan;
    @Size(max = 50)
    @Column(name = "nama_belakang")
    private String namaBelakang;
    @Size(max = 19)
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Size(max = 20)
    @Column(name = "kelas")
    private String kelas;
    @Size(max = 20)
    @Column(name = "nama_sekolah")
    private String namaSekolah;
    @Size(max = 50)
    @Column(name = "alamat")
    private String alamat;
    @Size(max = 20)
    @Column(name = "telp")
    private String telp;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 20)
    @Column(name = "email")
    private String email;
    @Size(max = 50)
    @Column(name = "quest1")
    private String quest1;
    @Size(max = 50)
    @Column(name = "quest2")
    private String quest2;
    @Size(max = 50)
    @Column(name = "quest3")
    private String quest3;
    @Size(max = 50)
    @Column(name = "quest4")
    private String quest4;

    public Siswa() {
    }

    public Siswa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQuest1() {
        return quest1;
    }

    public void setQuest1(String quest1) {
        this.quest1 = quest1;
    }

    public String getQuest2() {
        return quest2;
    }

    public void setQuest2(String quest2) {
        this.quest2 = quest2;
    }

    public String getQuest3() {
        return quest3;
    }

    public void setQuest3(String quest3) {
        this.quest3 = quest3;
    }

    public String getQuest4() {
        return quest4;
    }

    public void setQuest4(String quest4) {
        this.quest4 = quest4;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Siswa)) {
            return false;
        }
        Siswa other = (Siswa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "survey.Siswa[ id=" + id + " ]";
    }
    
}
