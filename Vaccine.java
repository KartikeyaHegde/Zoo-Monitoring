package com.karthik.zoo.animals;

class Vaccine extends MedicineProduct {
    private String nameOfVaccine;
    private String dateOfManufacture;
    private String dateOfExpire;

    public Vaccine(String nameOfVaccine, String dateOfManufacture, String dateOfExpire) {
        this.nameOfVaccine = nameOfVaccine;
        this.dateOfManufacture = dateOfManufacture;
        this.dateOfExpire = dateOfExpire;
    }


    @Override
    String getNameOfVaccine() {
        return nameOfVaccine;
    }

    @Override
    String getDateOfManufacture() {
        return dateOfManufacture;
    }

    @Override
    String getDateOfExpire() {
        return dateOfExpire;
    }

    public void setNameOfVaccine(String nameOfVaccine) {
        this.nameOfVaccine = nameOfVaccine;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setDateOfExpire(String dateOfExpire) {
        this.dateOfExpire = dateOfExpire;
    }
}

