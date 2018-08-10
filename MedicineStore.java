package com.karthik.zoo.animals;

import java.util.ArrayList;
import java.util.List;

class MedicineStore {

    void vaccination() {
        List<Vaccine> vaccineList = new ArrayList<>();
        vaccineList.add(new Vaccine("Rabies", "05/01/18", "05/07/18"));
        vaccineList.add(new Vaccine("Clostridium", "10/02/18", "10/08/18"));
        vaccineList.add(new Vaccine("Anthrax", "15/03/18", "15/09/18"));

        for (int i = 0; i < vaccineList.size(); i++) {
            System.out.println("Vaccine available in Medicine Store is: " + vaccineList.get(i).getNameOfVaccine() + " and Date Of Manufacture is " + vaccineList.get(i).getDateOfManufacture() + " and Date Of Expire is " + vaccineList.get(i).getDateOfExpire());
        }

        List<UpcomingVaccine> upcomingVaccine = new ArrayList<>();

        upcomingVaccine.add(new UpcomingVaccine("West Nile Fever", "25/05/18", "30/10/18"));

        System.out.println();

        System.out.println("Upcoming Vaccination:");

        System.out.println();

        for (int u = 0; u < upcomingVaccine.size(); u++) {
            System.out.println("Upcoming Vaccine present in Medicine Store are" + "-" + upcomingVaccine.get(u).getNameOfVaccine() + "Date Of Manufacture is" + upcomingVaccine.get(u).getDateOfManufacture() + " and Date Of Expire is" + upcomingVaccine.get(u).getDateOfExpire());
        }


    }

}

