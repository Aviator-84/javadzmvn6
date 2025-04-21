import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void SetStationNumber() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(7);

        int expected = 7;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NotSetStationNumberAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(10);

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NotSetStationNumberBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(-1);

        int expected = 9;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetMaxStationNumber() {
        Radio rad = new Radio();

        rad.maxCurrentStationNumber();

        int expected = 9;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStationNumber() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(8);

        rad.nextStationNumber();

        int expected = 9;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextMoreMaxStationNumber() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(9);

        rad.nextStationNumber();

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevStationNumber() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(4);

        rad.prevStationNumber();

        int expected = 3;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevLessMinStationNumber() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(0);

        rad.prevStationNumber();

        int expected = 9;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(48);

        int expected = 48;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NotSetSoundVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setSoundVolume(103);

        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dNotSetSoundVolumeBelowMin() {
        Radio rad = new Radio();

        rad.setSoundVolume(-1);

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetMaxSoundVolume() {
        Radio rad = new Radio();

        rad.maxSoundVolume();

        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MoreSoundVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(59);

        rad.moreSound();

        int expected = 60;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MoreMaxSoundVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(103);

        rad.moreSound();

        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LessSoundVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(55);

        rad.lessSound();

        int expected = 54;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LessMinSoundVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(-1);

        rad.lessSound();

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}


