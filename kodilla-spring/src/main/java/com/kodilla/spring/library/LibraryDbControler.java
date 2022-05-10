package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;

@Repository
// @Component też by działał, ale tak jest bardziej szczegółowo
// i daje info, że klasa służy do obsługi repozytorium danych
public final class LibraryDbControler {

    public void saveData() {
        System.out.println("Saving data to the database.");
    }

    public void loadData() {
        System.out.println("Loading data from the database");
    }
}
