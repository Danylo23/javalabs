package ua.lviv.iot.components.repositories;

import ua.lviv.iot.components.models.VideoCard;

import javax.transaction.Transactional;

@Transactional
public interface VideoCardRepository extends ComponentsRepository<VideoCard> {


}
