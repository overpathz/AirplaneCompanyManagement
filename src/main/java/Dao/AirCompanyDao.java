package Dao;

import Entities.AirCompany;
import Entities.Airplane;
import Entities.Flight;

import java.util.List;

public interface AirCompanyDao {
    AirCompany addAirCompany(AirCompany airCompany);
    void updateAirCompany(AirCompany airCompany);
    void removeAirCompany(Long id);
    AirCompany getAirCompanyById(Long id);
    List<AirCompany> listAirCompanies();
    List<Flight> findAllAirCompanyFlightByStatus(String status);
    Airplane addNewAirplane(Airplane airplane);
//    List<Flight> findAllActiveStatusFlights();
}