package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void shoudSetStation() {
        Radio x = new Radio();

        x.setCurrentStation(5);

        Assertions.assertEquals(5, x.getCurrentStation());
    }

    @Test
    public void shoudNotSetStationAboveMax() {
        Radio x = new Radio();

        x.setCurrentStation(100);

        Assertions.assertEquals(0, x.getCurrentStation());
    }

    @Test
    public void shoudNotSetStationBelowMin() {
        Radio x = new Radio();

        x.setCurrentStation(-10);


        Assertions.assertEquals(0, x.getCurrentStation());
    }

    @Test
    public void nextStation() {
        Radio x = new Radio();

        x.setCurrentStation(1);
        x.nextStation();

        Assertions.assertEquals(2, x.getCurrentStation());
    }

    @Test
    public void nextStationAboveMax() {
        Radio x = new Radio();

        x.setCurrentStation(9);
        x.nextStation();

        Assertions.assertEquals(0, x.getCurrentStation());
    }

    @Test
    public void prevStation() {
        Radio x = new Radio();

        x.setCurrentStation(2);
        x.prevStation();

        Assertions.assertEquals(1, x.getCurrentStation());
    }

    @Test
    public void prevStationBelowMin() {
        Radio x = new Radio();

        x.setCurrentStation(0);
        x.prevStation();

        Assertions.assertEquals(9, x.getCurrentStation());
    }

    @Test
    public void shoudSetVolume() {
        Radio x = new Radio();

        x.setCurrentVolume(5);

        Assertions.assertEquals(5, x.getCurrentVolume());
    }

    @Test
    public void shoudNotSetVolumeBelowMin() {
        Radio x = new Radio();

        x.setCurrentVolume(-10);

        Assertions.assertEquals(0, x.getCurrentVolume());
    }

    @Test
    public void shoudNotSetVolumeAboveMax() {
        Radio x = new Radio();

        x.setCurrentVolume(1000);

        Assertions.assertEquals(0, x.getCurrentVolume());
    }

    @Test
    public void increaseVolume() {
        Radio x = new Radio();

        x.setCurrentVolume(0);
        x.increaseVolume();

        Assertions.assertEquals(1, x.getCurrentVolume());
    }

    @Test
    public void increaseVolumeAboveMax() {
        Radio x = new Radio();

        x.setCurrentVolume(100);
        x.increaseVolume();

        Assertions.assertEquals(100, x.getCurrentVolume());
    }

    @Test
    public void downgradeVolume() {
        Radio x = new Radio();

        x.setCurrentVolume(2);
        x.downgradeVolume();

        Assertions.assertEquals(1, x.getCurrentVolume());
    }

    @Test
    public void downgradeVolumeBelowMin() {
        Radio x = new Radio();

        x.setCurrentVolume(0);
        x.downgradeVolume();

        Assertions.assertEquals(0, x.getCurrentVolume());
    }

    @Test
    public void nextStationBeforeLast() {
        Radio x = new Radio();

        x.setCurrentStation(8);
        x.nextStation();

        Assertions.assertEquals(9, x.getCurrentStation());

    }
}