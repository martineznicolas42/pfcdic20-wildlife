package com.example.animalquiz.javabean;

import android.os.Parcel;
import android.os.Parcelable;

public class Mamiferos implements Parcelable {
    private String continenteM;
    private String nombreM;
    private int idSonidoAnimal;
    private int idFotoAnimal;
    private int idFotoContinenteM;
    private String claseM;
    private String pesoAdultoM;
    private String longitudAdultoM;
    private String promedioVidaM;
    private String alimentacionM;
    private String peligrosoM;
    private String dondeViveM;

    public Mamiferos(String continenteM,String nombreM, int idFotoAnimal, int idFotoContinenteM , String claseM, String pesoAdultoM
            , String longitudAdultoM, String promedioVidaM, String alimentacionM, String peligrosoM, String dondeViveM,
                     int idSonidoAnimal) {
        this.nombreM = nombreM;
        this.continenteM = continenteM;
        this.idFotoAnimal = idFotoAnimal;
       // this.idIcono = idIcono;
        //this.idVideo = idVideo;
        this.idFotoContinenteM = idFotoContinenteM;
        this.claseM = claseM;
        this.pesoAdultoM = pesoAdultoM;
        this.longitudAdultoM = longitudAdultoM;
        this.promedioVidaM = promedioVidaM;
        this.alimentacionM = alimentacionM;
        this.peligrosoM = peligrosoM;
        this.dondeViveM = dondeViveM;
        this.idSonidoAnimal = idSonidoAnimal;
    }

    public int getIdSonidoAnimal() {
        return idSonidoAnimal;
    }

    public int getIdFotoContinenteM() {
        return idFotoContinenteM;
    }

    public void setIdFotoContinente(int idFotoContinente) {
        this.idFotoContinenteM = idFotoContinente;
    }

    public String getContinenteM() {
        return continenteM;
    }

    public void setContinenteM(String continenteM) {
        this.continenteM = continenteM;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public int getIdFotoAnimal() {
        return idFotoAnimal;
    }

    public void setIdFotoAnimal(int idFotoAnimal) {
        this.idFotoAnimal = idFotoAnimal;
    }

    public String getClaseM() {
        return claseM;
    }

    public void setClaseM(String claseM) {
        this.claseM = claseM;
    }

    public String getPesoAdultoM() {
        return pesoAdultoM;
    }

    public void setPesoAdultoM(String pesoAdultoM) {
        this.pesoAdultoM = pesoAdultoM;
    }

    public String getLongitudAdultoM() {
        return longitudAdultoM;
    }

    public void setLongitudAdultoM(String longitudAdultoM) {
        this.longitudAdultoM = longitudAdultoM;
    }

    public String getPromedioVidaM() {
        return promedioVidaM;
    }

    public void setPromedioVidaM(String promedioVidaM) {
        this.promedioVidaM = promedioVidaM;
    }

    public String getAlimentacionM() {
        return alimentacionM;
    }

    public void setAlimentacionM(String alimentacionM) {
        this.alimentacionM = alimentacionM;
    }

    public String getPeligrosoM() {
        return peligrosoM;
    }

    public void setPeligrosoM(String peligrosoM) {
        this.peligrosoM = peligrosoM;
    }

    public String getDondeViveM() {
        return dondeViveM;
    }

    public void setDondeViveM(String dondeViveM) {
        this.dondeViveM = dondeViveM;
    }

    protected Mamiferos(Parcel in) {
        continenteM = in.readString();
        idFotoAnimal = in.readInt();
        nombreM = in.readString();
        claseM = in.readString();
        pesoAdultoM  = in.readString();
        longitudAdultoM = in.readString();
        promedioVidaM = in.readString();
        alimentacionM = in.readString();
        peligrosoM = in.readString();
        dondeViveM = in.readString();
        idFotoContinenteM = in.readInt();
        idSonidoAnimal = in.readInt();
    }

    public static final Creator<Mamiferos> CREATOR = new Creator<Mamiferos>() {
        @Override
        public Mamiferos createFromParcel(Parcel in) {
            return new Mamiferos(in);
        }

        @Override
        public Mamiferos[] newArray(int size) {
            return new Mamiferos[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(continenteM);
        dest.writeInt(idFotoAnimal);
        dest.writeString(nombreM);
        dest.writeString(claseM);
        dest.writeString(pesoAdultoM);
        dest.writeString(longitudAdultoM);
        dest.writeString(promedioVidaM);
        dest.writeString(alimentacionM);
        dest.writeString(peligrosoM);
        dest.writeString(dondeViveM);
        dest.writeInt(idFotoContinenteM);
        dest.writeInt(idSonidoAnimal);
    }
}
