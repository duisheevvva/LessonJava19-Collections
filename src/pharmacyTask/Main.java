package pharmacyTask;

import pharmacyTask.database.GenerateID;
import pharmacyTask.models.Medicine;
import pharmacyTask.models.Pharmacy;
import pharmacyTask.service.MedicineService;
import pharmacyTask.service.PharmacyService;
import pharmacyTask.service.serviceImpl.MedicineServiceImpl;
import pharmacyTask.service.serviceImpl.PharmacyServiceImpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PharmacyService pharmacyService = new PharmacyServiceImpl();
        pharmacyService.savePharmacy(new Pharmacy(GenerateID.genPharmacyId(),"Neman","Vostok5"));
        pharmacyService.savePharmacy(new Pharmacy(GenerateID.genPharmacyId(),"Bimed","Chui115"));
        System.out.println(pharmacyService.getAllPharmacies());
//        System.out.println("GetById");
//        System.out.println(pharmacyService.getPharmacyById(3L));
//        System.out.println("Update");
//        Pharmacy pharmacy = new Pharmacy();
//        pharmacy.setName("UpdatePharmacy");
//        pharmacy.setAddress("Chui115");
//        pharmacyService.updatePharmacyById(2L,pharmacy);
//        System.out.println(pharmacyService.getAllPharmacies());
//        System.out.println("Delete");
//        pharmacyService.deletePharmacyById(2L);
//        System.out.println(pharmacyService.getAllPharmacies());


        MedicineService medicineService = new MedicineServiceImpl();
        System.out.println("Save medicine");
        medicineService.saveMedicineByPharmacyId(1L,new Medicine(GenerateID.genMedicineId(),"Mukaltin",30,"ot kashlya",
                LocalDate.of(2026,5,5)));
//        System.out.println(medicineService.getAllMedicine(1L));
        System.out.println(pharmacyService.getAllPharmacies());


    }
}
