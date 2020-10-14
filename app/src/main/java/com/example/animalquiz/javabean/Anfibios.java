package com.example.animalquiz.javabean;

import android.os.Parcel;
import android.os.Parcelable;

public class Anfibios implements Parcelable{
    private String continenteAn;
    private String nombreAn;
    private int idFotoAnimalAn;
    private int idFotoContinenteAn;
    private String claseAn;
    private String pesoAdultoAn;
    private String longitudAdultoAn;
    private String promedioVidaAn;
    private String alimentacionAn;
    private String peligrosoAn;
    private String dondeViveAn;

    public Anfibios(String continenteAn, String nombreAn, int idFotoAnimalAn, int idFotoContinenteAn, String claseAn, String pesoAdultoAn, String longitudAdultoAn, String promedioVidaAn, String alimentacionAn, String peligrosoAn, String dondeViveAn) {
        this.continenteAn = continenteAn;
        this.nombreAn = nombreAn;
        this.idFotoAnimalAn = idFotoAnimalAn;
        this.idFotoContinenteAn = idFotoContinenteAn;
        this.claseAn = claseAn;
        this.pesoAdultoAn = pesoAdultoAn;
        this.longitudAdultoAn = longitudAdultoAn;
        this.promedioVidaAn = promedioVidaAn;
        this.alimentacionAn = alimentacionAn;
        this.peligrosoAn = peligrosoAn;
        this.dondeViveAn = dondeViveAn;
    }

    public String getContinenteAn() {
        return continenteAn;
    }

    public void setContinenteAn(String continenteAn) {
        this.continenteAn = continenteAn;
    }

    public String getNombreAn() {
        return nombreAn;
    }

    public void setNombreAn(String nombreAn) {
        this.nombreAn = nombreAn;
    }

    public int getIdFotoAnimalAn() {
        return idFotoAnimalAn;
    }

    public void setIdFotoAnimalAn(int idFotoAnimalAn) {
        this.idFotoAnimalAn = idFotoAnimalAn;
    }

    public int getIdFotoContinenteAn() {
        return idFotoContinenteAn;
    }

    public void setIdFotoContinenteAn(int idFotoContinenteAn) {
        this.idFotoContinenteAn = idFotoContinenteAn;
    }

    public String getClaseAn() {
        return claseAn;
    }

    public void setClaseAn(String claseAn) {
        this.claseAn = claseAn;
    }

    public String getPesoAdultoAn() {
        return pesoAdultoAn;
    }

    public void setPesoAdultoAn(String pesoAdultoAn) {
        this.pesoAdultoAn = pesoAdultoAn;
    }

    public String getLongitudAdultoAn() {
        return longitudAdultoAn;
    }

    public void setLongitudAdultoAn(String longitudAdultoAn) {
        this.longitudAdultoAn = longitudAdultoAn;
    }

    public String getPromedioVidaAn() {
        return promedioVidaAn;
    }

    public void setPromedioVidaAn(String promedioVidaAn) {
        this.promedioVidaAn = promedioVidaAn;
    }

    public String getAlimentacionAn() {
        return alimentacionAn;
    }

    public void setAlimentacionAn(String alimentacionAn) {
        this.alimentacionAn = alimentacionAn;
    }

    public String getPeligrosoAn() {
        return peligrosoAn;
    }

    public void setPeligrosoAn(String peligrosoAn) {
        this.peligrosoAn = peligrosoAn;
    }

    public String getDondeViveAn() {
        return dondeViveAn;
    }

    public void setDondeViveAn(String dondeViveAn) {
        this.dondeViveAn = dondeViveAn;
    }

    protected Anfibios(Parcel in) {
        continenteAn = in.readString();
        idFotoAnimalAn = in.readInt();
        nombreAn = in.readString();
        claseAn = in.readString();
        pesoAdultoAn  = in.readString();
        longitudAdultoAn = in.readString();
        promedioVidaAn = in.readString();
        alimentacionAn = in.readString();
        peligrosoAn = in.readString();
        dondeViveAn = in.readString();
        idFotoContinenteAn = in.readInt();
    }

    public static final Parcelable.Creator<Anfibios> CREATOR = new Parcelable.Creator<Anfibios>() {
        @Override
        public Anfibios createFromParcel(Parcel in) {
            return new Anfibios(in);
        }

        @Override
        public Anfibios[] newArray(int size) {
            return new Anfibios[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(continenteAn);
        dest.writeInt(idFotoAnimalAn);
        dest.writeString(nombreAn);
        dest.writeString(claseAn);
        dest.writeString(pesoAdultoAn);
        dest.writeString(longitudAdultoAn);
        dest.writeString(promedioVidaAn);
        dest.writeString(alimentacionAn);
        dest.writeString(peligrosoAn);
        dest.writeString(dondeViveAn);
        dest.writeInt(idFotoContinenteAn);
    }
}
