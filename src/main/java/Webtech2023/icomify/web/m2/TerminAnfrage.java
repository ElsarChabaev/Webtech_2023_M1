package Webtech2023.icomify.web.m2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

import java.util.Objects;


@Entity
    public class TerminAnfrage {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String nachname;
        private String telNummer;
        private String emailAdresse;
       private String stadt;
       private WochenTage verfügbarerWochentag;
       private String kommentar;


        public TerminAnfrage(String name, String nachname, String telNummer, String emailAdresse, String stadt, WochenTage verfügbarerWochentag, String kommentar) {
            this.name = name;
            this.nachname = nachname;
            this.telNummer = telNummer;
            this.emailAdresse = emailAdresse;
            this.stadt = stadt;
            this.verfügbarerWochentag = verfügbarerWochentag;
            this.kommentar = kommentar;
        }

    public TerminAnfrage() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TerminAnfrage that = (TerminAnfrage) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(nachname, that.nachname) && Objects.equals(telNummer, that.telNummer) && Objects.equals(emailAdresse, that.emailAdresse) && Objects.equals(stadt, that.stadt) && verfügbarerWochentag == that.verfügbarerWochentag && Objects.equals(kommentar, that.kommentar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nachname, telNummer, emailAdresse, stadt, verfügbarerWochentag, kommentar);
    }

    @Override
    public String toString() {
        return "TerminAnfrage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nachname='" + nachname + '\'' +
                ", telNummer='" + telNummer + '\'' +
                ", emailAdresse='" + emailAdresse + '\'' +
                ", stadt='" + stadt + '\'' +
                ", verfügbarerWochentag=" + verfügbarerWochentag +
                ", kommentar='" + kommentar + '\'' +
                '}';
    }

    public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNachname() {
            return nachname;
        }

        public void setNachname(String nachname) {
            this.nachname = nachname;
        }

        public String getTelNummer() {
            return telNummer;
        }

        public void setTelNummer(String telNummer) {
            this.telNummer = telNummer;
        }

        public String getEmailAdresse() {
            return emailAdresse;
        }

        public void setEmailAdresse(String emailAdresse) {
            this.emailAdresse = emailAdresse;
        }

        public String getStadt() {
            return stadt;
        }

        public void setStadt(String stadt) {
            this.stadt = stadt;
        }

        public WochenTage getVerfügbarerWochentag() {
            return verfügbarerWochentag;
        }

        public void setVerfügbarerWochentag(WochenTage verfügbarerWochentag) {
            this.verfügbarerWochentag = verfügbarerWochentag;
        }

        public String getKommentar() {
            return kommentar;
        }

        public void setKommentar(String kommentar) {
            this.kommentar = kommentar;
        }
    }


