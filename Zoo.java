package com.karthik.zoo.animals;

class Zoo {
    public static void main(String[] args)
    {
        MedicineStore medicineStore = new MedicineStore();

        Cage cage = new Cage();

        medicineStore.vaccination();

        System.out.println();

        cage.caging();

    }
}
