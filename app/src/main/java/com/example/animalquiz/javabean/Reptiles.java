package com.example.animalquiz.javabean;

import android.os.Parcel;
import android.os.Parcelable;

public class Reptiles implements Parcelable{
    private String continenteR;
    private String nombreR;
    private int idFotoAnimalR;
    private int idFotoContinenteR;
    private String claseR;
    private String pesoAdultoR;
    private String longitudAdultoR;
    private String promedioVidaR;
    private String alimentacionR;
    private String peligrosoR;
    private String dondeViveR;

    public Reptiles(String continenteR, String nombreR, int idFotoAnimalR, int idFotoContinenteR, String claseR, String pesoAdultoR, String longitudAdultoR, String promedioVidaR, String alimentacionR, String peligrosoR, String dondeViveR) {
        this.continenteR = continenteR;
        this.nombreR = nombreR;
        this.idFotoAnimalR = idFotoAnimalR;
        this.idFotoContinenteR = idFotoContinenteR;
        this.claseR = claseR;
        this.pesoAdultoR = pesoAdultoR;
        this.longitudAdultoR = longitudAdultoR;
        this.promedioVidaR = promedioVidaR;
        this.alimentacionR = alimentacionR;
        this.peligrosoR = peligrosoR;
        this.dondeViveR = dondeViveR;
    }

    public String getContinenteR() {
        return continenteR;
    }

    public void setContinenteR(String continenteR) {
        this.continenteR = continenteR;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public int getIdFotoAnimalR() {
        return idFotoAnimalR;
    }

    public void setIdFotoAnimalR(int idFotoAnimalR) {
        this.idFotoAnimalR = idFotoAnimalR;
    }

    public int getIdFotoContinenteR() {
        return idFotoContinenteR;
    }

    public void setIdFotoContinenteR(int idFotoContinenteR) {
        this.idFotoContinenteR = idFotoContinenteR;
    }

    public String getClaseR() {
        return claseR;
    }

    public void setClaseR(String claseR) {
        this.claseR = claseR;
    }

    public String getPesoAdultoR() {
        return pesoAdultoR;
    }

    public void setPesoAdultoR(String pesoAdultoR) {
        this.pesoAdultoR = pesoAdultoR;
    }

    public String getLongitudAdultoR() {
        return longitudAdultoR;
    }

    public void setLongitudAdultoR(String longitudAdultoR) {
        this.longitudAdultoR = longitudAdultoR;
    }

    public String getPromedioVidaR() {
        return promedioVidaR;
    }

    public void setPromedioVidaR(String promedioVidaR) {
        this.promedioVidaR = promedioVidaR;
    }

    public String getAlimentacionR() {
        return alimentacionR;
    }

    public void setAlimentacionR(String alimentacionR) {
        this.alimentacionR = alimentacionR;
    }

    public String getPeligrosoR() {
        return peligrosoR;
    }

    public void setPeligrosoR(String peligrosoR) {
        this.peligrosoR = peligrosoR;
    }

    public String getDondeViveR() {
        return dondeViveR;
    }

    public void setDondeViveR(String dondeViveR) {
        this.dondeViveR = dondeViveR;
    }

    protected Reptiles(Parcel in) {
        continenteR = in.readString();
        idFotoAnimalR = in.readInt();
        nombreR = in.readString();
        claseR = in.readString();
        pesoAdultoR = in.readString();
        longitudAdultoR = in.readString();
        promedioVidaR = in.readString();
        alimentacionR = in.readString();
        peligrosoR = in.readString();
        dondeViveR = in.readString();
        idFotoContinenteR = in.readInt();
    }

    public static final Parcelable.Creator<Reptiles> CREATOR = new Parcelable.Creator<Reptiles>() {
        @Override
        public Reptiles createFromParcel(Parcel in) {
            return new Reptiles(in);
        }

        @Override
        public Reptiles[] newArray(int size) {
            return new Reptiles[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(continenteR);
        dest.writeInt(idFotoAnimalR);
        dest.writeString(nombreR);
        dest.writeString(claseR);
        dest.writeString(pesoAdultoR);
        dest.writeString(longitudAdultoR);
        dest.writeString(promedioVidaR);
        dest.writeString(alimentacionR);
        dest.writeString(peligrosoR);
        dest.writeString(dondeViveR);
        dest.writeInt(idFotoContinenteR);
    }
}
