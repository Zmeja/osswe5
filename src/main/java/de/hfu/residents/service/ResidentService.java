package de.hfu.residents.service;

import java.util.List;

import de.hfu.residents.domain.Resident;

/**
 * @author Stefan Betermieux
 * 
 * Additional Documentation for Task 8
 */
public interface ResidentService {

  Resident getUniqueResident(Resident filterResident) throws ResidentServiceException;

  List<Resident> getFilteredResidentsList(Resident filterResident);

}