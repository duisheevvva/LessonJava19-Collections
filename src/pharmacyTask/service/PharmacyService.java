package pharmacyTask.service;

import pharmacyTask.models.Pharmacy;

import java.util.List;

public interface PharmacyService {
    void savePharmacy(Pharmacy pharmacy);
    List<Pharmacy> getAllPharmacies();
    Pharmacy getPharmacyById(Long id);
    void updatePharmacyById(Long id,Pharmacy newPharmacy);
    void deletePharmacyById(Long id);
}
