package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void shoudSetStation() {
        Radio x = new Radio();

        x.setCurrentStation(5);

        int expected = 5;
        int actual = x.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudNotSetStationAboveMax() {
        Radio x = new Radio();

        x.setCurrentStation(100);

        int expected = 0;
        int actual = x.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudNotSetStationBelowMin() {
        Radio x = new Radio();

        x.setCurrentStation(-10);

        int expected = 0;
        int actual = x.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio x = new Radio();

        x.setCurrentStation(1);
        x.nextStation();

        int expected = 2;
        int actual = x.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStationAboveMax() {
        Radio x = new Radio();

        x.setCurrentStation(9);
        x.nextStation();

        int expected = 0;
        int actual = x.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio x = new Radio();

        x.setCurrentStation(2);
        x.prevStation();

        int expected = 1;
        int actual = x.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStationBelowMin() {
        Radio x = new Radio();

        x.setCurrentStation(0);
        x.prevStation();

        int expected = 9;
        int actual = x.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shoudSetVolume() {
        Radio x = new Radio();

        x.setCurrentVolume(5);

        int expected = 5;
        int actual = x.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shoudNotSetVolumeBelowMin() {
        Radio x = new Radio();

        x.setCurrentVolume(-10);

        int expected = 0;
        int actual = x.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shoudNotSetVolumeAboveMax() {
        Radio x = new Radio();

        x.setCurrentVolume(100);

        int expected = 0;
        int actual = x.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume() {
        Radio x = new Radio();

        x.setCurrentVolume(0);
        x.increaseVolume();

        int expected = 1;
        int actual = x.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeAboveMax() {
        Radio x = new Radio();

        x.setCurrentVolume(10);
        x.increaseVolume();

        int expected = 10;
        int actual = x.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void downgradeVolume() {
        Radio x = new Radio();

        x.setCurrentVolume(2);
        x.downgradeVolume();

        int expected = 1;
        int actual = x.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void downgradeVolumeBelowMin() {
        Radio x = new Radio();

        x.setCurrentVolume(0);
        x.downgradeVolume();

        int expected = 0;
        int actual = x.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}