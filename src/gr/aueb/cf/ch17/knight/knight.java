package gr.aueb.cf.ch17.knight;

public class knight implements IKnight{

    @Override
    public void embarkOnMission(IMission mission) {
        mission.embark();
        mission.save();
        mission.comeBack();
    }
}
