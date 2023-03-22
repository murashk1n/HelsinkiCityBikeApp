package com.example.HelsinkiCityBikeApp.services;

import com.example.HelsinkiCityBikeApp.model.Station;
import com.example.HelsinkiCityBikeApp.repositories.JourneyRepository;
import com.example.HelsinkiCityBikeApp.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class StationService {
    private final StationRepository stationRepository;
    private final JourneyRepository journeyRepository;

    @Autowired
    public StationService(StationRepository stationRepository, JourneyRepository journeyRepository) {
        this.stationRepository = stationRepository;
        this.journeyRepository = journeyRepository;
    }

    public void setAdditionalInfoToStation(Station station){
        station.setStartingFromStation(journeyRepository.countAllByDepartureStation(station.getStationNameFI()));
        station.setEndingFromStation(journeyRepository.countAllByReturnStation(station.getStationNameFI()));

        station.setAvgDistanceFromStation(journeyRepository.countAllDistanceFromStation(station.getStationNameFI())/station.getStartingFromStation()*0.001);
        station.setAvgDistanceToStation(journeyRepository.countAllDistanceToStation(station.getStationNameFI())/station.getEndingFromStation()*0.001);


    }

    public Station findOne(int id) {
        Optional<Station> foundStation = stationRepository.findById(id);
        return foundStation.orElse(null);
    }

    public List<Station> findAll() {
        return stationRepository.findAll(PageRequest.of(0, 30)).getContent();
    }
}
