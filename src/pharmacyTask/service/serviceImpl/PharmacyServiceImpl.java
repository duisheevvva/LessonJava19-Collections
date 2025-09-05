package pharmacyTask.service.serviceImpl;

import pharmacyTask.database.Database;
import pharmacyTask.models.Pharmacy;
import pharmacyTask.service.PharmacyService;

import java.util.Date;
import java.util.List;

public class PharmacyServiceImpl implements PharmacyService {
    @Override
    public void savePharmacy(Pharmacy pharmacy) {
        Database.pharmacies.add(pharmacy);
    }

    @Override
    public List<Pharmacy> getAllPharmacies() {
        return Database.pharmacies;
    }

    @Override
    public Pharmacy getPharmacyById(Long id) {
        try {
            for (Pharmacy pharmacy : Database.pharmacies) {
                if (pharmacy.getId() == id) {
                    return pharmacy;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void updatePharmacyById(Long id, Pharmacy newPharmacy) {
        try {
            Pharmacy oldPharmacy = getPharmacyById(id);
            oldPharmacy.setName(newPharmacy.getName());
            if (oldPharmacy.getAddress().equals(newPharmacy.getAddress())) {
                throw new RuntimeException("eski address jany addreske barabar bolo albayt");
            } else {
                oldPharmacy.setAddress(newPharmacy.getAddress());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deletePharmacyById(Long id) {
        try {
            if (id == null || id <= 0) {
                throw new RuntimeException("Id null bolo albait je id ters san bolo albait");
            }
            Pharmacy deletePharmacy = getPharmacyById(id);
            Database.pharmacies.remove(deletePharmacy);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
