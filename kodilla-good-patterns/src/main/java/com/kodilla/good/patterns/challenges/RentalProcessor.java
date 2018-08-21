package com.kodilla.good.patterns.challenges;

public class RentalProcessor {

    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(final InformationService informationService,
                           final RentalService rentalService,
                           final RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDTo process(final RentRequest rentRequest) { //polecenie wynajmu
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getVehicles());

        if(isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getVehicles());
            return new RentalDTo(rentRequest.getUser(), true);
        } else {
            return new RentalDTo(rentRequest.getUser(), false);
        }
    }
}