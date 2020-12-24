package com.danpopescu;

public class CoronaDisinfector {

    private final Announcer announcer = new ConsoleAnnouncer();
    private final Policeman policeman = new PolicemanImpl();

    public void start(Room room) {
        announcer.announce("Disinfection will start in 5 minutes");
        policeman.drivePeopleOut();
        disinfect(room);
        announcer.announce("Disinfection is over. You can enter the room.");
    }

    private void disinfect(Room room) {
        System.out.println("Disinfecting everything using the holy water... Corona runs away in fear!");
    }
}
