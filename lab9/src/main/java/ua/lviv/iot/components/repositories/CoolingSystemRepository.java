package ua.lviv.iot.components.repositories;

import ua.lviv.iot.components.models.CoolingSystem;

import javax.transaction.Transactional;

@Transactional
public interface CoolingSystemRepository extends ComponentsRepository<CoolingSystem> {


}