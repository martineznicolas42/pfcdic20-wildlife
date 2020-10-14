package com.example.animalquiz.javabean;

import android.os.Parcel;
import android.os.Parcelable;

public class Peces implements Parcelable{
    private String continenteP;
    private String nombreP;
    private int idFotoAnimalP;
    private int idFotoContinenteP;
    private String claseP;
    private String pesoAdultoP;
    private String longitudAdultoP;
    private String promedioVidaP;
    private String alimentacionP;
    private String peligrosoP;
    private String dondeViveP;

    public Peces(String continenteP, String nombreP, int idFotoAnimalP, int idFotoContinenteP, String claseP, String pesoAdultoP, String longitudAdultoP, String promedioVidaP, String alimentacionP, String peligrosoP, String dondeViveP) {
        this.continenteP = continenteP;
        this.nombreP = nombreP;
        this.idFotoAnimalP = idFotoAnimalP;
        this.idFotoContinenteP = idFotoContinenteP;
        this.claseP = claseP;
        this.pesoAdultoP = pesoAdultoP;
        this.longitudAdultoP = longitudAdultoP;
        this.promedioVidaP = promedioVidaP;
        this.alimentacionP = alimentacionP;
        this.peligrosoP = peligrosoP;
        this.dondeViveP = dondeViveP;
    }

    public String getContinenteP() {
        return continenteP;
    }

    public void setContinenteP(String continenteP) {
        this.continenteP = continenteP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getIdFotoAnimalP() {
        return idFotoAnimalP;
    }

    public void setIdFotoAnimalP(int idFotoAnimalP) {
        this.idFotoAnimalP = idFotoAnimalP;
    }

    public int getIdFotoContinenteP() {
        return idFotoContinenteP;
    }

    public void setIdFotoContinenteP(int idFotoContinenteP) {
        this.idFotoContinenteP = idFotoContinenteP;
    }

    public String getClaseP() {
        return claseP;
    }

    public void setClaseP(String claseP) {
        this.claseP = claseP;
    }

    public String getPesoAdultoP() {
        return pesoAdultoP;
    }

    public void setPesoAdultoP(String pesoAdultoP) {
        this.pesoAdultoP = pesoAdultoP;
    }

    public String getLongitudAdultoP() {
        return longitudAdultoP;
    }

    public void setLongitudAdultoP(String longitudAdultoP) {
        this.longitudAdultoP = longitudAdultoP;
    }

    public String getPromedioVidaP() {
        return promedioVidaP;
    }

    public void setPromedioVidaP(String promedioVidaP) {
        this.promedioVidaP = promedioVidaP;
    }

    public String getAlimentacionP() {
        return alimentacionP;
    }

    public void setAlimentacionP(String alimentacionP) {
        this.alimentacionP = alimentacionP;
    }

    public String getPeligrosoP() {
        return peligrosoP;
    }

    public void setPeligrosoP(String peligrosoP) {
        this.peligrosoP = peligrosoP;
    }

    public String getDondeViveP() {
        return dondeViveP;
    }

    public void setDondeViveP(String dondeViveP) {
        this.dondeViveP = dondeViveP;
    }

    protected Peces(Parcel in) {
        continenteP = in.readString();
        idFotoAnimalP = in.readInt();
        nombreP = in.readString();
        claseP = in.readString();
        pesoAdultoP = in.readString();
        longitudAdultoP = in.readString();
        promedioVidaP = in.readString();
        alimentacionP = in.readString();
        peligrosoP = in.readString();
        dondeViveP = in.readString();
        idFotoContinenteP = in.readInt();
    }

    public static final Parcelable.Creator<Peces> CREATOR = new Parcelable.Creator<Peces>() {
        @Override
        public Peces createFromParcel(Parcel in) {
            return new Peces(in);
        }

        @Override
        public Peces[] newArray(int size) {
            return new Peces[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(continenteP);
        dest.writeInt(idFotoAnimalP);
        dest.writeString(nombreP);
        dest.writeString(claseP);
        dest.writeString(pesoAdultoP);
        dest.writeString(longitudAdultoP);
        dest.writeString(promedioVidaP);
        dest.writeString(alimentacionP);
        dest.writeString(peligrosoP);
        dest.writeString(dondeViveP);
        dest.writeInt(idFotoContinenteP);
    }
}
