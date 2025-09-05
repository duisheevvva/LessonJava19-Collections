package pharmacyTask.service.serviceImpl;

import pharmacyTask.database.Database;
import pharmacyTask.models.Medicine;
import pharmacyTask.models.Pharmacy;
import pharmacyTask.service.MedicineService;

import java.util.List;

public class MedicineServiceImpl implements MedicineService {
    @Override
    public void saveMedicineByPharmacyId(Long pharmacyId, Medicine medicine) {
        for (Pharmacy pharmacy: Database.pharmacies) {
            if (pharmacy.getId() == pharmacyId){
                pharmacy.getMedicines().add(medicine);
            }
        }
    }

    @Override
    public List<Medicine> getAllMedicine(Long pharmacyId) {
        for (Pharmacy pharmacy: Database.pharmacies) {
            if (pharmacy.getId() == pharmacyId){
                return  pharmacy.getMedicines();
            }
        }
        return null;
    }
}
