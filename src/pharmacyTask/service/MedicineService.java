package pharmacyTask.service;

import pharmacyTask.models.Medicine;

import java.util.List;

public interface MedicineService {
    void saveMedicineByPharmacyId(Long pharmacyId, Medicine medicine);
    List<Medicine> getAllMedicine(Long pharmacyId);
}
