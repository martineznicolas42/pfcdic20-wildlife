package com.example.animalquiz.javabean;

import android.os.Parcel;
import android.os.Parcelable;

public class Aves implements Parcelable{
    private String continenteA;
    private String nombreA;
    private int idFotoAnimalA;
    private int idFotoContinenteA;
    private String claseA;
    private String pesoAdultoA;
    private String longitudAdultoA;
    private String promedioVidaA;
    private String alimentacionA;
    private String peligrosoA;
    private String dondeViveA;

    public Aves(String continenteA, String nombreA, int idFotoAnimalA, int idFotoContinenteA, String claseA, String pesoAdultoA, String longitudAdultoA, String promedioVidaA, String alimentacionA, String peligrosoA, String dondeViveA) {
        this.continenteA = continenteA;
        this.nombreA = nombreA;
        this.idFotoAnimalA = idFotoAnimalA;
        this.idFotoContinenteA = idFotoContinenteA;
        this.claseA = claseA;
        this.pesoAdultoA = pesoAdultoA;
        this.longitudAdultoA = longitudAdultoA;
        this.promedioVidaA = promedioVidaA;
        this.alimentacionA = alimentacionA;
        this.peligrosoA = peligrosoA;
        this.dondeViveA = dondeViveA;
    }

    public String getContinenteA() {
        return continenteA;
    }

    public void setContinenteA(String continenteA) {
        this.continenteA = continenteA;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public int getIdFotoAnimalA() {
        return idFotoAnimalA;
    }

    public void setIdFotoAnimalA(int idFotoAnimalA) {
        this.idFotoAnimalA = idFotoAnimalA;
    }

    public int getIdFotoContinenteA() {
        return idFotoContinenteA;
    }

    public void setIdFotoContinenteA(int idFotoContinenteA) {
        this.idFotoContinenteA = idFotoContinenteA;
    }

    public String getClaseA() {
        return claseA;
    }

    public void setClaseA(String claseA) {
        this.claseA = claseA;
    }

    public String getPesoAdultoA() {
        return pesoAdultoA;
    }

    public void setPesoAdultoA(String pesoAdultoA) {
        this.pesoAdultoA = pesoAdultoA;
    }

    public String getLongitudAdultoA() {
        return longitudAdultoA;
    }

    public void setLongitudAdultoA(String longitudAdultoA) {
        this.longitudAdultoA = longitudAdultoA;
    }

    public String getPromedioVidaA() {
        return promedioVidaA;
    }

    public void setPromedioVidaA(String promedioVidaA) {
        this.promedioVidaA = promedioVidaA;
    }

    public String getAlimentacionA() {
        return alimentacionA;
    }

    public void setAlimentacionA(String alimentacionA) {
        this.alimentacionA = alimentacionA;
    }

    public String getPeligrosoA() {
        return peligrosoA;
    }

    public void setPeligrosoA(String peligrosoA) {
        this.peligrosoA = peligrosoA;
    }

    public String getDondeViveA() {
        return dondeViveA;
    }

    public void setDondeViveA(String dondeViveA) {
        this.dondeViveA = dondeViveA;
    }

    protected Aves(Parcel in) {
        continenteA = in.readString();
        idFotoAnimalA = in.readInt();
        nombreA = in.readString();
        claseA = in.readString();
        pesoAdultoA  = in.readString();
        longitudAdultoA = in.readString();
        promedioVidaA = in.readString();
        alimentacionA = in.readString();
        peligrosoA = in.readString();
        dondeViveA = in.readString();
        idFotoContinenteA = in.readInt();
    }

    public static final Parcelable.Creator<Aves> CREATOR = new Parcelable.Creator<Aves>() {
        @Override
        public Aves createFromParcel(Parcel in) {
            return new Aves(in);
        }

        @Override
        public Aves[] newArray(int size) {
            return new Aves[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(continenteA);
        dest.writeInt(idFotoAnimalA);
        dest.writeString(nombreA);
        dest.writeString(claseA);
        dest.writeString(pesoAdultoA);
        dest.writeString(longitudAdultoA);
        dest.writeString(promedioVidaA);
        dest.writeString(alimentacionA);
        dest.writeString(peligrosoA);
        dest.writeString(dondeViveA);
        dest.writeInt(idFotoContinenteA);
    }
}
